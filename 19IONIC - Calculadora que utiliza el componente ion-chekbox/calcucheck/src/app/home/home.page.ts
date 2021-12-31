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
  sumar: boolean;
  restar: boolean;

  constructor() {}

  Calcular() {
    // tslint:disable-next-line:no-bitwise
    if (!!this.valor1 && !!this.valor2) {
      let s = '';
      if (this.sumar) {
        const c =  parseFloat(this.valor1) + parseFloat(this.valor2);
        s = s + this.valor1 + '+' + this.valor2 + '=' + c + '<br>';
      }
      if (this.restar) {
        const c =  parseFloat(this.valor1) - parseFloat(this.valor2);
        s = s + this.valor1 + '-' + this.valor2 + '=' + c + '';
      }
      this.resultado = '<b>' + s + '</b>';
    } 
    else {
      this.resultado = 'Error en los datos!!!';
    }
  }
}
