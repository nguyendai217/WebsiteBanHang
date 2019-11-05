<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>GioHang Page</title>
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
					<a class="navbar-brand" href="../"
						style="margin-left: 15px !important;">ShopTK</a>
				</div>

				<!-- Collect the nav links, forms, and other content for toggling -->
				<div class="collapse navbar-collapse"
					id="bs-example-navbar-collapse-1">
					<ul class="nav navbar-nav navbar-center">
						<li><a href="../" class="active">Trang Chủ </a></li>
						<li class="dropdown">
						<a href="#" class="dropdown-toggle"
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
								<li><a href="../dangnhap/">Đăng nhập</a></li>
							</c:otherwise>
						</c:choose>
						<li><a href="../giohang/" class="giohanggg">Giỏ Hàng(${soluongSP })</a></li>
					</ul>
				</div>
			</div>
		</nav>
	</div>


	<div class="container">
		<div class="row">
			<div class="col-md-12">
				<h2>Giỏ Hàng Sản Phẩm</h2>
				<table class="table">
					<thead>
						<tr>
							<td><h5>Tên Sản Phẩm</h5></td>
							<td><h5>Màu Sản Phẩm</h5></td>
							<td><h5>Size Sản Phẩm</h5></td>
							<td><h5>Số Lượng</h5></td>
							<td><h5>Giá Tiền</h5></td>
							<td><h5>Tuỳ Chọn</h5></td>
						</tr>
					</thead>

					<tbody>
						<c:forEach var="value" items="${giohangs }">
							<tr>
								<td class="tensp" data-masp="${value.getMasp() }">${value.getTensp() }</td>
								<td class="mau" data-mamau="${value.getMamau() }">${value.getTenmau() }</td>
								<td class="size" data-masize="${value.getMasize() }">${value.getTensize() }</td>
								<td><input class="slg"  type="number" min="1" value="${value.getSoluong() }" /></td>
								<td class="gt" data-value="${value.getGiatien() }"> ${value.getGiatien() }</td>
								<td id="btn-xoa" class=" btn btn-danger">Xoá</td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</div>
		</div>
		<div class="row">
			<div class="col-md-9"></div>
			<div class="col-md-3">
				<h4 style="color: red;" id="tongtien"></h4>
			</div>

		</div>

		<div class="row">
			<div class="col-md-12">
				<h2>Thông tin người nhận</h2>
				<form action="" method="post">
					<div class="form-group">
						<label>Tên người nhận</label> <input type="text"
							class="form-control" id="tennguoinhan" name="tenKH"> <label>Địa
							Chỉ</label> <input type="text" class="form-control" id="diachi" name="diaChi">
						<label>Số Điện Thoại</label> <input type="text"
							class="form-control" id="sodienthoai" name="soDT">
					</div>
					<div class="form-group">
					<label>Phương thức nhận hàng</label>
					<div class="radio">
						<label ><input checked="checked" type="radio" name="hinhthucgiao" value="Nhận tại cửa hàng">Nhận tại cửa hàng</label>
					</div>
					<div class="radio">
						<label><input type="radio" name="hinhthucgiao" value="Giao hàng online">Giao hàng online</label>
					</div>
					</div>
					<div class="form-group">
						<label>Nội dung</label>
						<textarea class="form-control" rows="3" name="ghichu"></textarea>
					</div>
					<div class="row">
						<div class="col-md-10"></div>
						<div class="col-md-2">
							<button class="btn btn-success">Đặt Hàng</button>
							<button class="btn btn-danger">Huỷ bỏ</button>
						</div>
					</div>
				</form>
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