package fr.morgan.apiagenda.controller;

import fr.morgan.apiagenda.entity.Agenda;
import fr.morgan.apiagenda.entity.User;
import fr.morgan.apiagenda.service.AgendaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/agenda")
public class AgendaController {

    @Autowired
    AgendaService agendaService;

    @GetMapping
    public List<Agenda> getAgendas(){
        return agendaService.getAgendas();
    }

    @PostMapping
    public void createAgenda(@RequestBody  Agenda agenda){
        agendaService.createAgenda(agenda);
    }

    @GetMapping("/{id}/members")
    public List<User> getMembers(@PathVariable ("id") Long id){
        Agenda agenda = agendaService.getAgenda(id);
        return agenda.getMembers();
    }
}
