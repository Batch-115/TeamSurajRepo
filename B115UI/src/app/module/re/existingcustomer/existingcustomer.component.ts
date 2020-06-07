import { Component, OnInit } from '@angular/core';
import { CustomerserService } from '../customerser.service';
import { Router } from '@angular/router';
import { CustomerDetails } from '../modelOfRegitraction/CustomerDetails';
@Component({
  selector: 'app-existingcustomer',
  templateUrl: './existingcustomer.component.html',
  styleUrls: ['./existingcustomer.component.css']
})
export class ExistingcustomerComponent implements OnInit {

  public u:any;
  customerMobileNumber:string;
    
//  customerDetails:CustomerDetails;

  constructor(public service:CustomerserService,public router:Router) { }

  ngOnInit(): void {
  }

  get(){   
    this.service.getCustomer(this.customerMobileNumber).subscribe((res:any)=>{this.u=res
    
    })
  }

  loan(id:number){
    this.service.get(id).subscribe((res:CustomerDetails)=>{this.service.customerDe=res;//{ console.log(res);}  
    this.service.customerAddr=Object.assign({},this.service.customerDe.customerAddr);
    this.service.customerEmp=Object.assign({},this.service.customerDe.customerEmploymentDetails);
    this.service.productDetails=Object.assign({},this.service.customerDe.productDetails) 
    this.service.cusomterLoan=Object.assign({},this.service.customerDe.customerLoanDetails); 
    this.service.customerDe=Object.assign({},this.service.customerDe);
    
  })
  
  this.router.navigate(['role/re/oldcustomerloan']);
  }

}
