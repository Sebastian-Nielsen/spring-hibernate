import {Component, OnInit} from '@angular/core';
import {FormControl, FormGroup, Validators} from "@angular/forms";

@Component({
  selector: 'app-create-new-user-reactive',
  templateUrl: './create-new-user-reactive.component.html',
  styleUrls: ['./create-new-user-reactive.component.scss']
})
export class CreateNewUserReactiveComponent implements OnInit {
  genders = ['male', 'female'];
  signupForm: any;
  submitted = false;

  onSubmit() {
    console.log("onSubmit triggered...")
  }

  ngOnInit() {
    this.signupForm = new FormGroup({
      'userData': new FormGroup({
        'username': new FormControl(null, Validators.required),
        'email': new FormControl(null, [Validators.required, Validators.email]),
      }),
      'gender': new FormControl('male'),
    });
  }
}
