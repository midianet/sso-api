package gov.goias.sso.domain;

import lombok.Data;
import org.springframework.data.annotation.Id;

import java.time.LocalDate;

@Data
public class Auth {

    @Id
    private String id;
    private LocalDate date;
    private User user;
    private String host;
    private Boolean active;
}