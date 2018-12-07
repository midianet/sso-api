package gov.goias.sso.resource;


import gov.goias.sso.domain.Auth;
import lombok.extern.log4j.Log4j2;
//import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@Log4j2
@RestController
@RequestMapping(value = "/api/auth", path = "/api/auth")
public class AuthResource {

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Auth login(@RequestParam String username, @RequestParam String password, @RequestParam String host) {
        return null;
        //log.trace("Criando colaborador {}", colaborador);
        //colaborador.setId(null);
        //colaborador = service.save(colaborador);
        //response.addHeader(HttpHeaders.LOCATION,"/api/colaboradores/" + colaborador.getId());
        //return colaborador;
    }
}