
package web.controller;


import java.io.IOException;

import java.io.PrintWriter;

import java.sql.Connection;

import java.sql.DriverManager;

import java.sql.ResultSet;

import java.sql.Statement;


import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;

import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpServletResponse;


public class MainServlet extends HttpServlet {

    

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        try {

            request.setCharacterEncoding("utf-8");

            String id=request.getParameter("id");

            String pw=request.getParameter("pw");

            

            System.out.println(id+":"+pw);

            //DB ���� Biz

        

            Class.forName("com.mysql.jdbc.Driver");

            Connection con=DriverManager.getConnection("jdbc:mysql://192.168.111.100:3306/shopping_db","winuser","4321");

            Statement stmt=con.createStatement();

            ResultSet rs=stmt.executeQuery("select * from customer where id='"+id+"'");

            String name=null;

            if(rs.next()) {

                name=rs.getString("name");

            }

            

            response.setContentType("text/html;charset=utf-8");

            PrintWriter out=response.getWriter();        

            out.println("<h1>");

            

            if(name != null) {

                out.println(name+"�� ȯ���մϴ�");

            }

            

            out.println("</h1>");

        }catch(Exception e) {

            e.printStackTrace();

        }

    }

    

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        

    }


}



