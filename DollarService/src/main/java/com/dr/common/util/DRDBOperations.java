package com.dr.common.util;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.dr.common.db.AbstractEntity;
import com.dr.db.entity.Location;

public class DRDBOperations {
	public static String insertRecord(AbstractEntity aEntity) {
		final EntityManager em = DRDBConnect.getEntityManager();
		em.getTransaction().begin();
		em.persist(aEntity);
		em.getTransaction().commit();

		return "";
	}

	public static String deletetRecord(AbstractEntity aEntity) {
		final EntityManager em = DRDBConnect.getEntityManager();
		em.getTransaction().begin();
		// write method for update
		em.getTransaction().commit();

		return "";
	}

	public static Location getLocationDataByID(Location loc) {

		final EntityManager em = DRDBConnect.getEntityManager();
		em.getTransaction().begin(); // write method for update
		Location location = em.find(Location.class, loc.getLocId());
		em.getTransaction().commit();
		return location;
	}

	public static List<String> getAllLocationData() {

		final EntityManager em = DRDBConnect.getEntityManager();
		em.getTransaction().begin();

		//Query query = em.createQuery("select e.loctin from facility e");
		Query query = em.createNativeQuery("select loctin from facility");

		@SuppressWarnings("unchecked")
		List<String> list = query.getResultList();

		em.getTransaction().commit();
		return list;
	}

}
