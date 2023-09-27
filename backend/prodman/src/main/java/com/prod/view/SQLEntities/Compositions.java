package com.prod.view.SQLEntities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Compositions {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String parent;
    private long parentID;
    private String child;
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getParent() {
        return parent;
    }
    public void setParent(String parent) {
        this.parent = parent;
    }
    public long getParentID() {
        return parentID;
    }
    public void setParentID(long parentID) {
        this.parentID = parentID;
    }
    public String getChild() {
        return child;
    }
    public void setChild(String child) {
        this.child = child;
    }
}
