import { Component, OnInit } from '@angular/core';
import { Router, ActivatedRoute } from '@angular/router';
import { Upda } from '../upda';
import { UpdaService } from '../upda.service';
import { UsernameService } from '../username.service';
import { UserloginserviceService } from '../userloginservice.service';

@Component({
  selector: 'app-updateuser',
  templateUrl: './updateuser.component.html',
  styleUrls: ['./updateuser.component.css']
})
export class UpdateuserComponent implements OnInit
{
  obj = new Upda('','','','','');

  constructor(private userv: UpdaService, private router: Router, private userserv: UserloginserviceService) { }

  ngOnInit(): void
  {
  }

  onSubmit()
  {
      alert("Updated Successfully");
      this.userv.enroll(this.obj).subscribe(data =>
      console.log('success', data),
      error => console.error('error', error))
  }
}
