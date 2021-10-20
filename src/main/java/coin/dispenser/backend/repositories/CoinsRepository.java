package coin.dispenser.backend.repositories;

import coin.dispenser.backend.entities.Coins;
import coin.dispenser.backend.entities.User;
import org.springframework.data.repository.CrudRepository;

public interface CoinsRepository extends CrudRepository<Coins, Long> {
}
