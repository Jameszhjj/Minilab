package com.webservice.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
/*
 * define the bookinfo table
 */
@Entity
@Table
public class Bookinfo 
{
   @Id
   @GeneratedValue(strategy= GenerationType.AUTO) 	
   private String title;//book title
   private String author;//book author
   private String version;//book version
   private int price;//book price
   public Bookinfo(String title,String author,String version,int price) 
   {
   	super( );
   	this.price = price;
   	this.title = title;
   	this.version = version;
   	this.author = author;
   }
   
   public Bookinfo( ) 
   {
   	super();
   }
   
   public int getPrice( ) 
   {
   	return price;
   }
   public void setPrice(int price)  
   {
   	this.price = price;
   }
    public String getTitle( ) 
   {
   	return title;
   }
   public void setTitle(String title) 
   {
   	this.title = title;
   }
   
   public String getVersion( ) 
   {
   	return version;
   }
   public void setVersion(String version) 
   {
   	this.version = version;
   }
   
   public String getAuthor( ) 
   {
   	return author;
   }
   public void setAuthor(String author) 
   {
   	this.author = author;
   }
   @Override
   public String toString() {
   	return "Bookinfo [title=" + title + ", author=" + author + ", version="
   			+ version + ", price=" + price + "]";
   }
}