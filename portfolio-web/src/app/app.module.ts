import {NgModule, LOCALE_ID, CUSTOM_ELEMENTS_SCHEMA} from '@angular/core';
import{APP_BASE_HREF, DatePipe, DecimalPipe, TitleCasePipe} from "@angular/common";
import { RouterModule } from '@angular/router';
import { BrowserModule } from '@angular/platform-browser';
import {AppRoutingModule} from "./app-routing.module";

import { AppComponent } from './app.component';
import {HeaderComponent} from "./Components/header/header.component";
import {FooterComponent} from "./Components/footer/footer.component";
import {HomeComponent} from "./Components/home/home.component";

export function getBaseHref(LOCALE_ID: string): string{
  return "/"+LOCALE_ID;
}

@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    HeaderComponent,
    FooterComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    RouterModule
  ],
  providers: [
    DatePipe,
    TitleCasePipe,
    DecimalPipe,
    {
      provide : APP_BASE_HREF,
      useFactory: getBaseHref,
      deps: [LOCALE_ID]
    },
  ],
  bootstrap: [AppComponent],
  schemas: [CUSTOM_ELEMENTS_SCHEMA]
})
export class AppModule { }
