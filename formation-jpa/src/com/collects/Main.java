package com.collects;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("ajcUnit");
		EntityManager em = entityManagerFactory.createEntityManager();
		
		Order order=new Order();
		order.setOrderCd("002");
		order.setAdressLivraison("112 Rue benin Talangai");
		order.setOrderDate(new Date());
		
		OrderItems items1=new OrderItems();
		items1.setItemCd("001X");
		items1.setItemDescription("IPHONE 13");
		items1.setQuantity(12);
		
		
		OrderItems items2=new OrderItems();
		items2.setItemCd("001X");
		items2.setItemDescription("IPHONE X");
		items2.setQuantity(12);
		
		order.getOrderItems().add(items1);
		order.getOrderItems().add(items2);
		
		em.getTransaction().begin();
		em.persist(order);
        em.getTransaction().commit();
        System.out.println("OK");

	}

}
