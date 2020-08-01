package com.example.lab6;

public class Constants {
    public final static String SOAP_ACTION = "http://www.w3schools.com/xml/";
    public final static String NAME_SPACE = "http://www.w3schools.com/xml/";
    public final static String URL = "http://www.w3schools.com/xml/tempconvert.asmx?WSDL";
    public final static String F_TO_C_METHOD_NAME = "FahrenheitToCelsius";
    public final static String C_TO_F_METHOD_NAME = "CelsiusToFahrenheit";
    public final static String F_TO_C_SOAP_ACTION = SOAP_ACTION + F_TO_C_METHOD_NAME;
    public final static String C_TO_F_SOAP_ACTION = SOAP_ACTION + C_TO_F_METHOD_NAME;
}
