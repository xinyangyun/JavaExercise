package com.stx.zzyb;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyFirstServlet extends HttpServlet { 

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String username = "admin";
		String userpassword = "123456";
		// ������Ӧ��������
		resp.setContentType("text/html");
		resp.setCharacterEncoding("utf-8");
		// TODO Auto-generated method stub
		String name = req.getParameter("name");
		String pwd = req.getParameter("pwd");
		System.out.println(name);
		PrintWriter pt = resp.getWriter(); // sout
		if (name == null || pwd == null ) {
			pt.write("<p1>" + "�û��������벻��Ϊ�գ�" + "</p1>");
		}else if (username.equals(name) && userpassword.equals(pwd)) {
			pt.write("<p1>" + "��֤�ɹ���" + "</p1>");
		}else {
			pt.write("<p1>" + "��֤ʧ�ܣ�" + "</p1>");
		}
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String username = "admin";
		String userpassword = "123456";
		// ������Ӧ��������
		resp.setContentType("text/html");
		resp.setCharacterEncoding("utf-8");
		// TODO Auto-generated method stub
		String name = req.getParameter("name");
		String pwd = req.getParameter("pwd");
		System.out.println(name);
		PrintWriter pt = resp.getWriter(); // sout
		if (name == null || pwd == null ) {
			pt.write("<p1>" + "�û��������벻��Ϊ�գ�" + "</p1>");
		}else if (username.equals(name) && userpassword.equals(pwd)) {
			pt.write("<p1>" + "��֤�ɹ���" + "</p1>");
		}else {
			pt.write("<p1>" + "��֤ʧ�ܣ�" + "</p1>");
		}
	}

}
