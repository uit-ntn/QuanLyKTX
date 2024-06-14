<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Product Detail</title>
        <link
            href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
            rel="stylesheet"
            integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH"
            crossorigin="anonymous">
        <link
            href="https://stackpath.bootstrapcdn.com/bootstrap/5.3.0/css/bootstrap.min.css"
            rel="stylesheet">
        <style>
        body {
            background-color: #f8f9fa;
        }
        .header, .footer {
            background-color: #007bff;
            color: white;
            padding: 10px 0;
            text-align: center;
        }
        .product-detail {
            background-color: white;
            padding: 20px;
            border-radius: 10px;
            box-shadow: 0 0 10px rgba(0,0,0,0.1);
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
        <link rel="stylesheet"
            href="../../../resources/static/css/product-detail.css">
    </head>
    <body>
        <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
            <div class="container px-5">
                <img class="navbar-brand" href="/"
                    src="../../../resources/static/img/logo.png">
                <button class="navbar-toggler" type="button"
                    data-bs-toggle="collapse"
                    data-bs-target="#navbarSupportedContent"
                    aria-controls="navbarSupportedContent" aria-expanded="false"
                    aria-label="Toggle navigation"><span
                        class="navbar-toggler-icon"></span></button>
                <div class="collapse navbar-collapse"
                    id="navbarSupportedContent">
                    <ul class="navbar-nav ms-auto mb-2 mb-lg-0">
                        <li class="nav-item"><a class="nav-link active"
                                aria-current="page"
                                href="/">Home</a></li>
                        <li class="nav-item"><a class="nav-link"
                                href="/about">About</a></li>
                        <li class="nav-item"><a class="nav-link"
                                href="/contact">Contact</a></li>
                        <li class="nav-item"><a class="nav-link"
                                href="/Services">Services</a></li>
                    </ul>
                    <a class="nav-link" href="shop/cart">
                        <i class="bi bi-cart4"></i>
                    </a>
                </div>
            </div>
        </nav>

        <div class="container">
            <div class="row">
                <div class="col-md-12">
                    <div class="product-detail">
                        <div class="row">
                            <div class="col-md-6">
                                <div class="product-images">
                                    <img
                                        src="https://sieuthixanh.com.vn/Upload/products/zoom/Bot-Giat-Omo-He-Bot-Thong-Minh-400g132713442100227588.jpg"
                                        class="img-fluid main-image"
                                        alt="Main Image">
                                </div>
                            </div>
                            <div class="col-md-6">
                                <div class="product-info">
                                    <h1>Bột giặt Omo</h1>
                                    <p class="price">40000 đ</p>
                                    <div class="quantity mb-3">
                                        <button
                                            class="btn btn-outline-secondary"
                                            type="button"
                                            id="decrease-quantity">-</button>
                                        <input type="text"
                                            class="form-control quantity-input text-center"
                                            id="quantity" value="1">
                                        <button
                                            class="btn btn-outline-secondary"
                                            type="button"
                                            id="increase-quantity">+</button>
                                    </div>
                                    <h5>Giặt là sạch</h5>
                                    <div class="mb-3">
                                        <button class="btn btn-custom me-2"
                                            type="button">Thêm vào giỏ
                                            hàng</button>
                                        <button
                                            class="btn btn-outline-secondary"
                                            type="button">Trở về shop</button>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>


        <section class="py-5">
            <div class="container">
              <div class="row gx-5">
                <aside class="col-lg-6">
                  <div class="border rounded-4 mb-3 d-flex justify-content-center">
                    <a data-fslightbox="mygalley" class="rounded-4" target="_blank" data-type="image" href="https://mdbcdn.b-cdn.net/img/bootstrap-ecommerce/items/detail1/big.webp">
                      <img style="max-width: 100%; max-height: 100vh; margin: auto;" class="rounded-4 fit" src="https://mdbcdn.b-cdn.net/img/bootstrap-ecommerce/items/detail1/big.webp" />
                    </a>
                  </div>
                  <div class="d-flex justify-content-center mb-3">
                    <a data-fslightbox="mygalley" class="border mx-1 rounded-2" target="_blank" data-type="image" href="https://mdbcdn.b-cdn.net/img/bootstrap-ecommerce/items/detail1/big1.webp" class="item-thumb">
                      <img width="60" height="60" class="rounded-2" src="https://mdbcdn.b-cdn.net/img/bootstrap-ecommerce/items/detail1/big1.webp" />
                    </a>
                    <a data-fslightbox="mygalley" class="border mx-1 rounded-2" target="_blank" data-type="image" href="https://mdbcdn.b-cdn.net/img/bootstrap-ecommerce/items/detail1/big2.webp" class="item-thumb">
                      <img width="60" height="60" class="rounded-2" src="https://mdbcdn.b-cdn.net/img/bootstrap-ecommerce/items/detail1/big2.webp" />
                    </a>
                    <a data-fslightbox="mygalley" class="border mx-1 rounded-2" target="_blank" data-type="image" href="https://mdbcdn.b-cdn.net/img/bootstrap-ecommerce/items/detail1/big3.webp" class="item-thumb">
                      <img width="60" height="60" class="rounded-2" src="https://mdbcdn.b-cdn.net/img/bootstrap-ecommerce/items/detail1/big3.webp" />
                    </a>
                    <a data-fslightbox="mygalley" class="border mx-1 rounded-2" target="_blank" data-type="image" href="https://mdbcdn.b-cdn.net/img/bootstrap-ecommerce/items/detail1/big4.webp" class="item-thumb">
                      <img width="60" height="60" class="rounded-2" src="https://mdbcdn.b-cdn.net/img/bootstrap-ecommerce/items/detail1/big4.webp" />
                    </a>
                    <a data-fslightbox="mygalley" class="border mx-1 rounded-2" target="_blank" data-type="image" href="https://mdbcdn.b-cdn.net/img/bootstrap-ecommerce/items/detail1/big.webp" class="item-thumb">
                      <img width="60" height="60" class="rounded-2" src="https://mdbcdn.b-cdn.net/img/bootstrap-ecommerce/items/detail1/big.webp" />
                    </a>
                  </div>
                  <!-- thumbs-wrap.// -->
                  <!-- gallery-wrap .end// -->
                </aside>
                <main class="col-lg-6">
                  <div class="ps-lg-3">
                    <h4 class="title text-dark">
                      Quality Men's Hoodie for Winter, Men's Fashion <br />
                      Casual Hoodie
                    </h4>
                    <div class="d-flex flex-row my-3">
                      <div class="text-warning mb-1 me-2">
                        <i class="fa fa-star"></i>
                        <i class="fa fa-star"></i>
                        <i class="fa fa-star"></i>
                        <i class="fa fa-star"></i>
                        <i class="fas fa-star-half-alt"></i>
                        <span class="ms-1">
                          4.5
                        </span>
                      </div>
                      <span class="text-muted"><i class="fas fa-shopping-basket fa-sm mx-1"></i>154 orders</span>
                      <span class="text-success ms-2">In stock</span>
                    </div>
          
                    <div class="mb-3">
                      <span class="h5">$75.00</span>
                      <span class="text-muted">/per box</span>
                    </div>
          
                    <p>
                      Modern look and quality demo item is a streetwear-inspired collection that continues to break away from the conventions of mainstream fashion. Made in Italy, these black and brown clothing low-top shirts for
                      men.
                    </p>
          
                    <div class="row">
                      <dt class="col-3">Type:</dt>
                      <dd class="col-9">Regular</dd>
          
                      <dt class="col-3">Color</dt>
                      <dd class="col-9">Brown</dd>
          
                      <dt class="col-3">Material</dt>
                      <dd class="col-9">Cotton, Jeans</dd>
          
                      <dt class="col-3">Brand</dt>
                      <dd class="col-9">Reebook</dd>
                    </div>
          
                    <hr />
          
                    <div class="row mb-4">
                      <div class="col-md-4 col-6">
                        <label class="mb-2">Size</label>
                        <select class="form-select border border-secondary" style="height: 35px;">
                          <option>Small</option>
                          <option>Medium</option>
                          <option>Large</option>
                        </select>
                      </div>
                      <!-- col.// -->
                      <div class="col-md-4 col-6 mb-3">
                        <label class="mb-2 d-block">Quantity</label>
                        <div class="input-group mb-3" style="width: 170px;">
                          <button class="btn btn-white border border-secondary px-3" type="button" id="button-addon1" data-mdb-ripple-color="dark">
                            <i class="fas fa-minus"></i>
                          </button>
                          <input type="text" class="form-control text-center border border-secondary" placeholder="14" aria-label="Example text with button addon" aria-describedby="button-addon1" />
                          <button class="btn btn-white border border-secondary px-3" type="button" id="button-addon2" data-mdb-ripple-color="dark">
                            <i class="fas fa-plus"></i>
                          </button>
                        </div>
                      </div>
                    </div>
                    <a href="#" class="btn btn-warning shadow-0"> Buy now </a>
                    <a href="#" class="btn btn-primary shadow-0"> <i class="me-1 fa fa-shopping-basket"></i> Add to cart </a>
                    <a href="#" class="btn btn-light border border-secondary py-2 icon-hover px-3"> <i class="me-1 fa fa-heart fa-lg"></i> Save </a>
                  </div>
                </main>
              </div>
            </div>
          </section>

        <footer class="bg-dark py-3">
            <div class="container px-4 px-lg-5 my-5 d-flex justify-content-center">
                <div style="width: 120px;height: 80px;">
                    <img style="height: 100%;width: 100%;" src="../../../resources/static/img/logo.png"></img>
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
        document.getElementById('decrease-quantity').addEventListener('click', function() {
            var quantity = document.getElementById('quantity');
            var value = parseInt(quantity.value, 10);
            if (value > 1) {
                quantity.value = value - 1;
            }
        });

        document.getElementById('increase-quantity').addEventListener('click', function() {
            var quantity = document.getElementById('quantity');
            quantity.value = parseInt(quantity.value, 10) + 1;
        });
    </script>
        <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
        <script
            src="https://stackpath.bootstrapcdn.com/bootstrap/5.3.0/js/bootstrap.bundle.min.js"></script>
    </body>
</html>
