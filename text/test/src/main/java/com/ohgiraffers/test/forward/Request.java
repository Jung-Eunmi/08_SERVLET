package com.ohgiraffers.test.forward;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/forward")
public class Request extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String id = req.getParameter("userId");
        String pwd = req.getParameter("userPwd");

        req.setAttribute("id", id);

        RequestDispatcher rq = req.getRequestDispatcher("response");

        rq.forward(req, resp);


    }
}
