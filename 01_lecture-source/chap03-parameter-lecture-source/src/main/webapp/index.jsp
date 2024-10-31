<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
    <h1>Request Parameter</h1>
    <h3>GET 방식의 요청</h3>
    <hr>
    <h4>form 태그를 이용한 GET 방식 parameter</h4>

    <form action="querystring" method="get">
        <label>이름 : </label><input type="text" name="name">
        <br>
        <label>나이 : </label><input type="number" name="age">
        <br>
        <label>생일 : </label><input type="date" name="birthday">
        <br>
        <label>성별 : </label>
        <input type="radio" name="gender" id="male" value="M">
        <label for="male">남성</label>
        <input type="radio" name="gender" id="female" value="F">
        <label for="female">여성</label>
        <br>
        <lable>국적 : </lable>
        <select name="national">
            <option value="ko">한국</option>
            <option value="ch">중국</option>
            <option value="jp">일본</option>
            <option value="etc">기타</option>
        </select>
        <br>
        <label>취미 : </label>
        <input type="checkbox" name="hobbies" id="movie" value="movie">
        <label for="movie">영화</label>
        <input type="checkbox" name="hobbies" id="music" value="music">
        <label for="music">음악</label>
        <input type="checkbox" name="hobbies" id="coding" value="coding">
        <label for="coding">코딩</label>
        <br>
        <input type="submit" value="GET 요청">
    </form>
</body>
</html>