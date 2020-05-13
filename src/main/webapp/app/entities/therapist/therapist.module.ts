import { NgModule } from '@angular/core';
import { RouterModule } from '@angular/router';

import { AllscriptsSharedModule } from 'app/shared/shared.module';
import { TherapistComponent } from './therapist.component';
import { TherapistDetailComponent } from './therapist-detail.component';
import { TherapistUpdateComponent } from './therapist-update.component';
import { TherapistDeleteDialogComponent } from './therapist-delete-dialog.component';
import { therapistRoute } from './therapist.route';

@NgModule({
  imports: [AllscriptsSharedModule, RouterModule.forChild(therapistRoute)],
  declarations: [TherapistComponent, TherapistDetailComponent, TherapistUpdateComponent, TherapistDeleteDialogComponent],
  entryComponents: [TherapistDeleteDialogComponent]
})
export class AllscriptsTherapistModule {}
