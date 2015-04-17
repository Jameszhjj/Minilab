package com.webservice.service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import com.webservice.entity.Bookinfo;
/*
 * Retrieve the information of C++ Primer
 */
public class RetrieveBookinfo 
{
   public static void main( String[ ] args ) 
   {
   	EntityManagerFactory emfactory = Persistence
   			.createEntityManagerFactory( "Eclipselink_JPA" );
   	EntityManager entitymanager = emfactory.
   			createEntityManager();
   	Bookinfo bookinfo = entitymanager.
   			find( Bookinfo.class, "C++ Primer" );
   	
   	System.out.println("bookinfo TITLE = "+bookinfo.getTitle( ));
   	System.out.println("bookinfo AUTHOR = "+bookinfo.getAuthor( ));
   	System.out.println("bookinfo VERSION = "+bookinfo.getVersion( ));
   	System.out.println("bookinfo PRICE = "+bookinfo.getPrice( ));
   }
}