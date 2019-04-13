<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/static/";
	
%>
<!DOCTYPE html>
<html lang="en">
	<head>
		<base href="<%=basePath%>">
		 <%@ include file="../system/index/top.jsp"%> 
	</head>
		 
<body class="no-skin">

	<!-- /section:basics/navbar.layout -->
	<div class="main-container" id="main-container">
		<!-- /section:basics/sidebar -->
		<div class="main-content">
			<div class="main-content-inner">
				<div class="page-content">
					<div class="hr hr-18 dotted hr-double"></div>
					<div class="row">
						     <div class="col-md-12">
                        <div class="card">
                            <div class="card-header row">
                                
                            </div>
                            <div class="card-body">
                                <table id="bootstrap-data-table" class="table table-striped table-bordered">
                                    <thead>
                                        <tr>
                                            <th>用户名</th>
                                            <th>手机号</th> 
                                            <th>邮箱</th> 
                                             <th>管理员用户名</th>
                                            <th>管理员手机号</th> 
                                            <th>原因</th> 
                                            <th>状态</th> 
                                        </tr>
                                    </thead>
                                    <tbody>
                                       <c:choose>
								<c:when test="${not empty UserRegListList}">
									 
									<c:forEach items="${UserRegListList}" var="UserRegList" varStatus="vs">
										
										<tr>
										<td class="center">${UserRegList.name }</td>
										<td class="center">${UserRegList.mobile }</td>
										<td class="center">${UserRegList.email }</td>	
										<td class="center">${UserRegList.adminname}</td>	
										<td class="center">${UserRegList.adminmobile }</td>	
										<td class="center">${UserRegList.reason }</td>	
										<td class="center">${UserRegList.state }</td>		 	
										 
										</tr>
									
									</c:forEach> 
								</c:when>
								<c:otherwise>
									<tr class="main_info">
										<td colspan="10" class="center">没有相关数据</td>
									</tr>
								</c:otherwise>
							</c:choose>
                                    </tbody>
                                </table>
                            </div>
                        </div>
                    </div>
						 
						<!-- /.col -->
					</div>
					<!-- /.row -->
				</div>
				<!-- /.page-content -->
			</div>
		</div>
		<!-- /.main-content -->


		<!-- 返回顶部 -->
	 

	</div>
	 <%@ include file="../system/index/foot.jsp"%> 
	<script type="text/javascript">
	 	 
		
		function delUserRegList(UserRegListId,msg){
			if(!confirm("确定要删除["+msg+"]吗?") return
				 
					var url = "<%=basePath%>../UserRegList/delete.do?id="+UserRegListId+"&tm="+new Date().getTime();
					$.get(url,function(data){
						setTimeout("self.location.reload()",100);
					});
				 
			 
		}
	</script>


</body>
</html>