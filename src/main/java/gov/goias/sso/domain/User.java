package gov.goias.sso.domain;

import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class User {

    @Id
    private String id;
    private String username;
    private String name;
    private String email;
    private Boolean active;
    private String password;
}