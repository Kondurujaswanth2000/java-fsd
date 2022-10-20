import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { ActivatedRoute, Router } from '@angular/router';
import { AuthS } from '../AuthS.model';
import { AdminserviceService } from '../adminservice.service';
import { admin } from '../admin';

@Component({
  selector: 'app-admin',
  templateUrl: './admin.component.html',
  styleUrls: ['./admin.component.css']
})
export class AdminComponent implements OnInit
{
  //admin login obj
  adminModel = new admin('','');

  //auth obj
  authS: AuthS | undefined;

  constructor(private Adminlogin: AdminserviceService, private router: Router, private route: ActivatedRoute) { }

  ngOnInit(): void
  {
  }

  onSubmit(form: NgForm)
  {
    this.Adminlogin.authenticated(form.value.username, form.value.password).subscribe((res) => {
      this.authS = res;
      if (this.authS.authenticated)
      {
        alert("Successfully logged in!")
        this.router.navigate(['/adminhome'], { relativeTo: this.route});
      }
      else
      {
        alert("Invalid Credentials!")
        form.reset();
      }
    });
  }

}
