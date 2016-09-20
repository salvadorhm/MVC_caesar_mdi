/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import models.ModelMain;
import views.ViewMain;

import views.ViewCaesar;
/**
 *
 * @author sax
 */
public class ControllerMain {
    ViewMain viewMain;
    ViewCaesar viewCaesar;
    ModelMain modelMain;
    
     public ControllerMain(ViewMain viewMain,ViewCaesar viewCaesar,ModelMain modelMain){
        this.viewMain = viewMain;
        this.viewCaesar = viewCaesar;
        this.modelMain = modelMain;
        this.viewMain.jmi_caesar.addActionListener(actionListener);
    }
     
    public ActionListener actionListener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
             if(e.getSource()==viewMain.jmi_caesar)
                jmiCaesarActionPerformed();
        }
};
     
      
    
    public void jmiCaesarActionPerformed(){
        this.viewMain.setContentPane(viewCaesar);
        this.viewMain.revalidate();
        this.viewMain.repaint();
    }
    
    public void initView(){
        this.viewMain.setTitle("Hello MVC Panel");
        this.viewMain.setLocationRelativeTo(null);
        this.viewMain.setVisible(true);
    }
}
