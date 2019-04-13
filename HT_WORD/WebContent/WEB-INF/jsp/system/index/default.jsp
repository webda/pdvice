<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html>
<html lang="en">
<head>
<base href="<%=basePath%>">

<!-- jsp文件头和头部 -->
<%@ include file="../index/top.jsp"%>
<!-- 百度echarts -->
<script src="plugins/echarts/echarts.min.js"></script>
<script type="text/javascript">
setTimeout("top.hangge()",500);
</script>
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
						<div class="col-xs-12">
<!-- 
							<div class="alert alert-block alert-success">
								<button type="button" class="close" data-dismiss="alert">
									<i class="ace-icon fa fa-times"></i>
								</button>
								 
								<i class="ace-icon fa fa-check green"></i>
								-->
								
								<!--  
								<strong class="green">
									&nbsp;
									<a href="http:/" target="_blank"><small>(&nbsp;&nbsp;)</small></a>
								</strong>
								-->
							</div>
							 
							<td style="vertical-align:top; padding-left:2px;">
								<c:if test="${not empty openbookList}">
									<span class="label label-default">您已经开通学生人数为: ${openbookList[0].counttextbook}</span>
								</c:if>
								<c:if test="${ empty openbookList}">
									<h6>您已经开通学生人数为 <span class="label label-default">0</span></h6>
								</c:if>
								
								</td>
								
								<td style="vertical-align:top; padding-left:2px;">
								<c:if test="${not empty userlicence}">
									<span class="label label-default">您目前的授权值为: ${userlicence.LICENSE}</span>
								</c:if>
								
								<c:if test="${ empty openbookList}">
									<h6>您目前的授权值为:  <span class="label label-default">0</span></h6>
								</c:if>
								</td>
							
							<!--  
							<div id="main" style="width: 600px;height:300px;"><img src="static/images/jiyiquxian.png" />   </div>
							-->
							<!--  
							<div style="float: left;margin-top: 3px;"><img src="static/images/jiyiquxian.png" /> </div>
							-->
							<!--  
							<script type="text/javascript">
						        // 基于准备好的dom，初始化echarts实例
						        var myChart = echarts.init(document.getElementById('main'));
						
						        // 指定图表的配置项和数据
								var option = {
						            title: {
						                text: 'HFTC Admin用户统计'
						            },
						            tooltip: {},
						            xAxis: {
						                data: ["系统用户","系统会员"]
						            },
						            yAxis: {},
						            series: [
						               {
						                name: '',
						                type: 'bar',
						                data: [${pd.userCount},${pd.appUserCount}],
						                itemStyle: {
						                    normal: {
						                        color: function(params) {
						                            // build a color map as your need.
						                            var colorList = ['#6FB3E0','#87B87F'];
						                            return colorList[params.dataIndex];
						                        }
						                    }
						                }
						               }
						            ]
						        };	        

						        // 使用刚指定的配置项和数据显示图表。
						        myChart.setOption(option);
						    </script>
						    -->
							
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
		<a href="#" id="btn-scroll-up" class="btn-scroll-up btn btn-sm btn-inverse">
			<i class="ace-icon fa fa-angle-double-up icon-only bigger-110"></i>
		</a>

	</div>
	<!-- /.main-container -->

	<!-- basic scripts -->
	<!-- 页面底部js¨ -->
	<%@ include file="../index/foot.jsp"%>
	<!-- ace scripts -->
	<script src="static/ace/js/ace/ace.js"></script>
	<!-- inline scripts related to this page -->
	<script type="text/javascript">
		$(top.hangge());
	</script>
<script type="text/javascript" src="static/ace/js/jquery.js"></script>
</body>
</html>