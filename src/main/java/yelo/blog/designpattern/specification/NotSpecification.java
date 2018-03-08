package yelo.blog.designpattern.specification;

import yelo.blog.designpattern.specification.dto.Person;

/**
 * Created by yassineelouardi on 15/11/2017.
 */
public class NotSpecification extends AbstractSpecification implements ISpecification {

    private ISpecification abstractSpecification;
    public NotSpecification(ISpecification abstractSpecification) {
        this.abstractSpecification = abstractSpecification;
    }
    
    public boolean isSpecifiedBy(Person person) {
        return !this.abstractSpcification.isSpecifiedBy(person);
    }
}
