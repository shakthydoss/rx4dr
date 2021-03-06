/* Copyright (C) Rx4Dr, Inc - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by shakthydoss <shakthydoss@gmail.com>, 2014
 */
package com.rx4dr.service.bo;

import com.rx4dr.service.dao.DrDao;
import com.rx4dr.service.error.FieldError;
import com.rx4dr.service.error.FieldValidationException;
import com.rx4dr.service.model.Dr;
import com.rx4dr.service.model.DrLbl;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
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
        // check email id already exist.
        if(getByEmail(dr.getXEmail()) != null){
            // throw email already exist. 
            List<FieldError> errors = new ArrayList<FieldError>();
            FieldError temp = new FieldError("Email Id", "already exit");
            errors.add(temp);
            throw new FieldValidationException(errors);
        }        
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

    @Override
    public boolean delete(int id) {
        logger.info("Entering delete");
        return drDao.delete(id);
    }

    @Override
    public DrLbl getDrLableBy(int drId) {
        logger.info("Entering getDrLableBy");
        return drDao.getDrLableBy(drId);
    }

    @Override
    public DrLbl addDrLable(DrLbl drLbl) {
        logger.info("Entering createDrLable");
        return drDao.addDrLable(drLbl);
    }

    @Override
    public DrLbl updateDrLable(DrLbl drLbl) {
       logger.info("Entering updateDrLable");
       return drDao.updateDrLable(drLbl);
    }

    @Override
    public boolean deleteDrLableBy(int drId) {
        logger.info("Entering deleteDrLableBy");
        return drDao.deleteDrLableBy(drId);
    }
    
}
