import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Categorie } from 'src/app/models/Categorie';
import { CategoryService } from 'src/app/_services/category/category.service';

@Component({
  selector: 'app-list-categories',
  templateUrl: './list-categories.component.html',
  styleUrls: ['./list-categories.component.css']
})
export class ListCategoriesComponent implements OnInit {

  categories : Categorie[];

  constructor(private catService: CategoryService , private router: Router) {
  }

  ngOnInit(): void {
    this.getCategories();
  }
  private getCategories(){
    this.catService.getCategoriesList().subscribe(data =>{
      this.categories=data;
    })
  }

  updateCategory(id: number){
    this.router.navigate(['edit-category', id]);
  }

  addCategory(){
    this.router.navigate(['add-category']);
  }

  showCategory(id: number){
    this.router.navigate(['show-category', id]);
  }

  deleteCategory(id: number){
    this.catService.deleteCategory(id).subscribe( data => {
      console.log(data);
      this.getCategories();
    })
  }

}
