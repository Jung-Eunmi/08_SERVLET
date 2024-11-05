<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Calculator</title>
</head>
<body>
<%
  int firstNum = (int) request.getAttribute("firstNum");
  int secondNum = (int) request.getAttribute("secondNum");
  String operator = (String) request.getAttribute("operator");
  int totalNum = (int) request.getAttribute("totalNum");
%>

<table style="color: coral" border="1" bgcolor="#ffebcd">
  <tr>
    <td colspan="4">은미's 계산기</td>
  </tr>
  <tr>
  <td>첫번째 숫자</td>
  <td>연산 기호</td>
  <td>두번째 숫자</td>
  <td>연산 결과</td>
  </tr>
  <tr>
    <td><%= firstNum %></td>
    <td><%= operator %></td>
    <td><%= secondNum %></td>
    <td><%= totalNum %></td>
  </tr>
</table>
</body>
</html>
