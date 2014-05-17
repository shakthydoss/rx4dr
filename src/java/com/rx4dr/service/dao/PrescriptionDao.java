package com.rx4dr.service.dao;

import com.rx4dr.service.model.Rx;
import java.util.List;

/**
 *
 * @author shakthydoss
 */
public interface PrescriptionDao {
        public Rx add(Rx rx);
	public Rx get(int id);	
	public List<Rx>search(String name,boolean sortBydate, boolean sortByName);
	public boolean delete(int id);	
    
}
