/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author jeshanpatel1510
 */
public class Category implements CategoryClass{
    public int categoryId;
    public String categoryName;
    public int parent_categoryId;
    
    private Connection con;
    private ResultSet rs;
    private Statement s;

    public Category() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fashionstore", "root", "root");
            s = con.createStatement();
        } catch (Exception e) {
            System.out.println("Exception : " + e.getMessage());
        }
    }
    @Override
    public ResultSet getAllCategories() {
        try{
            rs = s.executeQuery("SELECT * FROM Category");
        }
        catch(Exception e){
            System.out.println("Exception : " + e.getMessage());
        }
        return rs;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public int getParent_categoryId() {
        return parent_categoryId;
    }

    public void setParent_categoryId(int parent_categoryId) {
        this.parent_categoryId = parent_categoryId;
    }
    
    @Override
    public Category getCategory(int id) {
        Category cat = new Category();
        try{
            rs = s.executeQuery("SELECT * FROM Category WHERE categoryId = "+id);
            
            cat.categoryId = rs.getInt("categoryId");
            cat.categoryName = rs.getString("category_name");
            cat.parent_categoryId = rs.getInt("parent_category_id");                        
        }
        catch(Exception e){
            System.out.println("Exception : " + e.getMessage());
        }
        return cat;
    }
    @Override
    public boolean addCategory(Category c) {
        int i = 0;
        try{
            i = s.executeUpdate("INSERT INTO category(categoryId, category_name, parent_category_id) VALUES(0, '"+c.categoryName+"', "+c.parent_categoryId+")");
        }
        catch(Exception e){
            System.out.println("Exception : " + e.getMessage());
        }
        if(i>0){
            return true;
        }
        else{
            return false;
        }
    }

    @Override
    public boolean updateCategory(int id, Category c) {
        int i = 0;
        try{
            i = s.executeUpdate("UPDATE category SET categoryName = "+c.categoryName+" AND parent_catgoryId = "+c.parent_categoryId+" WHERE categoryId = "+id);
        }
        catch(Exception e){
            System.out.println("Exception : " + e.getMessage());
        }
        if(i>0){
            return true;
        }
        else{
            return false;
        }
    }

    @Override
    public boolean removeCategory(int id) {
        int i = 0;
        try{
            i = s.executeUpdate("DELETE FROM category WHERE categoryId = "+id);
        }
        catch(Exception e){
            System.out.println("Exception : " + e.getMessage());
        }
        if(i>0){
            return true;
        }
        else{
            return false;
        }
    }
    
}
