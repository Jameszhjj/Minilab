package com.webservice.service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import com.webservice.entity.Bookinfo;
/*
 * Delete the information of C++ Primer
 */
public class DeleteBookinfo 
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
   	entitymanager.remove( bookinfo );
   	entitymanager.getTransaction( ).commit( );
   	entitymanager.close( );
   	emfactory.close( );
   }
}