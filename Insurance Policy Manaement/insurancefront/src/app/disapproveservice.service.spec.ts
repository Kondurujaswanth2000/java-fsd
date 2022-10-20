import { TestBed } from '@angular/core/testing';

import { DisapproveserviceService } from './disapproveservice.service';

describe('DisapproveserviceService', () => {
  let service: DisapproveserviceService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(DisapproveserviceService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
