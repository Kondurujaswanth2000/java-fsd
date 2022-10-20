import { TestBed } from '@angular/core/testing';

import { ApproveserviceService } from './approveservice.service';

describe('ApproveserviceService', () => {
  let service: ApproveserviceService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(ApproveserviceService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
