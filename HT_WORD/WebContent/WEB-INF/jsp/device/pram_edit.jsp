<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

				<div class="row">
					<div class="col-12">
						<form action="device/${msg}.do" name="form1" id="form1"  method="post">
						<input type="hidden" name="id" id="id" value="${pd.id}"/>
						<input type="hidden" name="CDMid" id="CDMid" value="${CDM.id}"/> 
							<div id="zhongxin" style="padding-top:13px;">
							<table class="center " style="width:100%;text-align: center;">
								<tr >
								<td width="25%">名称:</td>
									<td> ${pd.name} </td>
								</tr> 
                                <tr>
								<td width="25%"> 报警次数:</td>
								<td><input type="text" name="remind" id="remind" placeholder="这里输入报警次数" value="${CDM.remind}"  title="-1表示不报警 0表示一直报警 大于0表示次数
                                    " style="width:99%;"/></td>
								</tr>   
								 <tr>
								<td width="25%"> 报警时间间隔:</td>
								<td><input type="text" name="interval" id="interval" placeholder="这里输入报警时间间隔" value="${CDM.interval}"  title="报警时间间隔" style="width:99%;"/></td>
								</tr> 
								<tr>
								<td width="25%"> 无操作处理:</td>
								<td><SELECT name="handle" id="handle" placeholder="这里输入无操作处理" value="${CDM.handle}"  title="无操作处理" style="width:99%;">
								<option VALUE=0>不处理</option>
								<option VALUE=1>关闭电源</option>
								<option VALUE=2>重启</option>
								</SELECT>
								</td>
								</tr>
								<tr>
								<td width="25%">通知管理人员:</td>
								<td><SELECT name="remindadmin" id="remindadmin" placeholder="这里输入生产地" value="${CDM.remindadmin}"  title="通知管理人员" style="width:99%;" >
								<option VALUE=0>不通知</option>
								<option VALUE=1>通知</option> 
								</SELECT>
								</td> 
								</tr> 
									<tr>
								<td width="25%">状态:</td>
								<td><input type="text" name="state" id="state"   
								 placeholder="这里输入状态" value="${CDM.state}"  title="状态" style="width:99%;"/></td>
								 
								</tr> 
								
								<tr>
								<td width="25%">属性:</td>
								<td>
								
								<table class="callspase">
								<thead>
								<tr><th>选择</th><th>属性</th><th>单位</th><th>计算公式</th><th>最大值</th><th>最小值</th></tr>
								</thead>
								<tbody>
									<c:forEach items="${plist}" var="properties" varStatus="vs">
									  <tr>
									  <td> <input type="checkbox"  class='propertiescheck'  name="properties"  value="${properties.id}"/></td>
									   <td> ${properties.name}</td>
									     <td> ${properties.unit}</td>
									     <td> ${properties.calc}</td>
									     <td> <input type="text"  data-id="${properties.id}"  style="width:60px" name="minval${properties.id}"/></td>
									     <td> <input type="text"  data-id="${properties.id}"  style="width:60px"  name="maxval${properties.id}"/></td>
									  </tr>
                                  
                                   
								  </c:forEach> 
								</tbody>
								</table>
								 
								<!-- <input type="text" name="sn" id="sn" placeholder="这里输入网关" value="${pd.sn}"  title="网关" style="width:99%;"/> -->
								</td>
								</tr>
								<tr>
									<td style="text-align: center;padding-top:5px;"  colspan=2>
										<a class="btn btn-mini btn-primary" onclick="save();">保存</a>
										<a class="btn btn-mini btn-danger" onclick="top.Dialog.close();">取消</a>
									</td>
								</tr>
							</table>
							</div>
						</form>
					
					 
					<!-- /.col -->
				</div>
			 


	 
	<script type="text/javascript">

	$("#handle").val('${CDM.handle}');
	$("#remindadmin").val('${CDM.remindadmin}');
	 
 
     var pids=[]; 
     
     <c:forEach items="${Propertiesids}" var="Properties" varStatus="vs">
 	
     pids.push({id:'${Properties.pid}',maxval:'${Properties.maxval}',minval:'${Properties.minval}'});
    </c:forEach> 
     $(function(){ 
    	 
    	 pids.forEach(function(properties){
    		 $(".propertiescheck[value="+properties.id+"]").prop("checked","checked") ;
    		 $("input[data-id="+properties.id+"][name=maxval"+properties.id+"]").val(properties.maxval) ;
    		 $("input[data-id="+properties.id+"][name=minval"+properties.id+"]").val(properties.minval) ;
    	 });
    	 $(".callspase").on("click","thead",function(obj){
    		 $(obj.target).parents("table.callspase").find("tbody").toggle(); 
    		 });
     })
     
    
	//保存
	function save(){
    	 $.ajax({ 
             type: 'post', 
             data: $('#form1').serialize(), 
             url: '../device/${msg}.do',
             cache:false,  
             dataType:'text', 
             success: function (data) {
                 if("success"==data){
                	 debugger
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

