import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class UsernameService
{
  username:string|undefined;

  constructor() { }

  //getters and setters
  setUsername(data: string | undefined)
  {
    this.username = data;
  }

  getUsername()
  {
    return this.username;
  }
}
