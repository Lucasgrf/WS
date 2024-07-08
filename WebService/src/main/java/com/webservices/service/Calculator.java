package com.webservices.service;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;
import jakarta.jws.soap.SOAPBinding;

@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface Calculator {
    @WebMethod
    double add(double a, double b);
    @WebMethod
    double sub(double a, double b);
    @WebMethod
    double div(double a, double b);
    @WebMethod
    double multi(double a, double b);
}
