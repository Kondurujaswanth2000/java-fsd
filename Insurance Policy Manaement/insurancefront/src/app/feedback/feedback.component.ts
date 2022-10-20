import { Component, OnInit } from '@angular/core';
import { Router, ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-feedback',
  templateUrl: './feedback.component.html',
  styleUrls: ['./feedback.component.css']
})
export class FeedbackComponent implements OnInit
{

  constructor(private router: Router, private route: ActivatedRoute) { }

  ngOnInit(): void
  {
  }

  onSubmit()
  {
    alert('Feedback submitted successfully!');
    this.router.navigate(['/user']);
  }

}
