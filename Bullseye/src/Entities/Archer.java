package Entities;

import Entities.Abstracts.AbstractMember;
import Utils.Gender;
import Utils.MemberStatus;
import java.util.Date;

public class Archer extends AbstractMember {
    public Archer(String firstname, String lastname, Date birthday, Gender gender, String address, MemberStatus status, boolean isActive, boolean hasInsurance) {
        super(firstname, lastname, birthday, gender, address, status, isActive, hasInsurance);
    }
}
