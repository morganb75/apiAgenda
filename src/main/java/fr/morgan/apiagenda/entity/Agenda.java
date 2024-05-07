package fr.morgan.apiagenda.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Agenda {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String name;
    @ManyToOne
    @JoinColumn(name ="owner_id")
    private User owner;
    @ManyToMany
    @JoinTable(name = "agenda_member",
        joinColumns = @JoinColumn(name = "agenda_id"),
        inverseJoinColumns = @JoinColumn(name = "member_id"))
    private List<User> members = new ArrayList<>();
    @ManyToMany
    @JoinTable(name = "agenda_event",
        joinColumns = @JoinColumn(name="agenda_id"),
        inverseJoinColumns = @JoinColumn(name = "event_id"))
    private List<Event> events = new ArrayList<>();

    public Agenda(String name, User owner, List<User> members, List<Event> events) {
        this.name = name;
        this.owner = owner;
        this.members = members;
        this.events = events;
    }
}

