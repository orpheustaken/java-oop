package com.github.orpheustaken.javaoop.introduction.oop.T11Enumeration.domain;

public enum PaymentType {
//    DEBIT,
//    CREDIT

    // Given the Payment Type, apply a discount of 10 or 5 per cent.
    DEBIT {
        @Override
        public double calculateDiscount(double value) {
            return value * 0.1;
        }
    },
    CREDIT {
        @Override
        public double calculateDiscount(double value) {
            return value * 0.05;
        }
    };

    // Abstract methods state that they must be Overridden.
    // Only the signature is defined, and it must be Overriden by each context, in this case the enum value.

    // Also, this is already and example of Polymorphism.
    public abstract double calculateDiscount(double value);
}
