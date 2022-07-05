package level4.lesson8.MavenHibernate.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity // сущность
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int id;
    public String name;

    public City() {
    }

    public City(String name) {
        this.name = name;
    }

    public City(int id) {
        this.id = id;
    }

    public City(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "City{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
