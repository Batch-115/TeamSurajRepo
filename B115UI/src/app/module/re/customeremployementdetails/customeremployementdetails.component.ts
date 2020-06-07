import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { FormBuilder, Validators, FormGroup } from '@angular/forms';
import { CustomerserService } from '../customerser.service';
import { CustomerEmploymentDetails } from '../modelOfRegitraction/CustomerEmployementDetails';



@Component({
  selector: 'app-customeremployementdetails',
  templateUrl: './customeremployementdetails.component.html',
  styleUrls: ['./customeremployementdetails.component.css']
})
export class CustomeremployementdetailsComponent implements OnInit {

   customer:CustomerEmploymentDetails;
   customerEmployementDetails:FormGroup;

   showMsg: boolean = false;

  constructor(public router:Router,public fb:FormBuilder,public service:CustomerserService) { }
  
  ngOnInit(): void {
    this.customerEmployementDetails=this.fb.group({
      employeeDetailsId:['0'],
      employeeType:['',[Validators.required,Validators.minLength(3)]],
      industryType:['',[Validators.required,Validators.minLength(3)]],
      nameOfCompany:['',[Validators.required,Validators.minLength(3)]],
      desgignation:['',[Validators.required,Validators.minLength(3)]],
      addressOfCompany:['',[Validators.required,Validators.minLength(3)]],
      status:['',Validators.required]
    })
  }   

  onSubmit(){   
    this.customer=new CustomerEmploymentDetails(this.customerEmployementDetails.value);
    this.service.customerEmp=Object.assign({},this.customer);
    this.showMsg=true;
    this.router.navigate(['/role/re/customerloan']);  
  }   
//   goToNextPage(){
//  this.router.navigate(['/role/re/customerloan']);
//   } 
}
