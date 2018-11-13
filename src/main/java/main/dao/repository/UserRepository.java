package main.dao.repository;

import main.entity.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import javax.persistence.NamedNativeQuery;
import java.util.List;

public interface UserRepository extends CrudRepository<User, Long> {
   List<User> findAll();
}
