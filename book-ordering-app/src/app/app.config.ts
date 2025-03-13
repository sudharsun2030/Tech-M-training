import { Routes } from '@angular/router';
import { provideRouter } from '@angular/router';
import { HomeComponent } from './components/home/home.component';
import { BookListComponent } from './components/book-list/book-list.component';
import { CartComponent } from './components/cart/cart.component';

const routes: Routes = [
  { path: '', component: HomeComponent },
  { path: 'books', component: BookListComponent },
  { path: 'cart', component: CartComponent },
];

export const appConfig = {
  providers: [provideRouter(routes)],
};
