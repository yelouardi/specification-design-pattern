package yelo.blog.designpattern.specification.rules;

import yelo.blog.designpattern.specification.AbstractSpecification;
import yelo.blog.designpattern.specification.dto.ClientType;
import yelo.blog.designpattern.specification.dto.Person;

/**
 * Created by yassineelouardi on 15/11/2017.
 */
public class ValidateProspectClient extends AbstractSpecification {
    @Override
    public boolean isSpecifiedBy(Person person) {
        return ClientType.PROSPECT.getIdProfile()==person.getType().getIdProfile();
    }
}
