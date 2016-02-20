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
<div class="container">		
	<div class="row">
        <div class="col-md-4 col-md-offset-4 col-sm-6 col-sm-offset-3">

                <div class="reg-header">            
                    <h2>Registrate</h2>
                </div>
                <div class="input-group margin-bottom-20">
                    <span class="input-group-addon"><i class="icon-user"></i></span>
                    <input type="text" placeholder="DNI" class="form-control" onkeydown="findPeople(this.value)" >
                </div>   
                <div class="input-group margin-bottom-20">
                    <span class="input-group-addon"><i class="icon-user"></i></span>
                    <input type="text" placeholder="Nombres" class="form-control">
                </div>                    
                <div class="input-group margin-bottom-20">
                    <span class="input-group-addon"><i class="icon-user"></i></span>
                    <input type="text" placeholder="Apellido Paterno" class="form-control">
                </div>
                <div class="input-group margin-bottom-20">
                    <span class="input-group-addon"><i class="icon-user"></i></span>
                    <input type="text" placeholder="Fecha de Nacimiento" class="form-control">
                </div>
                <div class="input-group margin-bottom-20">
                    <span class="input-group-addon"><i class="icon-user"></i></span>
                    <input type="text" placeholder="Sexo" class="form-control">
                </div>
                <div class="input-group margin-bottom-20">
                    <span class="input-group-addon"><i class="icon-user"></i></span>
                    <input type="text" placeholder="Departamento" class="form-control">
                </div>  
                <div class="input-group margin-bottom-20">
                    <span class="input-group-addon"><i class="icon-user"></i></span>
                    <input type="text" placeholder="Provincia" class="form-control">
                </div>
                <div class="input-group margin-bottom-20">
                    <span class="input-group-addon"><i class="icon-user"></i></span>
                    <input type="text" placeholder="Distrito" class="form-control">
                </div>
                <div class="input-group margin-bottom-20">
                    <span class="input-group-addon"><i class="icon-user"></i></span>
                    <input type="text" placeholder="Direccion" class="form-control">
                </div>

                <div class="row">
                    <div class="col-md-6">
                                           
                    </div>
                    <div class="col-md-6">
                        <button class="btn-u pull-right" onclick="pruebas();">Registrar</button>                        
                    </div>
                </div>

                <hr>
         
        </div>
    </div><!--/row-->
</div><!--/container-->		
<!--=== End Content Part ===-->

</body>