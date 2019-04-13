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
                                <button type="button" class="btn btn-primary col-md-1 col-md-offset-10"   onclick="addDevice('${Users.id}');">添加</button>
                            </div>
                            <div class="card-body">
                                <table id="bootstrap-data-table" class="table table-striped table-bordered">
                                    <thead>
                                        <tr>
                                            <th>设备名称</th>
                                            <th>网关</th>
                                            <th> 制造商</th> 
                                            <th>生产地</th>
                                            <th>生产时间</th>
                                            <th>购置时间</th>
                                             <th>操作</th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                       <c:choose>
								<c:when test="${not empty DeviceList}">
									 
									<c:forEach items="${DeviceList}" var="Device" varStatus="vs">
										
										<tr>
										<td class="center"><a  onclick="editDevice('${Device.id}');" style="cursor:pointer;">${Device.name }</a></td>	
											<td class="center">${Device.sn }</td>	
											<td class="center">${Device.producer }</td>	
											<td class="center">${Device.origin}</td>	
											<td class="center">${Device.createdate}</td>	
											<td class="center">${Device.buydate}</td>	
											<td class="center">
											 <button type="button" onclick="SetDeviceParm('${Device.id}','${Device.name}');" class="btn btn-danger">实验参数</button>
											 <button type="button" onclick="delDevice('${Device.id}','${Device.name}');" class="btn btn-danger">删除</button>
											 </td>	
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


 

	</div>
	<!-- /.main-container -->

	<!-- basic scripts -->
	<!-- 页面底部js¨ -->
 
	 <%@ include file="../system/index/foot.jsp"%> 
	<script type="text/javascript">
		 
		function addDevice(pid){  
			 var diag ={}; 
			 diag.Title ="新增";
			 diag.URL ='<%=basePath%>../device/toAdd.do?pid='+pid+"&tm="+new Date().getTime(); 
			 jQuery.window(diag);
		}
		
		function editDevice(id){ 
			 var diag ={}; 
			 diag.Title ="修改";
			 diag.URL ='<%=basePath%>../device/toEdit.do?id='+id+"&tm="+new Date().getTime();
			 jQuery.window(diag);
		}
		function SetDeviceParm(id){ 
			 var diag ={}; 
			 diag.Title ="实验参数";
			 diag.URL ='<%=basePath%>../device/toParm.do?id='+id+"&tm="+new Date().getTime();
			 jQuery.window(diag);
		}
		 
		
		function delDevice(DeviceId,msg){ 
			if(!window.confirm("确定要删除["+msg+"]吗?"))return; 
			var url = "<%=basePath%>../device/delete.do?id="+companyId+"&tm="+new Date().getTime();
			jQuery.get(url,function(data){
				setTimeout("self.location.reload()",100); 
		});
		}
	</script>


</body>
</html>