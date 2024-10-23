package be.abis.exercise;

import be.abis.exercise.model.Address;
import be.abis.exercise.model.Company;
import be.abis.exercise.model.Person;

public class PersonTest {
    public static void main(String[] args) {
        Address a = new Address("route d'Arlon", 10, "1255", "Leuven");
        Company c = new Company("Abis","01225345", "4555444", a);
        Person p = new Person(1, "John", "Doe", 35, "john.doe@abis.com","secret" , "BE", c);
        System.out.println(p.getFirstName()+" "+p.getLastName()+" is "+p.getAge()+" years old and works for "+p.getCompany().getName()+" in "+p.getCompany().getAddress().getTown());
    }
}
