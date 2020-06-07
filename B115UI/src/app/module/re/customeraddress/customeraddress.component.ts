import { Component, OnInit } from '@angular/core';
import { FormGroup, Validators, FormBuilder } from '@angular/forms';
import { CustomerserService } from '../customerser.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-customeraddress',
  templateUrl: './customeraddress.component.html',
  styleUrls: ['./customeraddress.component.css']
})
export class CustomeraddressComponent implements OnInit {

  showMsg:boolean=false;
  constructor(public fb:FormBuilder,public service:CustomerserService,public router:Router) { }
  customeraddress:FormGroup;
  ngOnInit(): void {
    this.customeraddress =this.fb.group({
      customerAddressId :[0],		
      residenceIs:['' ,Validators.required],
      residenceAddress:['' ,[Validators.required,Validators.minLength(3)]], 
      area :['' ,[Validators.required,Validators.minLength(3)]],
      landmark :['' ,[Validators.required,Validators.minLength(3)]],
      city :['' ,[Validators.required,Validators.minLength(3)]],
      state :['' ,[Validators.required,Validators.minLength(3)]],
      country :['' ,[Validators.required,Validators.minLength(3)]],
      pincode:['' , [Validators.required, Validators.pattern('[0-9]{6}')]],
      residenceSince :['' ,Validators.required],   
      localResidenceIs :['' ,Validators.required],	
      localResidenceAddress :['' ,Validators.required],
      localArea :['' ,Validators.required],
      localLandmark:['' ,Validators.required],
      localCity :['' ,Validators.required],
      localState :['' ,Validators.required],
      localPincode:['' , [Validators.required, Validators.pattern('[0-9]{6}')]],
      localResidenceSince :['' ,Validators.required],
      status :[0]
  
    });   
  }

  onSubmit(){
    console.log(this.customeraddress.value)
    this.service.customerAddr=Object.assign({},this.customeraddress.value);
  this.showMsg=true;
  this.router.navigate(['role/re/customerdocument'])
  }
  // goToNextPage(){
  //   this.router.navigate(['role/re/customeremployementdetails'])
  // }
}
