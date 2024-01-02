package com.zorba.util;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.zorba.model.Customer;
import com.zorba.model.Vehicle;

public class HibernateUtility {
		public static SessionFactory initializeSession() {
			try {
			Configuration con = new Configuration().configure().addAnnotatedClass(Vehicle.class).addAnnotatedClass(Customer.class);
			SessionFactory sf = con.buildSessionFactory();
			return sf;
			} catch (Exception e) {
				System.out.println("Error during initialization");
				e.printStackTrace();
				
			}
			return null;
		}

}
