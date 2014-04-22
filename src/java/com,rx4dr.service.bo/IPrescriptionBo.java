package service.rx4dr.com.bo;

import java.util.List;

import service.rx4dr.com.model.Rx;

public interface IPrescriptionBo {
	
	public int create(Rx rx);
	public Rx get(int id);
	public Rx search(int id,boolean sortBydate, boolean sortByName);
	public List<Rx>search(String name,boolean sortBydate, boolean sortByName);
	public int delete(int id);
	public boolean sendEmail(Rx rx);

}
