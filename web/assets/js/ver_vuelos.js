$(function (e) {
    $.ajax({
        type: "GET",
        url: 'http://localhost:8000/vuelos/',
        crossDomain: true,
        //async: false,//jsonpCallback: 'jsonpCallback',
        dataType: 'json',
        contentType: "application/json",
        success: function (data, textStatus, jqXHR) {
            var item = 0;
            var row = "";
            $.each(data, function () {
                row = "<tr id=\"pedido_" + (item + 1) + "\">" +
                        "<td>" + data[item].id_vuelo + "</td>" +
                        "<td>" + data[item].ind_capacidad + " pasajeros</td>" +
                        "<td>" + data[item].des_modelo_avion + "</td>" +
                        "<td>" + data[item].num_vuelo + "</td>" +
                        "<td> S/." + data[item].num_precio + "</td>" +
                        "<td>TACA</td>" +
                        "<td>" + data[item].id_itinirario + "</td>";
                $(row).appendTo("#tablaPedidos tbody");
                item++;
            });
        },
        error: function (jqXHR, textStatus, errorThrown) {
            alert('hubo un error, asegurese de haber pagado su pensión');
        }
    });

});