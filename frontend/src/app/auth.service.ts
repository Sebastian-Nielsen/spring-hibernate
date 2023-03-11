
export class AuthService {
  loggedIn = false;


  OnInit() {
    setTimeout(() => {
      this.loggedIn = true;
    }, 800)
  }

  isAuthenticated(): Promise<boolean> {
    return new Promise((resolve, reject) => this.loggedIn);
  }

  login() {
    this.loggedIn = true;
  }

  logout() {
    this.loggedIn = false;
  }
}
