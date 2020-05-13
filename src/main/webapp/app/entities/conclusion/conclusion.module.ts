import { NgModule } from '@angular/core';
import { RouterModule } from '@angular/router';

import { AllscriptsSharedModule } from 'app/shared/shared.module';
import { ConclusionComponent } from './conclusion.component';
import { ConclusionDetailComponent } from './conclusion-detail.component';
import { ConclusionUpdateComponent } from './conclusion-update.component';
import { ConclusionDeleteDialogComponent } from './conclusion-delete-dialog.component';
import { conclusionRoute } from './conclusion.route';

@NgModule({
  imports: [AllscriptsSharedModule, RouterModule.forChild(conclusionRoute)],
  declarations: [ConclusionComponent, ConclusionDetailComponent, ConclusionUpdateComponent, ConclusionDeleteDialogComponent],
  entryComponents: [ConclusionDeleteDialogComponent]
})
export class AllscriptsConclusionModule {}
