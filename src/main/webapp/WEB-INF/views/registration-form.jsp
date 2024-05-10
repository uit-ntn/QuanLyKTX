<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Room Registration</title>
</head>
<body>
    <h2>Room Registration Form</h2>
    <form action="/register-room" method="post">
        <label for="studentId">Student ID:</label>
        <input type="text" id="studentId" name="studentId"><br><br>
        <label for="roomId">Room ID:</label>
        <input type="text" id="roomId" name="roomId"><br><br>
        <label for="checkInDate">Check-in Date:</label>
        <input type="date" id="checkInDate" name="checkInDate"><br><br>
        <label for="checkOutDate">Check-out Date:</label>
        <input type="date" id="checkOutDate" name="checkOutDate"><br><br>
        <button type="submit">Register Room</button>
    </form>
</body>
</html>
