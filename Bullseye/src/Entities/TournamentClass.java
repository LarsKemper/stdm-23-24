package Entities;

import Utils.AgeGroup;
import Utils.BowTyp;
import Utils.Gender;

public class TournamentClass {
    private Gender gender;
    private BowTyp bowTyp;
    private AgeGroup ageGroup;
    
    public TournamentClass(Gender gender, BowTyp bowTyp, AgeGroup ageGroup) {
        this.gender = gender;
        this.bowTyp = bowTyp;
        this.ageGroup = ageGroup;
    }
}
