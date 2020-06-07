import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { CustomeremployementdetailsComponent } from './customeremployementdetails.component';

describe('CustomeremployementdetailsComponent', () => {
  let component: CustomeremployementdetailsComponent;
  let fixture: ComponentFixture<CustomeremployementdetailsComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ CustomeremployementdetailsComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(CustomeremployementdetailsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
