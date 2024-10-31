package com.ohgiraffers.request;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.util.Enumeration;

@WebServlet(value = "/headers")
public class RequestHeaderServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 있니? 라고 물어보는 자료형
        Enumeration<String> headerName = req.getHeaderNames();
        while (headerName.hasMoreElements()){
            System.out.println(headerName.nextElement());
        }
    }
}