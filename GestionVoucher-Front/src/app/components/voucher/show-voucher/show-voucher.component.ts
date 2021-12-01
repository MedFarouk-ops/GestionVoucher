import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Voucher } from 'src/app/models/Voucher';
import { VoucherService } from 'src/app/_services/voucher/voucher.service';

@Component({
  selector: 'app-show-voucher',
  templateUrl: './show-voucher.component.html',
  styleUrls: ['./show-voucher.component.css']
})
export class ShowVoucherComponent implements OnInit {

  id : number;
  voucher: Voucher = new Voucher();
  constructor(private voucherService: VoucherService,
    private route: ActivatedRoute,
    private router: Router) { }

  ngOnInit(): void {
    this.id = this.route.snapshot.params['id'];

    this.voucherService.getVoucherById(this.id).subscribe(data => {
      this.voucher = data;
    }, error => console.log(error));
  }
  goToVoucherList(){
    this.router.navigate(['/vouchers']);
  }

}
