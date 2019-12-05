package com;

import com.Model.AddressBook;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class AddressBookTest {

    //String JsonFilePath="/home/admin142/eclipse-workspace/AddressBook/src/test/resources/book.json";
    @Test
    public void givenPersonInformation_InProperFormat_ShouldReturnOne() throws IOException {
        AddressBook obj = new AddressBook();
        obj.readAddressBook("/home/admin142/eclipse-workspace/AddressBook/src/test/resources/book.json");
        int result=obj.addPerson("Swapna","patil","G T B  Colony,Old Dhule","dhule","MH","431203","9505205070");
        Assert.assertEquals(1,result);
    }
}
