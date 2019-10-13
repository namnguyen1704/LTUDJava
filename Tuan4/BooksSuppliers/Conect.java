/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitaptuan4;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ArrayList;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
/**
 *
 * @author Administrator
 */
public class Conect {
    private Connection conn;

    public Conect() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databasename=BooksSuppliers;username=sa;password=123");
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        new Conect();
    }
    public ArrayList<Suppliers> getListSupplierses(){
        ArrayList<Suppliers> list = new ArrayList<>();
        String sql = "select *from books";
        try {
        PreparedStatement ps = conn.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while(rs.next()){
            Suppliers nv = new Suppliers();
            nv.setID(rs.getString("ID"));
            nv.setName(rs.getString("Name"));
            nv.setAddress(rs.getString("Address"));
            nv.setContact(rs.getString("ContactNo"));
            nv.setEmail(rs.getString("EmailID"));
            nv.setRemakes(rs.getString("Remakes"));
            list.add(nv);
        }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list ;
        
    
    }

    boolean DeleteData(Suppliers s) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
