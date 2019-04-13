<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
 	  
 	  <link href='../plugins/zTree/2.6/zTreeStyle.css' rel='stylesheet' type='text/css'>
		<ul id="tree" class="tree" style="overflow:auto;"></ul>
	 
	<div style="width: 100%;" class="center">
		<a class="btn btn-mini btn-primary" onclick="save();">保存</a>
		<a class="btn btn-mini btn-danger" onclick="top.Dialog.close();">取消</a>
	</div>
 
	<script type="text/javascript" src="../plugins/zTree/2.6/jquery.ztree-2.6.min.js"></script>
	
	<script type="text/javascript">
	 debugger
	var zTree;
	$(document).ready(function(){
			
			var setting = {
			    showLine: true,
			    checkable: true
			};
			var zn = '${zTreeNodes}';
			var zTreeNodes = eval(zn);
			zTree = $("#tree").zTree(setting, zTreeNodes);
		});
	</script>
	<script type="text/javascript">
	
		 function save(){
			   
				var nodes = zTree.getCheckedNodes();
				var tmpNode;
				var ids = "";
				for(var i=0; i<nodes.length; i++){
					tmpNode = nodes[i];
					if(i!=nodes.length-1){
						ids += tmpNode.id+",";
					}else{
						ids += tmpNode.id;
					}
				}
				
				var roleId = "${id}";
				var url = "../role/saveauth.do";
				var postData;
				
				postData = {"id":roleId,"menuIds":ids};
				
		 
				$.post(url,postData,function(data){
					 if(data && data=="success"){
						 
						 alert('保存成功！')
						window.location.reload();
					 }
				});
			 
		 }
	
	</script>

