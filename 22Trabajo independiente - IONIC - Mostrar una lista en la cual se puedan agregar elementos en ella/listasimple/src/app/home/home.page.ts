import { Component } from '@angular/core';

@Component({
  selector: 'app-home',
  templateUrl: 'home.page.html',
  styleUrls: ['home.page.scss'],
})
export class HomePage {

  dato1:string;
  registros = [];

  constructor() {}

  Guardar() {
    // tslint:disable-next-line:no-bitwise
    if (!!this.dato1) {
      this.registros.push(this.dato1);
      
    }
  }
}
