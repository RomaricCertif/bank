package eagervslazy;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("ajcUnit");
		EntityManager em = entityManagerFactory.createEntityManager();
		Query query = em.createQuery("from Studient o where o.studientCd =:matricule", Studient.class);
		query.setParameter("matricule", "001");
		List<Studient> classRooms=query.getResultList();
		if (classRooms != null && !classRooms.isEmpty()) {
			for (Studient classRoom : classRooms) {
				System.out.println(classRoom.getFullName()+ " "+classRoom.getStudientCd());

			}
			System.out.println();
		}
		System.out.println("-------------- SQL NATIF-----------------");
		query = em.createNativeQuery("SELECT * FROM TSTUDIENT ", Studient.class);
		query.setFirstResult(1);
		query.setMaxResults(1);
		List<Studient> list=query.getResultList();
		for (Studient classRoom : list) {
			System.out.println(classRoom.getFullName()+ " "+classRoom.getStudientCd());

		}
	}

}
