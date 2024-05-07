package fr.morgan.apiagenda.repository;

import fr.morgan.apiagenda.entity.Agenda;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AgendaRepository extends JpaRepository<Agenda,Long> {
}
