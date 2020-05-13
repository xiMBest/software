import { NgModule } from '@angular/core';
import { RouterModule } from '@angular/router';

@NgModule({
  imports: [
    RouterModule.forChild([
      {
        path: 'patient',
        loadChildren: () => import('./patient/patient.module').then(m => m.AllscriptsPatientModule)
      },
      {
        path: 'oncologist',
        loadChildren: () => import('./oncologist/oncologist.module').then(m => m.AllscriptsOncologistModule)
      },
      {
        path: 'therapist',
        loadChildren: () => import('./therapist/therapist.module').then(m => m.AllscriptsTherapistModule)
      },
      {
        path: 'conclusion',
        loadChildren: () => import('./conclusion/conclusion.module').then(m => m.AllscriptsConclusionModule)
      },
      {
        path: 'hospital',
        loadChildren: () => import('./hospital/hospital.module').then(m => m.AllscriptsHospitalModule)
      },
      {
        path: 'test-result',
        loadChildren: () => import('./test-result/test-result.module').then(m => m.AllscriptsTestResultModule)
      }
      /* jhipster-needle-add-entity-route - JHipster will add entity modules routes here */
    ])
  ]
})
export class AllscriptsEntityModule {}
