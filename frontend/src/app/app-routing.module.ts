import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AppComponent } from './app.component';
import { HomeComponent } from './home/home.component';
import { PageNotFoundComponent } from './page-not-found/page-not-found.component';
import { UsersComponent } from './user/users/users.component';

const appRoutes: Routes = [
  // { path: '/', pathMatch: 'full', component: HomeComponent },
  // { path: '', pathMatch: 'full', component: HomeComponent },
  { path: '', redirectTo: '/home', pathMatch: 'full' },
  { path: '/home', component: HomeComponent },

  { path: 'users' , component: UsersComponent, children: [
      { path: ':id' , component: AppComponent },
  ] },
  { path: 'not-found', component: PageNotFoundComponent },
  { path: '**', redirectTo: '/not-found' }
];

@NgModule({
  imports: [
    RouterModule.forRoot(appRoutes)
  ],
  exports: [RouterModule]
})
export class AppRoutingModule {}
