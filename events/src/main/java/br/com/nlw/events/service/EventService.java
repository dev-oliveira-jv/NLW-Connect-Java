package br.com.nlw.events.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.nlw.events.model.Event;
import br.com.nlw.events.repositories.EventRepositories;

@Service
public class EventService {

    @Autowired
    private EventRepositories eventRepositories;

    public Event addNewEvent(Event event){

        // Gerando o Pretty Name
        event.setPrettyName(event.getTitle().toLowerCase().replaceAll(" ", "-"));
        return eventRepositories.save(event);
    }

    public List<Event> getAllEvents(){
        return (List<Event>)eventRepositories.findAll();
    }


    public Event getByPrettyName(String prettyName){
        return eventRepositories.findByPrettyName(prettyName);   
    }
}
