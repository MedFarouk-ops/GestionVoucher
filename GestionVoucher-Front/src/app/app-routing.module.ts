import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AddCategoryComponent } from './components/category/add-category/add-category.component';
import { DeleteCategoryComponent } from './components/category/delete-category/delete-category.component';
import { EditCategoryComponent } from './components/category/edit-category/edit-category.component';
import { ListCategoriesComponent } from './components/category/list-categories/list-categories.component';
import { ShowCategoryComponent } from './components/category/show-category/show-category.component';
import { HomePageComponent } from './components/home/home-page/home-page.component';
import { AddVoucherComponent } from './components/voucher/add-voucher/add-voucher.component';
import { DeleteVoucherComponent } from './components/voucher/delete-voucher/delete-voucher.component';
import { EditVoucherComponent } from './components/voucher/edit-voucher/edit-voucher.component';
import { ListVouchersComponent } from './components/voucher/list-vouchers/list-vouchers.component';
import { ShowVoucherComponent } from './components/voucher/show-voucher/show-voucher.component';

const routes: Routes = [
  // Home Routes : 
  {path: 'home', component: HomePageComponent},
  {path:'',redirectTo : 'home' , pathMatch:'full'},
  // Categorie Routes :
  {path: 'list-category', component: ListCategoriesComponent},
  {path: 'add-category', component: AddCategoryComponent},
  {path: 'show-category', component: ShowCategoryComponent},
  {path: 'edit-category', component: EditCategoryComponent},
  {path: 'delete-category', component: DeleteCategoryComponent},
  // Voucher Routes :
  {path: 'list-vouchers', component:ListVouchersComponent },
  {path: 'add-voucher', component: AddVoucherComponent},
  {path: 'show-voucher', component: ShowVoucherComponent},
  {path: 'edit-voucher', component: EditVoucherComponent},
  {path: 'delete-voucher', component: DeleteVoucherComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
