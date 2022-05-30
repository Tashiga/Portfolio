import {Component, Inject, LOCALE_ID, Renderer2} from '@angular/core';
import {DOCUMENT} from "@angular/common";
import {Router} from "@angular/router";

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'Portfolio - Sashtiga';

  constructor(@Inject(DOCUMENT) doc: Document,
              router: Router,
              @Inject(LOCALE_ID) locale: string,
              renderer: Renderer2) {
    renderer.setAttribute(doc.documentElement, 'lang', locale);
    console.log("hello - home");
    router.navigate(['home']);
  }

}
