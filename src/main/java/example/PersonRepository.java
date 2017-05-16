package example;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

public interface PersonRepository extends CrudRepository<Person, String> {

    Optional<Person> findByLastName(String lastName);

}