/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import models.ModelCaesar;
import views.ViewCaesar;

/**
 *
 * @author sax
 */
public class ControllerCaesar {
    ModelCaesar modelCaesar;
    ViewCaesar viewCaesar;
    
    public ControllerCaesar(ViewCaesar viewCaesar, ModelCaesar modelCaesar){
        this.modelCaesar = modelCaesar;
        this.viewCaesar = viewCaesar;
        
        this.viewCaesar.jbnt_execute.addActionListener(actionListener); 
        this.viewCaesar.jrb_decrypt.addActionListener(actionListener);
        this.viewCaesar.jrb_encrypt.addActionListener(actionListener);
    }
    
    public void init_view(){

    }
    
    ActionListener actionListener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource()== viewCaesar.jbnt_execute ){
                if(viewCaesar.jbnt_execute.getText().equals("Cifrar"))
                    jbt_encrypt_actionPerformed();
                else
                    jbt_decrypt_actionPerformed();
            }
            
            else if(e.getSource() == viewCaesar.jrb_encrypt)
                viewCaesar.jbnt_execute.setText("Cifrar");
            else if(e.getSource() == viewCaesar.jrb_decrypt)
                viewCaesar.jbnt_execute.setText("Descifrar");
            
        }
    };
    
    private void jbt_encrypt_actionPerformed(){
        this.modelCaesar.setMessage(this.viewCaesar.jta_message.getText());
        this.viewCaesar.jta_message.setText("");
        this.modelCaesar.encrypt();
        this.viewCaesar.jta_message.setText(this.modelCaesar.getMessage());
    }
    
    private void jbt_decrypt_actionPerformed(){
        this.modelCaesar.setMessage(this.viewCaesar.jta_message.getText());
        this.viewCaesar.jta_message.setText("");
        this.modelCaesar.decrypt();
        this.viewCaesar.jta_message.setText(this.modelCaesar.getMessage());
    }
}
