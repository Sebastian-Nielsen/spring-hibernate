import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import {Observable} from "rxjs";
import {User} from "./user";

@Injectable()
export class UserService {

  private usersUrl: string;

  constructor(private http: HttpClient) {
    this.usersUrl = 'http://localhost:8080/users';
    // this.usersUrl = 'http://localhost:8080/streams';
  }

  public getAll(): Observable<User[]> {
    console.log("get /users")
    return this.http.get<User[]>(this.usersUrl);
  }

  public save(user: User) {
    console.log("post /users, data:", user)
    return this.http.post<User>(this.usersUrl, user);
  }
}
