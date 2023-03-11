import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { User } from '../user';
import { UserService } from '../user.service';

@Component({
  selector: 'app-users',
  templateUrl: './users.component.html',
  styleUrls: ['./users.component.scss'],
  providers: [UserService],
})
export class UsersComponent implements OnInit {
  users: any[] = [
    // {name: "sebastian", email: "sebastian@gmail.com"},
    // {name: "john", email: "john@gmail.com"}
  ];

  constructor(
    private route: ActivatedRoute,
    private userService: UserService
  ) {}

  name: string = "sebastian";

  saveUser() {
    const user: User = {
      name: this.name,
      email: `${this.name}@gmail.com`,
      id: '',
      firstName: '',
      lastName: '',
      password: '',
      role: ''
    };

    // this.users.push(user);
    //
    this.userService.save(user);
  }

  ngOnInit() {
    this.userService.fetchAllUsers().subscribe((users: User[]) => {
      console.log("subscribe result:", users)
      this.users = this.users.concat(users);
    })

    // this.route.queryParams.subscribe(params => {
    //   console.log("params:", params)
    //   this.users?.push({
    //     email: this.route.snapshot.queryParams['email'],
    //     name: this.route.snapshot.queryParams['name'],
    //   });
    // })
  }

}
