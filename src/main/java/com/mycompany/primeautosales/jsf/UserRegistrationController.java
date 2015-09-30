/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.primeautosales.jsf;

import com.mycompany.primeautosales.jsf.entity.User;
import javax.inject.Named;
import javax.faces.bean.ViewScoped;
import org.primefaces.event.FlowEvent;

/**
 *
 * @author Andy
 */
@Named(value = "userRegistrationController")
@ViewScoped
public class UserRegistrationController {
    private User current;
    /**
     * Creates a new instance of UserRegistrationController
     */
    public UserRegistrationController() {
    }
    
    public User getCurrent(){
        if( current == null ){
            current = new User();
        }
        return current;
    }
    
    public String flowHandler(FlowEvent event){
        if(current != null){
            System.out.println("current user: " + current);
            if(!current.isEnableNotifications()){
                System.out.println("Confirm");
                return "confirm";
            } else {
                System.out.println("new step");
                return event.getNewStep();
            }
        } else {
            System.out.println("new step");
            return event.getNewStep();
        }
    }
}
