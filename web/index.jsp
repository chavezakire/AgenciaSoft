<%@include file="header_page.jsp" %>
<!--=== Slider ===-->
<div id="sequence-theme" class="sequence-inner">
    <div id="sequence">
        <img class="prev" src="assets/plugins/horizontal-parallax/images/bt-prev1.png" alt="Previous" />
        <img class="next" src="assets/plugins/horizontal-parallax/images/bt-next1.png" alt="Next" />
        <ul>
            <li class="animate-in">
                <div class="info"><h2>Bienvenidos a CHAMAQUITOS SAC</h2><p>Tú mejor opción para planear tus viajes. #DeTodasManeras</p></div>
                <img class="balloon" src="assets/plugins/horizontal-parallax/images/balloon.png" alt="Balloon" />
            </li>
            <li>
                <div class="info"><h2>Agencia de Viajes</h2><p>Tenemos todos los vuelos!</p></div>
                <img class="aeroplane" src="assets/plugins/horizontal-parallax/images/aeroplane.png" alt="Aeroplane" />
            </li>
            <li>
                <div class="info"><h2>Consulta habitación</h2><p>Hacemos que tus viajes sean placenteros. #Guarda</p></div>
                <img class="kite" src="assets/plugins/horizontal-parallax/images/kite.png" alt="Kite" />
            </li>
        </ul>
    </div>
</div><!--/sequence-theme-->
<!--=== End Slider ===-->

<!--=== Content Part ===-->
<div class="container"> 
    <div class="row">
        <div class="col-md-9">
            <!-- Welcome Block -->
            <div class="headline"><h2>Bienvenidos a chamaquitos SAC</h2></div>
            <div class="row">
                <div class="col-sm-4"><img class="img-responsive margin-bottom-20" src="assets/img/main/6.jpg" alt="" /></div>
                <div class="col-sm-8">
                    <p>Unify is an incredibly beautiful responsive Bootstrap Template for corporate and creative professionals. It works on all major web browsers, tablets and phone.</p>
                    <ul class="list-unstyled margin-bottom-20">
                        <li><i class="icon-ok color-green"></i> Donec id elit non mi porta gravida</li>
                        <li><i class="icon-ok color-green"></i> Corporate and Creative</li>
                        <li><i class="icon-ok color-green"></i> Responsive Bootstrap Template</li>
                        <li><i class="icon-ok color-green"></i> Corporate and Creative</li>
                    </ul>                    
                </div>
            </div>

            <blockquote class="hero-unify margin-bottom-30">
                <p>Award winning digital agency. We bring a personal and effective approach to every project we work on, which is why. Unify is an incredibly beautiful responsive Bootstrap Template for corporate professionals.</p>
                <small>CEO, Julio Castillo</small>
            </blockquote>
            <!-- //End Welcome Block -->
        </div>

        <div class="col-md-3">
            <!-- Choose Us -->            
            <div class="who margin-bottom-30">
                <div class="headline"><h3>¿Porque nosotros?</h3></div>
                <p>Contamos con la lista actualizada de todos los vuelos</p>
                <ul class="list-unstyled">
                    <li><a href="#"><i class="icon-fixed-width icon-desktop"></i>Cómodidad</a></li>
                    <li><a href="#"><i class="icon-fixed-width icon-bullhorn"></i>Rápidez</a></li>
                    <li><a href="#"><i class="icon-fixed-width icon-globe"></i>Facilidad</a></li>
                </ul>
            </div><!--/who-->                        
            <!-- //End Choose Us -->
        </div>
    </div><!--/row-->
</div><!--/container-->     
<!-- End Content Part -->

<div class="footer">
    <div class="container">
        <div class="row">
            <div class="col-md-4 md-margin-bottom-40">
                <!-- About -->
                <div class="headline"><h2>Sobre Nosotros</h2></div>
                <p class="margin-bottom-25 md-margin-bottom-40">Mofiquen pes</p>
            </div><!--/col-md-4-->	

            <div class="col-md-4 md-margin-bottom-40">
                <div class="posts">
                    <div class="headline"><h2>Noticias xD</h2></div>
                    <dl class="dl-horizontal">
                        <dt><a href="#"><img src="assets/img/sliders/elastislide/6.jpg" alt="" /></a></dt>
                        <dd>
                            <p><a href="#">Anim moon officia Unify is an incredibly beautiful responsive Bootstrap Template</a></p> 
                        </dd>
                    </dl>
                </div>
            </div><!--/col-md-4-->

            <div class="col-md-4">
                <div class="headline"><h2>Contactanos</h2></div>	
                <address class="md-margin-bottom-40">
                    MZ N7 <br />
                    Mi PERU LA H<br />
                    Phone: 777 <br />
                    Fax: No tenemos <br />
                    Email: <a href="mailto:info@utaq.com" class="">queestarepagando@distri.com</a>
                </address>
            </div><!--/col-md-4-->
        </div><!--/row-->	
    </div><!--/container-->	
</div><!--/footer-->	
<!--=== End Footer ===-->

<!--=== Copyright ===-->
<div class="copyright">
    <div class="container">
        <div class="row">
            <div class="col-md-6"><p class="copyright-space">2016 &copy; Chamo. ALL Rights Reserved. UPC</p></div>
            <div class="col-md-6"><a href="index.jsp"><img id="logo-footer" src="assets/img/logo2-default.png" class="pull-right" alt="" /></a></div>
        </div><!--/row-->
    </div><!--/container-->	
</div><!--/copyright-->	
<!--=== End Copyright ===-->

<!-- JS Global Compulsory -->           
<script type="text/javascript" src="assets/plugins/jquery-1.10.2.min.js"></script>
<script type="text/javascript" src="assets/plugins/jquery-migrate-1.2.1.min.js"></script>
<script type="text/javascript" src="assets/plugins/bootstrap/js/bootstrap.min.js"></script> 
<script type="text/javascript" src="assets/plugins/hover-dropdown.min.js"></script> 
<script type="text/javascript" src="assets/plugins/back-to-top.js"></script>
<!-- JS Implementing Plugins -->           
<script type="text/javascript" src="assets/plugins/flexslider/jquery.flexslider-min.js"></script>
<script type="text/javascript" src="assets/plugins/horizontal-parallax/js/sequence.jquery-min.js"></script>
<script type="text/javascript" src="assets/plugins/horizontal-parallax/js/horizontal-parallax.js"></script>
<script type="text/javascript" src="assets/plugins/bxslider/jquery.bxslider.js"></script>
<!-- JS Page Level -->           
<script type="text/javascript" src="assets/js/app.js"></script>
<script type="text/javascript">
    jQuery(document).ready(function () {
        App.init();
        App.initSliders();
        App.initBxSlider();
    });
</script>
</body>
</html>	