/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demoproject37a.controller;

import demoproject37a.view.LoginView;

/**
 *
 * @author sangyakoirala
 */
public class LoginController {
    private LoginView loginView= new LoginView();
    public LoginController(LoginView loginView){
        this.loginView=loginView;
    }
    public void open(){
        this.loginView.setVisible(true);
    }
    public void close(){
        this.loginView.dispose();
    }
    
}
