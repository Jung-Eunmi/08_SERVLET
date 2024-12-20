package com.ohgiraffers.section01.status;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/status")
public class StatusCodeServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // error 페이지
//        resp.sendError(404,"이 페이지는 없는 페이지입니다.");
        resp.sendError(500,"서버 내부 오류(개발자의 잘못)");
    }
}
