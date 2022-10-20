import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';
import { AuthS } from './AuthS.model';

@Injectable({
  providedIn: 'root'
})
export class UserloginserviceService
{
  //userName: string | undefined ;

  constructor(private httpClient: HttpClient) { }

  authenticated(
    userName: string,
    password: string
): Observable<AuthS> {
    let body = {
        userName: userName,
        password: password,
    };
    let headers = new HttpHeaders({
        'content-type': 'application/json',
    });
    return this.httpClient.post<AuthS>(
        'http://localhost:9091/api/v1/login',
        body,
        {
            headers: headers,
        }
    );
    //this.uname = userName;
}

}
