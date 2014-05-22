/* Copyright (C) Rx4Dr, Inc - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by shakthydoss <shakthydoss@gmail.com>, 2014
 */
package com.rx4dr.service.bo;

import com.rx4dr.service.dao.DrDao;
import com.rx4dr.service.model.Dr;
import java.util.Date;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 *
 * @author shakthydoss
 */
public class DrBoImpl implements DrBo{

    private transient final Log logger = LogFactory.getLog( this.getClass() );

    private DrDao  drDao;

    public DrDao getDrDao() {
        return drDao;
    }

    public void setDrDao(DrDao drDao) {
        this.drDao = drDao;
    }
            
    @Override
    public Dr add(Dr dr) {
        logger.info("Entering add");
        // set created by system.
        dr.setIUserCreatd(0);
        dr.setIUserUpd(0);        
        // set current date.
        Date now = new Date();
        dr.setTStmpCreatd(now);
        dr.setTStmpUpd(now);
        return drDao.add(dr);
    }

    @Override
    public Dr getById(int id) {
      logger.info("Entering getById");
      return drDao.getById(id);
    }

    @Override
    public Dr getByEmail(String email) {
        logger.info("Entering getByEmail");
        return drDao.getByEmail(email);
    }

    @Override
    public Dr update(Dr dr) {
        logger.info("Entering update");
        return drDao.update(dr);
    }
    
}
