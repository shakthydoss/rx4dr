/* Copyright (C) RxDr, Inc - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by shakthydoss <shakthydoss@gmail.com>, 2014
 */
package com.rx4dr.service.dao;

import com.rx4dr.service.model.User;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

/**
 *
 * @author shakthydoss
 */
public class UserDaoImpl extends HibernateDaoSupport implements UserDao {

    private transient final Log logger = LogFactory.getLog(this.getClass());

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
        logger.info("Entering getById");
        Session session = sessionFactory.openSession();
        Criteria criteria = session.createCriteria(User.class);
        criteria.add(Restrictions.eq("IUser", id));
        User user = (User) criteria.uniqueResult();
        return user;
    }

    @Override
    public User getByEmail(String email) {
        logger.info("Entering getByEmail");
        Session session = sessionFactory.openSession();
        Criteria criteria = session.createCriteria(User.class);
        criteria.add(Restrictions.eq("XEmail", email));
        User user = (User) criteria.uniqueResult();
        return user;
    }

    @Override
    public User update(User user) {
        logger.info("Entering update");
        Session session = sessionFactory.openSession();
        session.update(user);
        return user;
    }

}
