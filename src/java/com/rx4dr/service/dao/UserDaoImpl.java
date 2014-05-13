/* Copyright (C) RxDr, Inc - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by shakthydoss <shakthydoss@gmail.com>, 2014
 */
package com.rx4dr.service.dao;

import com.rx4dr.service.model.User;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

/**
 *
 * @author shakthydoss
 */
public class UserDaoImpl extends HibernateDaoSupport  implements IUserDao{
    
   private transient final Log logger = LogFactory.getLog( this.getClass() );

    @Autowired
    private SessionFactory sessionFactory;
    
    @Override
    public User add(User user) {
        logger.info("Entering add");
        Session s = sessionFactory.openSession();
        s.save(user);
        return user;
    }

    @Override
    public User getById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public User getByEmail(String email) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public User update(User user) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
