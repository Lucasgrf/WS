package com.service.client;

import jakarta.xml.ws.Service;
import jakarta.xml.ws.WebServiceException;

import javax.xml.namespace.QName;
import java.net.MalformedURLException;
import java.net.URL;

public class ServerUtil {
    public static Service getConnection(){
        Service service = null;
        try {
            URL url = new URL("http://localhost/8085/service/calculator?wsdl");
            QName qname = new QName("http://service.webservices.com/", "CalculatorImplementsService");
            service = Service.create(url, qname);
        } catch (MalformedURLException e) {
            e.printStackTrace();
            System.out.println("Wrong URL: " + e.getMessage());
        }catch (WebServiceException e){
            e.printStackTrace();
            System.out.println("WebServiceException: " + e.getMessage());
        }
        return service;
    }
}
