package com.rx4dr.service.bo;


import com.rx4dr.service.dao.IPrescriptionDao;
import com.rx4dr.service.model.Rx;
import java.util.List;
import org.springframework.stereotype.Service;


@Service
public class PrescriptionBoImpl implements IPrescriptionBo {
    
       private IPrescriptionDao prescriptionDao;
       
       public void setPrescriptionDao(IPrescriptionDao prescriptionDao){
           this.prescriptionDao = prescriptionDao;
       }
       public IPrescriptionDao getPrescriptionDao(){
           return prescriptionDao;
       }

	@Override
	public int create(Rx rx) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Rx get(int id) {
		prescriptionDao.get(id);
		return null;
	}

	@Override
	public Rx search(int id, boolean sortBydate, boolean sortByName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Rx> search(String name, boolean sortBydate, boolean sortByName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean sendEmail(Rx rx) {
		// TODO Auto-generated method stub
		return false;
	}

  

}
