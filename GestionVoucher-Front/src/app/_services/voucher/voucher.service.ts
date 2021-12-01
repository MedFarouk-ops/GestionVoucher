import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Categorie } from 'src/app/models/Categorie';
import { Voucher } from 'src/app/models/Voucher'; 

@Injectable({
  providedIn: 'root'
})
export class VoucherService {

private baseURL="http://localhost:8080/api/vouchers";
  
constructor(private httpClient: HttpClient) { }


loadCategories(): Observable<Categorie[]>{
  let headers = new HttpHeaders();
  headers.append('content-type', 'application/json');
  headers.append('accept', 'application/json');
  return this.httpClient.get<Categorie[]>('http://localhost:8080/api/categories', {headers: headers});
}  

getVouchersList(): Observable<Voucher[]>{
    return this.httpClient.get<Voucher[]>(`${this.baseURL}`);
}

createVoucher(voucher: Voucher): Observable<Object>{
  return this.httpClient.post(`${this.baseURL}`, voucher);
}

getVoucherById(id: number): Observable<Voucher>{
  return this.httpClient.get<Voucher>(`${this.baseURL}/${id}`);
}

updateVoucher(id: number, voucher: Voucher): Observable<Object>{
  return this.httpClient.put(`${this.baseURL}/${id}`, voucher);
}

deleteVoucher(id: number): Observable<Object>{
  return this.httpClient.delete(`${this.baseURL}/${id}`);
}

}