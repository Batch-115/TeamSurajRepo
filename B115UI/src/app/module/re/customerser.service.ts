import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { CustomerEmploymentDetails } from './modelOfRegitraction/CustomerEmployementDetails';
import { CustomerLoanDetails } from './modelOfRegitraction/CustomerLoanDetails';
import { CustomerDetails } from './modelOfRegitraction/CustomerDetails';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Address } from './modelOfRegitraction/Address';
import { Product } from './modelOfRegitraction/Product';

//to send data in json format we have to write this 
let header = new HttpHeaders({'content-type': 'application/json'});

@Injectable({
  providedIn: 'root'
})
export class CustomerserService {

  constructor(public http:HttpClient,public fb:FormBuilder) { }
 

  public customerAddr:Address={
    customerAddressId :null,		 
    residenceIs: '',
    residenceAddress:  '',
	  area : '',
	  landmark : '',
	  city : '',
	  state : '',
	  country : '',
	  pincode: '',
	  residenceSince : '',
    localResidenceIs : '',	
	  localResidenceAddress : '',
	  localArea : '',
	  localLandmark: '',
	  localCity : '',
	  localState : '',	
	  localPincode: '',
    localResidenceSince : '',  
	   status :null
  }

  public customerEmp:CustomerEmploymentDetails={
      employeeDetailsId:null,
      employeeType:'',
      industryType:'',
      nameOfCompany:'',
      desgignation:'',
      addressOfCompany:'',
      status:null
  }

  public cusomterLoan:CustomerLoanDetails={
    loanId:null,
    loanCode:'',
    loanAmount:null,
    rateOfInterest:null,
    tenure:null,
    advanceEMI:null,
    processingFees:null,
    totalInterest:null,
    paymentOption:' ',
    status:null,
  }

  public productDetails:Product={
    productId:null,
    productName:'',
    productSpecification:'',
    productPrice:null,
    productStatus:null,
  }
  public imagedata:FormGroup=this.fb.group({

    documentId:null,
    addressProof:[''],
    idProof:[''],
    photo:[''],
    blankcheque:[''],
    bankStatement:[''],
    signature:[''],    
  
   })
  public customerDe:CustomerDetails={  
    customerId :null,
    customerFirstName  : '',
    customerMiddleName : '',
    customerLastName :'' ,
    customerDataOfBirth :'',
    customerGender : '',
    customerMaritailStatus :'',
    customerMobileNumber:'' ,    
    customerEducation : '',
    customerNetMonthlyIncome :'',
    customergmail : '',
    status : null,
    
    customerAddr:null,
    customerDocument:null,
    customerEmploymentDetails:null,
    customerLoanDetails:null,
    productDetails:null
  }
      //IMAGE 
  



   url:string="http://localhost:8083/CustomerRegister";

 

  public sendEnquiryDetails(enquiryData:any){
    return this.http.post(this.url+"/enquiry"+"/",enquiryData,{headers : header});
  }

  public getEnquiryDetails(){
    return this.http.get(this.url+"/enquiryDto");
  }

  public sendEmployementDetails(employementDetail:any){
    return this.http.post(this.url+"/employementDetails"+"/",employementDetail,{headers:header});
  }

  //for sending data  
  public sendData(){    //for set value 
     this.customerDe.customerAddr=this.customerAddr;
     this.customerDe.customerDocument=this.imagedata.value;
     this.customerDe.customerEmploymentDetails=this.customerEmp;
     this.customerDe.customerLoanDetails=this.cusomterLoan;
     this.customerDe.productDetails=this.productDetails;
    return this.http.post(this.url+"/customerDetails"+"/",this.customerDe,{headers:header});
  }

  //for login 
  public getCustomer(mobileNo:string){
    return this.http.get(this.url+"/getByNumber/"+mobileNo);
  }

  //new amount loan details
  public sendLoan(){
   this.customerDe.customerLoanDetails=this.cusomterLoan;
    return this.http.post(this.url+"/oldCustomer",this.customerDe);
  }

  public  get(id:number){
    return this.http.get(this.url+"/getById/"+id);
  }
}
