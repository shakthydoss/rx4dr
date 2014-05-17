/* Copyright (C) RxDr, Inc - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by shakthydoss <shakthydoss@gmail.com>, 2014
 */
package com.rx4dr.service.dao;

import com.rx4dr.service.model.Rx;
import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

/**
 *
 * @author shakthydoss
 */
public class PrescriptionDaoImpl extends HibernateDaoSupport implements  PrescriptionDao{
    final Log logger = LogFactory.getLog(getClass());
    
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public Rx add(Rx rx) {
        logger.info("Entering add");
        return null;        
    }

    @Override
    public Rx get(int id) {
        logger.info("Entering get");
        return null;        
    }   

    @Override
    public List<Rx> search(String name, boolean sortBydate, boolean sortByName) {
        logger.info("Entering search");
        return null;        
    }

    @Override
    public boolean delete(int id) {
       logger.info("Entering delete");
        return false;        
    }

   
    
}
