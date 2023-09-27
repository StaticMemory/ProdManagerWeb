package com.prod.view.SQLEntities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.GenerationType;
@Entity
public class Adjacencies {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private long parentID;
    private long childID;
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public long getParentID() {
        return parentID;
    }
    public void setParentID(long parentID) {
        this.parentID = parentID;
    }
    public long getChildID() {
        return childID;
    }
    public void setChildID(long childID) {
        this.childID = childID;
    }
}
