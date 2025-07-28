<!DOCTYPE html>
<html>
<head>
    <title>Dashboard - Pahana Edu Billing System</title>
    <style>
        body { font-family: Times New Roman; margin: 1.5in 1in; }
        h1 { font-size: 14pt; font-weight: bold; }
        p { font-size: 12pt; }
    </style>
</head>
<body>
    <h1>Welcome, <%= session.getAttribute("username") %></h1>
    <p><a href="logout">Logout</a></p>
</body>
</html>