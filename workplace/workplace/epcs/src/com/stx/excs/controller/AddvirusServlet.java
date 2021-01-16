package com.stx.excs.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.stx.excs.entity.Vrius;
import com.stx.excs.service.addVirusService;

/**
 * Created by Administrator on 2020/4/15 0015.
 */
@WebServlet("/addvirus")
public class AddvirusServlet extends HttpServlet {
	addVirusService addVService = new addVirusService();
	
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
     //
    	System.out.println("test");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	resp.setContentType("text/html");
		resp.setCharacterEncoding("utf-8");
		PrintWriter pw =  resp.getWriter();
        String vname = req.getParameter("vname");
        String description = req.getParameter("description");
        if(vname == "" || description == "") {
        	pw.write("<p>病毒名称和描述不能为空</p>");
        	return;
        }
        Vrius vrius = new Vrius(vname,description);
        int result = addVService.addVirus(vrius);
        if(result == 1) {
        	pw.write("<p>添加病毒成功！</p>");
        }else {
        	pw.write("<p>添加病毒失败！</p>"); 
        }
        
    }
}
