import { Component, OnInit } from '@angular/core';
import { Validators, FormGroup, FormBuilder } from '@angular/forms';
import { CustomerserService } from '../customerser.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-old-customer-loan',
  templateUrl: './old-customer-loan.component.html',
  styleUrls: ['./old-customer-loan.component.css']
})
export class OldCustomerLoanComponent implements OnInit {

  constructor(public fb:FormBuilder,public service :CustomerserService,public router:Router) { }
  cusomterLoan:FormGroup;
  
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
    this.service.cusomterLoan=Object.assign({},this.cusomterLoan.value);
    this.service.sendLoan().subscribe();
  }

}
