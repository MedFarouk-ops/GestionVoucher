import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Categorie } from 'src/app/models/Categorie';
import { CategoryService } from 'src/app/_services/category/category.service';

@Component({
  selector: 'app-add-category',
  templateUrl: './add-category.component.html',
  styleUrls: ['./add-category.component.css']
})
export class AddCategoryComponent implements OnInit {

  cat: Categorie = new Categorie();
  constructor(private catService: CategoryService,
    private router: Router) { }

  ngOnInit(): void {
  }

  saveCategory(){
    this.catService.createCategory(this.cat).subscribe( data =>{
      this.goToCategoriesList();
    },
    error => console.log(error));
  }

  goToCategoriesList(){
    this.router.navigate(['/list-category']);
  }
  
  onSubmit(){
    console.log(this.cat);
    this.saveCategory();
  }

}
