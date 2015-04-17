package com.webservice.service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import com.webservice.entity.Bookinfo;
/*
 * Update the information of C++ Primer
 */
public class UpdateBookinfo 
{
   public static void main( String[ ] args ) 
   {
   	EntityManagerFactory emfactory = Persistence.
   			createEntityManagerFactory( "Eclipselink_JPA" );
   	EntityManager entitymanager = emfactory.
   			createEntityManager( );
   			entitymanager.getTransaction( ).begin( );
   	Bookinfo bookinfo=entitymanager.
   			find( Bookinfo.class, "C++ Primer" );
   	//before update
   	System.out.println( bookinfo );
   	bookinfo.setVersion( "sixth" );
   	entitymanager.getTransaction( ).commit( );
        //after update
   	System.out.println( bookinfo );
   	entitymanager.close();
   	emfactory.close();
   }
}