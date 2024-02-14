package Entities.Abstracts;

import Utils.Gender;
import java.util.Date;

public abstract class AbstractMember {
    private String name;
    private Date birthday;
    private Gender gender;
    private String address;
    private boolean status;
    private boolean hasInsurance;
    
    public AbstractMember(String name, Date birthday, Gender gender, String address, boolean status, boolean hasInsurance) {
        this.name = name;
        this.birthday = birthday;
        this.gender = gender;
        this.address = address;
        this.status = status;
        this.hasInsurance = hasInsurance;
    }

    public String getName() {
        return this.name;
    }

    public Date getBirthday() {
        return this.birthday;
    }

    public Gender getGender() {
        return this.gender;
    }

    public String getAddress() {
        return this.address;
    }

    public boolean getStatus() {
        return this.status;
    }

    public boolean getHasInsurance() {
        return this.hasInsurance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void setHasInsurance(boolean hasInsurance) {
        this.hasInsurance = hasInsurance;
    }
}