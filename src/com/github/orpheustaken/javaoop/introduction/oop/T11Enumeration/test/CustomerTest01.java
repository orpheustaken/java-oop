package com.github.orpheustaken.javaoop.introduction.oop.T11Enumeration.test;

import com.github.orpheustaken.javaoop.introduction.oop.T11Enumeration.domain.Customer;
import com.github.orpheustaken.javaoop.introduction.oop.T11Enumeration.domain.CustomerType;
import com.github.orpheustaken.javaoop.introduction.oop.T11Enumeration.domain.PaymentType;

public class CustomerTest01 {
    public static void main(String[] args) {
        Customer customer1 = new Customer("Michael Scott", PaymentType.DEBIT, CustomerType.INDIVIDUAL);
        Customer customer2 = new Customer("Dunder Mifflin", PaymentType.CREDIT, CustomerType.COMPANY);
        Customer customer3 = new Customer("Bannered Mare", PaymentType.DEBIT, CustomerType.STARTUP);

        System.out.println(customer1);
        System.out.println(customer2);
        System.out.println(customer3);

        System.out.println(PaymentType.DEBIT.calculateDiscount(100));
        System.out.println(PaymentType.CREDIT.calculateDiscount(100));

        // Get enumeration by specific value based on a String input.
        // In this case by the enum REPORT_VALUE attribute that is automatically assigned.

        // values() and valueOf() are inherited by the Enumeration class.
        // values() returns an array with all elements of the Enum.
        // valueOf() returns the enum constant of this type with the specified name. The string must match exactly.

        // Exception error if the value doesn't match exactly.
//        CustomerType customerType = CustomerType.valueOf("INDIVIDUAL");

        CustomerType customerType = CustomerType.getByReportValue("company");

        System.out.println(customerType);
    }
}
