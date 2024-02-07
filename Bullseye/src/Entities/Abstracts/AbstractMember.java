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
}