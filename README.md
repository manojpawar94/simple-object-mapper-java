# Simple-Mapper
Simple-Mapper is core java lightweight, annotation based framework which helps to map two objects at field level.

## Example 1
Consider that we have two classes `Person` and `PersonDto`. We can to map fields of both classes using `@MField` annotation.
### How to map field of two classes

```
public class Person {
    private String personName;
    private int personAge;
    private String personGender;
    //getters and setters
}
```

```
public class PersonDto {
    @MField("pname")
    private String name;
    @MField("page")
    private int age;
    //getters and setters
}
```

### How get `PersonDto` object instance from `Person` object instance?
```
// mapping Person object to the PersonDto
Person person = getPerson();
SMapper jMapper = new SMapper();
PersonDto personDto = jMapper.map(person, PersonDto.class);
```

### How get `Person` object instance from `PersonDto` object instance?
```
PersonDto personDto = getPersonDto();
SMapper jMapper = new SMapper();
Person person = jMapper.map(personDto, Person.class);
```

## Author
Manoj Pawar
Software Engineer at Virtusa Consutlting Services.
Email:`mmpawar94@gmail.com`
