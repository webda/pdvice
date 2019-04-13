<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

				<div class="row">
					<div class="col-12">
						<form action="device/${msg}.do" name="form1" id="form1"  method="post">
						<input type="hidden" name="id" id="id" value="${pd.id}"/>
						<input name="pid" id="pid" value="${pd.pid }" type="hidden">
							<div id="zhongxin" style="padding-top:13px;">
							<table class="center " style="width:100%;text-align: center;">
								<tr >
								<td width="25%">名称:</td>
									<td><input type="text" name="name" id="name" placeholder="这里输入设备名称" value="${pd.name}"  title="设备名称" style="width:99%;"/></td>
								</tr>
								<tr> 
								<td width="25%">网关:</td>
								<td>
								<select name="company" id="company" class="form-control">
								<c:forEach items="${rolist}" var="role" varStatus="vs">
                                                <option value="${role.id}" data-sn='${role.getawaysn}'>${role.company}:${role.getawaysn}</option>
                                                
                                                 </c:forEach> 
                               </select>
								  <input type="text"  id="sn"  value="${pd.sn}"   name="sn"/></td> 
								</tr>
                                <tr>
								<td width="25%"> 设备IP:</td>
								<td><input type="text" name="ip" id="ip" placeholder="这里输入设备Ip" value="${company.ip}"  title="设备IP" style="width:99%;"/></td>
								</tr>  
								
								 <tr>
								<td width="25%"> 从机地址:</td>
								<td><input type="text" name="slaveid" id="slaveid" placeholder="这里输入 从机地址" value="${company.slaveid}"  title=" 从机地址" style="width:99%;"/></td>
								</tr> 
								<tr>
								<td width="25%"> 制造商:</td>
								<td><input type="text" name="producer" id="producer" placeholder="这里输入制造商" value="${pd.producer}"  title="制造商" style="width:99%;"/></td>
								</tr>
								<tr>
								<td width="25%">生产地:</td>
								<td><input type="text" name="Origin" id="Origin" placeholder="这里输入生产地" value="${pd.Origin}"  title="生产地" style="width:99%;"/></td>
								 
								</tr> 
									<tr>
								<td width="25%">生产时间:</td>
								<td><input type="text" name="createdate" id="createdate"   class="datapicker"
								 placeholder="这里输入生产时间" value="${pd.createdate}"  title="生产时间" style="width:99%;"/></td>
								 
								</tr> 	<tr>
								<td width="25%">购置时间:</td>
								<td><input type="text" name="buydate" id="buydate" class="datapicker"
								 placeholder="这里输入购置时间" value="${pd.buydate}"  title="购置时间" style="width:99%;"/></td>
								 
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

 
	$("#company").change(function(obj){
		
		$("#sn").val($("#company :checked").attr("data-sn"))
	});
 
 
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
     
     $(function(){
    	 $(".datapicker").datepicker({	autoclose: true, //自动关闭
    			beforeShowDay: $.noop,    //在显示日期之前调用的函数
    			calendarWeeks: false,     //是否显示今年是第几周
    			clearBtn: false,          //显示清除按钮
    			daysOfWeekDisabled: [],   //星期几不可选
    			endDate: Infinity,        //日历结束日期
    			forceParse: true,         //是否强制转换不符合格式的字符串
    			format: 'yyyy-mm-dd',     //日期格式
    			keyboardNavigation: true, //是否显示箭头导航
    			language: 'cn',           //语言
    			minViewMode: 0,
    			orientation: "auto",      //方向
    			rtl: false,
    			startDate: -Infinity,     //日历开始日期
    			startView: 0,             //开始显示
    			todayBtn: false,          //今天按钮
    			todayHighlight: false  //今天高亮  
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

