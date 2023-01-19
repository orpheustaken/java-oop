package com.github.orpheustaken.javaoop.introduction.oop.T11Enumeration.domain;

// Can have any Access Modifier.
public class Customer {
    // Enumerations can be declared in a specific class, or inside an existing one.
    // But they still must be defined as an attribute for the existing class.
//    public enum PaymentType {
//        DEBIT, CREDIT
//    }

    private String name;
    private PaymentType paymentType;
    private CustomerType customerType;

    public Customer(String name, PaymentType paymentType, CustomerType customerType) {
        this.name = name;
        this.paymentType = paymentType;
        this.customerType = customerType;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", paymentType=" + paymentType +
                ", customerType=" + customerType +
                ", customerTypeDatabaseIndex=" + customerType.getDATABASE_INDEX() +
                ", customerTypeReportValue=" + customerType.getREPORT_VALUE() +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PaymentType getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(PaymentType paymentType) {
        this.paymentType = paymentType;
    }

    public CustomerType getCustomerType() {
        return customerType;
    }

    public void setCustomerType(CustomerType customerType) {
        this.customerType = customerType;
    }
}
