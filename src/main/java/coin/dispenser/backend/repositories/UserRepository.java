package coin.dispenser.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import coin.dispenser.backend.entities.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
    User findByEmail(String email);
}
