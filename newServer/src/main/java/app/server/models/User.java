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
    private String userName;
    private String password;
    private String name;
    private String phoneNumber;
    private String profile;
    private String bio;
    private LocalDate lastSeen;
    private LocalDate dateJoined;

    public User(String userName,String password,String name,String phoneNumber){
        this.userName = userName;
        this.password = password;
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

}
