<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
 
				<div class="row">
					<div class="col-12">
						<form action="company/${msg}.do" name="form1" id="form1"  method="post">
						<input type="hidden" name="id" id="id" value="${pd.id}"/>
						<input name="creator" id="creator" value="${pd.creator }" type="hidden">
						<input name="owner" id="owner" value="${pd.owner }" type="hidden">
							<div id="zhongxin" style="padding-top:13px;">
							<table class="center" style="width:100%;text-align: center;">
								<tr  >
								<td width="25%">名称:</td>
									<td><input type="text" name="company" id="company" placeholder="这里输入名称" value="${pd.company}"  title="名称" style="width:99%;"/></td>
								</tr>
								<tr>
								<td width="25%">地址:</td>
								<td><input type="text" name="address" id="address" placeholder="这里输入email" value="${pd.address}"  title="email" style="width:99%;"/></td>
								</tr>
								<tr>
								<td width="25%">电话:</td>
								<td><input type="text" name="phone" id="phone" placeholder="这里输入电话" value="${pd.phone}"  title="电话" style="width:99%;"/></td>
								</tr>
								<tr>
								<td width="25%">手机:</td>
								<td><input type="text" name="mobile" id="mobile" placeholder="这里输入手机" value="${pd.mobile}"  title="手机" style="width:99%;"/></td>
								</tr>
								<tr>
								<td width="25%">网关地址:</td>
								<td><input type="text" name="getawaysn" id="getawaysn" placeholder="这里输入网关地址" value="${pd.getawaysn}"  title="网关地址" style="width:99%;"/></td>
								</tr>
							    <tr>
								 
								</tr>
								<tr>
									<td style="text-align: center;padding-top:5px;" colspan=2>
										<a class="btn btn-mini btn-primary" onclick="save();">保存</a>
										<a class="btn btn-mini btn-danger" onclick="$('#scrollmodal').modal('hide');">取消</a>
									</td>
								</tr>
							</table>
							</div>
						</form>
				 
					 
				</div>
				<!-- /.row -->
			 
 
		   
	<script type="text/javascript">


	function save(){ 
			 $.ajax({ 
	             type: 'post', 
	             data: $('#form1').serialize(), 
	             url: '../company/${msg}.do',
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
</body>
</html>

