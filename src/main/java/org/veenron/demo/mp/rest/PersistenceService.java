package org.veenron.demo.mp.rest;

import jakarta.ejb.Singleton;
import org.veenron.demo.mp.domain.Project;
import org.veenron.demo.mp.persist.Storage;

@Singleton
public class PersistenceService {

    public Storage<Project> projectStorage = new Storage();

}
