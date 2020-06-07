import { Component, OnInit } from '@angular/core';
import { CustomerserService } from '../customerser.service';
import { FormGroup, FormBuilder, Validators } from '@angular/forms';
import { Router } from '@angular/router';

@Component({
  selector: 'app-product-details',
  templateUrl: './product-details.component.html',
  styleUrls: ['./product-details.component.css']
})
export class ProductDetailsComponent implements OnInit {

  showMsg:boolean=false;
  constructor(public service:CustomerserService,public fb:FormBuilder,public router:Router) { }

  ngOnInit(): void {
  }
  public productDetails:FormGroup=this.fb.group({
    productId:[''],
    productName:['',[Validators.required,Validators.pattern('^[a-zA-Z]+$')]],
    productSpecification:[''],
    productPrice:['',[Validators.required, Validators.pattern(/^-?(0|[1-9]\d*)?$/)]],
    productStatus:[''],
  
   })


   onSubmit(){
   this.service.productDetails=Object.assign({},this.productDetails.value);
   this.service.sendData().subscribe();   
   this.showMsg=true;
   
   }
 
   goTo(){
    this.router.navigate(['role/re/redashboard']);
   }
    
}
