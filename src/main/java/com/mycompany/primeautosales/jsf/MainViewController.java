/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.primeautosales.jsf;

import java.util.ArrayList;
import java.util.List;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import org.primefaces.event.ResizeEvent;

/**
 *
 * @author Andy
 */
@Named(value = "mainViewController")
@RequestScoped
public class MainViewController {
    
    private String selectionType;
    private List<Car> automobile = new ArrayList();
    /**
     * Creates a new instance of MainViewController
     */
    public MainViewController() {
    }
    
    public void layoutResizeEvent(ResizeEvent event){
        //System.out.println("The layout has been resized: " + event.getComponent());
    }
    
    public String navigateToCar(){
        selectionType = "Car";
        return "automobile";
    }
    
    public String navigateToPickup(){
        selectionType = "TRUCK";
        return "automobile";
    }
    
    public String navigateToSuv(){
        selectionType = "SUV";
        return "automobile";
    }

    /**
     * @return the selectionType
     */
    public String getSelectionType() {
        return selectionType;
    }

    /**
     * @param selectionType the selectionType to set
     */
    public void setSelectionType(String selectionType) {
        this.selectionType = selectionType;
    }

    /**
     * @return the automobile
     */
    public List<Car> getAutomobile() {
        Car car1 = new Car();
        car1.setMake("Janeau");
        car1.setModel("Turbo");
        Car car2 = new Car();
        car2.setMake("Janeau");
        car2.setModel("Rocket");
        Car car3 = new Car();
        car3.setMake("Janeau");
        car3.setModel("Jet");
        automobile = new ArrayList();
        automobile.add(car1);
        automobile.add(car2);
        automobile.add(car3);
        return automobile;
    }

    /**
     * @param automobile the automobile to set
     */
    public void setAutomobile(List<Car> automobile) {
        this.automobile = automobile;
    }
}
