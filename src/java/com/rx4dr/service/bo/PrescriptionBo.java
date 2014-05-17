package com.rx4dr.service.bo;


import com.rx4dr.service.model.Rx;
import java.util.List;



public interface PrescriptionBo {
	
	public Rx add(Rx rx);
	public Rx get(int id);	
	public List<Rx>search(String name,boolean sortBydate, boolean sortByName);
	public boolean delete(int id);
	public boolean sendEmail(int id);

}
