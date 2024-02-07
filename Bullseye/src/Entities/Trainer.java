package Entities;

import Entities.Abstracts.AbstractMember;
import Utils.Gender;
import java.util.Date;

public class Trainer extends AbstractMember {
    private Date licenseDate;

    public Trainer(String name, Date birthday, Gender gender, String address, Date licenseDate, boolean status, boolean hasInsurance)
    {
        super(name, birthday, gender, address, status, hasInsurance);

        this.licenseDate = licenseDate;
    }

    public void registerMember() {
        return; // TODO
    }
}