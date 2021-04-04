package org.acme.rest.json;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Set;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/persons")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class PersonResource {

    private Set<Person> people = Collections.newSetFromMap(Collections.synchronizedMap(new LinkedHashMap<>()));

    public PersonResource() {
        people.add(new Person("Apple", "Winter fruit", 12));
        people.add(new Person("Pineapple", "Tropical fruit", 14));
    }

    @GET
    public Set<Person> list() {
        return people;
    }

    @POST
    public Set<Person> add(Person person) {
        people.add(person);
        return people;
    }

    @DELETE
    public Set<Person> delete(Person person) {
        people.removeIf(existingPerson -> existingPerson.firstName.contentEquals(person.firstName));
        return people;
    }
}
