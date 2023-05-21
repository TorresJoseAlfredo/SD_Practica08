/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/WebServices/WebService.java to edit this template
 */
package SDCALC;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Jose Alfredo
 */
@WebService(serviceName = "TRANSWebService")
public class TRANSWebService {


    /**
     * Web service operation
     */
    @WebMethod(operationName = "Pagar")
    public Boolean Pagar(@WebParam(name = "numero_tarjeta") String numero_tarjeta, @WebParam(name = "monto") float monto, @WebParam(name = "nombre") String nombre, @WebParam(name = "c\u00f3digo_CVV") String código_CVV) {
        //TODO write your implementation code here:
        return null;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "Comprar")
    public Boolean Comprar(@WebParam(name = "id_producto") String id_producto, @WebParam(name = "precio") float precio, @WebParam(name = "numero_productos") int numero_productos, @WebParam(name = "total") float total) {
        //TODO write your implementation code here:
        return null;
    }    
}
