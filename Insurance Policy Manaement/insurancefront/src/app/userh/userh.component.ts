import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { UsernameService } from '../username.service';

@Component({
  selector: 'app-userh',
  templateUrl: './userh.component.html',
  styleUrls: ['./userh.component.css']
})
export class UserhComponent implements OnInit
{
  username:string|undefined;

  constructor(private unserv: UsernameService, private httpClient: HttpClient) { }

  ngOnInit(): void
  {
    this.username = this.unserv.getUsername();
  }

  logout()
  {
    let res =  this.httpClient.get('http://localhost:9091/api/v1/logout').subscribe(data => console.log('success', data),error => console.error('error', error))
   }

}
