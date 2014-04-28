package com.rx4dr.service.controller;

import com.rx4dr.service.bo.IPrescriptionBo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/service/greeting")
public class PrescriptionController {

@Autowired    
private IPrescriptionBo prescriptionBo;

@Value("${app.lbl.description}")
private String testvariable;
    
@RequestMapping(value = "/{name}", method = RequestMethod.GET)
 public String getGreeting(@PathVariable String name) {
  String result="Hello "+name;  
  System.out.println("-----"+name);
  System.out.println("testvariable-----"+testvariable);

  AppConstants appConstants = new AppConstants();
  System.out.println(appConstants.getLblError());
   
  prescriptionBo.get(0);
  return result;
 }
}
