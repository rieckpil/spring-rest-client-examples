package de.rieckpil.springrestclientexamples.service;

import de.rieckpil.api.domain.User;

import java.util.List;

public interface ApiService {

    List<User> getUsers(Integer limit);

}
