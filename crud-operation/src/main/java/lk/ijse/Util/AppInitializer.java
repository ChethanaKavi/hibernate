package lk.ijse.Util;

import lk.ijse.Util.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class AppInitializer {
    public static void main(String[] args) {

        try (SessionFactory sessionFactory = Hibernate.getSessionFactory();
             Session session = sessionFactory.openSession();) {
            System.out.println("session: " + session);
        }
    }
}
