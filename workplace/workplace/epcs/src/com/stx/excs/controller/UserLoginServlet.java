package com.stx.excs.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Administrator on 2020/4/15 0015.
 */
@WebServlet("/login")
public class UserLoginServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse resp) throws ServletException, IOException {
        String uname = request.getParameter("uname");
        String pwd = request.getParameter("pwd");
        System.out.println(uname);
        System.out.println(pwd);
        resp.setCharacterEncoding("utf-8");
        PrintWriter pw = resp.getWriter();
        if ("admin".equals(uname) && "123456".equals(pwd)) {
            // forward 可以带参数到另外一个servlet 或jsp 页面上去；
            /*req.getRequestDispatcher("/welcome.jsp").forward(req, resp);*/
            request.getRequestDispatcher("/welcome.jsp").forward(request, resp);
            // sendRedirect 不可以带参数到另外一个servlet 或jsp 页面上去
//            resp.sendRedirect("/epcs/welcome.jsp");
        } else {
            pw.write("not ok");
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    }
}
