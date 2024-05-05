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
    private Integer id;
    @Column(nullable = false)
    private String name;
    @ManyToOne
    @JoinColumn(name ="owner_id")
    private dbUser owner;
    @ManyToMany
    @JoinTable(name = "agenda_member",
        joinColumns = @JoinColumn(name = "agenda_id"),
        inverseJoinColumns = @JoinColumn(name = "member_id"))
    private List<dbUser> members = new ArrayList<>();
    @ManyToMany
    @JoinTable(name = "agenda_event",
        joinColumns = @JoinColumn(name="agenda_id"),
        inverseJoinColumns = @JoinColumn(name = "event_id"))
    private List<Event> events = new ArrayList<>();
}
