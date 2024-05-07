package fr.morgan.apiagenda.service;

import fr.morgan.apiagenda.entity.Agenda;
import fr.morgan.apiagenda.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AgendaService {

    List<Agenda> getAgendas();
    Agenda getAgenda(Long id);
    void createAgenda(Agenda agenda);
    void deleteAgenda(Agenda agenda);
//    void getMember(Long id );
    void addMember(Long id, User user);
    void deleteMember(Long id,User user);
}
