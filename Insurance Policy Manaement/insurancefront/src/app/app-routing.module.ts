import { Component, NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AboutComponent } from './about/about.component';
import { AddpolicyComponent } from './addpolicy/addpolicy.component';
import { AdminComponent } from './admin/admin.component';
import { ApplyComponent } from './apply/apply.component';
import { FeedbackComponent } from './feedback/feedback.component';
import { CustomerlistComponent } from './customerlist/customerlist.component';
import { CustomersComponent } from './customers/customers.component';
import { HistoryComponent } from './history/history.component';
import { HomeComponent } from './home/home.component';
import { PersonalComponent } from './personal/personal.component';
import { ApplypolicyComponent } from './applypolicy/applypolicy.component';
import { QueriesComponent } from './queries/queries.component';
import { UserregisterComponent } from './userregister/userregister.component';
import { UpdateuserComponent } from './updateuser/updateuser.component';
import { UserdashboardComponent } from './userdashboard/userdashboard.component';
import { ViewpolicyComponent } from './viewpolicy/viewpolicy.component';
import { UserloginComponent } from './userlogin/userlogin.component';
import { AdmindashboardComponent } from './admindashboard/admindashboard.component';

const routes: Routes = [
  {path:"",redirectTo:"home",pathMatch:"full"},
  {path:'home',component:HomeComponent},
  {path: 'adminhome', component: AdmindashboardComponent},
  {path: 'customers', component:CustomersComponent},
  {path: 'addpolicies', component:AddpolicyComponent},
  {path: 'viewpolicies', component:ViewpolicyComponent},
  {path: 'about', component:AboutComponent},
  {path: 'customerhistory', component:CustomerlistComponent},
  {path: 'register', component:UserregisterComponent},
  {path: 'contact', component:FeedbackComponent},
  {path: 'admin', component:AdminComponent},
  {path: 'policy', component:ApplypolicyComponent},
  {path: 'history', component:HistoryComponent},
  {path: 'login', component:UserloginComponent},
  {path: 'update', component:UpdateuserComponent},
  {path: 'user', component:UserdashboardComponent,

    children:
    [
      {path: 'query', component:QueriesComponent},
      {path: 'policie',component:ApplyComponent},
      {path: 'personal', component:PersonalComponent}
    ]
  },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
