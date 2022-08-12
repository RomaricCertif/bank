package jointure.heritage;

import java.util.Calendar;
import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {

	public static void main(String[] args) {
		EmployeActif emp=new EmployeActif();
		emp.setFullName("OKEMBA Elliot");
		Calendar calendar=Calendar.getInstance();
		calendar.set(2022, 03, 12);
		calendar.getTime();
		
		emp.setMatricule("003");
		emp.setPosition(Position.Conge);
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("ajcUnit");
		EntityManager em = entityManagerFactory.createEntityManager();
		em.getTransaction().begin();
		em.persist(emp);
		em.getTransaction().commit();
		System.out.println("OK");

	}

}
