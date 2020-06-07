import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { CustomerdetailcompComponent } from './customerdetailcomp.component';

describe('CustomerdetailcompComponent', () => {
  let component: CustomerdetailcompComponent;
  let fixture: ComponentFixture<CustomerdetailcompComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ CustomerdetailcompComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(CustomerdetailcompComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
