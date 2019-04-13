<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/"; 
%>

<!doctype html>
<!--[if lt IE 7]>      <html class="no-js lt-ie9 lt-ie8 lt-ie7" lang=""> <![endif]-->
<!--[if IE 7]>         <html class="no-js lt-ie9 lt-ie8" lang=""> <![endif]-->
<!--[if IE 8]>         <html class="no-js lt-ie9" lang=""> <![endif]-->
<!--[if gt IE 8]><!--> <html class="no-js" lang=""> <!--<![endif]-->
<head>
    	 <%@ include file="top.jsp"%> 
</head>
<body>
    <!-- Left Panel -->
<%@ include file="left.jsp"%> 
   
    <!-- Left Panel -->


    <!-- Right Panel -->
    <div id="right-panel" class="right-panel" style="position: absolute;
    top: 0px;
    bottom: 0px;
    left: 0px;
    right: 0px;">

        <!-- Header-->
        <header id="header" class="header">
            <div class="top-left">
                <div class="navbar-header">
                    <a class="navbar-brand" href="./"><img src="images/logo.png" alt="Logo"></a>
                    <a class="navbar-brand hidden" href="./"><img src="images/logo2.png" alt="Logo"></a>
                    <a id="menuToggle" class="menutoggle"><i class="fa fa-bars"></i></a>
                </div>
            </div>
            <div class="top-right">
                <div class="header-menu">
                    <div class="user-area dropdown float-right">
                        <a href="#" class="dropdown-toggle active" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                            <img class="user-avatar rounded-circle" src="images/admin.jpg" alt="User Avatar">
                        </a>

                        <div class="user-menu dropdown-menu">
                            
                            <a class="nav-link" href="#"><i class="fa fa-power-off"></i>Logout</a>
                        </div>
                    </div>
                </div>
            </div>
        </header><!-- /header -->
   
 

        <div class="content" style="    position: absolute;
    top: 0px;
    bottom: 35px;
    padding:0em">
            <iframe  id="content"  name="content" style="width:100%;height:100%;border: 0px;" src="user/userlist">
               
</iframe  ><!-- .animated -->
</div><!-- .content -->
    <div class="clearfix"></div>

    <footer class="site-footer" style="  padding:0em;  bottom: 0px;
    position: absolute;
    right: 0px;
    left: 0px;">
        <div class="footer-inner bg-white">
            <div class="row">
                <div class="col-sm-6">
                   
                   
                </div>
                <div class="col-sm-6 text-right"> Designed by Colorlib
                </div>
            </div>
        </div>
    </footer>


</div><!-- /#right-panel -->

<!-- Right Panel -->

<!-- Scripts -->
<%@ include file="foot.jsp"%> 

 

</body>
</html>


