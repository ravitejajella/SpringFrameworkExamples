package demo;

import org.springframework.stereotype.Component;

@Component
public class Teacher implements Staff{

    private String qualification;
    public Address address;


    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void teaching (){
           System.out.println("Teaching");
       }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }


}
