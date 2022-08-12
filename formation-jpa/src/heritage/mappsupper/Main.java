package heritage.mappsupper;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("ajcUnit");
		EntityManager em = entityManagerFactory.createEntityManager();
		em.getTransaction().begin();
		Provider provider=new Provider();
		provider.setProviderId("002");
		provider.setProviderName("OKEMBA Fabiola");
		provider.setUserName("ELLIOT OKEMBA");
		em.persist(provider);
		em.getTransaction().commit();
		System.out.println("OK");
	}

}
