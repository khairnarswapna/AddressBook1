package com.Model;

import java.util.List;

public class Person {

    private String firstname;
    private String lastname;
    private Address addressObj;
    private String mobileNO;

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Address getAddressObj() {
        return addressObj;
    }

    public void setAddressObj(Address addressObj) {
        this.addressObj = addressObj;
    }

    public String getMobileNO() {
        return mobileNO;
    }

    public void setMobileNO(String  mobileNO) {
        this.mobileNO = mobileNO;
    }


}
