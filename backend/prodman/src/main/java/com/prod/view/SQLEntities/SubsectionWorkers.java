package com.prod.view.SQLEntities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
@Entity
public class SubsectionWorkers {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public long getWorkerID() {
        return workerID;
    }
    public void setWorkerID(long workerID) {
        this.workerID = workerID;
    }
    public String getPermissions() {
        return permissions;
    }
    public void setPermissions(String permissions) {
        this.permissions = permissions;
    }
    private long workerID;
    private String permissions;
}
