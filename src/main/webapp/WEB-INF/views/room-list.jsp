<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Danh sách các phòng</title>
        <link
            href="https://stackpath.bootstrapcdn.com/bootstrap/5.1.3/css/bootstrap.min.css"
            rel="stylesheet">
        <link
            href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
            rel="stylesheet"
            integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
            crossorigin="anonymous">
        <style>
        /* CSS styles here */
    </style>
    </head>
    <body>
        <div class="container">
            <h1>Danh sách các phòng</h1>
            <p>Number of rooms: ${rooms != null ? rooms.size() :
                'rooms is null'}</p>

            <c:choose>
                <c:when test="${empty rooms}">
                    <p>Không có phòng phù hợp.</p>
                </c:when>
                <c:otherwise>
                    <div class="row">
                        <c:forEach var="room" items="${rooms}">
                            <div class="col-md-4 mb-3">
                                <div class="card">
                                    <div class="card-header">
                                        P ${room.roomNumber}
                                        <span
                                            class="badge bg-primary">${room.capacity}
                                            sinh viên</span>
                                        <a
                                            href="<c:url value='/rooms/${room.roomID}' />"
                                            class="btn btn-link">View
                                            Details</a>
                                    </div>
                                    <div class="card-body">
                                        <div class="room-status">
                                            <c:forEach var="i" begin="1"
                                                end="${room.capacity}">
                                                <span
                                                    class="seat seat-available">&#x1F464;</span>
                                            </c:forEach>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </c:forEach>
                    </div>
                </c:otherwise>
            </c:choose>
        </div>

        <script
            src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-MrcW6ZMFbyQ5Md2jGmOD4KHAOU6Wl5F/6bZr96BRTxVYlZH8N6FNFVC71RZ5PB"
            crossorigin="anonymous"></script>
        <script
            src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
            crossorigin="anonymous"></script>
    </body>
</html>
