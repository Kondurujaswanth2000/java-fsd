import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { UsernameService } from '../username.service';
import { Approve } from '../ListApproved';
import { ApplyserviceService } from '../applyservice.service';

@Component({
  selector: 'app-applypolicy',
  templateUrl: './applypolicy.component.html',
  styleUrls: ['./applypolicy.component.css']
})
export class ApplypolicyComponent implements OnInit
{
  pol : any;
  username: string | undefined;
  app: any | undefined;

  constructor(private httpClient: HttpClient,
    private unserv: UsernameService,
    private appServ: ApplyserviceService
    ) { }

  ngOnInit(): void
  {
    let res = this.httpClient.get("http://localhost:9091/api/v1/policies");
    res.subscribe((data)=>this.pol = data);
    this.username = this.unserv.getUsername();
    console.log(this.username);
  }

  show(obj: any)
  {
    var userName:string | undefined;
    var policyId:string;
    userName = this.username!;
    policyId = obj;
    console.log(userName, policyId);
    this.app = new Approve(policyId,userName);

    this.appServ.apply(this.app).subscribe(data =>
      console.log('success', data),
      error => console.error('error', error))

    alert('Policy applied!')
   }

}
