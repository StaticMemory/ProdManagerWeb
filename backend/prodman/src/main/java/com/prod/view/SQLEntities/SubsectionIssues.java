package com.prod.view.SQLEntities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class SubsectionIssues {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private long subsectionID; // ID of subsection issue belongs to
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public long getSubsectionID() {
        return subsectionID;
    }
    public void setSubsectionID(long subsectionID) {
        this.subsectionID = subsectionID;
    }
    public String getIssueName() {
        return issueName;
    }
    public void setIssueName(String issueName) {
        this.issueName = issueName;
    }
    public String getPriority() {
        return priority;
    }
    public void setPriority(String priority) {
        this.priority = priority;
    }
    public String getOwner() {
        return owner;
    }
    public void setOwner(String owner) {
        this.owner = owner;
    }
    private String issueName; // name of issue lol
    private String priority; // Low, Medium High
    private String owner; // Who took out the issues
}
