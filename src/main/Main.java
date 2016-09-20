/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import controllers.ControllerCaesar;
import controllers.ControllerMain;
import models.ModelCaesar;
import models.ModelMain;
import views.ViewCaesar;
import views.ViewMain;

/**
 *
 * @author sax
 */
public class Main {

   private static ViewMain viewMain;
    private static ModelMain modelMain;
    private static ControllerMain controllerMain;
    
    private static ViewCaesar viewCaesar;
    private static ModelCaesar modelCaesar;
    private static ControllerCaesar controllerCaesar;

    public static void main(String[] args) {
       viewCaesar = new ViewCaesar();
       modelCaesar = new ModelCaesar();
       controllerCaesar = new ControllerCaesar(viewCaesar, modelCaesar);
       
       viewMain = new ViewMain();
       modelMain = new ModelMain();
       controllerMain = new ControllerMain(viewMain,viewCaesar , modelMain);
       
       controllerMain.initView();
    }
    
}
