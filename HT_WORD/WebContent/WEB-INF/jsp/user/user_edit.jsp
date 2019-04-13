<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
 

 <form id="form1">
				<div class="row">
					<div class="col-12">
					 
						<input type="hidden" name="id" id="id" value="${pd.id}"/>
						<input name="pid" id="pid" value="${pd.pid }" type="hidden">
						 
							<table class="center" style="width:100%;">
								<tr>
								<td width="25%"  style="text-align: right;">名称:</td>
									<td><input type="text" name="name" id="name" placeholder="这里输入名称" value="${pd.name}" 
									class="form-control" title="名称" style="width:99%;"/></td>
								</tr>
								<tr>
								<td width="25%" style="text-align: right;">手机:</td>
								<td><input type="text" name="mobile" id="mobile" placeholder="这里输入手机" value="${pd.mobile}"  
								class="form-control" title="手机" style="width:99%;"/></td>
								</tr>
								<tr>
								<td width="25%" style="text-align: right;">email:</td>
								<td><input type="text" name="email" id="email" placeholder="这里输入email" value="${pd.email}"    
								class="form-control" title="email" style="width:99%;"/></td>
								</tr>
								<tr>
								<td width="25%" style="text-align: right;">真实姓名:</td>
								<td><input type="text" name="realname" id="realname" placeholder="这里输入真实姓名" value="${pd.realname}"  
								class="form-control" title="真实姓名" style="width:99%;"/></td>
								 
								</tr><tr>
								<td width="25%" style="text-align: right;">角色:</td>
								<td>
									<c:forEach items="${rolist}" var="role" varStatus="vs">
									 <div class="checkbox" style="margin-left: 50px; float:left">
                                                    <label for="checkbox1" class="form-check-label ">
                                                        <input type="checkbox" id="rid" name="rid" value="${role.id}" class="form-check-input">${role.name}
                                                    </label>
                                                </div>
									
							 
									 
								  </c:forEach> 
								  
								</td> 
								</tr>
								<tr>
									<td style="text-align: center;padding-top:5px;" colspan="2" style="text-align: center;">
										<a class="btn btn-mini btn-primary" onclick="save();">保存</a>
										<a class="btn btn-mini btn-danger" onclick="$('#scrollmodal').modal('hide');">取消1</a>
									</td>
								</tr>
							</table>
							 
					 
					
					 
					<!-- /.col -->
				</div>
			 </div>
			 </form>

 
	<script type="text/javascript">

 
	
	var roleids=[];
	<c:forEach items="${roleids}" var="roleid" varStatus="vs">
	
	      roleids.push('${roleid.rid}');
     </c:forEach> 
     
   
    	 
    	 roleids.forEach(function(id){
    		 jQuery(".rolecheck[value="+id+"]").prop("checked","checked") 
    	 });
   
	//保存
	function save(){
		debugger
		 $.ajax({ 
             type: 'post', 
             data: $('#form1').serialize(), 
             url: '../user/${msg}.do',
             cache:false,  
             dataType:'text', 
             success: function (data) {
                 if("success"==data){
                     alert('保存成功');
                     window.location.href.reload();
                 }else{
                	 alert('保存失败');
                 }
             }   
         }) 
		 
	}
	
	
	</script>

