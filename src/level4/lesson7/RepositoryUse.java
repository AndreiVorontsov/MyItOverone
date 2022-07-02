package level4.lesson7;

import level4.lesson7.model.Person;
import level4.lesson7.repository.PersonRepository;

import java.io.IOException;
import java.sql.SQLException;

public class RepositoryUse {
    public static void main(String[] args) throws SQLException, IOException, ClassNotFoundException {
        Person person = new Person("Вова", 65);
        PersonRepository personRepository  = new PersonRepository();
        personRepository.create(person);
    }
}
