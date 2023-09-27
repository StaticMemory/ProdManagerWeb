package com.prod.view.SQLEntities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.GenerationType;
@Entity
public class Subsections {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private long projectOwnerID;
    private String projectOwnerName;
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public long getProjectOwnerID() {
        return projectOwnerID;
    }
    public void setProjectOwnerID(long projectOwnerID) {
        this.projectOwnerID = projectOwnerID;
    }
    public String getProjectOwnerName() {
        return projectOwnerName;
    }
    public void setProjectOwnerName(String projectOwnerName) {
        this.projectOwnerName = projectOwnerName;
    }
    public String getSubsection() {
        return subsection;
    }
    public void setSubsection(String subsection) {
        this.subsection = subsection;
    }
    private String subsection;
}
