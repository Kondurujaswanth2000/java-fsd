import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from "@angular/common/http";
import { Observable } from 'rxjs';
import { AuthS } from './AuthS.model';

@Injectable({
  providedIn: 'root'
})
export class AdminserviceService
{
  constructor(private httpClient: HttpClient) { }

  authenticated
  (
    username: string,
    password: string
  ): Observable<AuthS>
  {
    let body =
    {
        username: username,
        password: password,
    };
    let headers = new HttpHeaders({
        'content-type': 'application/json',
    });
    return this.httpClient.post<AuthS>(
        'http://localhost:9091/api/v1/adminlogin',
        body,
        {
            headers: headers,
        }
    );
}
}
