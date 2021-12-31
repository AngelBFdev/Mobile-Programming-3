import { Component } from '@angular/core';

@Component({
  selector: 'app-home',
  templateUrl: 'home.page.html',
  styleUrls: ['home.page.scss'],
})

export class HomePage {

  resultado = '';
  valor2: string;
  valor1: string;

  constructor() {}

  Sumar() {
    // tslint:disable-next-line:no-bitwise
    if (!!this.valor1 && !!this.valor2) {
      const c =  parseFloat(this.valor1) + parseFloat(this.valor2);
      this.resultado = this.valor1 + '+' + this.valor2 + '=' + c;
    } 
    else {
      this.resultado = 'Error en los datos!!!';
    }
  }
}
