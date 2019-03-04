package site.bulibucai.springjdbcdemo;

import lombok.Data;

@Data
public class Customer {
    private Long id;
    private String firstName;
    private String lastName;

    public Customer(Long id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return String.format("Customer[id=%d, firstName='%s', lastName='%s']",
                id, firstName, lastName);
    }
}
