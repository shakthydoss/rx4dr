/* Copyright (C) Rx4Dr, Inc - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by shakthydoss <shakthydoss@gmail.com>, 2014
 */
package com.rx4dr.service.bo;

import com.rx4dr.service.dao.PrescriptionDao;
import com.rx4dr.service.model.Route;
import com.rx4dr.service.model.Rx;
import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Service;

@Service
public class PrescriptionBoImpl implements PrescriptionBo {

    final Log logger = LogFactory.getLog(getClass());

    private PrescriptionDao prescriptionDao;

    public void setPrescriptionDao(PrescriptionDao prescriptionDao) {
        this.prescriptionDao = prescriptionDao;
    }

    public PrescriptionDao getPrescriptionDao() {
        return prescriptionDao;
    }

    @Override
    public Rx add(Rx rx) {
        logger.info("Entering add");
        return null;
    }

    @Override
    public Rx get(int id) {
        logger.info("Entering get");        
        return prescriptionDao.get(id);
    }

    @Override
    public List<Rx> search(String name, boolean sortBydate, boolean sortByName) {
        logger.info("Entering search");
        return prescriptionDao.search(name, sortBydate, sortByName);
    }

    @Override
    public boolean delete(int id) {
        logger.info("Entering delete");
        return prescriptionDao.delete(id);
    }

    @Override
    public boolean sendEmail(int id) {
        logger.info("Entering sendEmail");
        return false;
    }

    @Override
    public List<Route> getRoutes() {
        logger.info("Entering getRoutes");
        return prescriptionDao.getRoutes();
    }

    @Override
    public List<String> getDrugs() {
        logger.info("Entering getDrugs");
        return prescriptionDao.getDrugs();
    }

}
