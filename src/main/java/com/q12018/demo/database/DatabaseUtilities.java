package com.q12018.demo.database;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Database util class, to manage all the database related stuff
 */
@Repository
@Transactional
public class DatabaseUtilities {
	
    @Autowired
    private SessionFactory sessionFactory;
    
	public Session getSession(){
		try{
			return sessionFactory.getCurrentSession();
		} catch (Exception e){
			e.printStackTrace();
		}
		return null;
	}
	
	public EventProfile getEventProfile(){
		return (EventProfile) getSession().createQuery("From EventProfile").uniqueResult();
	}
}
