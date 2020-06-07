import { Component, OnInit } from '@angular/core';
import { FormBuilder, Validators, FormGroup } from '@angular/forms';
import { Enquiry } from '../modelOfRegitraction/Enquiry';
import { CustomerserService } from '../customerser.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-customer-enquiry-comp',
  templateUrl: './customer-enquiry-comp.component.html',
  styleUrls: ['./customer-enquiry-comp.component.css']
})
export class CustomerEnquiryCompComponent implements OnInit {

 addEnquiryDetails:FormGroup;

  constructor(  private fb:FormBuilder,public service:CustomerserService,public router:Router) {}

  ngOnInit(): void {
    this.addEnquiryDetails=this.fb.group({
       enquiryId:['0'],
      
       firstName:['',Validators.required], 
       lastName:['',Validators.required],
       mobileNo:['',Validators.required],
       email:['',[Validators.required]],
       productName:['',Validators.required],
       state:['',Validators.required],
       city:['',Validators.required]
   })
  }

 
   onSubmit(){
    let data = JSON.stringify(this.addEnquiryDetails.value);
     this.service.sendEnquiryDetails(data).subscribe();
     this.router.navigate(['role/re/listcustomerenquiry']);
      
   }

   goTo(){
    this.router.navigate(['role/re/listcustomerenquiry']);
   }
}
