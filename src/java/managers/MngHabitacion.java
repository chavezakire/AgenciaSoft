/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managers;

import services.*;

public class MngHabitacion extends Manager{

    public static java.util.List<services.Habitacion> findHabDisponible(int idhotel, int tipohab, java.lang.String fd, java.lang.String fh) {
        services.ServiceHabitacion3_Service service = new services.ServiceHabitacion3_Service();
        services.ServiceHabitacion3 port = service.getServiceHabitacion3Port();
        return port.findHabDisponible(idhotel, tipohab, fd, fh);
    }
    
}