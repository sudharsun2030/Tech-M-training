import { Component, Input } from '@angular/core';

@Component({
  selector: 'app-book-detail',
  standalone: true,
  template: `
    <div *ngIf="book" class="book-card">
      <img [src]="book.image" alt="{{ book.title }}">
      <h3>{{ book.title }}</h3>
      <p>Author: {{ book.author }}</p>
      <p>Price: {{ book.price | priceFormat }}</p>
      <button (click)="addToCart()">Add to Cart</button>
    </div>
  `,
  styles: [`
    .book-card {
      border: 1px solid #ddd;
      padding: 10px;
      margin: 10px;
      text-align: center;
      box-shadow: 2px 2px 10px rgba(0, 0, 0, 0.1);
    }
    img {
      width: 100px;
      height: 150px;
      object-fit: cover;
    }
  `]
})
export class BookDetailComponent {
  @Input() book: any;

  addToCart() {
    console.log('Added to cart:', this.book);
  }
}
