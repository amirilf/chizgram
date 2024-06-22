package app.server.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Room {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    //todo name

    @ManyToMany
    private List<User> users;

    @OneToMany
    private List<Message> messages;

}
