import { ComponentFixture, TestBed } from '@angular/core/testing';

import { UserhComponent } from './userh.component';

describe('UserhComponent', () => {
  let component: UserhComponent;
  let fixture: ComponentFixture<UserhComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ UserhComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(UserhComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
