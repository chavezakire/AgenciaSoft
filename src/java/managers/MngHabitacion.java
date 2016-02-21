/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managers;

import java.util.List;
import services.Habitacion;

public class MngHabitacion extends Manager{

    public static List<Habitacion> findHabDisponible(int idhotel, int tipohab, java.lang.String fd, java.lang.String fh) {
        services.ServiceHabitacionPrueba_Service service = new services.ServiceHabitacionPrueba_Service();
        services.ServiceHabitacionPrueba port = service.getServiceHabitacionPruebaPort();
        return port.findHabDisponible(idhotel, tipohab, fd, fh);
    }
}