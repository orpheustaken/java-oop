package com.github.orpheustaken.javaoop.introduction.oop.T11Enumeration.domain;

import org.jetbrains.annotations.Nullable;

public enum CustomerType {
    // Inside an Enumeration everything is a final (CONSTANT).
//    INDIVIDUAL,
//    COMPANY

    // Enumerations can be treated like an object and have values passed to them.
    INDIVIDUAL(1, "Individual"),
    COMPANY(2, "Company"),
    STARTUP(3, "Startup");

    // The enum attributes are going to be assigned automatically by itself.
    // This is useful for storing indexes in the database, for example.

    // To do this the constructor is to be customized, such as below.

    // It's a final so no problem in being public.
    private final int DATABASE_INDEX;
    private final String REPORT_VALUE;

    // THE CONSTRUCTOR CANNOT BE CALLED DIRECTLY BUT RATHER BY THE ENUM ITSELF.
    // private by default.
    CustomerType(int databaseIndex, String reportValue) {
        this.DATABASE_INDEX = databaseIndex;
        this.REPORT_VALUE = reportValue;
    }

    // Return enumeration by specific value based on a String input.
    public static CustomerType getByReportValue(String reportValue) {
        for (CustomerType customerType : values()) {
            if (customerType.getREPORT_VALUE().equalsIgnoreCase(reportValue)) {
                return customerType;
            }
        }
        return null;
    }

    public int getDATABASE_INDEX() {
        return DATABASE_INDEX;
    }

    public String getREPORT_VALUE() {
        return REPORT_VALUE;
    }
}
