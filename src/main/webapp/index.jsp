<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title></title>
</head>
<body>
<form action="/send" method="POST">
    iD: <input type="text" name="ID"><br>
    Timestamp:<input type="text" name="timeStamp">
    Type: <input type="text" name="type">
    Actor <input type="text" name="actor">
    Transaction Data <input type="text" name="data">
    <input type="submit"></input>
</form>
<br/>

</body>
</html>