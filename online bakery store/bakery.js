// Defining bakery items with image URLs
const bakeryItems = [
    { 
        name: "Chocolate Cake", 
        price: 20, 
        weight: "500g", 
        image: "images/download.jfif" 
    },
    { 
        name: "Strawberry Pastry", 
        price: 5, 
        weight: "150g", 
        image: "images/Strawberry.webp" 
    },
    { 
        name: "Butter Croissant", 
        price: 3, 
        weight: "100g", 
        image: "images/images.jfif" 
    },
    { 
        name: "Lemon Cake", 
        price: 18, 
        weight: "450g", 
        image: "images/lemon-cake.jfif" 
    },
    { 
        name: "Blueberry Muffin", 
        price: 6, 
        weight: "200g", 
        image: "images/blueberry.jpg" 
    },
];

// Display bakery items on the product listing page
window.onload = function () {
  const productListDiv = document.getElementById("product-list");

  bakeryItems.forEach((item, index) => {
    const productDiv = document.createElement("div");
    productDiv.classList.add("product-card");

    productDiv.innerHTML = `
      <img src="${item.image}" alt="${item.name}" class="product-image"> 
      <h3>${item.name}</h3>
      <p>Price: $${item.price}</p>
      <p>Weight: ${item.weight}</p>
      <button onclick="addToCart(${index})">Add to Cart</button>
    `;

    productListDiv.appendChild(productDiv);
  });
};

// Function to add item to cart
function addToCart(index) {
  let cart = JSON.parse(localStorage.getItem('cart')) || [];

  const selectedItem = bakeryItems[index];

  // Check if the item is already in the cart
  const existingItemIndex = cart.findIndex(item => item.name === selectedItem.name);

  if (existingItemIndex !== -1) {
    // If item exists, increase the quantity
    cart[existingItemIndex].quantity += 1;
  } else {
    // If item does not exist, add it with quantity = 1
    selectedItem.quantity = 1;
    cart.push(selectedItem);
  }

  // Save the updated cart to localStorage
  localStorage.setItem('cart', JSON.stringify(cart));

  // Redirect to cart page
  window.location.href = "cart.html";
}

// Display cart contents on cart page
if (window.location.href.includes('cart.html')) {
  const cartItemsDiv = document.getElementById("cart-items");
  const totalPriceSpan = document.getElementById("total-price");

  let cart = JSON.parse(localStorage.getItem('cart')) || [];

  if (cart.length === 0) {
    cartItemsDiv.innerHTML = "<p>Your cart is empty</p>";
  } else {
    let totalPrice = 0;

    cart.forEach(item => {
      const cartItemDiv = document.createElement("div");
      cartItemDiv.classList.add("cart-item");

      cartItemDiv.innerHTML = `
        <img src="${item.image}" alt="${item.name}" class="cart-item-image">  <!-- Add image here -->
        <p><strong>${item.name}</strong></p>
        <p>Price: $${item.price}</p>
        <p>Weight: ${item.weight}</p>
        <p>Quantity: ${item.quantity}</p>
        <p>Total: $${item.price * item.quantity}</p>
      `;

      cartItemsDiv.appendChild(cartItemDiv);
      totalPrice += item.price * item.quantity;
    });

    totalPriceSpan.textContent = totalPrice;
  }
}

// Function to clear the cart
function clearCart() {
  // Remove cart data from localStorage
  localStorage.removeItem('cart');

  // Reload the page or redirect to the product listing page
  location.reload();  // This will just reload the cart page
}
