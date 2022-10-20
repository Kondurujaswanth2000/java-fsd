import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { User } from './user';

@Injectable({
  providedIn: 'root'
})
export class RecordService
{
  baseURL = "http://localhost:9091/api/v1/user";

  constructor(private httpClient: HttpClient) { }

  enroll(user:User)
  {
    return this.httpClient.post<any>(this.baseURL, user)
  }
}
