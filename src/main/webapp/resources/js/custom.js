$(document).ready(
		function() {
			$("#btndangnhap").click(function() {

				var email = $("#email").val();
				var password = $("#password").val();

				$.ajax({
					url : "/ShopTK/api/KiemTraDangNhap",
					type : "GET",
					data : {
						email : email,
						password : password
					},
					success : function(value) {
						if (value == "true") {
							linkhientai = window.location.href;
							link = linkhientai.replace("dangnhap/", "");
							window.location = link;
						} else {
							$("#result").text("Đăng nhập thất bại !")
						}
					}
				})
			});

			$(".btn-giohangg").click(
					function() {
						var mamau = $(this).closest("tr").find(".mau").attr(
								"data-mamau");
						var tenmau = $(this).closest("tr").find(".mau").text();
						var masize = $(this).closest("tr").find(".size").attr(
								"data-masize");
						var tensize = $(this).closest("tr").find(".size")
								.text();
						var tensp = $("#tensp").text();
						var masp = $("#tensp").attr("data-masp");
						var soluong = $(this).closest("tr").find(".soluong")
								.text();
						var giatien = $("#giatien").attr("data-value");
						var machitiet = $(this).attr("data-mact");

						$.ajax({
							url : "/ShopTK/api/AddGioHang",
							type : "GET",
							data : {
								masp : masp,
								masize : masize,
								mamau : mamau,
								tensp : tensp,
								tensize : tensize,
								giatien : giatien,
								tenmau : tenmau,
								soluong : soluong,
								machitiet : machitiet

							},
							success : function(value) {
								$(".giohanggg")
										.html("Giỏ Hàng( " + value + ")");
							}
						})
					});
			$("#btn-xoa").click(
					function() {
						var self = $(this);
						var mamau = $(this).closest("tr").find(".mau").attr(
								"data-mamau");
						var masize = $(this).closest("tr").find(".size").attr(
								"data-masize");
						var masp = $(this).closest("tr").find(".tensp").attr(
								"data-masp");

						$.ajax({
							url : "/ShopTK/api/XoaGioHang",
							type : "GET",
							data : {
								masp : masp,
								masize : masize,
								mamau : mamau
							},
							success : function(value) {
								self.closest("tr").remove();
								Gantongtien(true);
							}
						})

					})

			Gantongtien();

			function Gantongtien(isEventChange) {
				var ttsp = 0;
				$(".gt").each(
						function() {
							var giatien = $(this).closest("tr").find(".gt")
									.attr("data-value");
							var soluong = $(this).closest("tr").find(".slg")
									.val();

							var tongtien = soluong * giatien;

							ttsp = ttsp + tongtien;

							if (!isEventChange) {
								$(this).html(tongtien);
							}

							var fomatttsp = ttsp.toString().replace(
									/(\d)(?=(\d{3})+(?!\d))/g, '$1.');
							$("#tongtien").html(
									"Tổng tiền :" + fomatttsp + " VND");
						})
			}

			$(".slg").change(
					function() {
						var soluong = $(this).val();
						var giatien = $(this).closest("tr").find(".gt").attr(
								"data-value");
						var tongtien = soluong * parseInt(giatien);

						$(this).closest("tr").find(".gt").html(tongtien);

						Gantongtien(true);

						var mamau = $(this).closest("tr").find(".mau").attr(
								"data-mamau");
						var masize = $(this).closest("tr").find(".size").attr(
								"data-masize");
						var masp = $(this).closest("tr").find(".tensp").attr(
								"data-masp");

						$.ajax({
							url : "/ShopTK/api/updateGioHang",
							type : "GET",
							data : {
								masp : masp,
								masize : masize,
								mamau : mamau,
								soluong : soluong

							},
							success : function(value) {

							}
						})
					})

			$("body").on("click", ".paging-item", function() {
				$(".paging-item").removeClass("active");
				$(this).addClass("active");
				var sotrang = $(this).text();
				var spbatdau = (sotrang - 1) * 5;

				$.ajax({
					url : "/ShopTK/api/getSPLimit",
					type : "GET",
					data : {
						spbatdau : spbatdau,
					},
					success : function(value) {
						var tbodysp = $("#table-sanpham").find("tbody");
						tbodysp.empty();
						tbodysp.append(value);
					}
				})
			})

			$("#check-all").change(function() {
				if (this.checked) {
					$("#table-sanpham input").each(function() {
						$(this).attr("checked", true);
					})
				} else {
					$("#table-sanpham input").each(function() {
						$(this).attr("checked", false);
					})

				}
			})

			$("#btnDelete").click(function() {
				$("#table-sanpham >tbody input:checked").each(function() {
					var maSP = $(this).val();
					var This= $(this);

					$.ajax({
						url : "/ShopTK/api/XoaSP",
						type : "GET",
						data : {
							maSP : maSP,
						},
						success : function(value) {
							This.closest("tr").remove();
						}
					})
				})

			})
		})
