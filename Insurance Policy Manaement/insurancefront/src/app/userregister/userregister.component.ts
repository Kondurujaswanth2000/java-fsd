import { Component, OnInit } from '@angular/core';
import { Router, ActivatedRoute } from '@angular/router';
import { User } from '../user';
import { RecordService } from '../record.service';

@Component({
  selector: 'app-userregister',
  templateUrl: './userregister.component.html',
  styleUrls: ['./userregister.component.css']
})
export class UserregisterComponent implements OnInit
{

  userM = new User('','','','','');

  constructor(private recordS: RecordService, private router: Router) { }

  ngOnInit(): void
  {
  }

  onSubmit()
  {
    alert("User registration Successful!");
    this.recordS.enroll(this.userM).subscribe(data =>
      console.log('success', data),
      error => console.error('error', error))

      this.router.navigate(['/login']);
  }

}
