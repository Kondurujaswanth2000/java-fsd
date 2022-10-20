import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class DeleteserviceService
{
  BaseURL = "http://localhost:9091/api/v1/policy/";

  constructor(private httpClient: HttpClient) { }

  public deletePolicy(id: any)
  {
    return this.httpClient.delete(this.BaseURL + id);
  }

  public updatePolicy(obj: Object)
  {
    return this.httpClient.put("http://localhost:9091/api/v1/updaPol/", obj);
  }
}
