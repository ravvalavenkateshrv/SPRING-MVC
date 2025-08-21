<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Save Student</title>
</head>
<body>
    <h2>Save Student</h2>
	<form action="/save/student" method="post">
	       <label for="id">ID:</label>
	       <input type="number" id="id" name="id" required>
	       <br><br>
	       
	       <label for="name">Name:</label>
	       <input type="text" id="name" name="name" required>
	       <br><br>
	       
	       <label for="age">Age:</label>
	       <input type="number" id="age" name="age" min="0" required>
	       <br><br>
	       
	       <input type="submit" value="Submit">
	   </form>
</body>
</html>
