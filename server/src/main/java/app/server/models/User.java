package app.server.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.util.Date;


@Getter
@Setter
@Entity
@Table(name = "\"USER\"")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;


    @Column(unique = true)
    private String userName;


    private String password;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false,unique = true)
    private String phoneNumber;


    private String profile;


    private String bio;


    private boolean isOnline;

    @Column(name = "date_joined", nullable = false, updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateJoined;
    @PrePersist
    public void onCreate(){
        dateJoined = new Date();
    }


}
