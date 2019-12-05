package com.Model;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AddressBook {

    private List<Person> personList;
    private String fileName;
    ObjectMapper objectmapper = new ObjectMapper();
    public int addPerson(String firstname, String lastname, String address, String city, String state, String zip,String mobileNo) throws IOException {
        Person personObj = new Person();
        personObj.setFirstname(firstname);
        personObj.setLastname(lastname);
        Address addressObj=new Address();
        addressObj.setAddress(address);
        addressObj.setCity(city);
        addressObj.setState(state);
        addressObj.setZip(zip);
        personObj.setAddressObj(addressObj);
        personObj.setMobileNO(mobileNo);
        personList.add(personObj);
        writeToJsonFile(personList);
        return 1;
    }
    public void writeToJsonFile(List<Person> personList) throws IOException {
        objectmapper.writeValue(new File(this.fileName),personList);
    }
    public void readAddressBook(String filename) throws IOException {
        this.fileName=filename;
        this.personList = objectmapper.readValue(new File(this.fileName),new TypeReference<List<Person>>(){});

    }

}
