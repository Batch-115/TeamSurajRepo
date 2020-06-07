import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ListcustomerenquiryComponent } from './listcustomerenquiry.component';

describe('ListcustomerenquiryComponent', () => {
  let component: ListcustomerenquiryComponent;
  let fixture: ComponentFixture<ListcustomerenquiryComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ListcustomerenquiryComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ListcustomerenquiryComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
