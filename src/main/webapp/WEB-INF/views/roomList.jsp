<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.example.QuanLyKTX.model.Room" %>
<%@page session="false" %>


<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <title>Room Registration Page</title>
    <link rel="stylesheet" type="text/css" href="../../../resources/static/css/home.css?version=5.1" />
    <link rel="icon" href="../../../resources/static/img/logo.png" type="image/x-icon">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>
    <% if (request.getAttribute("errorMessage") != null) { %>
    <div class="alert alert-danger" role="alert">
        <%= request.getAttribute("errorMessage") %>
    </div>
    <% } %>
    <table border="1">
        <thead>
            <tr>
                <th>Room ID</th>
                <th>Room Number</th>
            </tr>
        </thead>
        <tbody>
            <% for (Room room : (List<Room>) request.getAttribute("rooms"))) { %>
            <tr>
                <td>
                    <%= room.getRoomId() %>
                </td>
                <td>
                    <%= room.getRoomNumber() %>
                </td>
            </tr>
            <% } %>
        </tbody>
    </table>
</body>
</html>
