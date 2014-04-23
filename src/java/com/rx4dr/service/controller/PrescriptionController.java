package com.rx4dr.service.controller;

import com.rx4dr.service.bo.IPrescriptionBo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/service/greeting")
public class PrescriptionController {

@Autowired    
private IPrescriptionBo prescriptionBo;
    
@RequestMapping(value = "/{name}", method = RequestMethod.GET)
 public String getGreeting(@PathVariable String name) {
  String result="Hello "+name;  
  prescriptionBo.get(0);
  return result;
 }
}
