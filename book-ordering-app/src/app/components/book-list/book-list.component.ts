import { Component, OnInit } from '@angular/core';
import { BookService } from '../../services/book.service';

@Component({
  selector: 'app-book-list',
  standalone: true,
  template: `
    <h2>Available Books</h2>
    <div *ngFor="let book of books">
      <app-book-detail [book]="book"></app-book-detail>
    </div>
  `,
})
export class BookListComponent implements OnInit {
  books: any[] = [];

  constructor(private bookService: BookService) {}

  ngOnInit() {
    this.bookService.getBooks().subscribe((data) => {
      this.books = data;
    });
  }
}
