<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Page</title>
<link rel="stylesheet"
	href='<c:url value="/resources/css/login.css"></c:url>' />
</head>
<body>
	<div class="login-wrap">
		<div class="login-html">
			<input id="tab-1" type="radio" name="tab" class="sign-in" checked><label
				for="tab-1" class="tab">Đăng Nhập</label> <input id="tab-2"
				type="radio" name="tab" class="sign-up"><label for="tab-2"
				class="tab">Đăng Ký</label>
			<div class="login-form">
				<div class="sign-in-htm">
					<div class="group">
						<label for="user" class="label">Email</label> <input id="email"
							type="text" class="input">
					</div>
					<div class="group">
						<label for="pass" class="label">Password</label> <input
							id="password" type="password" class="input">
					</div>
					<div class="group">
						<input id="check" type="checkbox" class="check" checked> <label
							for="check"><span class="icon"></span> Lưu đăng nhập</label>
					</div>
					<div class="group">
						<button id="btndangnhap" type="submit" class="button">Đăng
							nhập</button>
					</div>
					<div class="foot-result">
						<label id="result">${result }</label>
					</div>
				</div>
				<div class="sign-up-htm">
					<form action="" method="post">
						<div class="group">
							<label for="user" class="label">Username</label> <input id="user"
								type="text" class="input" name="username">
						</div>
						<div class="group">
							<label for="email" class="label">Email</label> <input
								id="email-signup" type="text" class="input" name="email">
						</div>
						<div class="group">
							<label for="pass" class="label">Password</label> <input
								id="password-signup" type="password" class="input"
								name="password">
						</div>
						<div class="group">
							<label for="pass" class="label">Repeat Password</label> <input
								id="pass" type="password" class="input" name="repassword">
						</div>

						<div class="group">
							<input type="submit" class="button" value="Đăng ký">
						</div>
						<div class="foot-result">
							<label id="result">${result }</label>
						</div>
						<div class="hr"></div>
						<div class="foot-lnk">
							<label for="tab-1">Đã có tài khoản, đăng nhập ?</label>
						</div>
					</form>
				</div>

			</div>
		</div>
	</div>
	​
	<jsp:include page="footer.jsp" />
</body>

</html>