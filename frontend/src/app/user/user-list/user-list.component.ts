import { Component, OnInit } from '@angular/core';
import { User } from '../user';
import { UserService } from '../user.service';

@Component({
  selector: 'app-user-list',
  templateUrl: './user-list.component.html',
  // styleUrls: ['./user-list.component.css']
  providers: [UserService],
})
export class UserListComponent implements OnInit {

  users: User[] = [];

  constructor(private userService: UserService) {
  }

  ngOnInit() {
    this.userService.getAll().subscribe(data => {
      console.log("res1:", data)
      this.users = [];
    });
    this.userService.save({
      email: "sebastian@mail",
      id: "",
      name: "",
    }).subscribe(data => {
      console.log("res2:", data)
    });
  }
}
