package level4.lesson8.MavenHibernate.reposity;

import level4.lesson8.MavenHibernate.SessionCreator;
import level4.lesson8.MavenHibernate.model.City;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class CityRepository {
//    CRUD
    public void add(City city){
        Session session = SessionCreator.getSession();
        session.save(city);
        session.close();
//        try(Session session = SessionCreator.getSession()){
//            session.persist(city);
//        }
    }

    public  City  get(int id){
        Session session = SessionCreator.getSession();
        City foundCity = session.get(City.class, id);
        session.close();
        return foundCity;
    }
    public List<City> getAll(){
        Session session = SessionCreator.getSession();
//        HQL - Hibernate Query Language
        List<City> cities = session.createQuery("from City", City.class).list();

        session.close();
        return cities;
    }

    public void update(City city){
        Session session = SessionCreator.getSession();

        Transaction transaction = session.beginTransaction();
        session.update(city);
        transaction.commit();

        session.close();
    }

    public void delete(City city){
        Session session = SessionCreator.getSession();

        Transaction transaction = session.beginTransaction();
        session.delete(city);
        transaction.commit();

        session.close();
    }
}
