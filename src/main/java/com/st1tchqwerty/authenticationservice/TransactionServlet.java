package com.st1tchqwerty.authenticationservice;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "transactionServlet", value = "/transactionServlet")
public class TransactionServlet extends HttpServlet {

    private TransactionService transactionService;
    public void init() {

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        int Id = Integer.parseInt(request.getParameter("ID"));
        String timeStamp = request.getParameter("timeStamp");
        String type = request.getParameter("type");
        String actor=request.getParameter("actor");
        String data=request.getParameter("data");
        CustomTransaction mytr = new CustomTransaction(Id, timeStamp, type, actor, data);
        transactionService.addTransaction(mytr);

        response.sendRedirect("index.jsp");
    }

    public void destroy() {
    }
}