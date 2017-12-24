package de.rieckpil.springrestclientexamples.service;

import de.rieckpil.api.domain.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApiServiceImplTest {

    @Autowired
    ApiService cut;

    @Test
    public void testGetUsers() {

        List<User> users = cut.getUsers(3);

        assertEquals(4, users.size());

    }

}