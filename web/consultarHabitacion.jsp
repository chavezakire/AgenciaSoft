<%@include file="header_page.jsp" %>
<%@page import="managers.MngCliente" %>  
<body>
    <script type="text/javascript">
        
        function findPeople(dni){
        <%
            MngCliente mngCli = new MngCliente();
            mngCli.consultaPersonaXML("DNI","74167957");  
        %>               
        }
        
    </script>
    <div class="container" style="width: 600px;">		
	<div class="row">
        <div class="panel panel-grey margin-bottom-40">
            <div class="panel-heading">
                <h3 class="panel-title"><i class="icon-tasks"></i>Consultar Habitación</h3>
            </div>
            <div class="panel-body">                                                      
                <form class="form-inline" role="form">
                    <div class="input-group margin-bottom-5">
                        <span class="input-group-addon"><i class="icon-user"></i></span>
                        <input type="" placeholder="DNI" class="form-control" onkeydown="findPeople(this.value)" >
                    </div>   
                    <div class="input-group margin-bottom-5">
                        <span class="input-group-addon"><i class="icon-user"></i></span>
                        <select class="form-control">
                            <option value=""></option>
                            <option value="Lima">Lima</option>
                            <option value="Callao">Callao</option>
                        </select>
                    </div>  
                    <div class="input-group margin-bottom-5">
                        <span class="input-group-addon"><i class="icon-user"></i></span>
                        <select class="form-control">
                            <option value=""></option>
                            <option value="Lima">Lima</option>
                            <option value="Callao">Callao</option>
                        </select>
                    </div>
                    <div class="input-group margin-bottom-5">
                        <span class="input-group-addon"><i class="icon-user"></i></span>
                        <select class="form-control">
                            <option value=""></option>
                            <option value="San Miguel">San Miguel</option>
                            <option value="Mi Perú">Mi Perú</option>
                        </select>
                    </div>
                    <div class="input-group margin-bottom-5">
                        <span class="input-group-addon"><i class="icon-user"></i></span>
                        <input type="text" placeholder="Hotel" class="form-control">
                    </div>
                    <div class="input-group margin-bottom-5">
                        <span class="input-group-addon"><i class="icon-user"></i></span>
                        <select class="form-control">
                            <option value=""></option>
                            <option value="Matrimonial">Matrimonial</option>
                            <option value="Simple">Simple</option>
                        </select>
                    </div>
                    <div class="input-group margin-bottom-5">
                        <span class="input-group-addon"><i class="icon-user"></i></span>
                        <input type="date" placeholder="Fecha Desde" class="form-control">
                    </div>
                    <div class="input-group margin-bottom-5">
                        <span class="input-group-addon"><i class="icon-user"></i></span>
                        <input type="date" placeholder="Fecha Hasta" class="form-control">
                    </div>
                    <div class="col-md-7">
                        <button class="btn-u pull-right" onclick="pruebas();">Consultar</button>
                    </div>
                </form>
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

</body>