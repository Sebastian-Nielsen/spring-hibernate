import { Component } from '@angular/core';
import {UserService} from "../user.service";
import {User} from "../user";

@Component({
  selector: 'app-create-new-user',
  templateUrl: './create-new-user.component.html',
  styleUrls: ['./create-new-user.component.scss'],
  providers: [UserService],
})
export class CreateNewUserComponent {

  constructor(private userService: UserService) {

  }

  submitted = false;

  createNewUser = (user: User) => {
  // createNewUser = (email: string, name: string, id: string) => {
    this.userService.save(user);
  }
  getAllUsers = () => {

  }

}
