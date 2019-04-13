<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
				<div class="row">
					<div class="col-12">
						<form  id="form1" >
						<input type="hidden" name="id" id="id" value="${pd.id}"/>
						<input name="pid" id="pid" value="${pd.pid }" type="hidden">
							<div id="zhongxin" style="padding-top:13px;">
							<table class="center" style="width:100%;text-align: center;">
								<tr>
								<td width="25%">名称:</td>
									<td><input type="text" name="name" id="name" placeholder="这里输入名称" value="${pd.name}"  title="名称" style="width:99%;"/></td>
								</tr>
								<tr>
								<td width="25%">手机:</td>
								<td><input type="text" name="desc" id="desc" placeholder="这里输入描述" value="${pd.desc}"  title="手机" style="width:99%;"/></td>
								</tr>
								 
								<tr>
									<td style="text-align: center;padding-top:5px;" colspan='2'>
										<a class="btn btn-mini btn-primary" onclick="save();">保存</a>
										<a class="btn btn-mini btn-danger" onclick="$('#scrollmodal').modal('hide');">取消</a>
									</td>
								</tr>
							</table>
							</div>
						</form>
					
					 
					<!-- /.col -->
				</div>
			 


  
	<script type="text/javascript">
 
function save(){
		debugger
		 $.ajax({ 
             type: 'post', 
             data: $('#form1').serialize(), 
             url: '../role/${msg}.do',
             cache:false,  
             dataType:'text', 
             success: function (data) {
                 if("success"==data){
                     alert('保存成功');
                     window.location.reload();
                 }else{
                	 alert('保存失败');
                 }
             }   
         }) 
		 
	}
	
	</script>
 

