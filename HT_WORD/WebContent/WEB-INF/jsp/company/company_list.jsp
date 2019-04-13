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
                                <button type="button" class="btn btn-primary col-md-1 col-md-offset-10"   onclick="addcompany('${Users.id}');">添加</button>
                            </div>
                            <div class="card-body">
                                <table id="bootstrap-data-table" class="table table-striped table-bordered">
                                    <thead>
                                        <tr>
                                            <th>机构名</th>
                                            <th>地址</th>
                                            <th>电话</th>
                                            <th>手机号</th>
                                            <th>关系</th>
                                            <th>网关地址</th>
                                             <th>操作</th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                       <c:choose>
								<c:when test="${not empty companyList}">
									 
									<c:forEach items="${companyList}" var="company" varStatus="vs">
										
										<tr>
										<td class="center"><a  onclick="editcompany('${company.id}');" style="cursor:pointer;">${company.company }</a></td>	
										<td class="center">${company.address }</td>
										
											<td class="center">${company.phone }</td>	
											<td class="center">${company.mobile }</td>	
											<td class="center">${company.relation }</td>	
											<td class="center">${company.getawaysn}</td>	
											<td class="center">
											 <button type="button" onclick="delcompany('${company.id}','${company.company}');" class="btn btn-danger">删除</button>
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
	 <%@ include file="../system/index/foot.jsp"%> 
	<script type="text/javascript">
	 
		function addcompany(pid){ 
			 var diag ={}; 
			 diag.Title ="新增";
			 diag.URL = '<%=basePath%>../company/toAdd.do?pid='+pid+"&tm="+new Date().getTime();
	 

			 jQuery.window(diag);
		}
		
		function editcompany(id){ 
			 
			 var diag ={}; 
			 diag.Title ="修改";
			 diag.URL = '<%=basePath%>../company/toEdit.do?id='+id+"&tm="+new Date().getTime(); 
			 jQuery.window(diag);
		}
		
		function delcompany(companyId,msg){
			
			
			if(!window.confirm("确定要删除["+msg+"]吗?"))return;
			 
			
			var url = "<%=basePath%>../company/delete.do?id="+companyId+"&tm="+new Date().getTime();
			jQuery.get(url,function(data){
				setTimeout("self.location.reload()",100);
	 
		});
	 
			 
		}
	</script>


</body>
</html>