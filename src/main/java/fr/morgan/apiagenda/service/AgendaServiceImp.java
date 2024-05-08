package fr.morgan.apiagenda.service;

import fr.morgan.apiagenda.entity.Agenda;
import fr.morgan.apiagenda.entity.User;
import fr.morgan.apiagenda.repository.AgendaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AgendaServiceImp implements AgendaService{

    @Autowired
    AgendaRepository agendaRepository;

    @Override
    public List<Agenda> getAgendas() {
        return agendaRepository.findAll();
    }

    @Override
    public Agenda getAgenda(Long id) {
        return agendaRepository.findById(id).get();
    }

    @Override
    public void createAgenda(Agenda agenda) {
        agendaRepository.save(agenda);
    }

    @Override
    public void deleteAgenda(Agenda agenda) {
        agendaRepository.delete(agenda);
    }

    @Override
    public void addMember(Long id, User user) {

    }

    @Override
    public void deleteMember(Long id,User user) {

    }
}
