import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Voucher } from 'src/app/models/Voucher';
import { VoucherService } from 'src/app/_services/voucher/voucher.service';

@Component({
  selector: 'app-list-vouchers',
  templateUrl: './list-vouchers.component.html',
  styleUrls: ['./list-vouchers.component.css']
})
export class ListVouchersComponent implements OnInit {


  vouchers : Voucher[];

  constructor(private voucherService: VoucherService , private router: Router) {
  }

  ngOnInit(): void {
    this.getVouchers();
  }
  private getVouchers(){
    this.voucherService.getVouchersList().subscribe(data =>{
      this.vouchers=data;
    })
  }

  updateVoucher(id: number){
    this.router.navigate(['edit-voucher', id]);
  }

  addVoucher(){
    this.router.navigate(['add-voucher']);
  }

  showVoucher(id: number){
    this.router.navigate(['show-voucher', id]);
  }

  deleteVoucher(id: number){
    this.voucherService.deleteVoucher(id).subscribe( data => {
      console.log(data);
      this.getVouchers();
    })
  }
}