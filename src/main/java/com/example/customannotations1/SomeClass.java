package com.example.customannotations1;

public class SomeClass {

    @FieldCustomValue
    private String lineDefault;

    @FieldCustomValue(value = "Hello World!")
    private String lineCustom;


    public String getLineDefault() {
        return lineDefault;
    }

    public void setLineDefault(String lineDefault) {
        this.lineDefault = lineDefault;
    }

    public String getLineCustom() {
        return lineCustom;
    }

    public void setLineCustom(String lineCustom) {
        this.lineCustom = lineCustom;
    }
}
