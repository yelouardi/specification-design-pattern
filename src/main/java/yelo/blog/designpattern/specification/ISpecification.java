package yelo.blog.designpattern.specification;

import yelo.blog.designpattern.specification.dto.Person;

/**
 * Created by yassineelouardi on 15/11/2017.
 */
public interface ISpecification {

    boolean isSpecifiedBy(Person person);
     ISpecification andSpecification(ISpecification specification);
     ISpecification orSpecification(ISpecification specification);
     ISpecification notSpecification();
}
