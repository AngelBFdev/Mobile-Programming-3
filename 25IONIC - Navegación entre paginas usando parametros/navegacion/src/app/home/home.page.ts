import { Component } from '@angular/core';
import { NavController } from '@ionic/angular';

@Component({
  selector: 'app-home',
  templateUrl: 'home.page.html',
  styleUrls: ['home.page.scss'],
})
export class HomePage {

  id: number;
  nombre: string;
  constructor(public navCtrl: NavController) {}

  irPagina2() {
    this.navCtrl.navigateForward('/pagina2', {state: {nombre: this.nombre, id: this.id}});
  }

}