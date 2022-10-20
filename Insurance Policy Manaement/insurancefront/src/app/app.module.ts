import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HomeComponent } from './home/home.component';
import { HeaderComponent } from './header/header.component';
import { AdminComponent } from './admin/admin.component';

import { CarouselModule } from 'ngx-owl-carousel-o';
import { HttpClientModule } from '@angular/common/http';
import { FormsModule } from '@angular/forms';
import { AdminhComponent } from './adminh/adminh.component';
import { AdmindashboardComponent } from './admindashboard/admindashboard.component';
import { AddpolicyComponent } from './addpolicy/addpolicy.component';
import { ViewpolicyComponent } from './viewpolicy/viewpolicy.component';
import { CustomersComponent } from './customers/customers.component';
import { CustomerlistComponent } from './customerlist/customerlist.component';
import { UserloginComponent } from './userlogin/userlogin.component';
import { UserregisterComponent } from './userregister/userregister.component';
import { AboutComponent } from './about/about.component';
import { ApplyComponent } from './apply/apply.component';
import { FeedbackComponent } from './feedback/feedback.component';
import { UserhComponent } from './userh/userh.component';
import { UserdashboardComponent } from './userdashboard/userdashboard.component';
import { UpdateuserComponent } from './updateuser/updateuser.component';
import { ApplypolicyComponent } from './applypolicy/applypolicy.component';
import { QueriesComponent } from './queries/queries.component';
import { HistoryComponent } from './history/history.component';
import { PersonalComponent } from './personal/personal.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';

@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    HeaderComponent,
    AdminComponent,
    AdminhComponent,
    AdmindashboardComponent,
    AddpolicyComponent,
    ViewpolicyComponent,
    CustomersComponent,
    CustomerlistComponent,
    UserloginComponent,
    UserregisterComponent,
    AboutComponent,
    ApplyComponent,
    FeedbackComponent,
    UserhComponent,
    UserdashboardComponent,
    UpdateuserComponent,
    ApplypolicyComponent,
    QueriesComponent,
    HistoryComponent,
    PersonalComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule,
    CarouselModule,
    BrowserAnimationsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
