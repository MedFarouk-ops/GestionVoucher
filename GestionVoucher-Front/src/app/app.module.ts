import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { AddVoucherComponent } from './components/voucher/add-voucher/add-voucher.component';
import { EditVoucherComponent } from './components/voucher/edit-voucher/edit-voucher.component';
import { DeleteVoucherComponent } from './components/voucher/delete-voucher/delete-voucher.component';
import { ShowVoucherComponent } from './components/voucher/show-voucher/show-voucher.component';
import { AddCategoryComponent } from './components/category/add-category/add-category.component';
import { EditCategoryComponent } from './components/category/edit-category/edit-category.component';
import { ShowCategoryComponent } from './components/category/show-category/show-category.component';
import { DeleteCategoryComponent } from './components/category/delete-category/delete-category.component';
import { HomePageComponent } from './components/home/home-page/home-page.component';
import { ListCategoriesComponent } from './components/category/list-categories/list-categories.component';
import { ListVouchersComponent } from './components/voucher/list-vouchers/list-vouchers.component';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';

@NgModule({
  declarations: [
    AppComponent,
    AddVoucherComponent,
    EditVoucherComponent,
    DeleteVoucherComponent,
    ShowVoucherComponent,
    AddCategoryComponent,
    EditCategoryComponent,
    ShowCategoryComponent,
    DeleteCategoryComponent,
    HomePageComponent,
    ListCategoriesComponent,
    ListVouchersComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
