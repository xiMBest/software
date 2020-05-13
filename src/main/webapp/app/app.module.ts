import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import './vendor';
import { AllscriptsSharedModule } from 'app/shared/shared.module';
import { AllscriptsCoreModule } from 'app/core/core.module';
import { AllscriptsAppRoutingModule } from './app-routing.module';
import { AllscriptsHomeModule } from './home/home.module';
import { AllscriptsEntityModule } from './entities/entity.module';
// jhipster-needle-angular-add-module-import JHipster will add new module here
import { MainComponent } from './layouts/main/main.component';
import { NavbarComponent } from './layouts/navbar/navbar.component';
import { FooterComponent } from './layouts/footer/footer.component';
import { PageRibbonComponent } from './layouts/profiles/page-ribbon.component';
import { ErrorComponent } from './layouts/error/error.component';

@NgModule({
  imports: [
    BrowserModule,
    AllscriptsSharedModule,
    AllscriptsCoreModule,
    AllscriptsHomeModule,
    // jhipster-needle-angular-add-module JHipster will add new module here
    AllscriptsEntityModule,
    AllscriptsAppRoutingModule
  ],
  declarations: [MainComponent, NavbarComponent, ErrorComponent, PageRibbonComponent, FooterComponent],
  bootstrap: [MainComponent]
})
export class AllscriptsAppModule {}
