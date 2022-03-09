/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import View.ViewLogin;

/**
 *
 * @author Pedro
 */
public class Main {
    
    public static void main(String args[]){
        Banco.startaBanco();
        ViewLogin tela =  new ViewLogin();
        tela.setVisible(true);
        
    }
    
}
