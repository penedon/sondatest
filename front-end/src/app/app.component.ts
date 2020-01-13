import { Component } from '@angular/core';
import { HttpClient, HttpParams, HttpHeaders } from '@angular/common/http';
import { Aeronave } from './aeronave.ts';
import { Observable } from 'rxjs/Observable';
import { FormBuilder, FormsModule, ReactiveFormsModule } from '@angular/forms';
import 'rxjs/add/operator/map';

import 'rxjs/add/operator/catch';
import 'rxjs/add/operator/retry';
import 'rxjs/add/observable/of';



@Component({
  selector: 'my-app',
  templateUrl: './app.component.html',
  styleUrls: [ './app.component.css' ]
})
export class AppComponent  {

  readonly ROOT_URL = 'https://sondatest.herokuapp.com';

  aeronaves: Observable<any>;
  novaAeronave;

  constructor(
    private http: HttpClient,
    private formBuilder: FormBuilder,
  ) {
    this.aeronaves = this.getAeronaves('');

    this.novaAeronave = this.formBuilder.group({
      nome: '',
      marca: '',
      ano: '',
      vendido: '',
    });
  }

  getAeronaves(query: string): Observable {
    query = query.trim();

    let heroesURL = `${this.ROOT_URL}`;
    return this.http.get(this.ROOT_URL + '/aeronaves')
  };

  createAeronave(formData) {
    const data : Aeronave = {
      nome: formData.nome,
      marca: formData.marca,
      ano: formData.ano,
      vendido: (formData.vendido == 'true'),
    }

    this.aeronaves = this.getAeronaves('');

  }

}
