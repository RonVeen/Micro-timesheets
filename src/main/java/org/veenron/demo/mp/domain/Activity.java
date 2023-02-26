package org.veenron.demo.mp.domain;

public class Activity {
    String uid;
    String description;
    boolean billable;

    public Activity() {
    }

    public Activity(String uid, String description, boolean billable) {
        this.uid = uid;
        this.description = description;
        this.billable = billable;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isBillable() {
        return billable;
    }

    public void setBillable(boolean billable) {
        this.billable = billable;
    }
}
