/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rx4dr.service.controller;

import com.rx4dr.service.model.ResponseEntity;
import java.util.Arrays;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.test.web.client.MockRestServiceServer;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.method;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.requestTo;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.requestTo;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.requestTo;
import static org.springframework.test.web.client.response.MockRestResponseCreators.withStatus;
import static org.springframework.test.web.client.response.MockRestResponseCreators.withSuccess;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author sakthidasans
 */
//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(locations = {"/applicationContext.xml"})
public class PrescriptionControllerTest {

    /*   @Autowired    
     private IPrescriptionBo prescriptionBo;
    
     @Autowired
     private IUserBo userBo;
     */
    public PrescriptionControllerTest() {
    }

    @Test
    @Ignore
    public void hello() {

    }

    @Test
    public void createUser() {
        System.out.println(".. create user");

        String requestURL = "http://localhost:8080/rx4dr/service/greeting/sakthi";

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));

        RestTemplate restTemplate = new RestTemplate();
        
        MockRestServiceServer mockServer = MockRestServiceServer.createServer(restTemplate);
        
        System.out.println("...done");
        mockServer.expect(requestTo(requestURL))
                  .andExpect(method(HttpMethod.GET))
                    .andRespond(withSuccess("{\"code\":\"200\",\"data\":\"Hello sakthi\"}", MediaType.APPLICATION_JSON));
                    
        
        mockServer.verify();
        System.out.println("...done");
    }

}
