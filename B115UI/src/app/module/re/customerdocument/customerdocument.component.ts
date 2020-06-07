import { Component, OnInit, ViewChild, ElementRef } from '@angular/core';
import { CustomerserService } from '../customerser.service';
import { DomSanitizer } from '@angular/platform-browser';
import { HttpResponse, HttpEventType } from '@angular/common/http';
import { FormGroup, FormBuilder } from '@angular/forms';
import { Router } from '@angular/router';

@Component({
  selector: 'app-customerdocument',
  templateUrl: './customerdocument.component.html',
  styleUrls: ['./customerdocument.component.css']
})
export class CustomerdocumentComponent implements OnInit {

  constructor(public custdoc:CustomerserService,public ds:DomSanitizer,public formBuilder:FormBuilder,public router:Router) { }

  
  retrievedImage: any;
  base64Data : any;
  retrieveResonse: any;
  message: string;
  imageName: any;
  imageid:any;
  imageaddressproof:any;
  imageidproof:any;
  imagephoto:any;
  imagecheque:any;
  public docname:any;
 public dname:any;


  address:any;
  idproof:any;
  photo:any;
  blankcheque:any;
  bankstatement:any;
  signature:any;
  progress:any;
 ad:any;
  ngOnInit(): void {
  }


  public onFileChanged(event,name){
        const reader=new FileReader();
    if(name=="addressProof"){      
      reader.onload=(e:any)=>{
        this.address=e.target.result;
        console.log(this.address);
      }
      reader.readAsDataURL(event.target.files[0]);
      console.log(name);
    }   


    if(name=="idProof"){
      reader.onload=(e:any)=>{
        this.idproof=e.target.result;
        console.log(this.idproof);

      }

      reader.readAsDataURL(event.target.files[0]);
   
      console.log(name);
    }


    if(name=="photo"){
      reader.onload=(e:any)=>{
        this.photo=e.target.result;
        console.log(this.photo);

      }

      reader.readAsDataURL(event.target.files[0]);
   
      console.log(name);
    }


    if(name=="blankcheque"){
      reader.onload=(e:any)=>{
        this.blankcheque=e.target.result;
        console.log(this.blankcheque);

      }

      reader.readAsDataURL(event.target.files[0]);
   
      console.log(name);
    }


    if(name=="bankStatement"){
      reader.onload=(e:any)=>{
        this.bankstatement=e.target.result;
        console.log(this.bankstatement);

      }

      reader.readAsDataURL(event.target.files[0]);
   
      console.log(name);
    }


    if(name=="signature"){
      reader.onload=(e:any)=>{
        this.signature=e.target.result;
        console.log(this.signature);

      }

      reader.readAsDataURL(event.target.files[0]);
   
      console.log(name);
    }

  }

  @ViewChild('signature') 
  sig: ElementRef;

  @ViewChild('bankStatement') 
  bs: ElementRef;

  @ViewChild('blankcheque') 
  bc: ElementRef;

  @ViewChild('photo') 
  ph: ElementRef;

  @ViewChild('idProof') 
  idp: ElementRef;


  @ViewChild('address') 
  ap: ElementRef;

  reset() {
      this.sig.nativeElement.value = '';
      this.bs.nativeElement.value = '';
      this.bc.nativeElement.value = '';
      this.ph.nativeElement.value = '';
      this.idp.nativeElement.value = '';
      this.ap.nativeElement.value = '';
  }

  public onUpload() {

    this.custdoc.imagedata.setValue({
      documentId:null,
      addressProof:this.address,
      idProof:this.idproof,
      photo:this.photo,
      blankcheque:this.blankcheque,
      bankStatement:this.bankstatement,
      signature:this.signature
    })
    
    this.router.navigate(['role/re/customeremployementdetails'])
   }

  //   this.custdoc.submitdocument(this.custdoc.imagedata.value).subscribe(event=>{

  //     if(event.type===HttpEventType.UploadProgress){
        
  //       const percentDone=Math.round(100*event.loaded/event.total);
  //       this.progress=percentDone;
  //       console.log(`File is ${percentDone}% uploaded.`);

  //     }else if(event instanceof HttpResponse){
  //       console.log('file is completely uploaded')

  //     }

  //   });
   
  // }


}
