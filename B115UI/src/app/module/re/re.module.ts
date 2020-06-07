import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { RedashboardComponent } from './redashboard/redashboard.component';
import { Routes, RouterModule } from '@angular/router';
import { CustomerEnquiryCompComponent } from './customer-enquiry-comp/customer-enquiry-comp.component';
import { CustomeremployementdetailsComponent } from './customeremployementdetails/customeremployementdetails.component';
import { CustomerloandetailsComponent } from './customerloandetails/customerloandetails.component';
import {ReactiveFormsModule,FormsModule} from "@angular/forms/"
import { CustomerserService } from './customerser.service';
import {HttpClientModule} from "@angular/common/http";
import { ListcustomerenquiryComponent } from './listcustomerenquiry/listcustomerenquiry.component';
import { CustomerdetailcompComponent } from './customerdetailcomp/customerdetailcomp.component';
import { CustomeraddressComponent } from './customeraddress/customeraddress.component';
import { CustomerdocumentComponent } from './customerdocument/customerdocument.component';
import { ProductDetailsComponent } from './product-details/product-details.component';
import { ExistingcustomerComponent } from './existingcustomer/existingcustomer.component';
import { OldCustomerLoanComponent } from './old-customer-loan/old-customer-loan.component';

const rerouting:Routes=[
  {path:'redashboard',component:RedashboardComponent},
  {path:'customeremployementdetails',component:CustomeremployementdetailsComponent},
  {path:'customerloan',component:CustomerloandetailsComponent},
  {path:'customerenquiry',component:CustomerEnquiryCompComponent},
  {path:'listcustomerenquiry',component:ListcustomerenquiryComponent},
  {path:'customerdetail',component:CustomerdetailcompComponent},
  {path:'customeraddress',component:CustomeraddressComponent},
  {path:'customerdocument',component:CustomerdocumentComponent},
  {path:'productdetails',component:ProductDetailsComponent},
  {path:'existingcustomer',component:ExistingcustomerComponent},
  {path:'oldcustomerloan',component:OldCustomerLoanComponent}
]
@NgModule({
  declarations: [RedashboardComponent, CustomerEnquiryCompComponent, CustomeremployementdetailsComponent, CustomerloandetailsComponent, ListcustomerenquiryComponent, CustomerdetailcompComponent, CustomeraddressComponent, CustomerdocumentComponent,  ProductDetailsComponent, ExistingcustomerComponent, OldCustomerLoanComponent],
  imports: [
    CommonModule,ReactiveFormsModule,FormsModule,HttpClientModule,
    RouterModule.forChild(rerouting)
  ],
  exports:[RouterModule,ReactiveFormsModule,FormsModule],
  providers:[CustomerserService]
})
export class ReModule { }
