<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Giỏ hàng</title>
    <link rel="icon" href="../../../resources/static/img/logo.png" type="image/x-icon">
    <link rel="stylesheet"
        href="https://cdn.jsdelivr.net/npm/bootstrap@4.1.3/dist/css/bootstrap.min.css"
        integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO"
        crossorigin="anonymous">
    <link rel="stylesheet" href="../../../resources/static/css/cart.css">
</head>

<body>
    <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
        <div class="container px-5">
            <a class="navbar-brand" href="/">
                <img src="../../../resources/static/img/logo.png" alt="Logo">
            </a>
            <button class="navbar-toggler" type="button"
                data-bs-toggle="collapse"
                data-bs-target="#navbarSupportedContent"
                aria-controls="navbarSupportedContent" aria-expanded="false"
                aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarSupportedContent">
                <ul class="navbar-nav ms-auto mb-2 mb-lg-0">
                    <li class="nav-item"><a class="nav-link active"
                            aria-current="page" href="/">Home</a></li>
                    <li class="nav-item"><a class="nav-link" href="/about">About</a></li>
                    <li class="nav-item"><a class="nav-link" href="/contact">Contact</a></li>
                    <li class="nav-item"><a class="nav-link" href="/services">Services</a></li>
                </ul>
            </div>
        </div>
    </nav>
    <div class="container px-3 my-5 clearfix">
        <!-- Shopping cart table -->
        <div class="card">
            <div class="card-header">
                <h2>Shopping Cart</h2>
            </div>
            <div class="card-body">
                <div class="table-responsive">
                    <table class="table table-bordered m-0">
                        <thead>
                            <tr>
                                <!-- Set columns width -->
                                <th class="text-center py-3 px-4" style="min-width: 400px;">Product Name &amp; Details</th>
                                <th class="text-right py-3 px-4" style="width: 100px;">Price</th>
                                <th class="text-center py-3 px-4" style="width: 120px;">Quantity</th>
                                <th class="text-right py-3 px-4" style="width: 100px;">Total</th>
                                <th class="text-center align-middle py-3 px-0" style="width: 40px;"><a href="#"
                                        class="shop-tooltip float-none text-light" title data-original-title="Clear cart"><i
                                            class="ino ion-md-trash"></i></a></th>
                            </tr>
                        </thead>
                        <tbody>
                            <c:forEach var="cartItem" items="${cartItems}" varStatus="status">
                                <tr>
                                    <td class="p-4">
                                        <div class="media align-items-center">
                                            <c:set var="product" value="${products[status.index]}" />
                                            <img src="${product.image}"
                                                class="d-block ui-w-40 ui-bordered mr-4" alt="${product.productName}">
                                            <div class="media-body">
                                                <a href="#" class="d-block text-dark">${product.productName}</a>
                                                <small>${product.description}</small>
                                            </div>
                                        </div>
                                    </td>
                                    <td class="text-right font-weight-semibold align-middle p-4">${product.price}</td>
                                    <td class="align-middle p-4"><input type="text" class="form-control text-center quantity"
                                            value="${cartItem.quantity}" data-price="${product.price}"></td>
                                    <td class="text-right font-weight-semibold align-middle p-4 total">${product.price * cartItem.quantity}</td>
                                    <td class="text-center align-middle px-0"><a href="#" class="shop-tooltip close float-none text-danger"
                                            title data-original-title="Remove">×</a></td>
                                </tr>
                            </c:forEach>
                        </tbody>
                    </table>
                </div>
                <!-- / Shopping cart table -->

                <div class="d-flex flex-wrap justify-content-between align-items-center pb-4">
                    <div class="mt-4">
                        <label class="text-muted font-weight-normal">Promocode</label>
                        <input type="text" placeholder="ABC" class="form-control">
                    </div>
                    <div class="d-flex">
                        <div class="text-right mt-4">
                            <label class="text-muted font-weight-normal m-0">Total price</label>
                            <div class="text-large"><strong id="totalPrice">0 VND</strong></div>
                        </div>
                    </div>
                </div>

                <div class="float-right">
                    <a href="/shop">
                        <button type="button" class="btn btn-lg btn-default md-btn-flat mt-2 mr-3">Back to shopping</button>
                    </a>
                    <button type="button" class="btn btn-lg btn-primary mt-2" id="checkoutButton">Checkout</button>
                </div>

            </div>
        </div>
    </div>

    <div class="modal fade" id="checkoutModal" tabindex="-1" aria-labelledby="checkoutModalLabel" aria-hidden="true">
        <div class="modal-dialog modal-lg">
            <div class="modal-content">
                <div class="modal-header">
                    <h5 class="modal-title" id="checkoutModalLabel">Checkout</h5>
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                        <span aria-hidden="true">&times;</span>
                    </button>
                </div>
                <div class="modal-body">
                    <table class="table">
                        <thead>
                            <tr>
                                <th scope="col">Product Name</th>
                                <th scope="col">Quantity</th>
                                <th scope="col">Unit Price</th>
                                <th scope="col">Total</th>
                            </tr>
                        </thead>
                        <tbody id="checkoutModalBody">
                            <!-- Modal body content will be filled dynamically -->
                        </tbody>
                    </table>
                    <hr>
                    <div class="row">
                        <div class="col-md-6">
                            <label for="paymentMethod">Payment Method</label>
                            <select class="form-control" id="paymentMethod">
                                <option value="credit">Credit Card</option>
                                <option value="paypal">PayPal</option>
                                <option value="cash">Cash on Delivery</option>
                            </select>
                        </div>
                        <div class="col-md-6">
                            <div class="text-right">
                                <label class="text-muted">Total Price</label>
                                <h4 id="modalTotalPrice">0 VND</h4>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                    <button type="button" class="btn btn-primary" id="confirmPayment">Proceed to Payment</button>
                </div>
            </div>
        </div>
    </div>
</body>
<!-- jQuery -->
<script src="https://code.jquery.com/jquery-3.3.1.min.js"></script>

<!-- Popper.js -->
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"
        integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49"
        crossorigin="anonymous"></script>

<!-- Bootstrap JS -->
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"
        integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" 
        crossorigin="anonymous"></script>
<script>
    function updateTotals() {
        let totalPrice = 0;
        document.querySelectorAll('tr').forEach(function(row) {
            const quantityInput = row.querySelector('.quantity');
            if (quantityInput) {
                const price = parseFloat(quantityInput.getAttribute('data-price'));
                const quantity = parseInt(quantityInput.value);
                const totalCell = row.querySelector('.total');
                const rowTotal = price * quantity;
                totalCell.innerText = rowTotal.toFixed(2) + ' VND';
                totalPrice += rowTotal;
            }
        });
        document.getElementById('totalPrice').innerText = totalPrice.toFixed(2) + ' VND';
    }

    document.querySelectorAll('.quantity').forEach(function(input) {
        input.addEventListener('input', function() {
            updateTotals();
        });
    });

    // Initial calculation on page load
    updateTotals();

    
</script>
<script>
    // Function to handle Checkout button click
    document.querySelector('#checkoutButton').addEventListener('click', function() {
        // Prepare data for modal
        let modalBody = document.getElementById('checkoutModalBody');
        modalBody.innerHTML = '';

        // Iterate over each row in the table
        document.querySelectorAll('tbody tr').forEach(function(row) {
            let productName = row.querySelector('.media-body a').innerText;
            let quantity = row.querySelector('.quantity').value;
            let unitPrice = parseFloat(row.querySelector('.font-weight-semibold').innerText);
            let totalPrice = parseFloat(row.querySelector('.total').innerText);

            // Create new row in modal
            let newRow = document.createElement('tr');
            newRow.innerHTML = `
                <td>${productName}</td>
                <td>${quantity}</td>
                <td>${unitPrice.toFixed(2)} VND</td>
                <td>${totalPrice.toFixed(2)} VND</td>
            `;
            modalBody.appendChild(newRow);
        });

        // Calculate total price
        let totalPrice = 0;
        document.querySelectorAll('.total').forEach(function(totalCell) {
            totalPrice += parseFloat(totalCell.innerText);
        });
        document.getElementById('modalTotalPrice').innerText = totalPrice.toFixed(2) + ' VND';

        // Show the modal
        $('#checkoutModal').modal('show');
    });

    // Optional: Handle payment confirmation button click
    document.querySelector('#confirmPayment').addEventListener('click', function() {
        let paymentMethod = document.getElementById('paymentMethod').value;
        // Perform further actions like sending payment information to server
        // For demonstration purpose, you can console log or alert the payment method
        console.log('Payment method selected:', paymentMethod);
        // Optionally, you can redirect to a payment gateway or perform other actions
        // window.location.href = '/payment-process'; // Example of redirecting to a payment process page
    });
</script>

</html>
