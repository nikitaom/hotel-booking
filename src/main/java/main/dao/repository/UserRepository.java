package main.dao.repository;

import main.entity.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import javax.persistence.NamedNativeQuery;

public interface UserRepository extends CrudRepository<User, Long> {
  @Query(value = "select name from users where email=?1", nativeQuery = true)
  User findUserByEmail(String email);
}
