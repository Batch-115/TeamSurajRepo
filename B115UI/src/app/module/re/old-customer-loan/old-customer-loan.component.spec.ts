import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { OldCustomerLoanComponent } from './old-customer-loan.component';

describe('OldCustomerLoanComponent', () => {
  let component: OldCustomerLoanComponent;
  let fixture: ComponentFixture<OldCustomerLoanComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ OldCustomerLoanComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(OldCustomerLoanComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
