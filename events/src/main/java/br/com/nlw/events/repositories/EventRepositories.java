package br.com.nlw.events.repositories;

import org.springframework.data.repository.CrudRepository;

import br.com.nlw.events.model.Event;


public interface EventRepositories extends CrudRepository<Event, Integer>{

    public Event  findByPrettyName(String prettyName);
}
