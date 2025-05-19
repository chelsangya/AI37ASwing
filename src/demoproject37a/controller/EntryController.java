/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demoproject37a.controller;

import demoproject37a.view.EntryView;
import demoproject37a.view.LoginView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author sangyakoirala
 */
public class EntryController {
    private EntryView entryView= new EntryView();
    public EntryController(EntryView entry){
        this.entryView=entry;
        entryView.addLoginNavigation(new LoginNavigation());
    }
    public void open(){
        this.entryView.setVisible(true);
    }
    public void close(){
        this.entryView.dispose();
    }
    


class LoginNavigation implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
        LoginView login= new LoginView();
        LoginController loginController= new LoginController(login);
        loginController.open();
        close();
    }
    
}
}