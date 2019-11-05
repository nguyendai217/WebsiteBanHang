<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Chi Tiet Page</title>
<jsp:include page="header.jsp" />
</head>
<body>
	<div class="container-fluid" style="background-color: black;">
		<nav class="navbar navbar-default none-nav">
			<div class="container-fluid">
				<!-- Brand and toggle get grouped for better mobile display -->
				<div class="navbar-header">
					<button type="button" class="navbar-toggle collapsed"
						data-toggle="collapse" data-target="#bs-example-navbar-collapse-1"
						aria-expanded="false">
						<span class="sr-only">Toggle navigation</span> <span
							class="icon-bar"></span> <span class="icon-bar"></span> <span
							class="icon-bar"></span>
					</button>
					<a class="navbar-brand" href="#"
						style="margin-left: 15px !important;">ShopTK</a>
				</div>

				<!-- Collect the nav links, forms, and other content for toggling -->
				<div class="collapse navbar-collapse"
					id="bs-example-navbar-collapse-1">
					<ul class="nav navbar-nav navbar-center">
						<li><a href="/" class="active">Trang Chủ </a></li>
						<li class="dropdown"><a href="#" class="dropdown-toggle"
							data-toggle="dropdown" role="button" aria-haspopup="true"
							aria-expanded="false"> Sản Phẩm <span class="caret"></span></a>
							<ul class="dropdown-menu">
								<c:forEach var="getdmsp" items="${dmsp }">
									<li><a href='<c:url value="/sanpham/${getdmsp.getMaDM() }/${getdmsp.getTenDM() }"></c:url>'>${getdmsp.getTenDM() }</a></li>
								</c:forEach>
							</ul></li>
						<li><a href="../">Dịch Vụ</a></li>
						<li><a href="../">Liên Hệ</a></li>
					</ul>
					<ul class="nav navbar-nav navbar-right">
						<c:choose>
							<c:when test="${name != null }">
								<li><a class="circle" href="dangnhap/"><span>${name }</span></a>
								</li>
							</c:when>
							<c:otherwise>
								<li><a href="dangnhap/">Đăng nhập</a></li>
							</c:otherwise>
						</c:choose>
						<li><a href='<c:url value="/giohang/"></c:url>' class="giohanggg">Giỏ Hàng(${Giohang })</a></li>
					</ul>
				</div>
			</div>
		</nav>
	</div>
	<div class="container" style="margin: 20px !important;">
		<div class="row">
			<div class="col-sm-2 col-md-2">
				<h4>Danh mục sp:</h4>
				<ul>
					<c:forEach var="getdmsp" items="${dmsp }">
						<li><a href='<c:url value="/sanpham/${getdmsp.getMaDM() }/${getdmsp.getTenDM() }"></c:url>'>${getdmsp.getTenDM() }</a></li>
					</c:forEach>
				</ul>
			</div>
			<div class="col-sm-8 col-md-8">
				<div id="title-sp" class="container">
					<span>${tenDM}</span>

					<div class="row">
						<c:forEach var="sp" items="${listSPDM}">
							<div class="col-md-3 col-sm-6 ">
								<div class="sanpham wow pulse" data-wow-duration="2s">
									<a href='<c:url value="/chitiet/${sp.getMaSP()}"></c:url>'> <img alt=""
										src='<c:url value="/resources/images/sanpham/${sp.getHinhSP() }"></c:url>'><br>
										<span class="font-image">${sp.getTenSP() }</span><br> <span
										class="font-prise">${sp.getGiaTien() } VND</span>
									</a>
								</div>

							</div>

						</c:forEach>
					</div>
				</div>
			</div>
		</div>
	</div>

	<div id="footer" class="container-fluid">
		<div class="row">
			<div class="col-sm-4 col-md-4 thongtin">
				<span style="font-size: 25px;">Thông tin shop</span><br> <span>
					Shop chuyên cung cấp các mẫu mã quần áo mới nhất, thời trang cho
					tất cả mọi lứa tuổi !</span><br> <span>Địa Chỉ : Số 10 Đống
					Đa, Hà Nội</span>
			</div>
			<div class="col-sm-4 col-md-4 thongtin">
				<span style="font-size: 25px;">Liên Hệ</span><br> <span>0123456789</span>
			</div>
			<div class="col-sm-4 col-md-4 gopy">
				<span style="font-size: 25px; color: white;">Góp Ý</span><br> <input
					type="text" placeholder="Username"><br>
				<textarea rows="3" cols="30" placeholder="Comment"></textarea>
				<br>
				<button id="btn-send">Gửi</button>
			</div>
		</div>
	</div>


	<jsp:include page="footer.jsp" />
</body>
</html>