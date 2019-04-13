<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
 
				<div class="row">
					<div class="col-12">
						<form action="properties/${msg}.do" name="form1" id="form1"  method="post">
						<input type="hidden" name="id" id="id" value="${pd.id}"/>
						<input name="creator" id="creator" value="${pd.creator }" type="hidden">
						<input name="owner" id="owner" value="${pd.owner }" type="hidden">
							<div id="zhongxin" style="padding-top:13px;">
							<table  style="width:100%;text-align: center;">
								<tr >
								<td width="25%">属性名:</td>
									<td><input type="text" name="name" id="name" placeholder="这里输入名称" value="${pd.name}"  title="属性" style="width:99%;"/></td>
								</tr>
								<tr>
								<td width="25%">单位:</td>
								<td><input type="text" name="unit" id="unit" placeholder="这里输入单位" value="${pd.unit}"  title="单位" style="width:99%;"/></td>
					  
								</tr>
								<tr>
								<td width="25%">图标:</td>
								<td><input type="text" name="icon" id="icon" placeholder="这里输入图标" value="${pd.icon}"  title="图标" style="width:99%;"/></td>
								</tr>
								<tr>
								<td width="25%">计算公式:</td>
								<td><input type="text" name="calc" id="calc" placeholder="这里输入计算公式" value="${pd.calc}"  title="计算公式" style="width:99%;"/></td>
								</tr>
								<tr>
								<td width="25%">提示信息:</td>
								<td><input type="text" name="tellflag" id="tellflag" placeholder="这里输入提示信息" value="${pd.tellflag}"  title="提示信息" style="width:99%;"/></td>
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
					
					<div id="zhongxin2" class="center" style="display:none"><img src="static/images/jzx.gif" style="width: 50px;" /><br/><h4 class="lighter block green"></h4></div>

					</div>
					<!-- /.col -->
				</div>
				<!-- /.row -->
			 
		   
	<script type="text/javascript"> 
	//保存
	function save(){ 
		debugger
			 $.ajax({ 
	             type: 'post', 
	             data: $('#form1').serialize(), 
	             url: '../properties/${msg}.do',
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

