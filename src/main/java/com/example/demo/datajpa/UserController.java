package com.example.demo.datajpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;

/**
 * description: UserController
 * date: 11/21/20 2:48 PM
 * author: fourwood
 */
@RestController
@RequestMapping(value = "/api/v1")
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @RequestMapping(value = "/user/{userId}", method = RequestMethod.GET)
    @ResponseBody
    public User getUser(@PathVariable long userId) {
        return userRepository.findById(userId);
    }

    @RequestMapping(value = "/user/all", method = RequestMethod.GET)
    @ResponseBody
    public Iterable<User> getUser() {
        return userRepository.findAll();
    }

    @RequestMapping(value = "/user", method = RequestMethod.POST)
    @ResponseBody
    public User createUser(@RequestBody Map<String, Object> user) {
        String firstName = user.get("firstName").toString();
        String lastName = user.get("lastName").toString();
        User postuser = new User(firstName, lastName);
        return userRepository.save(postuser);
    }

    @RequestMapping(value = "/user/{userId}", method = RequestMethod.DELETE)
    @ResponseBody
    public void deleteUser(@PathVariable long userId) {
        userRepository.deleteById(userId);
    }

    @RequestMapping(value = "/user", method = RequestMethod.GET)
    @ResponseBody
    public List<User> findUserByFirstName(@RequestParam String Name, @RequestParam(defaultValue = "0") int type) {
        if(type == 0) return userRepository.myFindByFirstName(Name);
        else return userRepository.findByLastName(Name);
    }
}
