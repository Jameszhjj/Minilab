package com.webservice.service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import com.webservice.entity.Bookinfo;
/*
 * Create  informations of Thinking in Java book
 */
public class CreateBookinfo2
{
   public static void main( String[ ] args ) 
   {
   	EntityManagerFactory emfactory = Persistence.
   			createEntityManagerFactory( "Eclipselink_JPA" );
   	EntityManager entitymanager = emfactory.
   			createEntityManager( );
   	entitymanager.getTransaction( ).begin( );
   	
   	
   	Bookinfo bookinfo2 = new Bookinfo( ); 
   	bookinfo2.setTitle( "Thinking in Java");
   	bookinfo2.setAuthor( "Bruce" );
   	bookinfo2.setVersion( "fourth" );
   	bookinfo2.setPrice( 108 );
   	
   	
   	entitymanager.persist( bookinfo2 );
   	entitymanager.getTransaction( ).commit( );
   	
   	
   	entitymanager.close( );
   	emfactory.close( );
   }
}