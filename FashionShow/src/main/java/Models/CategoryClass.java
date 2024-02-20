package Models;

import java.sql.Connection;
import java.sql.ResultSet;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

/**
 *
 * @author jeshanpatel1510
 */
public interface CategoryClass {
    ResultSet getAllCategories();
    Category getCategory(int id);
    boolean addCategory(Category c);
    boolean updateCategory(int id, Category c);
    boolean removeCategory(int id);
}
