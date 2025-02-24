package br.com.nlw.events.repositories;

import org.springframework.data.repository.CrudRepository;

import br.com.nlw.events.model.User;


public interface UserRepositorie extends CrudRepository<User, Integer>  {

    public User findByEmail(String email);

}
