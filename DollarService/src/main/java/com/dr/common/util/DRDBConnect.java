package com.dr.common.util;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DRDBConnect {

	private static EntityManagerFactory entityManagerFactory;
	private static String[] hibernateProperties = { "hibernate.connection.url", "hibernate.connection.username",
			"hibernate.connection.password", "hibernate.connection.driver_class", "hibernate.dialect",
			"hibernate.transaction.manager_lookup_class", "hibernate.c3p0.min_size", "hibernate.c3p0.max_size",
			"hibernate.c3p0.timeout", "hibernate.c3p0.max_statements", "hibernate.default_schema" };

	public static EntityManager getEntityManager() {
		// loadEntityManagerFactory();
		return Persistence.createEntityManagerFactory("DollarPU").createEntityManager();
	}

	private synchronized static void loadEntityManagerFactory() {
		if (entityManagerFactory == null) {

		}
	}

	public static Map<String, String> getPersistencePropertiesMap() {
		final Map<String, String> persistencePropertiesMap = new HashMap<String, String>();
		try {
			loadHibernateProperties(persistencePropertiesMap);
		} catch (final IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return persistencePropertiesMap;
	}

	private static void loadHibernateProperties(final Map<String, String> persistencePropertiesMap) throws IOException {
		final Properties persistenceProperties = new Properties();
		persistenceProperties.load(Thread.currentThread().getContextClassLoader().getResourceAsStream(""));

	}

}
