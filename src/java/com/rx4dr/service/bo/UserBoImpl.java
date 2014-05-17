/* Copyright (C) Rx4Dr, Inc - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by shakthydoss <shakthydoss@gmail.com>, 2014
 */
package com.rx4dr.service.bo;

import com.rx4dr.service.dao.UserDao;
import com.rx4dr.service.model.User;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 *
 * @author shakthydoss
 */
public class UserBoImpl implements UserBo{

    private transient final Log logger = LogFactory.getLog( this.getClass() );

    private UserDao  userDao;

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
    
    @Override
    public User add(User user) {
        logger.info("Entering add");
        return userDao.add(user);
    }

    @Override
    public User getById(int id) {
      logger.info("Entering getById");
      return userDao.getById(id);
    }

    @Override
    public User getByEmail(String email) {
        logger.info("Entering getByEmail");
        return userDao.getByEmail(email);
    }

    @Override
    public User update(User user) {
        logger.info("Entering update");
        return userDao.update(user);
    }
    
}
