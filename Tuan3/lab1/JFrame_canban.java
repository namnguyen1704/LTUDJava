package lab1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.awt.Color;
import javax.swing.JFrame;

/**
 *  
 * @author Administrator
    */                                                                                                                                                      
   public class JFrame_canban extends JFrame {
       public JFrame_canban(){
           setSize(400,300);
           setBackground(Color.yellow);
            setForeground(Color.red);
            setTitle("nam");
           
       }
       
       public static void main(String[] args) {
            new JFrame_canban();
       }

}
