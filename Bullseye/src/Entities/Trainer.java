package Entities;

import Entities.Abstracts.AbstractMember;
import Utils.Gender;
import java.util.Date;

public class Trainer extends AbstractMember {
    private boolean license;

    public Trainer(String name, Date birthday, Gender gender, String address, boolean license, boolean status, boolean hasInsurance)
    {
        super(name, birthday, gender, address, status, hasInsurance);

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