package demo;

import org.springframework.stereotype.Component;

@Component
public class Address {

    private String phoneNumber;
    private String colony;

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getColony() {
        return colony;
    }

    public void setColony(String colony) {
        this.colony = colony;
    }

    @Override
    public String toString() {
        return "Address{" +
                "phoneNumber='" + phoneNumber + '\'' +
                ", colony='" + colony + '\'' +
                '}';
    }
}
