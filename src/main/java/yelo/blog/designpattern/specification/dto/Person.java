package yelo.blog.designpattern.specification.dto;

import java.util.Date;
import java.util.List;

/**
 * Created by yassineelouardi on 15/11/2017.
 */
public class Person {
    private String firstName;
    private String lastName ;
    private Date birthDay ;
    private ClientType type ;
    private List<Agreement> agreement;

    public Person() {
    }

    public Person(String firstName, String lastName, Date birthDay, ClientType type) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDay = birthDay;
        this.type = type;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }

    public ClientType getType() {
        return type;
    }

    public void setType(ClientType type) {
        this.type = type;
    }

    public List<Agreement> getAgreement() {
        return agreement;
    }

    public void setAgreement(List<Agreement> agreement) {
        this.agreement = agreement;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthDay=" + birthDay +
                ", type=" + type +
                ", agreement=" + agreement +
                '}';
    }
}
