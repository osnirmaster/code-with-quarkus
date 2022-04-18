package org.acme.services;

import java.util.ArrayList;

import org.acme.config.PersonGenerate;
import org.acme.domain.Person;

import io.smallrye.mutiny.Multi;

public class CellService {

    public static Multi<ArrayList<Person>> getPerson() {
        return Multi.createFrom().items(new PersonGenerate().generatePersonsDB());
    }
}
