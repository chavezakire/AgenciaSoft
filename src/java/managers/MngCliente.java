package managers;

import ServiceClient.PERSONA;
import ServiceClient.WsConsultaDatos;
import java.sql.SQLException;

public class MngCliente extends Manager{

    public static PERSONA consultaPersonaXML(java.lang.String tipoDoc, java.lang.String numDoc) {
        ServiceClient.WsConsultaDatos service = new ServiceClient.WsConsultaDatos();
        ServiceClient.WsConsultaDatosSoap port = service.getWsConsultaDatosSoap();
        return port.consultaPersonaXML(tipoDoc, numDoc);
    }  
    
    public boolean saveUser(String dni, String nombre, String paterno, String materno, String nacimiento, String sexo, String departamento, 
                        String provincia, String distrito, String direccion, String user, String password) throws SQLException {

        if (!dni.equals("")) {
            try {
                String sql = "";
                sql = "";
                stmt.execute(sql);
                return true;
            } catch (SQLException e) {
                throw new SQLException("No accedio");
            } finally {
                if (stmt != null) {
                    try {
                        stmt.close();
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }
            }
        } else {
            throw new SQLException("No guardo!");
        }
    }
 }  
    
