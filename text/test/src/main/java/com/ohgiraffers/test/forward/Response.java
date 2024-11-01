package com.ohgiraffers.test.forward;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/response")
public class Response extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = (String) req.getAttribute("id");

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("<!doctype html>\n")
                .append("<html>\n")
                .append("<head></head>\n")
                .append("<body>\n")
                .append("<h3 align=\"center\">")
                .append(id)
                .append("</h3>")
                .append("</body>\n")
                .append("</html>");

        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter printWriter = resp.getWriter();
        printWriter.print(stringBuilder);
        printWriter.flush();
        printWriter.close();

    }
}
