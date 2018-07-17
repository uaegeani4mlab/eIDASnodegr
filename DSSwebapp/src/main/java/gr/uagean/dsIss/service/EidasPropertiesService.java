/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gr.uagean.dsIss.service;


import java.util.List;

/**
 *
 * @author nikos
 */
public interface EidasPropertiesService {
    
    public List<String> getEidasProperties() throws NullPointerException;
    
    public List<String> getNaturalProperties() throws NullPointerException;
    
    public List<String> getLegalProperties() throws NullPointerException;
    
}

