<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

        <!DOCTYPE html>
        <html lang="en">

        <head>
            <meta charset="utf-8" />
            <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />
            <meta name="description" content="" />
            <meta name="author" content="" />
            <title>Ký túc xá Shop</title>
            <!-- Favicon-->
            <link rel="icon" type="image/x-icon" href="assets/favicon.ico" />
            <!-- Bootstrap icons-->
            <link href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.5.0/font/bootstrap-icons.css" rel="stylesheet" />
            <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
            <link rel="stylesheet" href="">
            <!-- Core theme CSS (includes Bootstrap)-->
            <style>
                @import url("https://fonts.googleapis.com/css2?family=Open+Sans:wght@400;600;700&display=swap");

                * {
                    padding: 0;
                    margin: 0;
                    text-decoration: none;
                    list-style: none;
                }

                .navbar-brand {
                    width: 80px;
                    height: 60px;
                }

                .navbar-brand img {
                    width: 100%;
                    height: 100%;
                }

                .fix-banner {
                    width: 100%;
                    height: 100%;
                }

                .fix-banner img {
                    width: 100%;
                    height: 90%;
                }
            </style>
            <link rel="stylesheet" href="../../../resources/static/css/styles.css">
        </head>


        <body>
            <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
                <div class="container px-5">
                    <img class="navbar-brand" src="../../../resources/static/img/logo.png">
                    <button class="navbar-toggler" type="button" data-bs-toggle="collapse"
                        data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent"
                        aria-expanded="false" aria-label="Toggle navigation"><span
                            class="navbar-toggler-icon"></span></button>
                    <div class="collapse navbar-collapse" id="navbarSupportedContent">
                        <ul class="navbar-nav ms-auto mb-2 mx-3 mb-lg-0">
                            <li class="nav-item"><a class="nav-link active" aria-current="page" href="/">Home</a></li>
                            <li class="nav-item"><a class="nav-link" href="/about">About</a></li>
                            <li class="nav-item"><a class="nav-link" href="/contact">Contact</a></li>
                            <li class="nav-item"><a class="nav-link" href="/Services">Services</a></li>
                        </ul>
                        <form class="d-flex">
                            <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search">
                            <button class="btn btn-primary" type="submit">Search</button>
                        </form> 
                        <a class="nav-link" href="shop/1/cart">
                            <button class="btn btn-secondary">
                                <i class="bi bi-cart4"></i>
                            </button>
                        </a>
                       
                    </div>
                </div>
            </nav>

            <div class="container">


                <h1 class="text-center my-5">DANH SÁCH SẢN PHẨM</h1>

                <section style="background-color: #eee;" class="border">
                    <div class="container py-5 px-5">
                        <!-- Filter Options -->
                        <div class="row mb-4">
                            <div class="col-lg-3">
                                <h5>Filter by Price</h5>
                                <select class="form-select" aria-label="Price filter">
                                    <option selected>Choose price range</option>
                                    <option value="1">$0 - $500</option>
                                    <option value="2">$500 - $1000</option>
                                    <option value="3">$1000 - $2000</option>
                                    <option value="4">$2000 - $4000</option>
                                </select>
                            </div>
                            <div class="col-lg-3">
                                <h5>Filter by Stars</h5>
                                <select class="form-select" aria-label="Stars filter">
                                    <option selected>Choose star rating</option>
                                    <option value="1">1 Star & Up</option>
                                    <option value="2">2 Stars & Up</option>
                                    <option value="3">3 Stars & Up</option>
                                    <option value="4">4 Stars & Up</option>
                                </select>
                            </div>
                            <div class="col-lg-3">
                                <h5>Filter by Availability</h5>
                                <select class="form-select" aria-label="Availability filter">
                                    <option selected>Choose availability</option>
                                    <option value="1">In Stock</option>
                                    <option value="2">Out of Stock</option>
                                </select>
                            </div>
                        </div>

                        <div class="row justify-content-center">
                            <div class="col-md-8 col-lg-6 col-xl-4">
                                <div class="card" style="border-radius: 15px;">
                                    <div class="bg-image hover-overlay ripple ripple-surface ripple-surface-light"
                                        data-mdb-ripple-color="light">
                                        <img src="https://mdbcdn.b-cdn.net/img/Photos/Horizontal/E-commerce/Products/12.webp"
                                            style="border-top-left-radius: 15px; border-top-right-radius: 15px;"
                                            class="img-fluid" alt="Laptop" />
                                        <a href="#!">
                                            <div class="mask"></div>
                                        </a>
                                    </div>
                                    <div class="card-body pb-0">
                                        <div class="d-flex justify-content-between">
                                            <div>
                                                <p><a href="#!" class="text-dark">Dell Xtreme 270</a></p>
                                                <p class="small text-muted">Laptops</p>
                                            </div>
                                            <div>
                                                <div class="d-flex flex-row justify-content-end mt-1 mb-4 text-warning">
                                                    <i class="bi-star-fill"></i>
                                                    <i class="bi-star-fill"></i>
                                                    <i class="bi-star-fill"></i>
                                                    <i class="bi-star-fill"></i>
                                                </div>
                                                <p class="small text-muted">Rated 4.0/5</p>
                                            </div>
                                        </div>
                                    </div>
                                    <hr class="my-0" />
                                    <div class="card-body pb-0">
                                        <div class="d-flex justify-content-between">
                                            <p><a href="#!" class="text-dark">$3,999</a></p>
                                            <p class="text-dark">#### 8787</p>
                                        </div>
                                        <p class="small text-muted">VISA Platinum</p>
                                    </div>
                                    <hr class="my-0" />
                                    <div class="card-body">
                                        <div class="d-flex justify-content-between align-items-center pb-2 mb-1">
                                            <button type="button" data-mdb-button-init data-mdb-ripple-init
                                                class="btn btn-danger">Details</button>
                                            <button type="button" data-mdb-button-init data-mdb-ripple-init
                                                class="btn btn-dark">Add to Cart</button>
                                            <button type="button" data-mdb-button-init data-mdb-ripple-init
                                                class="btn btn-primary">Buy now</button>
                                        </div>
                                    </div>
                                </div>
                            </div>


                            <div class="col-md-8 col-lg-6 col-xl-4">
                                <div class="card" style="border-radius: 15px;">
                                    <div class="bg-image hover-overlay ripple ripple-surface ripple-surface-light"
                                        data-mdb-ripple-color="light">
                                        <img src="https://mdbcdn.b-cdn.net/img/Photos/Horizontal/E-commerce/Products/12.webp"
                                            style="border-top-left-radius: 15px; border-top-right-radius: 15px;"
                                            class="img-fluid" alt="Laptop" />
                                        <a href="#!">
                                            <div class="mask"></div>
                                        </a>
                                    </div>
                                    <div class="card-body pb-0">
                                        <div class="d-flex justify-content-between">
                                            <div>
                                                <p><a href="#!" class="text-dark">Dell Xtreme 270</a></p>
                                                <p class="small text-muted">Laptops</p>
                                            </div>
                                            <div>
                                                <div class="d-flex flex-row justify-content-end mt-1 mb-4 text-warning">
                                                    <i class="bi-star-fill"></i>
                                                    <i class="bi-star-fill"></i>
                                                    <i class="bi-star-fill"></i>
                                                    <i class="bi-star-fill"></i>
                                                </div>
                                                <p class="small text-muted">Rated 4.0/5</p>
                                            </div>
                                        </div>
                                    </div>
                                    <hr class="my-0" />
                                    <div class="card-body pb-0">
                                        <div class="d-flex justify-content-between">
                                            <p><a href="#!" class="text-dark">$3,999</a></p>
                                            <p class="text-dark">#### 8787</p>
                                        </div>
                                        <p class="small text-muted">VISA Platinum</p>
                                    </div>
                                    <hr class="my-0" />
                                    <div class="card-body">
                                        <div class="d-flex justify-content-between align-items-center pb-2 mb-1">

                                            <a href="/shop/product/1">
                                                <button type="button" data-mdb-button-init data-mdb-ripple-init
                                                    class="btn btn-danger">Details</button>
                                            </a>
                                            <button type="button" data-mdb-button-init data-mdb-ripple-init
                                                class="btn btn-dark">Add to Cart</button>
                                            <button type="button" data-mdb-button-init data-mdb-ripple-init
                                                class="btn btn-primary">Buy now</button>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <!-- Repeat the above block for other product cards -->
                        </div>
                    </div>
                </section>


            </div>
            <!-- Footer-->
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

            <!-- Bootstrap core JS-->
            <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
            <!-- Core theme JS-->
            <script src="../../../resources/static/js/scripts.js"></script>
        </body>

        </html>