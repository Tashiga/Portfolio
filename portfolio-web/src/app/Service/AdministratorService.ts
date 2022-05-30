import {Observable} from "rxjs";
import {Injectable} from "@angular/core";
import {HttpClient} from "@angular/common/http";
import {Administrator} from "../Model/Administrator";

@Injectable({providedIn : "root"})
export class AdministratorService {
  private apiServerUrl = '';

  constructor(private http: HttpClient) {}

  public getAdministrators(): Observable<Administrator[]> {
    return this.http.get<Administrator[]>(`${this.apiServerUrl}/administrator/all`);
  }

  public addAdministrator(administrator: Administrator): Observable<Administrator> {
    return this.http.post<Administrator>(`${this.apiServerUrl}/administrator/add`, administrator);
  }

  public updateAdministrator(administrator: Administrator): Observable<Administrator> {
    return this.http.put<Administrator>(`${this.apiServerUrl}/administrator/update`, administrator);
  }

  public deleteAdministrator(administratorId: number): Observable<void> {
    return this.http.delete<void>(`${this.apiServerUrl}/administrator/delete/${administratorId}`);
  }

}
