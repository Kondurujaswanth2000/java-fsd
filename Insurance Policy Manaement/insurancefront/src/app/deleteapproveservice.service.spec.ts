import { TestBed } from '@angular/core/testing';

import { DeleteapproveserviceService } from './deleteapproveservice.service';

describe('DeleteapproveserviceService', () => {
  let service: DeleteapproveserviceService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(DeleteapproveserviceService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
