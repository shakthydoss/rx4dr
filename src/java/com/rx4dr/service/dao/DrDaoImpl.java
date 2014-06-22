/* Copyright (C) Rx4Dr, Inc - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by shakthydoss <shakthydoss@gmail.com>, 2014
 */
package com.rx4dr.service.dao;

import com.rx4dr.service.model.Dr;
import com.rx4dr.service.model.DrLbl;
import java.sql.SQLException;
import java.util.Date;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Criteria;
import org.hibernate.Query;
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
        criteria.add(Restrictions.eq("IDr", id));
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
        String hql = "UPDATE  Dr set NFirst = :NFirst , NLast = :NLast , NMid = :NMid , NNick = :NNick , XEmail = :XEmail , XPh = :XPh WHERE IDr = :IDr";
        Query query = session.createQuery(hql);
        query.setParameter("NFirst", dr.getNFirst());
        query.setParameter("NLast", dr.getNLast());
        query.setParameter("NMid", dr.getNMid());
        query.setParameter("NNick", dr.getNNick());
        query.setParameter("XEmail", dr.getXEmail());
        query.setParameter("XPh", dr.getXPh());
        query.setParameter("IDr", dr.getIDr());
        query.executeUpdate();        
        session.flush();
        closeSession(session);
        return null;
    }

    @Override
    public boolean delete(int id) {
        logger.info("Entering delete");        
        Session session = sessionFactory.openSession();
        Dr u = new Dr();
        u.setIDr(id);        
        session.delete(u);  
        session.flush();
        closeSession(session);
        return true;
    }

    @Override
    public DrLbl getDrLableBy(int drId) {
        logger.info("Entering getDrLableBy");        
        Session session = sessionFactory.openSession();
        Criteria criteria = session.createCriteria(DrLbl.class);
        criteria.add(Restrictions.eq("IDrId", drId));
        DrLbl drLbl = (DrLbl) criteria.uniqueResult();       
        return drLbl;
    }
    
    @Override
    public DrLbl addDrLable(DrLbl drLbl) {
      logger.info("Entering createDrLable");
      Session session = sessionFactory.openSession();
      session.save(drLbl);
      session.flush();
      closeSession(session);
      return drLbl;
    }
    
     @Override
    public DrLbl updateDrLable(DrLbl drLbl) {
       logger.info("Entering updateDrLable");
       Session session = sessionFactory.openSession();
       Query query = session.createQuery("update DrLbl set lbl1 = :lbl1 , lbl2 = :lbl2 , lbl3 = :lbl3 , lbl4 = :lbl4  where IDocIbl = :IDocIbl and  IDrId = :IDrId");
       query.setParameter("lbl1", drLbl.getLbl1());
       query.setParameter("lbl2", drLbl.getLbl2());
       query.setParameter("lbl3", drLbl.getLbl3());
       query.setParameter("lbl4", drLbl.getLbl4());
       query.setParameter("IDocIbl", drLbl.getIDocIbl());
       query.setParameter("IDrId", drLbl.getIDrId());
       query.executeUpdate();
       session.flush();
       closeSession(session);
       return null;
    }

    @Override
    public boolean deleteDrLableBy(int drId) {
        logger.info("Entering delereDrLableBy");
        Session session = sessionFactory.openSession();        
        Query query = session.createQuery("Delete from DrLbl where IDrId = :IDrId");
        query.setParameter("IDrId", drId);
        query.executeUpdate();             
        session.flush();
        closeSession(session);              
        return true;
    }

    
    private void closeSession(Session s) {
        if (s != null) {
            s.close();
        }
    }
   
}
