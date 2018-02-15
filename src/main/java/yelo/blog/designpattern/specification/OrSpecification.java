package yelo.blog.designpattern.specification;

import yelo.blog.designpattern.specification.dto.Person;

/**
 * Created by yassineelouardi on 15/11/2017.
 */
public class OrSpecification extends AbstractSpecification implements ISpecification {

    private ISpecification abstractSpecification;
    private ISpecification specification;
    public OrSpecification(ISpecification abstractSpecification, ISpecification specification) {
        this.abstractSpecification = abstractSpecification;
        this.specification = specification;
    }
    
    public boolean isSpecifiedBy(Person person) {
        return this.specification.isSpecifiedBy(person) || this.abstractSpecification.isSpecifiedBy(person);
    }


}
