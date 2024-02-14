package Entities;

import Entities.Abstracts.AbstractMember;
import Utils.Gender;
import Utils.MemberStatus;
import java.util.Date;

public class Archer extends AbstractMember {
    public Archer(String name, Date birthday, Gender gender, String address, MemberStatus status, boolean isActive, boolean hasInsurance) {
        super(name, birthday, gender, address, status, isActive, hasInsurance);
    }
}
