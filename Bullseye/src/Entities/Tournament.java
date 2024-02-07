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
}
