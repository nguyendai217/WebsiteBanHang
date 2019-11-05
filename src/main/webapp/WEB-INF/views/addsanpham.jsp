<!--
Author: W3layouts
Author URL: http://w3layouts.com
License: Creative Commons Attribution 3.0 Unported
License URL: http://creativecommons.org/licenses/by/3.0/
-->
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE HTML>
<html>
<head>
<title>Pooled Admin Panel Category Flat Bootstrap Responsive Web
	Template | Home :: w3layouts</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords"
	content="Pooled Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, 
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design" />
<script type="application/x-javascript">
	
	
	
	

addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } 





</script>
<!-- Bootstrap Core CSS -->
<link rel="stylesheet"
	href='<c:url value="/resources/bootstrap/css/bootstrap.min.css"></c:url>' />
<!-- Custom CSS -->
<link rel="stylesheet"
	href='<c:url value="/resources/css/style.css"></c:url>' />

<link rel="stylesheet"
	href='<c:url value="/resources/css/morris.css"></c:url>' />
<!-- Graph CSS -->
<link rel="stylesheet"
	href='<c:url value="/resources/css/font-awesome.css"></c:url>' />
<!-- jQuery -->
<script src='<c:url value="/resources/js/jquery-3.4.1.min.js"></c:url>'></script>
<!-- //jQuery -->
<link
	href='//fonts.googleapis.com/css?family=Roboto:700,500,300,100italic,100,400'
	rel='stylesheet' type='text/css' />
<link href='//fonts.googleapis.com/css?family=Montserrat:400,700'
	rel='stylesheet' type='text/css'>
<!-- lined-icons -->
<link rel="stylesheet"
	href='<c:url value="/resources/css/icon-font.min.css"></c:url>' />
<!-- //lined-icons -->
</head>
<body>
	<div class="page-container">
		<!--/content-inner-->
		<div class="left-content container">
			<h2 style="text-align: center;">Sản Phẩm</h2>
			<div class="row">
				<div style="float: right; margin-right: 180px;">
					<button class="btn btn-primary">Them San Pham</button>
					<button id="btnDelete" class="btn btn-info">Xoa</button>
				</div>
				<table id="table-sanpham" class="table">
					<thead class="thead-dark">
						<tr>
							<td>
								<div class="checkbox">
									<label><input id="check-all" type="checkbox" value="" /></label>
								</div>
							</td>
							<td>Tên Sản Phẩm</td>
							<td>Giá Tiền</td>
							<td>Giành Cho</td>
						</tr>
					</thead>
					<tbody>
						<c:forEach var="listsp" items="${listSP }">
							<tr>
								<td>
									<div class="checkbox">
										<label><input type="checkbox"
											value="${listsp.getMaSP() }" /></label>
									</div>
								</td>
								<td class="tensp">${listsp.getTenSP() }</td>
								<td class="giatien">${listsp.getGiaTien() }</td>
								<td class="gianhcho">${listsp.getGianhcho() }</td>
							</tr>
						</c:forEach>
					</tbody>
				</table>

				<ul class="pagination" style="margin-left: 500px !important;">
					<c:forEach var="i" begin="1" end="${ tongpage }">
						<c:choose>
							<c:when test="${i==1 }">
								<li class="paging-item active"><a href="#">${i }</a></li>
							</c:when>
							<c:otherwise>
								<li class="paging-item"><a href="#">${i }</a></li>
							</c:otherwise>
						</c:choose>
					</c:forEach>
				</ul>
			</div>
		</div>
		<!--//content-inner-->
		<!--/sidebar-menu-->
		<div class="sidebar-menu">
			<header class="logo1">
				<a href="#" class="sidebar-icon"> <span class="fa fa-bars"></span>
				</a>
			</header>
			<div style="border-top: 1px ridge rgba(255, 255, 255, 0.15)"></div>
			<div class="menu">
				<ul id="menu">
					<li><a href="index.html"><i class="fa fa-tachometer"></i>
							<span>Dashboard</span>
							<div class="clearfix"></div></a></li>
					<li id="menu-academico"><a href="/addsanpham.jsp"><i
							class="fa fa-envelope nav_icon"></i><span>Sản Phẩm </span>
							<div class="clearfix"></div></a></li>
					<li><a href="gallery.html"><i class="fa fa-picture-o"
							aria-hidden="true"></i><span>Gallery</span>
							<div class="clearfix"></div></a></li>
				</ul>
			</div>
		</div>
		<div class="clearfix"></div>
	</div>
	<script>
		var toggle = true;

		$(".sidebar-icon").click(
				function() {
					if (toggle) {
						$(".page-container").addClass("sidebar-collapsed")
								.removeClass("sidebar-collapsed-back");
						$("#menu span").css({
							"position" : "absolute"
						});
					} else {
						$(".page-container").removeClass("sidebar-collapsed")
								.addClass("sidebar-collapsed-back");
						setTimeout(function() {
							$("#menu span").css({
								"position" : "relative"
							});
						}, 400);
					}

					toggle = !toggle;
				});
	</script>
	<!--js -->

	<script
		src='<c:url value="/resources/js/jquery.nicescroll.js"></c:url>'></script>
	<script src='<c:url value="/resources/js/scripts.js"></c:url>'></script>
	<script src='<c:url value="/resources/js/custom.js"></c:url>'></script>
	<!-- Bootstrap Core JavaScript -->
	<script src='<c:url value="/resources/js/bootstrap.min.js"></c:url>'></script>
	<!-- /Bootstrap Core JavaScript -->
	<!-- morris JavaScript -->
	<script src='<c:url value="/resources/js/raphael-min.js"></c:url>'></script>
	<script src='<c:url value="/resources/js/morris.js"></c:url>'></script>
	<script>
		$(document).ready(
				function() {
					//BOX BUTTON SHOW AND CLOSE
					jQuery('.small-graph-box').hover(function() {
						jQuery(this).find('.box-button').fadeIn('fast');
					}, function() {
						jQuery(this).find('.box-button').fadeOut('fast');
					});
					jQuery('.small-graph-box .box-close').click(function() {
						jQuery(this).closest('.small-graph-box').fadeOut(200);
						return false;
					});
				});
	</script>
</body>
</html>