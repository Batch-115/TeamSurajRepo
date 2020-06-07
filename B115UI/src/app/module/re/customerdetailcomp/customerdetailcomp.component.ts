import { Component, OnInit } from '@angular/core';
import { FormGroup, FormBuilder, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { CustomerserService } from '../customerser.service';
import { CustomerDetails } from '../modelOfRegitraction/CustomerDetails';



@Component({
  selector: 'app-customerdetailcomp',
  templateUrl: './customerdetailcomp.component.html',
  styleUrls: ['./customerdetailcomp.component.css']
})
export class CustomerdetailcompComponent implements OnInit {
  
  
 customer:CustomerDetails;
 
 public customerDetails:FormGroup;

 showMsg:boolean=false;

  constructor(public fb:FormBuilder,public router:Router,public service:CustomerserService) {
  
   }  

  ngOnInit(): void {
    this.customerDetails=this.fb.group({
        customerId :null,
        customerFirstName  : ['',[Validators.required, Validators.minLength(3), Validators.pattern('[a-zA-Z ]*')]],
        customerMiddleName : ['' ,[Validators.required, Validators.minLength(3), Validators.pattern('[a-zA-Z ]*')]],
        customerLastName : ['' ,[Validators.required, Validators.minLength(3), Validators.pattern('[a-zA-Z ]*')]],
        customerDataOfBirth : ['',[Validators.required, Validators.pattern('(0[1-9]|[1-2][0-9]|3[0-1])\/(0[1-9]|1[0-2])\/[0-9]{4}')]],
        customerGender : ['' ,Validators.required],
        customerMaritailStatus :['',Validators.required],
        customerMobileNumber: ['',[Validators.required, Validators.pattern('[7-9][0-9]{9}')]],    
        customerEducation : ['' ,Validators.required],
        customerNetMonthlyIncome : ['' ,Validators.required],
        customergmail : ['' ,[Validators.required,Validators.email]],
        status : null,
        
     
    })
  }

  

  onSubmit(){
    console.log(this.customerDetails.value)
     this.customer=new CustomerDetails(this.customerDetails.value);
     this.service.customerDe=Object.assign({},this.customer);
     this.showMsg=true; 
     this.router.navigate(['role/re/customeraddress'])
  }
  // goToNextPage(){
  //   this.router.navigate(['role/re/customeraddress'])
  //  }
}
