import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-customerlist',
  templateUrl: './customerlist.component.html',
  styleUrls: ['./customerlist.component.css']
})
export class CustomerlistComponent implements OnInit
{
  user: any;
  pol: any;

  constructor(private httpClient: HttpClient) { }

  ngOnInit(): void
  {
    let res1 = this.httpClient.get("http://localhost:9091/api/v1/approved");
    res1.subscribe((data) => this.user = data);

    let res2 = this.httpClient.get('http://localhost:9091/api/v1/disapproved');
    res2.subscribe((data) => this.pol = data);
  }

}
