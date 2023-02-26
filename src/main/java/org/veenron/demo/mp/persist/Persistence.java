package org.veenron.demo.mp.persist;

import org.veenron.demo.mp.domain.Project;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Persistence {

    private static Persistence INSTANCE = new Persistence();

    private Map<String, Project> data = new HashMap<>();

    private Persistence() {
    }

    public static Persistence getInstance() {
        return INSTANCE;
    }

    public Project getOne(String uid) {
        if (data.containsKey(uid)) {
            return data.get(uid);
        }
        return null;
    }

    public List<Project> getAll() {
        return List.copyOf(data.values());
    }

    public Project store(Project project) {
        data.put(project.getUid(), project);
        return project;
    }

    public Project update(Project project) {
        if (!data.containsKey(project.getUid())) {
            return null;
        }
        data.put(project.getUid(), project);
        return project;
    }





}
