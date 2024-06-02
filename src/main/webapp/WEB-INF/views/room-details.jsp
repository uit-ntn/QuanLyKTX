<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Room Details</title>
    </head>
    <body>
        <h1>Room Details</h1>
        <table>
            <tr>
                <th>Room ID:</th>
                <td>${room.roomID}</td>
            </tr>
            <tr>
                <th>Room Number:</th>
                <td>${room.roomNumber}</td>
            </tr>
            <tr>
                <th>Capacity:</th>
                <td>${room.capacity}</td>
            </tr>
            <tr>
                <th>Floor:</th>
                <td>${room.floor}</td>
            </tr>
            <tr>
                <th>Status:</th>
                <td>${room.status}</td>
            </tr>
            <tr>
                <th>Building:</th>
                <td>${room.building.buildingName}</td>
            </tr>
        </table>
        <a href="<c:url value='/rooms' />">Back to Search</a>
        <br>
        <a href="<c:url value='/register?roomId=${room.roomID}' />">Register for
            this room</a>
    </body>
</html>
