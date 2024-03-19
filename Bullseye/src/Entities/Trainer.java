package Entities;

import Entities.Abstracts.AbstractMember;
import Utils.Gender;
import Utils.MemberStatus;
import java.util.Date;

public class Trainer extends AbstractMember {
    private boolean license;

    public Trainer(String firstname, String lastname, Date birthday, Gender gender, String address, MemberStatus status, boolean license, boolean isActive, boolean hasInsurance)
    {
        super(firstname, lastname, birthday, gender, address, status, isActive, hasInsurance);

        this.license = license;
    }

    public void registerMember() {
        return; // TODO
    }

    public boolean getLicense() {
        return this.license;
    }

    public void setLicense(boolean license) {
        this.license = license;
    }
}