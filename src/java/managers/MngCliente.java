package managers;

import ServiceClient.PERSONA;
import ServiceClient.WsConsultaDatos;


public class MngCliente {

    public static PERSONA consultaPersonaXML(java.lang.String tipoDoc, java.lang.String numDoc) {
        ServiceClient.WsConsultaDatos service = new ServiceClient.WsConsultaDatos();
        ServiceClient.WsConsultaDatosSoap port = service.getWsConsultaDatosSoap();
        return port.consultaPersonaXML(tipoDoc, numDoc);
    }  
    
       
}
