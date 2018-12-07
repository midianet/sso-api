package gov.goias.sso;

import gov.goias.sso.domain.User;
import gov.goias.sso.repository.UserRepository;
import gov.goias.sso.resource.UserResource;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTests {

    @Autowired
    private UserRepository repository;

    @Test
    public void insertUser() {
        User user = new User();
        user.setName("Marcos");
        user.setActive(true);
        user.setEmail("midianet@gmail.com");
        user.setPassword("123");
        user.setUsername("midianet");
        repository.save(user);
        System.out.println("Test");
    }

}
