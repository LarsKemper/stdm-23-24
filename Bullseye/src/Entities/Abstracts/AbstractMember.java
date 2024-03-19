package Entities.Abstracts;

import Utils.Interfaces.Identifiable;
import Utils.Gender;
import Utils.MemberStatus;
import java.util.Date;

public abstract class AbstractMember implements Identifiable {
    protected int id;
    private String firstname;
    private String lastname;
    private Date birthday;
    private Gender gender;
    private String address;
    private MemberStatus status;
    private boolean isActive;
    private boolean hasInsurance;
    
    public AbstractMember(String firstname, String lastname, Date birthday, Gender gender, String address, MemberStatus status, boolean isActive, boolean hasInsurance) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.birthday = birthday;
        this.gender = gender;
        this.address = address;
        this.status = status;
        this.hasInsurance = hasInsurance;
    }

    @Override
    public int getId() {
        return this.id;
    }

    public String getFirstname() {
        return this.firstname;
    }

    public String getLastname() {
        return this.lastname;
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
    
    public MemberStatus getStatus() {
        return this.status;
    }

    public boolean getIsActive() {
        return this.isActive;
    }

    public boolean getHasInsurance() {
        return this.hasInsurance;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFirstname(String name) {
        this.firstname = name;
    }
    
    public void setLasttname(String name) {
        this.lastname = name;
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

    public void setStatus(MemberStatus status) {
        this.status = status;
    }
    
    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }

    public void setHasInsurance(boolean hasInsurance) {
        this.hasInsurance = hasInsurance;
    }
}