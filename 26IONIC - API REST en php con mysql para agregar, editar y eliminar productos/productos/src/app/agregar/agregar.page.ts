import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { ModalController } from '@ionic/angular';
@Component({
  selector: 'app-agregar',
  templateUrl: './agregar.page.html',
  styleUrls: ['./agregar.page.scss'],
})
export class AgregarPage implements OnInit {

  nombre: string;
  descripcion: string;
  cantidad: number;
  preciodeventa: number;
  preciodecosto: number;
  url = '';
  respuesta: any;
  constructor(public http: HttpClient, public modalController: ModalController) { }

  guardarProducto() {
    const uri = 'https://cursodemoviles.000webhostapp.com/api.php?comando=agregar&nombre=' + this.nombre 
    + '&descripcion=' + this.descripcion
    + '&preciodecosto=' + this.preciodecosto +
    '&preciodeventa=' + this.preciodeventa +
    '&cantidad=' + this.cantidad +
    '&fotografia=' + this.url;
    this.http.get(uri).subscribe(data => {
      this.respuesta = data;
      const mensaje = this.respuesta.mensaje;
      if (!!mensaje) {
      {
    this.modalController.dismiss();
      }
    }

  });
  }
cancelar() {
this.modalController.dismiss();
}
  ngOnInit() {
  }

}
