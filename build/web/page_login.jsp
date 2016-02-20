<!DOCTYPE html>
<!--[if IE 8]> <html lang="en" class="ie8"> <![endif]-->  
<!--[if IE 9]> <html lang="en" class="ie9"> <![endif]-->  
<!--[if !IE]><!--> <html lang="en"> <!--<![endif]-->  

    <%@include file="header_page.jsp" %>

<body>


<!--=== Breadcrumbs ===-->
<div class="breadcrumbs margin-bottom-40">
    <div class="container">
        <h1 class="pull-left">Login</h1>
        <ul class="pull-right breadcrumb">
            <li><a href="index.jsp">Home</a></li>
            <li><a href="">Pages</a></li>
            <li class="active">Login</li>
        </ul>
    </div><!--/container-->
</div><!--/breadcrumbs-->
<!--=== End Breadcrumbs ===-->

<!--=== Content Part ===-->
<div class="container">		
	<div class="row">
        <div class="col-md-4 col-md-offset-4 col-sm-6 col-sm-offset-3">
            <form class="reg-page">
                <div class="reg-header">            
                    <h2>Login to your account</h2>
                </div>

                <div class="input-group margin-bottom-20">
                    <span class="input-group-addon"><i class="icon-user"></i></span>
                    <input type="text" placeholder="Username" class="form-control">
                </div>                    
                <div class="input-group margin-bottom-20">
                    <span class="input-group-addon"><i class="icon-lock"></i></span>
                    <input type="text" placeholder="Password" class="form-control">
                </div>                    

                <div class="row">
                    <div class="col-md-6">
                        <label class="checkbox"><input type="checkbox"> Stay signed in</label>                        
                    </div>
                    <div class="col-md-6">
                        <button class="btn-u pull-right" type="submit">Login</button>                        
                    </div>
                </div>

                <hr>

                <h4>Forget your Password ?</h4>
                <p>no worries, <a class="color-green" href="#">click here</a> to reset your password.</p>
            </form>            
        </div>
    </div><!--/row-->
</div><!--/container-->		
<!--=== End Content Part ===-->

<!--=== Footer ===-->
<div class="footer">
    <div class="container">
        <div class="row">
            <div class="col-md-4 md-margin-bottom-40">
                <!-- About -->
                <div class="headline"><h2>About</h2></div>  
                <p class="margin-bottom-25 md-margin-bottom-40">Unify is an incredibly beautiful responsive Bootstrap Template for corporate and creative professionals.</p>    

                <!-- Monthly Newsletter -->
                <div class="headline"><h2>Monthly Newsletter</h2></div> 
                <p>Subscribe to our newsletter and stay up to date with the latest news and deals!</p>
                <form class="footer-subsribe">
                    <div class="input-group">
                        <input type="text" class="form-control" placeholder="Email Address">                            
                        <span class="input-group-btn">
                            <button class="btn-u" type="button">Subscribe</button>
                        </span>
                    </div><!-- /input-group -->                    
                </form>                         
            </div><!--/col-md-4-->  
            
            <div class="col-md-4 md-margin-bottom-40">
                <div class="posts">
                    <div class="headline"><h2>Recent Blog Entries</h2></div>
                    <dl class="dl-horizontal">
                        <dt><a href="#"><img src="assets/img/sliders/elastislide/6.jpg" alt="" /></a></dt>
                        <dd>
                            <p><a href="#">Anim moon officia Unify is an incredibly beautiful responsive Bootstrap Template</a></p> 
                        </dd>
                    </dl>
                    <dl class="dl-horizontal">
                    <dt><a href="#"><img src="assets/img/sliders/elastislide/10.jpg" alt="" /></a></dt>
                        <dd>
                            <p><a href="#">Anim moon officia Unify is an incredibly beautiful responsive Bootstrap Template</a></p> 
                        </dd>
                    </dl>
                    <dl class="dl-horizontal">
                    <dt><a href="#"><img src="assets/img/sliders/elastislide/11.jpg" alt="" /></a></dt>
                        <dd>
                            <p><a href="#">Anim moon officia Unify is an incredibly beautiful responsive Bootstrap Template</a></p> 
                        </dd>
                    </dl>
                </div>
            </div><!--/col-md-4-->

            <div class="col-md-4">
                <!-- Monthly Newsletter -->
                <div class="headline"><h2>Contact Us</h2></div> 
                <address class="md-margin-bottom-40">
                    25, Lorem Lis Street, Orange <br />
                    California, US <br />
                    Phone: 800 123 3456 <br />
                    Fax: 800 123 3456 <br />
                    Email: <a href="mailto:info@anybiz.com" class="">info@anybiz.com</a>
                </address>

                <!-- Stay Connected -->
                <div class="headline"><h2>Stay Connected</h2></div> 
                <ul class="social-icons">
                    <li><a href="#" data-original-title="Feed" class="social_rss"></a></li>
                    <li><a href="#" data-original-title="Facebook" class="social_facebook"></a></li>
                    <li><a href="#" data-original-title="Twitter" class="social_twitter"></a></li>
                    <li><a href="#" data-original-title="Goole Plus" class="social_googleplus"></a></li>
                    <li><a href="#" data-original-title="Pinterest" class="social_pintrest"></a></li>
                    <li><a href="#" data-original-title="Linkedin" class="social_linkedin"></a></li>
                    <li><a href="#" data-original-title="Vimeo" class="social_vimeo"></a></li>
                </ul>
            </div><!--/col-md-4-->
        </div><!--/row-->   
    </div><!--/container--> 
</div><!--/footer-->    
<!--=== End Footer ===-->

<!--=== Copyright ===-->
<div class="copyright">
    <div class="container">
        <div class="row">
            <div class="col-md-6">                      
                <p class="copyright-space">
                    2013 &copy; Unify. ALL Rights Reserved. 
                    <a href="#">Privacy Policy</a> | <a href="#">Terms of Service</a>
                </p>
            </div>
            <div class="col-md-6">  
                <a href="index.html">
                    <img id="logo-footer" src="assets/img/logo2-default.png" class="pull-right" alt="" />
                </a>
            </div>
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
<!-- JS Page Level -->           
<script type="text/javascript" src="assets/js/app.js"></script>
<script type="text/javascript">
    jQuery(document).ready(function() {
        App.init();
    });
</script>
<!--[if lt IE 9]>
    <script src="assets/plugins/respond.js"></script>
<![endif]-->

</body>
</html> 