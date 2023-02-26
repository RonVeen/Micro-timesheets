package org.veenron.demo.mp.domain;

import java.io.Serializable;

public class Project implements Serializable {
    private String uid;
    private String name;
    private boolean active;

    public Project() {

    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
