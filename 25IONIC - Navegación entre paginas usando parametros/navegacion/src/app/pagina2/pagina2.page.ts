import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-pagina2',
  templateUrl: './pagina2.page.html',
  styleUrls: ['./pagina2.page.scss'],
})
export class Pagina2Page implements OnInit {

  nombre: string;
  id: number;
  constructor(private router: Router) { 
    this.nombre = this.router.getCurrentNavigation().extras.state.nombre;
    this.id = this.router.getCurrentNavigation().extras.state.id;
  }

  ngOnInit() {
  }

}