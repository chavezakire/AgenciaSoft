/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managers;

import java.util.List;
import services.*;

public class MngReserva extends Manager{

    public static List<Reserva> historialReservaCliente(java.lang.String dni) {
        services.ServiceReserva2_Service service = new services.ServiceReserva2_Service();
        services.ServiceReserva2 port = service.getServiceReserva2Port();
        return port.historialReservaCliente(dni);
    }

    public static boolean addReserva(int habitacion, java.lang.String fecini, java.lang.String fecfin, float venta, java.lang.String cliente) {
        services.ServiceReserva2_Service service = new services.ServiceReserva2_Service();
        services.ServiceReserva2 port = service.getServiceReserva2Port();
        return port.addReserva(habitacion, fecini, fecfin, venta, cliente);
    }
}