package models;

import enums.memberStatus;
import javax.persistence.*;
import java.util.Date;

@Entity
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;

    @Enumerated(EnumType.STRING)
    private memberStatus memberStatus;
    private Date renewalDate;


    public Member() {
    }

    public Member(String name, memberStatus memberStatus, Date renewalDate) {
        this.name = name;
        this.memberStatus = memberStatus;
        this.renewalDate = renewalDate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public memberStatus getMemberStatus() {
        return memberStatus;
    }

    public void setMemberStatus(memberStatus memberStatus) {
        this.memberStatus = memberStatus;
    }

    public Date getRenewalDate() {
        return renewalDate;
    }

    public void setRenewalDate(Date renewalDate) {
        this.renewalDate = renewalDate;
    }
}
