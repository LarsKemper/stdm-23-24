package Entities;

import Entities.Abstracts.AbstractMember;
import Utils.Gender;
import java.util.Date;

public class Archer extends AbstractMember {
    public Archer(String name, Date birthday, Gender gender, String address, boolean status, boolean hasInsurance) {
        super(name, birthday, gender, address, status, hasInsurance);
    }
}
