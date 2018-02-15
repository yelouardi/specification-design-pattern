package yelo.blog.designpattern.specification;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import yelo.blog.designpattern.specification.dto.Agreement;
import yelo.blog.designpattern.specification.dto.ClientType;
import yelo.blog.designpattern.specification.dto.Person;
import yelo.blog.designpattern.specification.rules.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;
/**
 * Created by yassineelouardi on 15/11/2017.
 */
public class SepecificationTest{

    private List<Person> persons;
    private ValidationPerson validationPerson =new ValidationPerson();
    private ValidateInsuranceClient validateInsuranceClient = new ValidateInsuranceClient();
    private ValidateBankClient validateBankClient = new ValidateBankClient();
    private ValidateProspectClient validateProspectClient = new ValidateProspectClient();
    private HaveAgreements haveAgreements =  new HaveAgreements();

    @Before
    public  void setUp(){
        int countPerson = (int)(Math.random()*10);
        persons= new ArrayList<>();
        for(int i=0; i<countPerson; i++){
            Person person = new Person();
            //person.setFirstName(StringUtils.toUpperCase(giveMeName(10)));
            person.setLastName(giveMeName(10));
            person.setBirthDay(new Date());
            person.setType(giveMeType(i));
            person.setAgreement(giveMeAgrements(i));
            persons.add(person);
        }

    }


    @Test
    public  void testProspectClients(){
        persons
                .stream()
                .filter(p -> validationPerson.andSpecification(validateProspectClient).isSpecifiedBy(p))
                .forEach(System.out::print);
    }

    @Test
    public  void testBankClients(){
        persons
                .stream()
                .filter(p -> validationPerson.andSpecification(validateBankClient).isSpecifiedBy(p))
                .forEach(System.out::print);
    }
    @Test
    public  void testInsuranceClients(){
        persons
                .stream()
                .filter(p -> validationPerson.andSpecification(validateInsuranceClient).isSpecifiedBy(p))
                .forEach(System.out::print);
    }

    @Test
    public  void testHaveAgreementsClients(){
        persons
                .stream()
                .filter(p -> validationPerson.andSpecification(validateInsuranceClient).orSpecification(validateBankClient).orSpecification(validateProspectClient).andSpecification(haveAgreements).isSpecifiedBy(p))
                .forEach(System.out::print);
    }




    public String giveMeName(int wordLength){
         Random r = new Random(); // Intialize a Random Number Generator with SysTime as the seed
            StringBuilder sb = new StringBuilder(wordLength);
            for(int i = 0; i < wordLength; i++) { // For each letter in the word
                char tmp = (char) ('a' + r.nextInt('z' - 'a')); // Generate a letter between a and z
                sb.append(tmp); // Add it to the String
            }
            return sb.toString();

    }

    public ClientType giveMeType(int index){
        if(index%2==0){
            return ClientType.INSURANCE;
        }
        else if(index%3==0){
            return ClientType.BANK;
        }else{
            return ClientType.PROSPECT;
        }
    }
    public List<Agreement> giveMeAgrements(int index){
        List<Agreement> agreements = new ArrayList<Agreement>();
            for (int j=0 ;j<index;j++) {
                Agreement a =new Agreement();
                a.setAgrementDate(new Date());
                a.setDescription("Agreement "+j);
                a.setIdAgrement(j);
                agreements.add(a);

        }
        return  agreements;
    }
}
