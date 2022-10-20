import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AdminhComponent } from './adminh.component';

describe('AdminhComponent', () => {
  let component: AdminhComponent;
  let fixture: ComponentFixture<AdminhComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AdminhComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(AdminhComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
