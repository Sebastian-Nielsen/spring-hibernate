import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CreateNewUserReactiveComponent } from './create-new-user-reactive.component';

describe('CreateNewUserReactiveComponent', () => {
  let component: CreateNewUserReactiveComponent;
  let fixture: ComponentFixture<CreateNewUserReactiveComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ CreateNewUserReactiveComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(CreateNewUserReactiveComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
