package yelo.blog.designpattern.specification;

/**
 * Created by yassineelouardi on 15/11/2017.
 */
public  abstract class AbstractSpecification implements ISpecification {

    public ISpecification andSpecification(ISpecification specification){
        return new AndSpecification(this,specification);
    }
    public ISpecification orSpecification(ISpecification specification){
        return new OrSpecification(this,specification);
    }
    public ISpecification notSpecification(){
        return new NotSpecification(this);
    }
}
