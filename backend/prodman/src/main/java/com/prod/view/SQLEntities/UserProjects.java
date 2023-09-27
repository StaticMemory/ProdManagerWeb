package com.prod.view.SQLEntities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class UserProjects {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private long userID;
    private long projectID;
    private String userOwnershipOfProjects; // Contributor, Owner, Viewer
    private String projectName;
    private String userName;
    public String getProjectName() {
        return projectName;
    }
    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public long getUserID() {
        return userID;
    }
    public void setUserID(long userID) {
        this.userID = userID;
    }
    public long getProjectID() {
        return projectID;
    }
    public void setProjectID(long projectID) {
        this.projectID = projectID;
    }
    public String getUserOwnershipOfProjects() {
        return userOwnershipOfProjects;
    }
    public void setUserOwnershipOfProjects(String userOwnershipOfProjects) {
        this.userOwnershipOfProjects = userOwnershipOfProjects;
    }
}
