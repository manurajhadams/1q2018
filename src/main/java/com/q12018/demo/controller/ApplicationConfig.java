/**
 * 
 */
package com.q12018.demo.controller;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import com.q12018.demo.database.DatabaseUtilities;
/**
 * 
 * To initialize spring beans through application context in non-spring classes
 */
public class ApplicationConfig implements ApplicationContextAware {

	private static ApplicationContext applicationContext;

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		// TODO Auto-generated method stub
		this.applicationContext = applicationContext; 
	}
	
	public static DatabaseUtilities getDatabseUtilities() {
		return applicationContext.getBean(DatabaseUtilities.class);
	}

}
