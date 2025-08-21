<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>All Students</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background: linear-gradient(to right, #ffecd2, #fcb69f);
            margin: 0;
            padding: 0;
        }

        .container {
            background-color: white;
            max-width: 800px;
            margin: 50px auto;
            padding: 25px;
            border-radius: 12px;
            box-shadow: 0px 4px 15px rgba(0,0,0,0.2);
        }

        h2 {
            text-align: center;
            color: #333;
            margin-bottom: 25px;
        }

        table {
            width: 100%;
            border-collapse: collapse;
            font-size: 15px;
        }

        th, td {
            padding: 12px;
            text-align: center;
            border-bottom: 1px solid #ddd;
        }

        th {
            background-color: #ff7e5f;
            color: white;
        }

        tr:nth-child(even) {
            background-color: #f8f8f8;
        }

        tr:hover {
            background-color: #ffe8d6;
        }

        .no-data {
            text-align: center;
            color: #666;
            padding: 15px;
        }
    </style>
</head>
<body>

<div class="container">
    <h2>All Students</h2>

    <table>
        <tr>
            <th>ID</th>
            <th>Employee Name</th>
            <th>Salary</th>
            <th>Address</th>
        </tr>

        <c:choose>
            <c:when test="${not empty students}">
                <c:forEach var="stu" items="${students}">
                    <tr>
                        <td>${stu.employeeId}</td>
                        <td>${stu.employeeName}</td>
                        <td>${stu.salary}</td>
                        <td>${stu.address}</td>
                    </tr>
                </c:forEach>
            </c:when>
            <c:otherwise>
                <tr>
                    <td colspan="4" class="no-data">No Students Found</td>
                </tr>
            </c:otherwise>
        </c:choose>

    </table>
</div>

</body>
</html>
