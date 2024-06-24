package app.server.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private int id;
    private String userName;
    private String password;
    private String name;
    private String phoneNumber;
    private String profile;
    private String bio;
    private Date lastSeen;
    private LocalDate dateJoined;

}
