import { Injectable } from '@angular/core';
import { Http, Response } from '@angular/http';
import 'rxjs/add/operator/map';

@Injectable()
export class GeneralService {
public url:string;
  constructor(protected http:Http) {
    this.url = "ciao";
  }
}
