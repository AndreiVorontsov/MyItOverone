package level4.lesson8.MavenHibernate;

import level4.lesson8.MavenHibernate.model.City;
import level4.lesson8.MavenHibernate.model.Person;
import level4.lesson8.MavenHibernate.reposity.CityRepository;
import level4.lesson8.MavenHibernate.reposity.PersonRepository;

import java.util.List;
//import org.hibernate.Session;

public class HibernateUsage {
    public static void main(String[] args) {
//        Session session = SessionCreator.getSession();
//        CityRepository cityRepository = new CityRepository();
//        cityRepository.add(new City("Minsk"));
//        cityRepository.add(new City("Pinsk"));
//        cityRepository.add(new City("Grodno"));
//        cityRepository.add(new City("Kiev"));
//        City city = cityRepository.get(4);
//        System.out.println(city);
//        cityRepository.update(new City(1, "Gomel'"));
//        cityRepository.delete(new City(1));
//       List<City> cities = cityRepository.getAll();
//        System.out.println(cities);
        PersonRepository personRepository = new PersonRepository();
//        personRepository.add(new Person(34, "Oleg", new City(4)));
//       Person person = personRepository.get(52);
//        System.out.println(person);
//        List<Person> people = personRepository.getAll();
//        System.out.println(people);
//        personRepository.update(new Person(1, 23, "Roma", new City(5)));
        personRepository.delete(new Person(2));
    }
}
