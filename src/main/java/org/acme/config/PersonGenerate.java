package org.acme.config;

import java.util.ArrayList;
import java.util.UUID;

import javax.inject.Singleton;

import com.github.javafaker.Faker;

import org.acme.domain.Person;

@Singleton
public class PersonGenerate {
    private ArrayList<Person> persons = new ArrayList<>();

    public ArrayList<Person> generatePersonsDB() {

        for (int i = 0; i < 10; i++) {
            Faker fake = new Faker();
            persons.add(new Person(
                    UUID.randomUUID(),
                    fake.name().fullName(),
                    fake.idNumber().ssnValid(),
                    fake.internet().emailAddress(),
                    fake.phoneNumber().cellPhone()));
        }

        return persons;
    }
}
