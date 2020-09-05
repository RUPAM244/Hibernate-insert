package com.rupam.hibernate.Baischib;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	
    	 Employye em=new Employye();
    	 em.setEmpid(30);
         em.setEmpname("GODO");
         em.setPosition("Analyst");
         em.setEmail("abc1947@gmail.com");
         
         Configuration con=new Configuration().configure().addAnnotatedClass(Employye.class);
         SessionFactory sf=con.buildSessionFactory();
         Session session=sf.openSession();
     
         Transaction tx= session.beginTransaction();
         session.save(em);
         tx.commit();
    }
}
