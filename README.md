***************************************************************
Simple-Mapper
***************************************************************
Simple-Mapper is core java lightweight, annotation based framework which helps to map two objects at field level.

public class Person {
    private String personName;
    private int personAge;
    private String personGender;
    //getters and setters
}

public class PersonDto {
    @MField("pname")
    private String name;
    @MField("page")
    private int age;
    //getters and setters
}

// mapping Person object to the PersonDto
Person person = getPerson();
SMapper jMapper = new SMapper();
PersonDto personDto = jMapper.map(person, PersonDto.class);

OR

PersonDto personDto = getPersonDto();
SMapper jMapper = new SMapper();
Person person = jMapper.map(personDto, Person.class);

***************************************************************
