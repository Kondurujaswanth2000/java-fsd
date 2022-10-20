import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { ApprovedM } from 'src/approvedm';
import { Disapprove } from './ListDisapproved';
import { ApproveserviceService } from '../approveservice.service';
import { DisapproveserviceService } from '../disapproveservice.service';
import { DeleteapproveserviceService } from '../deleteapproveservice.service';

@Component({
  selector: 'app-customers',
  templateUrl: './customers.component.html',
  styleUrls: ['./customers.component.css']
})
export class CustomersComponent implements OnInit
{

  show : boolean=true;
  approved: boolean = false;
  disapproved: boolean = false;
  appM: any | undefined;
  disaM :any | undefined;

  pol: any;

  constructor(private httpClient: HttpClient,
    private approvedService: ApproveserviceService,
    private disapprovedService: DisapproveserviceService,
    private deleteapproveService: DeleteapproveserviceService) { }

  ngOnInit(): void
  {
    let res =  this.httpClient.get('http://localhost:9091/api/v1/approvals');
    res.subscribe((data)=>this.pol = data);
  }

  approve(userName:any,policyId:any)
  {
    this.show=!this.show;
    this.approved = !this.approved;
    this.appM = new ApprovedM(policyId,userName) ;
    console.log(this.appM);

    this.approvedService.approved(this.appM).subscribe(data =>
      console.log('succses', data),
      error => console.error('error', error))

    this.deleteapproveService.deleteapproval(userName).subscribe(data =>
      console.log('succses', data),
      error => console.error('error', error))

      alert('Approved!')
  }

  disapprove(userName:any,policyId:any)
  {
   this.show =!this.show;
   this.disapproved = !this.disapproved;
   this.disaM = new Disapprove(policyId,userName);

   this.disapprovedService.disapproved(this.disaM).subscribe(data =>
    console.log('succses', data),
    error => console.error('error', error))

   this.deleteapproveService.deleteapproval(userName).subscribe(data =>
    console.log('succses', data),
    error => console.error('error', error))

   alert('Dispproved!')
  }
}
