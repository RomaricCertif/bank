package org.ajc;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("ajcUnit");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		String q="select o from Customer o";
		List<Customer> customers=entityManager.createQuery(q).getResultList();
		for (Customer customer:customers) {
			System.out.println(customer.getCustomerName());
		}
		//Check dans le 
	}
}
