<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<!DOCTYPE html>
<html>
<head>
    <title>Register Room</title>
</head>
<body>
    <h2>Register Room</h2>
    <form action="/booking/register" method="post">
        <input type="hidden" name="roomID" value="${roomID}"/>
        <div>
            <label for="fullName">Full Name:</label>
            <input type="text" id="fullName" name="fullName" required>
        </div>
        <div>
            <label for="gender">Gender:</label>
            <input type="text" id="gender" name="gender" required>
        </div>
        <div>
            <label for="dateOfBirth">Date of Birth:</label>
            <input type="date" id="dateOfBirth" name="dateOfBirth" required>
        </div>
        <div>
            <label for="address">Address:</label>
            <input type="text" id="address" name="address" required>
        </div>
        <div>
            <label for="phoneNumber">Phone Number:</label>
            <input type="text" id="phoneNumber" name="phoneNumber" required>
        </div>
        <div>
            <label for="school">School:</label>
            <input type="text" id="school" name="school" required>
        </div>
        <div>
            <label for="mssv">Student ID:</label>
            <input type="text" id="mssv" name="mssv" required>
        </div>
        <div>
            <label for="email">Email:</label>
            <input type="email" id="email" name="email" required>
        </div>
        <div>
            <label for="checkInDate">Check-In Date:</label>
            <input type="date" id="checkInDate" name="checkInDate" required>
        </div>
        <div>
            <label for="checkOutDate">Check-Out Date:</label>
            <input type="date" id="checkOutDate" name="checkOutDate" required>
        </div>
        <div>
            <button type="submit">Register</button>
        </div>
    </form>
    <c:if test="${not empty success}">
        <p>${success}</p>
    </c:if>
    <c:if test="${not empty error}">
        <p>${error}</p>
    </c:if>
</body>
</html>
