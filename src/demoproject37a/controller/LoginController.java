/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demoproject37a.controller;

import demoproject37a.view.LoginView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author sangyakoirala
 */
public class LoginController {
    private LoginView loginView= new LoginView();
    public LoginController(LoginView loginView){
        this.loginView=loginView;
        this.loginView.loginUser(new LoginUser());
    }
    public void open(){
        this.loginView.setVisible(true);
    }
    public void close(){
        this.loginView.dispose();
    }
    
    class LoginUser implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
           String email=loginView.getEmailTextField().getText();
           String password= String.valueOf(loginView.getPasswordField().getPassword());
           if(email.isEmpty()||password.isEmpty()){
               JOptionPane.showMessageDialog(loginView, "Please fill in all the fields");
           } else{
               JOptionPane.showMessageDialog(loginView, "Validated");
           }
        }
        
    }
}
