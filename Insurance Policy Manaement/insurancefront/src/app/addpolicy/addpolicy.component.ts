import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { Policy } from '../policy';
import { PolicyserviceService } from '../policyservice.service';

@Component({
  selector: 'app-addpolicy',
  templateUrl: './addpolicy.component.html',
  styleUrls: ['./addpolicy.component.css']
})
export class AddpolicyComponent implements OnInit
{
  addPo : Array<Policy> = [];
  storeMsg: string = ""
  addP = new Policy(0,'','','','');

  constructor(private serv: PolicyserviceService) { }

  ngOnInit(): void
  {
  }

  loadPolicy(): void
  {
    this.serv.loadPolicyDetails().subscribe(res => this.addPo = res);
    console.log('Policies', this.addPo);
  }

  onSubmit()
  {
    alert("Policy Added Successful");
    this.serv.addpolicy(this.addP).subscribe(
      data => console.log('success',data),
      error => console.error('error',error)
    )

    /*console.log(ref.value);
    this.serv.addpolicy(ref.value).subscribe(res => this.storeMsg = res, error => console.log(error), () => this.loadPolicy());
    alert("Policy details added successfully!");*/
  }

}
