import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ShowVoucherComponent } from './show-voucher.component';

describe('ShowVoucherComponent', () => {
  let component: ShowVoucherComponent;
  let fixture: ComponentFixture<ShowVoucherComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ShowVoucherComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ShowVoucherComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
