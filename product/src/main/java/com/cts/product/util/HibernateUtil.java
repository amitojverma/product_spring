package com.cts.product.util;

import java.util.HashMap;
import java.util.Map;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Environment;

import com.cts.product.bean.Login;
import com.cts.product.bean.Product;

public class HibernateUtil {
	private static StandardServiceRegistry registry;
	   private static SessionFactory sessionFactory;

	   public static SessionFactory getSessionFactory() {
	      if (sessionFactory == null) {
	         try {
	            StandardServiceRegistryBuilder registryBuilder = new StandardServiceRegistryBuilder();

	            Map<String, Object> settings = new HashMap<>();
	            settings.put("hibernate.connection.driver_class", "com.mysql.cj.jdbc.Driver");
		        settings.put("hibernate.connection.url", "jdbc:mysql://localhost:3306/springtest");
	            settings.put(Environment.USER, "root");
	            settings.put(Environment.PASS, "root");
	            settings.put(Environment.HBM2DDL_AUTO, "update");

	            registryBuilder.applySettings(settings);
	            registry = registryBuilder.build();
	            MetadataSources sources = new MetadataSources(registry)
	                  .addAnnotatedClass(Login.class).addAnnotatedClass(Product.class);
	            Metadata metadata = sources.getMetadataBuilder().build();
	            sessionFactory = metadata.getSessionFactoryBuilder().build();
	         } catch (Exception e) {
	            if (registry != null) {
	               StandardServiceRegistryBuilder.destroy(registry);
	            }
	            e.printStackTrace();
	         }
	      }
	      return sessionFactory;
	   }

	   public static void shutdown() {
	      if (registry != null) {
	         StandardServiceRegistryBuilder.destroy(registry);
	      }
	   }
}
