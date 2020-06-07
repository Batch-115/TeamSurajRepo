import { TestBed } from '@angular/core/testing';

import { CustomerserService } from './customerser.service';

describe('CustomerserService', () => {
  let service: CustomerserService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(CustomerserService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
