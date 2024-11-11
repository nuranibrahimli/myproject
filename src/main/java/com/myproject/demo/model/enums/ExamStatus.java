package com.myproject.demo.model.enums;

public enum ExamStatus {
    NOT_STARTED("YELLOW"),
    COMPLETED_SUCCESS("GREEN"),
    COMPLETED_FAIL("RED");

    private final String color;

    ExamStatus(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
