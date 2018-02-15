package yelo.blog.designpattern.specification.rules;

import yelo.blog.designpattern.specification.AbstractSpecification;
import yelo.blog.designpattern.specification.dto.Person;

/**
 * Created by yassineelouardi on 15/11/2017.
 */
public class ValidationPerson extends AbstractSpecification {

    @Override
    public boolean isSpecifiedBy(Person person) {
        return person!=null && person.getFirstName()!=null&&person.getLastName()!=null&&person.getBirthDay()!=null;
    }

}
