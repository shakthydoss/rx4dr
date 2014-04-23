package com.rx4dr.service.dao;

import com.rx4dr.service.model.Rx;
import java.util.List;

/**
 *
 * @author shakthydoss
 */
public interface IPrescriptionDao {
public int create(Rx rx);
	public Rx get(int id);
	public Rx search(int id,boolean sortBydate, boolean sortByName);
	public List<Rx>search(String name,boolean sortBydate, boolean sortByName);
	public int delete(int id);
	public boolean sendEmail(Rx rx);
    
}
