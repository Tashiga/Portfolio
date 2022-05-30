import {RouterModule, Routes} from "@angular/router";
import {HomeComponent} from "./Components/home/home.component";
import {NgModule} from "@angular/core";

const routes : Routes = [
  { path: 'home', component: HomeComponent},
  { path: '', component: HomeComponent, pathMatch: 'full'},
  { path: '**', redirectTo: ''},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
