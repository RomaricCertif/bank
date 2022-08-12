package com.maps;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("ajcUnit");
		EntityManager em = entityManagerFactory.createEntityManager();
        em.getTransaction().begin();
        
        Person person=new Person();
        person.setPersonId("001");
        person.setFirstName("Romaric Vinod");
        person.setLastName("OKEMBA NGATSONO");
        
        
        Certificate certificate=new  Certificate();
        certificate.setCertificateCd("001");
        certificate.setCertificateDate(new Date());
        

        Certificate certificate1=new  Certificate();
        certificate1.setCertificateCd("002");
        certificate1.setCertificateDate(new Date());
        
        
        person.getCertificates().put("001", certificate);
        person.getCertificates().put("002", certificate1);
        
        em.persist(person);
        em.getTransaction().commit();
        System.out.println("OK");

        
	}

}
