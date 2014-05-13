package com.rx4dr.service.controller;

import com.rx4dr.service.bo.IPrescriptionBo;
import com.rx4dr.service.model.ResponseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
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
 public ResponseEntity<String> getGreeting(@PathVariable String name) {
  String result="Hello "+name;  
  System.out.println("-----"+name);
  System.out.println("testvariable-----"+testvariable);
  
  prescriptionBo.get(0);
  return new ResponseEntity("200" , result);
 }
}
