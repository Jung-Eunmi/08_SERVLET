package com.ohgiraffers.parameter.section01.querystring;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.sql.Date;

@WebServlet("/querystring") // 인자가 두개 이상이면 'value = '를 입력하고 인자를 입력해야 함
public class QueryStringServlet extends HttpServlet {

    @Override           // 요청한 값이 항상 Request 에 담겨있음
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("doGet() 호출 됨...");

        /* comment.
        *   HttpServletRequest 객체를 통해 우리가 화면에서 요청 한 값을
        *   getParameter() 메소드로 꺼내올 수 있다.
        *   인자로 input 태그에 지정 한 name 속성의 값을 getParameter() 메소드에 전달해주면 된다.
        * */

        String name = req.getParameter("name");
        System.out.println("우리가 view 에서 입력 한 이름 : " + name);

        // getParameter() 메소드는 타입이 String 이기 때문에 자료형이 다르면 파싱 해줘야함!
        int age = Integer.parseInt(req.getParameter("age"));
        System.out.println("나이 : " + age);

        Date birthday = Date.valueOf(req.getParameter("birthday"));
        System.out.println("생일 : " + birthday);

        String national = req.getParameter("national");
        System.out.println("국적 : " + national);

        String[] hobbies = req.getParameterValues("hobbies");
        for(String hobby : hobbies){
            System.out.println(hobby);
        }


    }
}
