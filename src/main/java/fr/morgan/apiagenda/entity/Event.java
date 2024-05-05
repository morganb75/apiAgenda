package fr.morgan.apiagenda.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false)
    private String name;
    @OneToOne
    @JoinColumn(name = "owner_id")
    private dbUser owner;
    @Column(nullable = false)
    private LocalDateTime beginDate;
    @Column(nullable = false)
    private LocalDateTime endDate;
}
