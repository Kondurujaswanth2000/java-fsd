import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Policy } from './policy';
import { Observable } from 'rxjs';
import { text } from 'stream/consumers';

@Injectable({
  providedIn: 'root'
})
export class PolicyserviceService
{
  baseURL1 = "http://localhost:9091/api/v1/policy";
  baseURL2 = "http://localhost:9091/api/v1/policies";
  baseURL3 = "http://localhost:9091/api/v1/updaPol";

  constructor(private httpClient: HttpClient) { }

  addpolicy(addp: Policy): Observable<string>
  {
    return this.httpClient.post(this.baseURL1, addp, { responseType: 'text' });
  }

  deleteProductDetails(polid: number): Observable<string>
  {
    return this.httpClient.delete(this.baseURL1 + polid, { responseType: 'text' });
  }

  loadPolicyDetails(): Observable<Policy[]>
  {
    return this.httpClient.get<Policy[]>(this.baseURL2);
  }

  updatePolicyInfo(pol: any): Observable<string>
  {
    return this.httpClient.patch(this.baseURL3, pol, { responseType: 'text'});
  }
}
