/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package servlets;

import Models.Category;
import jakarta.servlet.RequestDispatcher;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author jeshanpatel1510
 */
@WebServlet(name = "AdminServlet", urlPatterns = {"/AdminServlet"})
public class AdminServlet extends HttpServlet {
    private Connection con;
    private ResultSet rs;
    private Statement s;
    
    public AdminServlet(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fashionstore", "root", "root");
            s = con.createStatement();
        } catch (Exception e) {
            System.out.println("Exception : " + e.getMessage());
        }
    }
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
 
    }
    
    public void Getcategories(HttpServletRequest req, HttpServletResponse res){        
        try{            
            ArrayList<Category> cat = new ArrayList<Category>();
            rs = s.executeQuery("SELECT * FROM Category");

            while (rs.next()) {
                Category category = new Category();
                System.out.println("Category : "+rs.getString("category_name"));
                category.categoryId = rs.getInt("categoryId");
                category.categoryName = rs.getString("category_name");
                category.parent_categoryId = rs.getInt("parent_category_id");
                cat.add(category);
            }        
            
            req.setAttribute("CategoryList", cat);
            RequestDispatcher disp = req.getRequestDispatcher("/admin.jsp");
            disp.forward(req, res);
        }
        catch(Exception e){
            System.out.println("Exception : "+e.getMessage());
        }
    }
    
    
    public void Getcategory(HttpServletRequest req, HttpServletResponse res){
        Category category = new Category();
        int id = 0;
        id = Integer.parseInt(req.getParameter("id"));
        category = category.getCategory(id);
        
        req.setAttribute("CategoryDetails", category);
        RequestDispatcher rd = req.getRequestDispatcher("updateCategory.jsp");        
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        String action = request.getServletPath();
        System.out.println("Action : " + action);
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            Getcategories(request, response);
        }
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
        String action = request.getServletPath();
        System.out.println("Action : " + action);             
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
