package gov.goias.sso.resource;

import gov.goias.sso.domain.User;
import gov.goias.sso.repository.UserRepository;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.websocket.server.PathParam;

@Log4j2
@RestController
@RequestMapping(value = "/api/user", path = "/api/user")
public class UserResource {

    @Autowired
    private UserRepository repository;

    @GetMapping(path = "/{username}")
    @ResponseStatus(HttpStatus.OK)
    public User getByUsername(@PathVariable String username, HttpServletRequest request){
        System.out.println(request.getPathInfo());
        return repository.findByUsername(username).orElseThrow(() -> new EmptyResultDataAccessException("Username",1));
    }

//    @PostMapping
//    @ResponseStatus(HttpStatus.CREATED)
//    public User create(@RequestBody User user, HttpServletResponse response) {
//        //log.trace("Criando colaborador {}", colaborador);
//        return repository.findByUsername(user.getUsername()).or(() -> {
//            response.addHeader(HttpHeaders.LOCATION,String.format("/api/colaboradores/%s",user.getUsername()));
//            return new User();
//        });
//    }

}