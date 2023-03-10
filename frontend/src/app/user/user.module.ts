import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { CreateNewUserComponent } from './create-new-user/create-new-user.component';
import {UserService} from "./user.service";
import {FormsModule, ReactiveFormsModule} from "@angular/forms";
import {CreateNewUserReactiveComponent} from "./create-new-user-reactive/create-new-user-reactive.component";



@NgModule({
  declarations: [
    CreateNewUserComponent,
    CreateNewUserReactiveComponent
  ],
  imports: [
    CommonModule,
    FormsModule,
    ReactiveFormsModule,
  ],
  providers: [UserService],
  exports: [
    CreateNewUserComponent,
    CreateNewUserReactiveComponent
  ]
})
export class UserModule { }
