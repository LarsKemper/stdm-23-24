package Entities;

import Entities.Abstracts.AbstractMember;
import java.util.Date;
import java.util.Map;

public class Tournament {
    private String name;
    private Date date;
    private String address;
    private int maxAttendees;
    private Map<AbstractMember, TournamentClass> attendees;
    
    public Tournament(String name, Date date, String address, int maxAttendees) {
        this.name = name;
        this.date = date;
        this.address = address;
        this.maxAttendees = maxAttendees;
    }

    public String getName() {
        return this.name;
    }

    public Date getDate() {
        return this.date;
    }

    public String getAddress() {
        return this.address;
    }

    public int getMaxAttendees() {
        return this.maxAttendees;
    }

    public Map<AbstractMember, TournamentClass> getAttendees() {
        return this.attendees;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setMaxAttendees(int maxAttendees) {
        this.maxAttendees = maxAttendees;
    }

    public void setAttendees(Map<AbstractMember, TournamentClass> attendees) {
        this.attendees = attendees;
    }
}
