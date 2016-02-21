<%@page import="ServiceClient.PERSONA"%>
<%@page import="managers.MngCliente"%>
<head>
    <title>Agencias</title>

    <!-- Meta -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">

    <!-- CSS Global Compulsory-->
    <link rel="stylesheet" href="assets/plugins/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="assets/css/style.css">
    <link rel="stylesheet" href="assets/css/headers/header1.css">
    <link rel="stylesheet" href="assets/css/responsive.css">
    <link rel="shortcut icon" href="favicon.ico">        
    <!-- CSS Implementing Plugins -->    
    <link rel="stylesheet" href="assets/plugins/font-awesome/css/font-awesome.css">
    <link rel="stylesheet" href="assets/plugins/flexslider/flexslider.css" type="text/css" media="screen"> 
    <link rel="stylesheet" href="assets/plugins/bxslider/jquery.bxslider.css">             
    <link rel="stylesheet" href="assets/plugins/horizontal-parallax/css/horizontal-parallax.css">
    <!-- CSS Page Style -->    
    <link rel="stylesheet" href="assets/css/pages/page_promo.css">
    <!-- CSS Theme -->    
    <link rel="stylesheet" href="assets/css/themes/default.css" id="style_color">
    <link rel="stylesheet" href="assets/css/themes/headers/default.css" id="style_color-header-1">  

</head> 

<body>
    <!--=== Top ===-->    
    <div class="top">
        <div class="container">         
            <ul class="loginbar pull-right">
                <li><i class="icon-globe"></i></li>
                <li><a href="page_login.jsp">Iniciar Sesión</a></li>
            </ul>
        </div>      
    </div><!--/top-->
    <!--=== End Top ===-->    

    <!--=== Header ===-->    
    <div class="header">
        <div class="navbar navbar-default" role="navigation">
            <div class="container">
                <!-- Brand and toggle get grouped for better mobile display -->
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-responsive-collapse">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a class="navbar-brand" href="index.html">
                        <img id="logo-header" src="assets/img/logo1-default.png" alt="Logo">
                    </a>
                </div>

                <!-- Collect the nav links, forms, and other content for toggling -->
                <div class="collapse navbar-collapse navbar-responsive-collapse">
                    <ul class="nav navbar-nav navbar-right">
                        <li class="dropdown">
                            <a href="index.jsp" data-hover="dropdown" data-delay="0" data-close-others="false">INICIO</a>
                        </li>
                        <li class="dropdown">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown" data-hover="dropdown" data-delay="0" data-close-others="false">CONSULTAR<i class="icon-angle-down"></i>
                            </a>
                            <ul class="dropdown-menu">
                                <li><a href="consultarHabitacion.jsp">Consultar Habitación</a></li>
                                <li><a href="ver_vuelos.jsp">Consultar vuelos</a></li>
                            </ul>
                        </li>
                        <li class="dropdown">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown" data-hover="dropdown" data-delay="0" data-close-others="false">Features<i class="icon-angle-down"></i>
                            </a>
                            <ul class="dropdown-menu">
                                <li><a href="feature_grid.html">Grid Layout</a></li>
                                <li><a href="feature_boxes.html">Content Boxes</a></li>
                                <li><a href="feature_typography.html">Typography</a></li>
                                <li><a href="feature_tagline_boxes.html">Tagline Boxes</a></li>
                                <li><a href="feature_buttons.html">Buttons</a></li>
                                <li><a href="feature_icons.html">Icons</a></li>
                                <li><a href="feature_thumbails.html">Thumbails</a></li>
                                <li><a href="feature_components.html">Components</a></li>
                                <li><a href="feature_accardion_and_tabs.html">Accardion and Tabs</a></li>
                                <li><a href="feature_navigations.html">Navigations</a></li>
                                <li><a href="feature_tables.html">Tables</a></li>
                                <li><a href="feature_forms.html">Forms</a></li>
                                <li><a href="feature_testimonials.html">Testimonials</a></li>
                            </ul>
                        </li>
                        <li class="dropdown"><a href="contact.jsp" >CONTACTO</a></li>
                    </ul>
                </div><!-- /navbar-collapse -->
            </div>    
        </div>    
    </div><!--/header-->
    <!--=== End Header ===-->    
</body>
