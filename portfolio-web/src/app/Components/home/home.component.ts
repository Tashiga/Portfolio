import {Component, Inject, LOCALE_ID, OnInit} from "@angular/core";
import {Router} from "@angular/router";

@Component({
  selector:'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit{

  constructor(private router: Router,
              // private userProfileService : UserProfileService,
              @Inject(LOCALE_ID) protected localId: string) {
    console.log("HomeComponent");
  }

  ngOnInit() {
    console.log("Hello");
    this.routeTo('home');
    console.log("Bye");

  }

  routeTo(path: string) {
    this.router.navigate([path]);
  }
}
