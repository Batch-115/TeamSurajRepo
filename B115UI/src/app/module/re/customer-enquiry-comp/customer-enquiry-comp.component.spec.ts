import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { CustomerEnquiryCompComponent } from './customer-enquiry-comp.component';

describe('CustomerEnquiryCompComponent', () => {
  let component: CustomerEnquiryCompComponent;
  let fixture: ComponentFixture<CustomerEnquiryCompComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ CustomerEnquiryCompComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(CustomerEnquiryCompComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
