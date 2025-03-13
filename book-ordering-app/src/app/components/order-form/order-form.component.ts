import { Component } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-order-form',
  standalone: true,
  template: `
    <form [formGroup]="orderForm" (ngSubmit)="placeOrder()">
      <input formControlName="name" placeholder="Your Name">
      <input formControlName="address" placeholder="Address">
      <button type="submit" [disabled]="orderForm.invalid">Place Order</button>
    </form>
  `,
})
export class OrderFormComponent {
  orderForm: FormGroup;

  constructor(private fb: FormBuilder) {
    this.orderForm = this.fb.group({
      name: ['', Validators.required],
      address: ['', Validators.required],
    });
  }

  placeOrder() {
    console.log('Order placed:', this.orderForm.value);
  }
}
