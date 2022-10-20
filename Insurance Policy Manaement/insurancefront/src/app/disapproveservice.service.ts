import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Disapprove } from './customers/ListDisapproved';

@Injectable({
  providedIn: 'root'
})
export class DisapproveserviceService
{
  baseURL = "http://localhost:9091/api/v1/disapproved";

  constructor(private httpClient: HttpClient) { }

  disapproved(disapprove: Disapprove)
  {
    console.log(disapprove);
    return this.httpClient.post<any>(this.baseURL, disapprove)
 }
}
