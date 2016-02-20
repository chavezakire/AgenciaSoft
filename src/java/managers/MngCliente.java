package managers;

import ServiceClient.PERSONA;
import ServiceClient.WsConsultaDatos;

public class MngCliente {

    public static PERSONA consultaPersonaXML(java.lang.String tipoDoc, java.lang.String numDoc) {
        ServiceClient.WsConsultaDatos service = new ServiceClient.WsConsultaDatos();
        ServiceClient.WsConsultaDatosSoap port = service.getWsConsultaDatosSoap();
        return port.consultaPersonaXML(tipoDoc, numDoc);
    }  
    
    
    //public String saveUser(String dni, String nombre, String paterno, String materno, String nacimiento, String sexo, String departamento, 
                        //String provincia, String distrito, String direccion, String user, String password){
        
        //try {
        //    String sql = "";
        //    sql = "";
        //    stmt.execute(sql);
        //    return true;
        //} catch (Exception e) {
        //}
    //}
       
}
