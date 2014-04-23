package com.rx4dr.service.bo;


import com.rx4dr.service.model.Rx;
import java.util.List;



public interface IPrescriptionBo {
	
	public int create(Rx rx);
	public Rx get(int id);
	public Rx search(int id,boolean sortBydate, boolean sortByName);
	public List<Rx>search(String name,boolean sortBydate, boolean sortByName);
	public int delete(int id);
	public boolean sendEmail(Rx rx);

}
