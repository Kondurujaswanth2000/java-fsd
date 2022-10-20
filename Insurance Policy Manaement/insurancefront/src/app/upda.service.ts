import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Upda } from './upda';

@Injectable({
  providedIn: 'root'
})
export class UpdaService
{
  baseURL = "http://localhost:9091/api/v1/user";
  constructor(private httpClient: HttpClient) { }

  enroll(update: Upda)
  {
    return this.httpClient.post<any>(this.baseURL, update)
  }
}
