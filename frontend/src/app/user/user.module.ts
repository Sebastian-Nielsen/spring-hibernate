import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import {UserService} from "./user.service";
import {FormsModule, ReactiveFormsModule} from "@angular/forms";
import { UsersComponent } from './users/users.component';
import { RouterModule } from '@angular/router';



@NgModule({
  declarations: [
    UsersComponent,
  ],
  imports: [
    RouterModule,
    CommonModule,
    FormsModule,
    ReactiveFormsModule,
  ],
  providers: [UserService],
  exports: [
    UsersComponent,
  ]
})
export class UserModule { }
