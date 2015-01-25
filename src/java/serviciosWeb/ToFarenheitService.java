/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package serviciosWeb;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Carlos Rojas
 */
@WebService(serviceName = "ToFarenheitService")
public class ToFarenheitService {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "aFarenheit")
    public double aFarenheit(@WebParam(name = "celsius") double celsius) {
        //TODO write your implementation code here:
        return celsius*1.8+32.0;
    }
}
