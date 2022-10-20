import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class DeleteapproveserviceService
{
  baseURL = "http://localhost:9091/api/v1/approvals/";

  constructor(private httpClient: HttpClient) { }

  public deleteapproval(id: String)
  {
    return this.httpClient.delete(this.baseURL + id);
  }
}
