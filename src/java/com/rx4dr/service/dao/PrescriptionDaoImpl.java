/* Copyright (C) Rx4Dr, Inc - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by shakthydoss <shakthydoss@gmail.com>, 2014
 */
package com.rx4dr.service.dao;

import com.rx4dr.service.model.Dr;
import com.rx4dr.service.model.Route;
import com.rx4dr.service.model.Rx;
import com.rx4dr.service.model.RxRec;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
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
        Session session = sessionFactory.openSession();                
        session.save(rx);       
        for (RxRec rxRec : rx.getRxRecs()) {    
            Rx temp = new Rx();
            temp.setIRx(rx.getIRx());
            rxRec.setRx(temp);
            session.save(rxRec);   
        }
        closeSession(session);
        return rx;
    }

    @Override
    public Rx get(int id) {
        logger.info("Entering get");   
        
        Session session = sessionFactory.openSession();
     //   Criteria criteria = session.createCriteria(Rx.class);
     //   criteria.add(Restrictions.eq("IRx", id));
     //   Rx rx = (Rx) criteria.uniqueResult();
        Query q = session.createQuery("from Rx where IRx = :IRx");
        q.setParameter("IRx", id);
        Rx rx = (Rx) q.uniqueResult();   
//        System.out.println(rx.getDr().getIDr());
//        System.out.println(rx.getRxRecs());
        return rx;       
        
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

    @Override
    public List<Route> getRoutes() {
        logger.info("Entering getRoutes");
        
        List<Route> result = new ArrayList<Route>();
        Route temp = new Route();
        temp.setCode("O");
        temp.setName("Oral");
        result.add(temp);
        
        temp = new Route();
        temp.setCode("LA");
        temp.setName("local");
        result.add(temp);

        temp = new Route();
        temp.setCode("SC");
        temp.setName("subcutaneous");
        result.add(temp);
        
        temp = new Route();
        temp.setCode("IV");
        temp.setName("intravenous");
        result.add(temp);
        
        temp = new Route();
        temp.setCode("P/R");
        temp.setName("per rectum");
        result.add(temp);
        
        temp = new Route();
        temp.setCode("P/V");
        temp.setName("per vaginum");
        result.add(temp);
                
        return result;
    }

    @Override
    public List<String> getDrugs() {
        logger.info("Entering getDrugs");
        List<String> drugs = new ArrayList<String>();
        drugs.add("Albuterol");
        drugs.add("alendronate");
        drugs.add("Allopurinol");
        drugs.add("Alprazolam");
        drugs.add("Amitriptyline");
        drugs.add("Amlodipine");
        drugs.add("Amoxicillin");
        drugs.add("Amoxicillin + Clavulanate");
        drugs.add("APAP + Hydrocodone");
        drugs.add("Atenolol");
        drugs.add("Atorvastatin");
        drugs.add("Azithromycin");
        drugs.add("Carisoprodol");
        drugs.add("Carvedilol");
        drugs.add("Cefdinir");
        drugs.add("Celecoxib");
        drugs.add("Cephalexin");
        drugs.add("Ciprofloxacin");
        drugs.add("Citalopram");
        drugs.add("Clonazepam");
        drugs.add("Clonidine");
        drugs.add("Clopidogrel");
        drugs.add("Codeine + APAP");
        drugs.add("Conjugated Estrogen");
        drugs.add("Cyclobenzaprine");
        drugs.add("Diazepam");
        drugs.add("Digoxin");
        drugs.add("Doxycycline");
        drugs.add("Duloxetine");
        drugs.add("Enalapril");
        drugs.add("Escitalopram");
        drugs.add("Esomeprazole");
        drugs.add("Ethinyl estradiol + Drospirenone");
        drugs.add("Ezetimibe");
        drugs.add("Ezetimibe + Simvastatin");
        drugs.add("Fenofibrate");
        drugs.add("Fexofenadine");
        drugs.add("Fluconazole");
        drugs.add("Fluoxetine");
        drugs.add("Fluticasone");
        drugs.add("Fluticasone + Salmeterol");
        drugs.add("Folic Acid");
        drugs.add("Furosemide");
        drugs.add("Gabapentin");
        drugs.add("Glimepiride");
        drugs.add("Glyburide");
        drugs.add("Hydro- chlorothiazide (HCTZ)");
        drugs.add("Ibuprofen");
        drugs.add("Insulin Glargine");
        drugs.add("Isosorbide Mononitrate");
        drugs.add("Lansoprazole");
        drugs.add("Levofloxacin");
        drugs.add("Levothyroxine");
        drugs.add("Lisinopril");
        drugs.add("Lorazepam");
        drugs.add("Losartan");
        drugs.add("Lovastatin");
        drugs.add("Meloxicam");
        drugs.add("Metformin");
        drugs.add("Methylphenidate");
        drugs.add("Methyl- prednisolone");
        drugs.add("metoprolol");
        drugs.add("Mometasone");
        drugs.add("Montelukast");
        drugs.add("Naproxen");
        drugs.add("Omeprazole");
        drugs.add("Oseltamivir");
        drugs.add("Oxycodone");
        drugs.add("Oxycodone + APAP");
        drugs.add("Paroxetine");
        drugs.add("Penicillin vk");
        drugs.add("Pioglitazone");
        drugs.add("Potassium Chloride");
        drugs.add("Pravastatin");
        drugs.add("Prednisone");
        drugs.add("Pregabalin");
        drugs.add("Promethazine");
        drugs.add("Propoxyphene + APAP");
        drugs.add("Quetiapine");
        drugs.add("Ramipril");
        drugs.add("Ranitidine");
        drugs.add("Rosuvastatin");
        drugs.add("Sertraline");
        drugs.add("Sildenafil");
        drugs.add("Simvastatin");
        drugs.add("Spironolactone");
        drugs.add("Sulfamethoxazole + Trimethoprim");
        drugs.add("Tamsulosin");
        drugs.add("Temazepam");
        drugs.add("Tramadol");
        drugs.add("Trazodone");
        drugs.add("Triamcinolone");
        drugs.add("Triamterene");
        drugs.add("Valacyclovir");
        drugs.add("Valsartan");
        drugs.add("Venlafaxine");
        drugs.add("Warfarin");
        drugs.add("Zolpidem");
        return drugs;
    }

    private void closeSession(Session s) {
        if (s != null) {
            s.close();
        }
    }
    
}
