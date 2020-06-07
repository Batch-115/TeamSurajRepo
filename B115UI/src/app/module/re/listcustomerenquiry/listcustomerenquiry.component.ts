import { Component, OnInit } from '@angular/core';
import { CustomerserService } from '../customerser.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-listcustomerenquiry',
  templateUrl: './listcustomerenquiry.component.html',
  styleUrls: ['./listcustomerenquiry.component.css']
})
export class ListcustomerenquiryComponent implements OnInit {

  headElements = [ 'First', 'Last', 'MobileNo','Product Name','City'];
  enquiry:any[];
  constructor(public service:CustomerserService,public router:Router) { }

  ngOnInit(): void {
   this.service.getEnquiryDetails().subscribe((data:any)=>
   this.enquiry=data
   
   )
  }

  goBack(){
  this.router.navigate(['role/re/customerenquiry'])
  }
  
}
