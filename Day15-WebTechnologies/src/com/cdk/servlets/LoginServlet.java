package com.cdk.servlets;

import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class LoginServlet extends javax.servlet.http.HttpServlet {

    Map<String, String> credentials = new HashMap<>();
    public void init() {
        credentials.put("Yateesha", "y");
        credentials.put("Apurva", "a");
        credentials.put("Deepika", "d");
    }

    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        HttpSession session = request.getSession();
        response.setContentType("text/html");
        String name = request.getParameter("user");
        String pass = request.getParameter("pass");
        for (Map.Entry<String, String> database : credentials.entrySet()) {
           // if (database.getValue())
        }
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }
}
