import { Injectable } from '@angular/core';
import { GeneralService } from './general.service';
import { Http, Response } from '@angular/http';
import 'rxjs/add/operator/map';

@Injectable()
export class UserService {
  constructor(private http:Http) {

  }
loginUser() {
    return this.http.get('https://reqres.in/api/users?page=2')
      .map(response => response.json());
  }
// show() {
//   console.log(this.url);
// }
}
