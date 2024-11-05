<%--
  Created by IntelliJ IDEA.
  User: Hi
  Date: 2024-11-05
  Time: 오전 10:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>☆계산하기☆</h1>
<form action="/number/input" method="get">
    <input type="number" name="firstNum" min="0" max="9" placeholder="첫번째 숫자" style="width: 100px">
    <input type="number" name="secondNum" min="0" max="9" placeholder="두번째 숫자" style="width: 100px">
    <select name="operator">
        <option value="+">+</option>
        <option value="-">-</option>
        <option value="*">*</option>
        <option value="/">/</option>
    </select>
    <button type="submit">계산</button>
</form>
</body>
</html>
