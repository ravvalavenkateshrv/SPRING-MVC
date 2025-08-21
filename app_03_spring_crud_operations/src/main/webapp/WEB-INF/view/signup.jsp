<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Add Employee</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background: linear-gradient(to right, #74ebd5, #acb6e5);
            margin: 0;
            padding: 0;
        }

        .container {
            background-color: white;
            max-width: 450px;
            margin: 50px auto;
            padding: 25px 30px;
            border-radius: 12px;
            box-shadow: 0px 4px 15px rgba(0,0,0,0.2);
        }

        h2 {
            text-align: center;
            margin-bottom: 25px;
            color: #333;
        }

        label {
            font-size: 16px;
            font-weight: bold;
            display: block;
            margin-bottom: 6px;
            color: #444;
        }

        input, textarea {
            width: 100%;
            padding: 10px;
            margin-bottom: 15px;
            border-radius: 6px;
            border: 1px solid #ccc;
            font-size: 14px;
        }

        input:focus, textarea:focus {
            border-color: #4CAF50;
            outline: none;
            box-shadow: 0px 0px 5px #4CAF50;
        }

        input[type="submit"] {
            background-color: #4CAF50;
            color: white;
            font-size: 16px;
            border: none;
            cursor: pointer;
            transition: 0.3s;
        }

        input[type="submit"]:hover {
            background-color: #45a049;
        }
    </style>
</head>
<body>

<div class="container">
    <h2>Add Employee</h2>
    <form action="/signup" method="post">
        
        <label for="employeeId">Employee ID:</label>
        <input type="number" id="employeeId" name="employeeId" required>

        <label for="employeeName">Employee Name:</label>
        <input type="text" id="employeeName" name="employeeName" required>

        <label for="salary">Salary:</label>
        <input type="number" id="salary" name="salary" required>

        <label for="password">Password:</label>
        <input type="password" id="password" name="password" required>

        <label for="address">Address:</label>
        <textarea id="address" name="address" rows="3" required></textarea>

        <input type="submit" value="Submit">
    </form>
</div>

</body>
</html>
