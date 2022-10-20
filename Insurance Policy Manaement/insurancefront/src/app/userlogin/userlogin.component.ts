import { Component, OnInit } from '@angular/core';
import { ActivatedRoute,Router } from '@angular/router';
import { NgForm } from '@angular/forms';
import { AuthS } from '../AuthS.model';
import { UserLogin } from '../userLogin';
import { UserloginserviceService } from '../userloginservice.service';
import { UsernameService } from '../username.service';

@Component({
  selector: 'app-userlogin',
  templateUrl: './userlogin.component.html',
  styleUrls: ['./userlogin.component.css']
})
export class UserloginComponent implements OnInit
{
  authStatus: AuthS | undefined;
  loginModel = new UserLogin('','');

  constructor(private loginService: UserloginserviceService,
    private usernameService: UsernameService,
    private router: Router,
    private route: ActivatedRoute) { }

  ngOnInit(): void
  {
  }

  onSubmit(form: NgForm) {
    console.log(form.value.userName, form.value.password);

    this.loginService
    .authenticated(form.value.userName, form.value.password)
    .subscribe((res) => {
      this.authStatus = res;
      console.log(res);
      if (this.authStatus.authenticated) {
        this.usernameService.setUsername(res.userName);
        alert("Successfully logged in!")
        this.router.navigate(['/user'], { relativeTo: this.route});
      }
      else {
        alert("Invalid Credentials!")
        form.reset();
      }
    });
  }

}
