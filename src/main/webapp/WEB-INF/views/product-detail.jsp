<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
        <!DOCTYPE html>
        <html lang="en">

        <head>
            <meta charset="UTF-8">
            <meta name="viewport" content="width=device-width, initial-scale=1.0">
            <title>Product Detail</title>
            <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet"
                integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH"
                crossorigin="anonymous">
            <link href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.5.0/font/bootstrap-icons.css" rel="stylesheet" />
            <link href="https://stackpath.bootstrapcdn.com/bootstrap/5.3.0/css/bootstrap.min.css" rel="stylesheet">
            <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css"
                integrity="sha512-QgYwR3AgETNA0wgsip0VAdm+KboWLFfDhUGZG1m3lqck9gr+JFv+d6I5H4XpIeM1Q0WtQ0F06cI1mQo4aJ6alw=="
                crossorigin="anonymous" referrerpolicy="no-referrer" />

            <style>
                body {
                    background-color: #f8f9fa;
                }

                .header,
                .footer {
                    background-color: #007bff;
                    color: white;
                    padding: 10px 0;
                    text-align: center;
                }

                .product-detail {
                    background-color: white;
                    padding: 20px;
                    border-radius: 10px;
                    box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
                    margin-top: 20px;
                }

                .product-images {
                    display: flex;
                    flex-direction: column;
                    align-items: center;
                }

                .product-images img {
                    border-radius: 10px;
                    margin-bottom: 10px;
                }

                .product-info h1 {
                    color: #007bff;
                }

                .product-info .price {
                    font-size: 1.5em;
                    color: #28a745;
                    margin-bottom: 20px;
                }

                .quantity-input {
                    width: 100px;
                    display: inline-flex;
                }

                .btn-custom {
                    background-color: #007bff;
                    color: white;
                }

                .btn-custom:hover {
                    background-color: #0056b3;
                }
            </style>
            <link rel="stylesheet" href="../../../resources/static/css/product-detail.css">
        </head>

        <body>
            <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
                <div class="container px-5">
                    <a class="navbar-brand" href="/">
                        <img src="../../../resources/static/img/logo.png" alt="Logo">
                    </a>
                    <button class="navbar-toggler" type="button" data-bs-toggle="collapse"
                        data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent"
                        aria-expanded="false" aria-label="Toggle navigation"><span
                            class="navbar-toggler-icon"></span></button>
                    <div class="collapse navbar-collapse" id="navbarSupportedContent">
                        <ul class="navbar-nav ms-auto mb-2 mb-lg-0">
                            <li class="nav-item"><a class="nav-link active" aria-current="page" href="/">Home</a></li>
                            <li class="nav-item"><a class="nav-link" href="/about">About</a></li>
                            <li class="nav-item"><a class="nav-link" href="/contact">Contact</a></li>
                            <li class="nav-item"><a class="nav-link" href="/services">Services</a></li>
                            <li class="nav-item"><a class="nav-link" href="/shop/cart/${loggedUser.studentID}">Cart</a>
                            </li>
                        </ul>
                    </div>
                </div>
            </nav>

            <section class="py-5">
                <div class="container">
                    <div class="row gx-5">
                        <aside class="col-lg-6">
                            <div class="border rounded-4 mb-3 d-flex justify-content-center">
                                <a data-fslightbox="mygalley" class="rounded-4" target="_blank" data-type="image"
                                    href="${product.image}">
                                    <img style="max-height: 60vh; margin: auto;" class="rounded-4 fit"
                                        src="${product.image}" />
                                </a>
                            </div>
                        </aside>
                        <main class="col-lg-6">
                            <div class="ps-lg-3">
                                <h4 class="title text-dark">
                                    ${product.productName}
                                </h4>
                                <div class="d-flex flex-row my-3">
                                    <div class="text-warning mb-1 me-2">
                                        <c:forEach var="i" begin="1" end="${product.rating}">
                                            <i class="fa fa-star"></i>
                                        </c:forEach>
                                        <span class="ms-1">
                                            ${product.rating} sao
                                        </span>
                                    </div>
                                    <span class="text-muted"><i
                                            class="fas fa-shopping-basket fa-sm mx-1"></i>${product.stockQuantity}</span>
                                    <span class="text-success ms-2">In stock</span>
                                </div>

                                <div class="mb-3">
                                    <span class="h5">${product.price} VND</span>
                                </div>

                                <p>
                                    ${product.description}
                                </p>

                                <hr />

                                <div class="row mb-4">
                                    <div class="col-md-4 col-6 mb-3">
                                        <label class="mb-2 d-block">Quantity</label>
                                        <div class="input-group mb-3" style="width: 170px;">
                                            <button class="btn btn-white border border-secondary px-3" type="button"
                                                id="decrease-quantity" data-mdb-ripple-color="dark">
                                                <i class="fas fa-minus"></i>
                                            </button>
                                            <input type="text" id="quantity"
                                                class="form-control text-center border border-secondary" value="1" />
                                            <button class="btn btn-white border border-secondary px-3" type="button"
                                                id="increase-quantity" data-mdb-ripple-color="dark">
                                                <i class="fas fa-plus"></i>
                                            </button>
                                        </div>
                                    </div>
                                </div>
                                <a href="#" class="btn btn-warning shadow-0"> Buy now </a>
                                <a href="#" class="btn btn-primary shadow-0"> <i class="me-1 fa fa-shopping-basket"></i>
                                    Add to cart </a>
                            </div>
                        </main>
                    </div>
                </div>
            </section>

            <footer class="bg-dark py-3">
                <div class="container px-4 px-lg-5 my-5 d-flex justify-content-center">
                    <div style="width: 120px;height: 80px;">
                        <img style="height: 100%;width: 100%;" src="../../../resources/static/img/logo.png" alt="Logo">
                    </div>
                    <div class="text-center text-white">
                        <h1 class="display-4 fw-bolder">Ký túc xá Shop</h1>
                        <p class="lead fw-normal text-white-50 mb-0">Không chỉ là cung cấp chỗ ở</p>
                    </div>
                </div>
                <hr class="text-white">
                <div class="container px-3 px-lg-5 my-3 d-flex justify-content-center">
                    <h2 class="text-center text-white">DORM DEV TEAM</h2>
                </div>
            </footer>

            <script>
                document.getElementById('decrease-quantity').addEventListener('click', function () {
                    var quantity = document.getElementById('quantity');
                    var value = parseInt(quantity.value, 10);
                    if (value > 1) {
                        quantity.value = value - 1;
                    }
                });

                document.getElementById('increase-quantity').addEventListener('click', function () {
                    var quantity = document.getElementById('quantity');
                    quantity.value = parseInt(quantity.value, 10) + 1;
                });
            </script>
            <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
            <script src="https://stackpath.bootstrapcdn.com/bootstrap/5.3.0/js/bootstrap.bundle.min.js"></script>
        </body>

        </html>