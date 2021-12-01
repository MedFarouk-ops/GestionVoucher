import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Categorie } from 'src/app/models/Categorie';

@Injectable({
  providedIn: 'root'
})
export class CategoryService {

  private baseURL="http://localhost:8080/api/categories";
  
  constructor(private httpClient: HttpClient) { }
    
  getCategoriesList(): Observable<Categorie[]>{
      return this.httpClient.get<Categorie[]>(`${this.baseURL}`);
  }
  
  createCategory(cat: Categorie): Observable<Object>{
    return this.httpClient.post(`${this.baseURL}`, cat);
  }
  
  getCategoryById(id: number): Observable<Categorie>{
    return this.httpClient.get<Categorie>(`${this.baseURL}/${id}`);
  }
  
  updateCategory(id: number, cat: Categorie): Observable<Object>{
    return this.httpClient.put(`${this.baseURL}/${id}`, cat);
  }
  
  deleteCategory(id: number): Observable<Object>{
    return this.httpClient.delete(`${this.baseURL}/${id}`);
  }
  
}
