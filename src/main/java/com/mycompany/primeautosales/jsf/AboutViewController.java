/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.primeautosales.jsf;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import org.primefaces.event.TabChangeEvent;

/**
 *
 * @author Andy
 */
@Named(value = "aboutViewController")
@ViewScoped
public class AboutViewController implements Serializable {

    /**
     * Creates a new instance of AboutViewController
     */
    public AboutViewController() {
    }
    
    public void TabChangeHandler(TabChangeEvent tce){
        FacesMessage msg = new FacesMessage("Tab Changed", "Active Tab" + tce.getTab().getTitle());
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }
    
}
