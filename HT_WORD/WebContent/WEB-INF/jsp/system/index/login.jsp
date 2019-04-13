<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!doctype html>
 
<head>
     
     <%@ include file="top.jsp"%> 

  

    <link href='https://fonts.googleapis.com/css?family=Open+Sans:400,600,700,800' rel='stylesheet' type='text/css'>
 
</head>
<body class="bg-dark">

    <div class="sufee-login d-flex align-content-center flex-wrap">
        <div class="container">
            <div class="login-content">
                <div class="login-logo">
                    <a href="index.html">
                        <img class="align-content" src="images/logo.png" alt="">
                    </a>
                </div>
                <div class="login-form">
                     
                        <div class="form-group">
                            <label>用户名</label>
                            <input  type="text" class="form-control" placeholder="用户名" id="loginname">
                        </div>
                        <div class="form-group">
                            <label>密码</label>
                            <input type="password" class="form-control" placeholder="Password" id="password">
                        </div> 
                        <button onclick="severCheck()" class="btn btn-success btn-flat m-b-30 m-t-30">登录</button>
                       
                     
                  
                </div>
            </div>
        </div>
    </div>

 
	 <%@ include file="foot.jsp"%> 
	 
	 <script>
	 function severCheck(){
			 
				var loginname = $("#loginname").val();
				var password = $("#password").val();
				var code =  loginname+",fh,"+password+",fh,"+222;
				$.ajax({
					type: "POST",
					url: 'login',
			    	data: {KEYDATA:code,tm:new Date().getTime()},
					dataType:'json',
					cache: false,
					success: function(data){
						if("success" == data.result){
							 
							window.location.href="main";
						}else if("usererror" == data.result){
							alert("用户名或密码有误");
								 
						} else{
							
							alert("缺少参数");
							 
						}
					}
				});
			 
		}
	
	 </script>
</body>
</html>
