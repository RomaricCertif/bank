package heritage.classes;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("ajcUnit");
		EntityManager em = entityManagerFactory.createEntityManager();
		Virement virement=new Virement();
		virement.setAmount(10000);
		virement.setPayCd("001");
		virement.setPayCd("001");
		virement.setPayDt(new Date());
		virement.setAccountNumber("220210222833");
		em.getTransaction().begin();
		em.persist(virement);
		em.getTransaction().commit();
		System.out.println("OK");

	}

}
