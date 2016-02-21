<%@page import="services.Habitacion"%>
<%@include file="header_page.jsp" %>
<%@page import="managers.MngHabitacion" %>  

<head>
    <script type="text/javascript"  >
        
        function findHabitacion(){
            var dpto = document.getElementById('cboDpto').value;
            var prov = document.getElementById('cboProvincia').value;
            var dist = document.getElementById('cboDistrito').value;
            var fDesde = document.getElementsByName('txtFechaDesde')[0].value;
            var fHasta = document.getElementsByName('txtFechaHasta')[0].value;
            
            if(fDesde === "" || fHasta === ""){
                alert("Ingrese un rango de fechas");
                return;
            }else{
                document.getElementById("frmHabitacion").submit();
            }            
        }
        
    </script>    
</head>

<jsp:useBean id="habitacion" scope="session" class="services.Habitacion" />

<body>
    <form id="frmHabitacion" action="ServletHabitacion" >
        <div class="container" style="width: 600px;">		
	<div class="row">
        <div class="panel panel-grey margin-bottom-40">
            <div class="panel-heading">
                <h3 class="panel-title"><i class="icon-tasks"></i>Consultar Habitación</h3>
            </div>
            <div class="panel-body">                                                      
                <!--<form class="form-inline" role="form">-->
                    <div class="input-group margin-bottom-5">
                        <span class="input-group-addon"><i class="icon-user"></i></span>
                        <select class="form-control" name="cboDpto">
                            <option value=""></option>
                            <option value="15">Lima</option>
                            <option value="7">Callao</option>
                        </select>
                    </div>  
                    <div class="input-group margin-bottom-5">
                        <span class="input-group-addon"><i class="icon-user"></i></span>
                        <select class="form-control" name="cboProvincia">
                            <option value=""></option>
                            <option value="1">Lima</option>
                            <option value="1">Callao</option>
                        </select>
                    </div>
                    <div class="input-group margin-bottom-5">
                        <span class="input-group-addon"><i class="icon-user"></i></span>
                        <select class="form-control" name="cboDistrito">
                            <option value=""></option>
                            <option value="36">San Miguel</option>
                            <option value="7">Mi Perú</option>
                        </select>
                    </div>
                    <div class="input-group margin-bottom-5">
                        <span class="input-group-addon"><i class="icon-user"></i></span>
                        <input type="text" name="txtHotel" value="<%= (habitacion.getHotel()!=null ? habitacion.getHotel() : "") %>" placeholder="Hotel" class="form-control">
                    </div>
                    <div class="input-group margin-bottom-5">
                        <span class="input-group-addon"><i class="icon-user"></i></span>
                        <select class="form-control" value="<%= (habitacion.getTipoHab() != null ? habitacion.getTipoHab() : "") %>" name="cboTipoHab">
                            <option value=""></option>
                            <option value="1">Simple</option>
                            <option value="2">Doble</option>
                            <option value="3">Triple</option>
                            <option value="4">Matrimonial</option>
                            <option value="5">Suite Junior</option>
                            <option value="6">Suite Doble</option>
                            <option value="7">Corner Suite</option>
                            <option value="8">Simple</option>
                        </select>
                    </div>
                    <div class="input-group margin-bottom-5">
                        <span class="input-group-addon"><i class="icon-user"></i></span>
                        <input type="date" name="txtFechaDesde" placeholder="Fecha Desde" class="form-control">
                    </div>
                    <div class="input-group margin-bottom-5">
                        <span class="input-group-addon"><i class="icon-user"></i></span>
                        <input type="date" name="txtFechaHasta" placeholder="Fecha Hasta" class="form-control">
                    </div>
                    <div class="col-md-7">
                        <button class="btn-u pull-right" onclick="findHabitacion();">Consultar</button>
                    </div>
                <!--</form>-->
            </div>

            <div class="panel panel-red margin-bottom-40">
                <div class="panel-heading">
                    <h3 class="panel-title"><i class="icon-user"></i>Habitaciones</h3>
                </div>
                <div class="panel-body">
                    <table class="table">
                        <thead>
                            <tr>
                                <th>#</th>
                                <th class="hidden-sm">Tipo Habitación</th>
                                <th>Fecha</th>
                                <th>Status</th>
                            </tr>
                        </thead>
                        <tbody>
                            <tr>
                                <td>1</td>
                                <td class="hidden-sm">Otto</td>
                                <td>@mdo</td>
                                <td><button class="btn btn-danger btn-xs"><i class="icon-trash"></i> Delete</button></td>
                            </tr>
                            <tr>
                                <td>2</td>
                                <td class="hidden-sm">Thornton</td>
                                <td>@fat</td>
                                <td><button class="btn btn-warning btn-xs"><i class="icon-pencil"></i> Edit</button></td>
                            </tr>
                            <tr>
                                <td>3</td>
                                <td class="hidden-sm">the Bird</td>
                                <td>@twitter</td>
                                <td><button class="btn btn-info btn-xs"><i class="icon-share"></i> Share</button></td>
                            </tr>
                            <tr>
                                <td>4</td>
                                <td class="hidden-sm">Web Design</td>
                                <td>@htmlstream</td>
                                <td><button class="btn btn-success btn-xs"><i class="icon-ok"></i> Submit</button></td>
                            </tr>
                        </tbody>
                    </table>
                </div>						
            </div>
         
        </div>
    </div><!--/row-->
</div><!--/container-->		
<!--=== End Content Part ===-->
    </form>
                            
</body>