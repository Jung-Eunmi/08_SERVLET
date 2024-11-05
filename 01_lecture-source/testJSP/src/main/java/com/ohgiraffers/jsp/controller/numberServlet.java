package com.ohgiraffers.jsp.controller;

import com.ohgiraffers.jsp.service.Calculator;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/number/input")
public class numberServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int firstNum = Integer.parseInt(req.getParameter("firstNum"));
        int secondNum = Integer.parseInt(req.getParameter("secondNum"));
        String operator = req.getParameter("operator");

        System.out.println("firstNum = " + firstNum);
        System.out.println("secondNum = " + secondNum);
        System.out.println("operator = " + operator);

        int totalNum = new Calculator().calcTotalNum(firstNum, secondNum, operator);

        req.setAttribute("firstNum", firstNum);
        req.setAttribute("secondNum", secondNum);
        req.setAttribute("operator", operator);
        req.setAttribute("totalNum", totalNum);

        RequestDispatcher rd = req.getRequestDispatcher("/jsp/response.jsp");
        rd.forward(req, resp);
    }
}
