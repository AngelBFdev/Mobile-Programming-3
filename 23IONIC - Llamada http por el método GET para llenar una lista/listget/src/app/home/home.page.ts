import { Component } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { createUrlResolverWithoutPackagePrefix } from '@angular/compiler';



@Component({
  selector: 'app-home',
  templateUrl: 'home.page.html',
  styleUrls: ['home.page.scss'],
})
export class HomePage {
registros = [];
  constructor(public http: HttpClient) {
   // alert('Prueba=' + this.cargar());
   this.cargar();
  }
cargar() {
    const uri = 'https://www.w3schools.com/angular/customers.php';

      this.http.get(uri).subscribe(data => {
      //process the json data
      //alert('Datos' + data.records[0].Name);
      this.registros = data.records;
      console.log(data);
    });

 // tslint:disable-next-line:no-trailing-whitespace
  }
}
