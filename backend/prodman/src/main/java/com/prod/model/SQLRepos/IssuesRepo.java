package com.prod.model.SQLRepos;
import java.util.ArrayList;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import com.prod.view.SQLEntities.SubsectionIssues;
public interface IssuesRepo extends CrudRepository<SubsectionIssues, Long> {
    @Query("Select u FROM SubsectionIssues u WHERE u.subsectionID = ?1")
    ArrayList<SubsectionIssues> getIssuesBySubsection(long id);
    @Query("Select u FROM SubsectionIssues u WHERE u.subsectionID =?1 AND u.priority=?2")
    ArrayList<SubsectionIssues> getIssuesBySubsectionAndSeverity(long id, String severity); //Low, Medium, High are only accepted severities
    
}
