<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Danh sách các phòng</title>
    <link href="https://stackpath.bootstrapcdn.com/bootstrap/5.1.3/css/bootstrap.min.css" rel="stylesheet">
    <style>
        .custom-container {
            border: 1px solid #ddd;
            border-radius: 5px;
            background: linear-gradient(135deg, #f5f7fa, #c3cfe2);
            padding: 20px;
            margin-top: 20px;
        }
        .custom-title {
            font-size: 1.5rem;
            font-weight: bold;
            color: #333;
        }
        .note {
            background-color: #fff3cd;
            padding: 15px;
            border: 1px solid #ffeeba;
            border-radius: 5px;
            margin-bottom: 20px;
        }
        .note p {
            margin: 0;
        }
        .form-group {
            margin-bottom: 1rem;
        }
        .room-status {
            display: flex;
            justify-content: center;
            align-items: center;
            flex-wrap: wrap;
        }
        .room-status .seat {
            margin: 5px;
        }
        .seat-occupied {
            color: red;
        }
        .seat-available {
            color: gray;
        }
        .card-header {
            font-weight: bold;
            background-color: #f8f9fa;
        }
        .list-group-item {
            display: flex;
            justify-content: space-between;
            align-items: center;
        }
        .badge-status {
            font-size: 0.9em;
        }
    </style>
</head>
<body>
    <div class="container">
        <h1>Danh sách các phòng</h1>
        <p>Building Type: ${buildingtype}</p>
        <p>Capacity: ${capacity}</p>
        <p>Building: ${building}</p>

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
                                    <span class="badge bg-primary">${room.capacity} sinh viên</span>
                                    <a href="<c:url value='/rooms/${room.roomID}' />" class="btn btn-link">View Details</a>
                                </div>
                                <div class="card-body">
                                    <div class="room-status">
                                        <c:forEach var="i" begin="1" end="${room.capacity}">
                                            <span class="seat 
                                                <c:choose>
                                                    <c:when test="${i <= room.occupied}">
                                                        seat-occupied
                                                    </c:when>
                                                    <c:otherwise>
                                                        seat-available
                                                    </c:otherwise>
                                                </c:choose>
                                            ">&#x1F464;</span>
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

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFbyQ5Md2jGmOD4KHAOU6Wl5F/6bZr96BRTxVYlZH8N6FNFVC71RZ5PB" crossorigin="anonymous"></script>
</body>
</html>
