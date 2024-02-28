/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Servlets;

import Models.User;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 *
 * @author jeshanpatel1510
 */
@WebServlet(name = "Register", urlPatterns = {"/Register"})
public class Register extends HttpServlet {
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/fashionstore", "root", "root");
            
            User user = new User();
            user.setUsername(request.getParameter("username"));
            user.setPassword(request.getParameter("password"));
            user.setLogin_id(user.getUsername()+"123");
            user.setPassword_question(request.getParameter("passwordQuestion"));
            user.setPassword_answer(request.getParameter("passwordAnswer"));
            user.setEmail(request.getParameter("email"));
            user.setPhone(Long.parseLong(request.getParameter("phone")));
            user.setAddress(request.getParameter("address"));
            user.setCountry(request.getParameter("country"));
            user.setState(request.getParameter("state"));
            user.setCity(request.getParameter("city"));
            user.setPin(Integer.parseInt(request.getParameter("pin")));
            
            Statement query = conn.createStatement();
            String sql = "INSERT INTO user(username, password, login_id, password_question, password_answer, email, phone, address, country, state, city, pin) VALUES('"+user.getUsername()+"', '"+user.getPassword()+"', '"+user.getLogin_id()+"', '"+user.getPassword_question()+"', '"+user.getPassword_answer()+"', '"+user.getEmail()+"', "+user.getPhone()+", '"+user.getAddress()+"', '"+user.getCountry()+"', '"+user.getState()+"', '"+user.getCity()+"', "+user.getPin()+")";
            
            int res = query.executeUpdate(sql);
            
            if(res == 1){
                request.setAttribute("message-type", "success");
                request.setAttribute("message", "Signed Up Successfully!!");
                response.sendRedirect("Message.jsp");
            }
        } catch (Exception e) {
            request.setAttribute("message-type", "exception");
            request.setAttribute("message", "Exception : "+e.getMessage());
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        request.getRequestDispatcher("Register.jsp").forward(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
