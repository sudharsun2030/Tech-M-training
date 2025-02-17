let totalPrice = 0; // Variable to store the total price

// Loop to get user input for each day's price
for (let i = 1; i <= 7; i++) {
    let price = parseFloat(prompt(Enter the price of 1kg tomato for Day ${i}:));
    totalPrice += price; // Add price to total
}

// Calculate the average price
let averagePrice = totalPrice / 7;

// Display the result based on the average price
if (averagePrice > 50) {
    alert("Tomato has given good profit.");
} else {
    alert("No profit from tomato.");
}

// Optional: Log the results for debugging
console.log("Total Price:", totalPrice);
console.log("Average Price:", averagePrice);