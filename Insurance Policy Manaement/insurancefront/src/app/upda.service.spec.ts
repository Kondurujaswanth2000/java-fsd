import { TestBed } from '@angular/core/testing';

import { UpdaService } from './upda.service';

describe('UpdaService', () => {
  let service: UpdaService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(UpdaService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
