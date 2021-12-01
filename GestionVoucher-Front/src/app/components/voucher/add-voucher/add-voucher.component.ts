import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Categorie } from 'src/app/models/Categorie';
import { Voucher } from 'src/app/models/Voucher';
import { CategoryService } from 'src/app/_services/category/category.service';
import { VoucherService } from 'src/app/_services/voucher/voucher.service';

@Component({
  selector: 'app-add-voucher',
  templateUrl: './add-voucher.component.html',
  styleUrls: ['./add-voucher.component.css']
})
export class AddVoucherComponent implements OnInit {

  voucher: Voucher = new Voucher();
  categories : Categorie[];
  constructor(private voucherService: VoucherService,private catService:CategoryService,
    private router: Router) { }

  ngOnInit(): void {
    this.getCategories();
  }

  saveVoucher(){
    this.voucherService.createVoucher(this.voucher).subscribe( data =>{
      this.goToVoucherList();
    },
    error => console.log(error));
  }

  goToVoucherList(){
    this.router.navigate(['/list-vouchers']);
  }
  
  onSubmit(){
    console.log(this.voucher);
    this.saveVoucher();
  }

  private getCategories(){
    this.catService.getCategoriesList().subscribe(data =>{
      this.categories=data;
    })
  }

}
