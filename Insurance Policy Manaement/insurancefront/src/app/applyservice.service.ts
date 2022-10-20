import { Injectable } from '@angular/core';
import { Approve } from './ListApproved';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class ApplyserviceService
{
  baseURL = "http://localhost:9091/api/v1/approvals";

  constructor(private httpClient: HttpClient) { }

  apply(approvals: Approve)
  {
    console.log(approvals);
    return this.httpClient.post<any>(this.baseURL, approvals)
 }
}
