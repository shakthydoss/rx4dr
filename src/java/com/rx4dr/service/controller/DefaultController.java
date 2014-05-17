/* Copyright (C) RxDr, Inc - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by shakthydoss <shakthydoss@gmail.com>, 2014
 */
package com.rx4dr.service.controller;

import com.rx4dr.service.error.UnknownResourceException;
import javax.servlet.http.HttpServletRequest;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DefaultController {
final Log logger = LogFactory.getLog(getClass());
    /**
	 * Method to handle unmapped requests.
	 * 
	 * @param request
	 */
	@RequestMapping("/**")
	public void unmappedRequest(HttpServletRequest request) {
		this.logger.info("Entering unmappedRequest");
		String uri = request.getRequestURI();                
		throw new UnknownResourceException("There is no resource for path " + uri + " using "+request.getMethod()+" request");
	}
}
