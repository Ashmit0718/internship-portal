package com.intern.intern_portal.model;
// jpa pasun sagle annotations import kartoy
import jakarta.persistence.*;
// table define hotoy
@Entity
public class application 
{
    @Id //primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //generated value mhanje jpa lo sangta primary key kashi generate karaychi 
    //database madhe auto generate id kartoy AUTO_INCREMENT sarkha
    
    //data store karnyasathi fields
    private Long id;
    private String studentName;
    private String studentEmail;
    private int internshipId;


    // getters ani setters
    // setters = input gheun object fill karayla
    //getters = object madhun data gheyla
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getStudentName() { return studentName; }
    public void setStudentName(String studentName) { this.studentName = studentName; }
    public String getStudentEmail() { return studentEmail; }
    public void setStudentEmail(String studentEmail) { this.studentEmail = studentEmail; }
    public int getInternshipId() { return internshipId; }
    public void setInternshipId(int internshipId) { this.internshipId = internshipId; }
}
