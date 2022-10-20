import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { ApprovedM } from 'src/approvedm';

@Injectable({
  providedIn: 'root'
})
export class ApproveserviceService
{
  baseURL = "http://localhost:9091/api/v1/approved";

  constructor(private httpClient: HttpClient) { }

  approved(approved: ApprovedM)
  {
    console.log(approved);
    return this.httpClient.post<any>(this.baseURL, approved)
 }
}
