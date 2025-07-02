/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package main;

/**
 *
 * @author darwisy
 */
public class RumahSakitKita {

     public static void main(String[] args) {
       
    /* Run Login Screen First */
    java.awt.EventQueue.invokeLater(new Runnable() {
        public void run() {
            new views.FormLogin().setVisible(true); // Open Login first
        }
    });
    }
}
