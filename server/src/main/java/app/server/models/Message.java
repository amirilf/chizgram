package app.server.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Entity
public class Message {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @ManyToOne
    @JoinColumn(name = "user_sender_id", nullable = false)
    private User userSender;

    @ManyToOne
    private Room room;

    //todo text

    @Column(name = "date_created", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateCreated;

    @PrePersist
    public void onCreate() {
        this.dateCreated = new Date();
    }

}
