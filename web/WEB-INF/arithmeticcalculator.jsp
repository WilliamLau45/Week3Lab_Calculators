<%-- 
    Document   : arithmeticcalculator
    Created on : Sep 23, 2022, 6:06:05 PM
    Author     : ohiow
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic Calculator</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
                <form method="post"action="arithmetic">
            First: <input type="text" name="arithmetic"><br>
            Second: <input type="text" name="arithmetic"><br>
            <input type="submit" name="operation" value="+">
            <input type="submit" name="operation" value="-">
            <input type="submit" name="operation" value="*">
            <input type="submit" name="operation" value="%"><br>
            <p>Result: ${arithmetic} </p> 
            
            <a href="age">Age Calculator</a>
        </form>
    </body>
</html>
