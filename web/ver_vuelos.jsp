<%@include file="header_page.jsp" %>
<div class="container">
    <h1>Lista de vuelos Internacionales y nacionales <span class="glyphicon glyphicon-thumbs-up"></span> </h1>

    <div class="table-responsive" id="div_mostrarConsulta">
        <table border="0" class="table table-hover" id="tablaPedidos">
            <thead>
                <tr>                            
                    <th width="40" scope="col">Code_Vuelo</th>
                    <th width="200" scope="col">Capacidad</th>
                    <th width="30" scope="col">Descripción del Avión</th>		    	
                    <th width="10" scope="col">Num. Vuelo</th>		    	
                    <th width="10" scope="col">Precio</th>	    
                    <th width="10" scope="col">Compania</th>	    
                    <th width="10" scope="col">Itinerario</th>	    
                </tr>
            </thead>
            <tbody></tbody>
        </table>
    </div>

</div>
</body>
<%@include file="footer_page.jsp" %>
<script src="assets/js/ver_vuelos.js"></script>
