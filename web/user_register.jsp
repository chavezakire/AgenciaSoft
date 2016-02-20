<%@page import="ServiceClient.PERSONA"%>
<%@include file="header_page.jsp" %>
<%@page import="managers.MngCliente" %>  


<head>
    <script type="text/javascript"  >
        
        function findPeople(){
            var dni = document.getElementsByName('txtDni')[0].value;
                    
            if(dni.length == 8){                
                document.getElementById("frmPersona").submit();
            }
        }
        
    </script>
    
</head>
<jsp:useBean id="persona" scope="session" class="ServiceClient.PERSONA" />
<body>
    
    <form id="frmPersona" action="ServletPersona" >
        
<div class="container">		
	<div class="row">
        <div class="col-md-4 col-md-offset-4 col-sm-6 col-sm-offset-3">

                <div class="reg-header">            
                    <h2>Registrate</h2>
                </div>
                <div class="input-group margin-bottom-20">
                    <span class="input-group-addon"><i class="icon-user"></i></span>
                    <input type="text" name="txtDni" id="txtDni" placeholder="DNI" class="form-control" value="<%= (persona.getNUMDOCUMENTO()!=null ? persona.getNUMDOCUMENTO() : "") %>" onkeyup="findPeople()" >
                </div>   
                <div class="input-group margin-bottom-20">
                    <span class="input-group-addon"><i class="icon-user"></i></span>
                    <input type="text" placeholder="Nombres" id="id_Nombres" value="<%= (persona.getNOMBRES()!=null ? persona.getNOMBRES() : "") %>" class="form-control">
                </div>                    
                <div class="input-group margin-bottom-20">
                    <span class="input-group-addon"><i class="icon-user"></i></span>
                    <input type="text" placeholder="Apellido Paterno" value="<%= (persona.getAPEPATERNO()!=null ? persona.getAPEMATERNO() : "") %>" class="form-control">
                </div>
                <div class="input-group margin-bottom-20">
                    <span class="input-group-addon"><i class="icon-user"></i></span>
                    <input type="text" placeholder="Fecha de Nacimiento" value="<%= (persona.getFECNACIMIENTO()!=null ? persona.getFECNACIMIENTO() : "") %>" class="form-control">
                </div>
                <div class="input-group margin-bottom-20">
                    <span class="input-group-addon"><i class="icon-user"></i></span>
                    <input type="text" placeholder="Sexo" value="<%= (persona.getCODSEXO()!=null ? persona.getCODSEXO() : "") %>" class="form-control">
                </div>
                <div class="input-group margin-bottom-20">
                    <span class="input-group-addon"><i class="icon-user"></i></span>
                    <input type="text" placeholder="Departamento" value="<%= (persona.getDESDEPARTAMENTO()!=null ? persona.getDESDEPARTAMENTO() : "") %>" class="form-control">
                </div>  
                <div class="input-group margin-bottom-20">
                    <span class="input-group-addon"><i class="icon-user"></i></span>
                    <input type="text" placeholder="Provincia" value="<%= (persona.getDESPROVINCIA()!=null ? persona.getDESPROVINCIA() : "") %>" class="form-control">
                </div>
                <div class="input-group margin-bottom-20">
                    <span class="input-group-addon"><i class="icon-user"></i></span>
                    <input type="text" placeholder="Distrito" value="<%= (persona.getDESDISTRITO()!=null ? persona.getDESDISTRITO() : "") %>" class="form-control">
                </div>
                <div class="input-group margin-bottom-20">
                    <span class="input-group-addon"><i class="icon-user"></i></span>
                    <input type="text" placeholder="Direccion" value="<%= (persona.getDIRECCION()!=null ? persona.getDIRECCION() : "") %>" class="form-control">
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

</form>

</body>