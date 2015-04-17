package com.webservice.service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import com.webservice.entity.Bookinfo;
/*
 * Create  informations of C++ Primer book
 */
public class CreateBookinfo
{
   public static void main( String[ ] args ) 
   {
   	EntityManagerFactory emfactory = Persistence.
   			createEntityManagerFactory( "Eclipselink_JPA" );
   	EntityManager entitymanager = emfactory.
   			createEntityManager( );
   	entitymanager.getTransaction( ).begin( );
   	
   	Bookinfo bookinfo = new Bookinfo( ); 
   	bookinfo.setTitle( "C++ Primer");
   	bookinfo.setAuthor( "Stanley" );
   	bookinfo.setVersion( "fiveth" );
   	bookinfo.setPrice( 128 );
   
   	
   	entitymanager.persist( bookinfo );
   	entitymanager.getTransaction( ).commit( );
   	
   	
   	entitymanager.close( );
   	emfactory.close( );
   }
}