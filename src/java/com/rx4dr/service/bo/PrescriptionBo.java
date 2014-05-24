/* Copyright (C) Rx4Dr, Inc - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by shakthydoss <shakthydoss@gmail.com>, 2014
 */
package com.rx4dr.service.bo;


import com.rx4dr.service.model.Route;
import com.rx4dr.service.model.Rx;
import java.util.List;



public interface PrescriptionBo {
	
	public Rx add(Rx rx);
	public Rx get(int id);	
	public List<Rx>search(String name,boolean sortBydate, boolean sortByName);
	public boolean delete(int id);
	public boolean sendEmail(int id);
        public List<Route> getRoutes();
        public List<String> getDrugs();

}
