package coin.dispenser.backend;

import coin.dispenser.backend.entities.User;
import coin.dispenser.backend.repositories.UserRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserRepositoryTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void createUser(){
        User user = User.builder().email("test@test.com").firstname("test").lastname("tester").password("12345").build();
        User u = userRepository.save(user);
        assertEquals(user.getFirstname(), u.getFirstname());
    }

}
