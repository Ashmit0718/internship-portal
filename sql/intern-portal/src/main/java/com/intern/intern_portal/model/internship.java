package com.intern.intern_portal.model;

import jakarta.persistence.*;

@Entity
@Table(name = "internship")
public class internship 
{

    @Id //primary key 
    @Column(name = "internship_id")// forein key mhanun use karaycha ahe application class madhe
    private int internshipId;
    private String title;
    private int stipend;

    @Column(name = "duration_weeks")
    private int durationWeeks;

    @Enumerated(EnumType.STRING)
    // enum sangta jpa la value kashi store karaychi hya case madhe string
    private Mode mode;

    @Column(name = "company_id")
    private int companyId;

    //enum define kela mode sathi aani mode 3 value accept karnar spelling mistakes aani sagla avoid karnya sathi
    public enum Mode 
    {
        ONLINE, OFFLINE, DUAL
    }

    // Default constructor
    public internship() {}

    // Getters ani Setters
    public int getInternshipId() 
    { return internshipId; }
    public void setInternshipId(int internshipId) 
    { this.internshipId = internshipId; }

    public String getTitle() 
    { return title; }
    public void setTitle(String title) { this.title = title; }

    public int getStipend() { return stipend; }
    public void setStipend(int stipend) 
    { this.stipend = stipend; }

    public int getDurationWeeks() { return durationWeeks; }
    public void setDurationWeeks(int durationWeeks) 
    { this.durationWeeks = durationWeeks; }

    public Mode getMode() 
    { return mode; }
    public void setMode(Mode mode) 
    { this.mode = mode; }

    public int getCompanyId() 
    { return companyId; }
    public void setCompanyId(int companyId) 
    { this.companyId = companyId; }
}