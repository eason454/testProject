package java8.optional;

import java.util.Optional;

/**
 * Created by zhaooyii on 2018/3/7.
 */
public class Person {
    private Optional<Car> car=Optional.empty();

    public Optional<Car> getCar() {
        return car;
    }

    public static void main(String[] args) {
        Person person=new Person();
        Optional<Person> optPerson=Optional.of(person);
        String name=optPerson.flatMap(Person::getCar).flatMap(Car::getInsurance).map(Insurance::getName).orElse("Unknown");
        System.out.println(name);

    }
}
