import { Component, OnInit } from '@angular/core';
import { FormGroup, FormBuilder, Validators } from '@angular/forms';
import { CustomerserService } from '../customerser.service';
import { CustomerLoanDetails } from '../modelOfRegitraction/CustomerLoanDetails';
import { Router } from '@angular/router';

@Component({
  selector: 'app-customerloandetails',
  templateUrl: './customerloandetails.component.html',
  styleUrls: ['./customerloandetails.component.css']
})
export class CustomerloandetailsComponent implements OnInit {

  customer:CustomerLoanDetails;
  cusomterLoan:FormGroup;

  showMsg:boolean=false;

  constructor(public fb:FormBuilder,public service :CustomerserService,public router:Router) { }

  ngOnInit(): void {
    this.cusomterLoan=this.fb.group({
      loanId:['0'],
      loanCode:['',[Validators.required, Validators.pattern(/^-?(0|[1-9]\d*)?$/)]],
      loanAmount:['',[Validators.required, Validators.pattern(/^-?(0|[1-9]\d*)?$/)]],
      rateOfInterest:['',[Validators.required, Validators.pattern(/^-?(0|[1-9]\d*)?$/)]],
      tenure:['',[Validators.required, Validators.pattern(/^-?(0|[1-9]\d*)?$/)]],
      advanceEMI:['',[Validators.required, Validators.pattern(/^-?(0|[1-9]\d*)?$/)]],
      processingFees:['',[Validators.required, Validators.pattern(/^-?(0|[1-9]\d*)?$/)]],
      totalInterest:['',[Validators.required, Validators.pattern(/^-?(0|[1-9]\d*)?$/)]],
      paymentOption:['',Validators.required],
      status:['',Validators.required]
    })
  }

  onSubmit(){
   this.customer=new CustomerLoanDetails(this.cusomterLoan.value);
   this.service.cusomterLoan=Object.assign({},this.customer);
    this.showMsg=true;
    this.router.navigate(['/role/re/productdetails']);
  }
 

}
