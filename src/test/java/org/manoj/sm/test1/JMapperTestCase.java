package org.manoj.sm.test1;

import org.junit.Test;
import org.manoj.sm.SMapper;

import static org.junit.Assert.*;

public class JMapperTestCase {

    @Test
    public void testJMapper() {
        // creating person as source object
        Person person = new Person();
        person.setPname("Manoj Pawar");
        person.setPemail("mmpawar94@gmail.com");
        person.setPmobile("8983120926");
        person.setCourntry("India");
        person.setPgender("Male");
        person.setPage(26);

        // mapping Person object to the PersonDto
        SMapper jMapper = new SMapper();
        PersonDto personDto = jMapper.map(person, PersonDto.class);
        assertNotNull(personDto);
        System.out.println(personDto.toString());

        Person mPerson = jMapper.map(personDto, Person.class);
        assertNotNull(mPerson);
        System.out.println(mPerson.toString());
    }
}
