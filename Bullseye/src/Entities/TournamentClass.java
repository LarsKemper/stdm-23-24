package Entities;

import Utils.AgeGroup;
import Utils.BowTyp;
import Utils.Gender;
import Utils.Interfaces.Identifiable;

public class TournamentClass implements Identifiable {
    protected int id;
    private Gender gender;
    private BowTyp bowTyp;
    private AgeGroup ageGroup;
    
    public TournamentClass(Gender gender, BowTyp bowTyp, AgeGroup ageGroup) {
        this.gender = gender;
        this.bowTyp = bowTyp;
        this.ageGroup = ageGroup;
    }

    @Override
    public int getId() {
        return this.id;
    }

    public Gender getGender() {
        return this.gender;
    }

    public BowTyp getBowTyp() {
        return this.bowTyp;
    }

    public AgeGroup getAgeGroup() {
        return this.ageGroup;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public void setBowTyp(BowTyp bowTyp) {
        this.bowTyp = bowTyp;
    }

    public void setAgeGroup(AgeGroup ageGroup) {
        this.ageGroup = ageGroup;
    }
}
