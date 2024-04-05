<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
  <head>
    <link
      rel="stylesheet"
      type="text/css"
      href="../../../resources/static/css/auth.css"
    />

    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
    <title>Auth</title>
  </head>
  <script src="https://code.jquery.com/jquery-3.6.0.min.js">
    // $(document).ready(function () {
    //   // Bắt sự kiện khi form submit
    //   $("form").submit(function (event) {
    //     // Ngăn chặn hành động mặc định của form
    //     event.preventDefault();
    //     alert("hello")
    //     // // Kiểm tra xem các trường đã được điền đầy đủ hay chưa
    //     // var username = $("#username").val();
    //     // if (username == "") {
    //     //   $("#username-error").text("Vui lòng nhập tên đăng nhập");
    //     // } else {
    //     //   $("#username-error").text("");
    //     //   // Nếu tất cả các trường đã được điền đầy đủ, bạn có thể tiếp tục xử lý form ở đây
    //     //   // Ví dụ: submit form, gọi API, vv.
    //     // }
    //   });
    // });
    $(document).ready(function(){
        console.log("jQuery is working!");
    });
  </script>
  <body>
    <div class="login">
      <div class="login__content">
        <div class="login__img">
          <!-- <img src="assets/img/img-login.svg" alt=""> -->
        </div>

        <div class="login__forms">
          <form
            method="POST"
            action="/login"
            class="login__registre"
            id="login-in"
          >
            <h1 class="login__title">Log In</h1>
            <div class="login__box">
              <i class="bx bx-user login__icon"></i>
              <input
                type="text"
                require
                placeholder="Email"
                class="login__input"
                name="email"
              />
            </div>

            <div class="login__box">
              <i class="bx bx-lock-alt login__icon"></i>
              <input
                type="password"
                require
                placeholder="Password"
                class="login__input"
                name="password"
              />
            </div>

            <a href="#" class="login__forgot">Forgot password?</a>

            <button name="login" type="submit" class="login__button">
              Sign In
            </button>

            <div>
              <span class="login__account">Don't have an Account ?</span>
              <span class="login__signin" id="sign-up">Sign Up</span>
            </div>
          </form>
          <form
            action="/signup"
            method="post"
            class="login__create none"
            id="login-up"
            onsubmit="return validateForm()"
          >
            <h1 class="login__title">Create Account</h1>

            <div class="login__box">
              <i class="bx bx-user login__icon"></i>
              <input
                type="text"
                placeholder="Username"
                class="login__input"
                id="username"
                name="username"
              />
            </div>
            <span
              class="error-message"
              id="username-error"
              style="color: red; position: relative; left: -68px"
            ></span>

            <div class="login__box">
              <i class="bx bx-at login__icon"></i>
              <input
                type="text"
                placeholder="Email"
                class="login__input"
                id="email"
                name="email"
              />
            </div>
            <span
              class="error-message"
              id="email-error"
              style="color: red; position: relative; left: -88px"
            ></span>

            <div class="login__box">
              <i class="bx bx-at login__icon"></i>
              <input
                type="password"
                placeholder="Password"
                class="login__input"
                id="password"
                name="password"
              />
            </div>
            <span
              class="error-message"
              id="password-error"
              style="color: red; position: relative; left: -68px"
            ></span>

            <div class="login__social">
              <a href="#" class="login__social-icon"
                ><i class="bx bxl-facebook"></i
              ></a>
              <a href="#" class="login__social-icon"
                ><i class="bx bxl-twitter"></i
              ></a>
              <a href="#" class="login__social-icon"
                ><i class="bx bxl-google"></i
              ></a>
            </div>
            <div>
              <span class="login__account">Already have an Account ?</span>
              <span class="login__signup" id="sign-in">Sign In</span>
            </div>
            <button
              type="submit"
              href="#"
              class="login__button"
              onclick="return validateForm();"
            >
              Sign Up
            </button>
          </form>
        </div>
      </div>
    </div>
  </body>
  <script>
    function validateForm() {
      // Lấy giá trị từ các trường input
      var username = document.getElementById("username").value;
      var email = document.getElementById("email").value;
      var password = document.getElementById("password").value;
      var isValid = true;

      if (username.trim() === "") {
        document.getElementById("username-error").innerText =
          "Please enter username";
        isValid = false;
      } else {
        document.getElementById("username-error").innerText = "";
      }

      if (email.trim() === "") {
        document.getElementById("email-error").innerText = "Please enter email";
        isValid = false;
      } else {
        document.getElementById("email-error").innerText = "";
      }

      if (password.trim() === "") {
        document.getElementById("password-error").innerText =
          "Please enter password";
        isValid = false;
      } else {
        document.getElementById("password-error").innerText = "";
      }

      return isValid;
    }
  </script>
  <script src="../../../resources/static/js/auth.js"></script>
</html>
