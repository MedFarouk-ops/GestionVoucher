import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ListVouchersComponent } from './list-vouchers.component';

describe('ListVouchersComponent', () => {
  let component: ListVouchersComponent;
  let fixture: ComponentFixture<ListVouchersComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ListVouchersComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ListVouchersComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
