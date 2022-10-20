import { Component, OnInit } from '@angular/core';
import { Router, ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-userdashboard',
  templateUrl: './userdashboard.component.html',
  styleUrls: ['./userdashboard.component.css']
})
export class UserdashboardComponent implements OnInit
{

  constructor(private router: Router, private route: ActivatedRoute) { }

  ngOnInit(): void
  {
  }

  re(a:any)
  {
    console.log("hello",a)
    this.router.navigate([a], {relativeTo: this.route});
  }

}
