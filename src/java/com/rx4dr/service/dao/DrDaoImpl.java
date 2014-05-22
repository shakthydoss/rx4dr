/* Copyright (C) Rx4Dr, Inc - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by shakthydoss <shakthydoss@gmail.com>, 2014
 */
package com.rx4dr.service.dao;

import com.rx4dr.service.model.Dr;
import java.sql.SQLException;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

/**
 *
 * @author shakthydoss
 */
public class DrDaoImpl extends HibernateDaoSupport implements DrDao {

    private transient final Log logger = LogFactory.getLog(this.getClass());

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public Dr add(Dr dr) {
        logger.info("Entering add");
        Session session = sessionFactory.openSession();        
        session.save(dr);        
        closeSession(session);
        return dr;
    }

    @Override
    public Dr getById(int id) {
        logger.info("Entering getById");
        Session session = sessionFactory.openSession();
        Criteria criteria = session.createCriteria(Dr.class);
        criteria.add(Restrictions.eq("IUser", id));
        Dr dr = (Dr) criteria.uniqueResult();
        return dr;
    }

    @Override
    public Dr getByEmail(String email) {
        logger.info("Entering getByEmail");
        Session session = sessionFactory.openSession();
        Criteria criteria = session.createCriteria(Dr.class);
        criteria.add(Restrictions.eq("XEmail", email));
        Dr dr = (Dr) criteria.uniqueResult();
        return dr;
    }

    @Override
    public Dr update(Dr dr) {
        logger.info("Entering update");
        Session session = sessionFactory.openSession();       
        session.update(dr);        
        closeSession(session);
        return dr;
    }

    @Override
    public boolean delete(int id) {
        logger.info("Entering delete");
        Session session = sessionFactory.openSession();
        Dr u = new Dr();
        u.setIDr(id);        
        session.delete(u);        
        closeSession(session);
        return true;
    }

    public void closeSession(Session s) {
        if (s != null) {
            s.close();
        }
    }
}
