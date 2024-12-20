package com.ohgiraffers.service;

import java.io.*;

import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(value = "/request-service")
public class ServiceMethodServlet extends HttpServlet {

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        /* comment.
         *   http 메소드는 get, post, head, options, put, delete 등등이 있지만
         *   가장 많이 사용되는 것은 get 과 post 이다. */

        /* comment. sevice()는 get 과 post 둘 다 허용,doGet(), doPost() 보다 우선순위가 높다. */
        // 자료형이 일치하지 않아 강제형변환
        HttpServletRequest request = (HttpServletRequest)req;
        HttpServletResponse response = (HttpServletResponse)res;
        
        String httpMethod = request.getMethod();
        System.out.println("httpMethod = " + httpMethod);

            // httpMethod 방식이 GET 이면
        if(("GET").equals(httpMethod)){
            doGet(request, response);
            // httpMethod 방식이 POST 이면
        }else if("POST".equals(httpMethod)) {
            doPost(request, response);
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        /* comment. doGet() 은 get 만 허용 */
        System.out.println("GET 요청을 처리 할 메소드 호출됨...");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        /* comment. doPost() 는 post 만 허용 */
        System.out.println("POST 요청을 처리 할 메소드 호출됨...");
    }

}