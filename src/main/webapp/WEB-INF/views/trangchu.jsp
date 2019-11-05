<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>

<html>
<head>
<meta charset="UTF-8">
<title>Trang Chu Page</title>
<jsp:include page="header.jsp" />
</head>
<body>
	<div id="header" class="container-fluid">
		<nav class="navbar navbar-default none-nav">
			<div class="container-fluid" style="background-color: black;">
				<!-- Brand and toggle get grouped for better mobile display -->
				<div class="navbar-header">
					<button type="button" class="navbar-toggle collapsed"
						data-toggle="collapse" data-target="#bs-example-navbar-collapse-1"
						aria-expanded="false">
						<span class="sr-only">Toggle navigation</span> <span
							class="icon-bar"></span><span class="icon-bar"></span> <span
							class="icon-bar"></span>
					</button>
					<a class="navbar-brand" href=""
						style="margin-left: 15px !important;">ShopTK</a>
				</div>

				<!-- Collect the nav links, forms, and other content for toggling -->
				<div class="collapse navbar-collapse"
					id="bs-example-navbar-collapse-1">
					<ul class="nav navbar-nav navbar-center">
						<li><a href="" class="active">Trang Chủ </a></li>
						<li class="dropdown"><a href="#" class="dropdown-toggle"
							data-toggle="dropdown" role="button" aria-haspopup="true"
							aria-expanded="false"> Sản Phẩm <span class="caret"></span></a>
							<ul class="dropdown-menu">
								<c:forEach var="getdmsp" items="${dmsp }">
									<li class="click-li"><a
										href="sanpham/${getdmsp.getMaDM() }/${getdmsp.getTenDM() }">${getdmsp.getTenDM() }</a></li>
								</c:forEach>
							</ul></li>
						<li><a href="">Dịch Vụ</a></li>
						<li><a href="">Liên Hệ</a></li>
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
						<li><a href="giohang/">Giỏ Hàng</a></li>
					</ul>
				</div>
			</div>
		</nav>
		<div id="myCarousel" class="carousel slide" data-ride="carousel">
			<!-- Indicators -->
			<ol class="carousel-indicators">
				<li data-target="#myCarousel" data-slide-to="0" class="active"></li>
				<li data-target="#myCarousel" data-slide-to="1"></li>
				<li data-target="#myCarousel" data-slide-to="2"></li>
				<li data-target="#myCarousel" data-slide-to="3"></li>
				
			</ol>

			<!-- Wrapper for slides -->
			<div class="carousel-inner">
				<div class="item active">
					<img src='<c:url value="/resources/images/slider1.jpg"></c:url>' style="width: 100%;  height:380px; ">
				</div>

				<div class="item">
					<img src='<c:url value="/resources/images/slider2.jpg"></c:url>'  style="width: 100%; height:380px; ">
				</div>

				<div class="item">
					<img src='<c:url value="/resources/images/slider3.jpg"></c:url>' style="width: 100%; height:380px; ">
				</div>
				<div class="item">
					<img src='<c:url value="/resources/images/slider4.png"></c:url>' style="width: 100%; height:380px; ">
				</div>
			</div>

			<!-- Left and right controls -->
			<a class="left carousel-control" href="#myCarousel" data-slide="prev">
				<span class="glyphicon glyphicon-chevron-left"></span> <span
				class="sr-only">Previous</span>
			</a><a class="right carousel-control" href="#myCarousel"
				data-slide="next"> <span
				class="glyphicon glyphicon-chevron-right"></span> <span
				class="sr-only">Next</span>
			</a>
		</div>

	</div>

	<div id="info" class="container">
		<div class="row">
			<div class="col-12 col-sm-4 col-md-4">
				<img alt=""
					src='<c:url value="/resources/images/icons/icons-quality.png"></c:url>'><br>
				<span style="font-size: 28px; font-weight: bold;"> Chất lượng
				</span><br> <span>Chúng tôi cam kết sẽ mang lại sản phẩm chất
					lượng tốt nhất .</span>
			</div>
			<div class="col-12 col-sm-4 col-md-4">
				<img alt=""
					src='<c:url value="/resources/images/icons/icons-money.png"></c:url>'><br>
				<span style="font-size: 28px; font-weight: bold;"> Tiết Kiệm
				</span><br> <span>Tiết kiệm chi phí, tiết kiệm tới 20% giá trị
					sản phẩm </span>
			</div>
			<div class="col-12 col-sm-4 col-md-4">
				<img alt=""
					src='<c:url value="/resources/images/icons/icons-shipper.png"></c:url>'><br>
				<span style="font-size: 28px; font-weight: bold;"> Giao Hàng
				</span><br> <span>Giao hàng nhanh chóng, tiện lợi .</span>
			</div>
		</div>
	</div>

	<div id="title-sp" class="container">
		<span>Sản Phẩm Hot</span>

		<div class="row">
			<c:forEach var="sp" items="${listSP}">

				<div class="col-md-3 col-sm-6 ">

					<div class="sanpham wow pulse" data-wow-duration="2s">
						<a href="chitiet/${sp.getMaSP()}"> <img alt=""
							src='<c:url value="/resources/images/sanpham/${sp.getHinhSP() }"></c:url>'><br>
							<span class="font-image">${sp.getTenSP() }</span><br> <span
							class="font-prise">${sp.getGiaTien() } VND</span>
						</a>
					</div>

				</div>

			</c:forEach>
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