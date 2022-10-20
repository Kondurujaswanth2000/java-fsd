import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { DeleteserviceService } from '../deleteservice.service';
import { PolicyserviceService } from '../policyservice.service';
import { Policy } from '../policy';


@Component({
  selector: 'app-viewpolicy',
  templateUrl: './viewpolicy.component.html',
  styleUrls: ['./viewpolicy.component.css']
})
export class ViewpolicyComponent implements OnInit
{

  pol: any;
  BaseURL = "http://localhost:9091/api/v1/policies";
  polics : Array<Policy> = [];

  flag: boolean = false;
  policy_id: number = 0;
  policyName:string = "";
  amount:string = "";
  tenureInYears:string = "";
  category:string = "";
  updateMsg: string = ""
  deleteMsg: string = ""

  constructor(private httpClient: HttpClient,private deleteservice: DeleteserviceService, private polServ: PolicyserviceService) { }

  ngOnInit(): void
  {
    let res = this.httpClient.get(this.BaseURL);
    res.subscribe((data) => this.pol = data);
    //this.loadPolicy();
  }

  deletePolicy(obj: any)
  {
    alert("Policy deleted Successfully!");
    this.deleteservice.deletePolicy(obj.policyId).subscribe((resp) =>
      {
        console.log(resp);
      },
      (err) =>
      {
        console.log(err);
      }
    );
    //this.polServ.deleteProductDetails(polid).subscribe(res => this.deleteMsg = res, error => console.log(error), () => this.loadPolicy());
  }

  updatePolicyAll()
  {
    let poli = {"policy_id": this.policy_id, "policyName": this.policyName, "amount": this.amount, "tenureInYears": this.tenureInYears, "category": this.category};
    console.log(poli);
    alert("Policy updated successfully!");
    this.deleteservice.updatePolicy(poli.policy_id).subscribe((resp) =>
    {
      console.log(resp);
    },
    (err) =>
    {
      console.log(err);
    }
    );
  }

  //userModelObj: any

  updatePolicy(poli: any)
  {
    console.log(poli);
    this.flag = true;
    this.policy_id = poli.policy_id;
    this.policyName = poli.policyName;
    this.amount = poli.amount;
    this.tenureInYears = poli.tenureInYears;
    this.category = poli.category;
  }
}
