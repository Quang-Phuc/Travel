<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>AdminLTE 2 | Compose Message</title>
<meta
	content='width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no'
	name='viewport'>
<!-- Bootstrap 3.3.2 -->
<link href="css2/bootstrap.min.css" rel="stylesheet" type="text/css" />
<!-- Font Awesome Icons -->
<link
	href="https://maxcdn.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css"
	rel="stylesheet" type="text/css" />
<!-- Ionicons -->
<link
	href="http://code.ionicframework.com/ionicons/2.0.0/css/ionicons.min.css"
	rel="stylesheet" type="text/css" />
<!-- fullCalendar 2.2.5-->
<link href="css2/fullcalendar.min.css" rel="stylesheet" type="text/css" />
<link href="css2/fullcalendar.print.css" rel="stylesheet"
	type="text/css" media='print' />
<!-- Theme style -->
<link href="css2/AdminLTE.min.css" rel="stylesheet" type="text/css" />
<!-- AdminLTE Skins. Choose a skin from the css/skins
         folder instead of downloading all of them to reduce the load. -->
<link href="css2/_all-skins.min.css" rel="stylesheet" type="text/css" />
<!-- iCheck -->
<link href="css2/blue.css" rel="stylesheet" type="text/css" />
<!-- bootstrap wysihtml5 - text editor -->
<link href="css2/bootstrap3-wysihtml5.min.css" rel="stylesheet"
	type="text/css" />
<script src="ckeditor/ckeditor.js"></script>

<!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.3.0/respond.min.js"></script>
    <![endif]-->
</head>
<body class="skin-blue">
	<div class="wrapper">

		<header class="main-header">
			<a href="../../index2.html" class="logo"><b>XIN CHÀO</b></a>
			<!-- Header Navbar: style can be found in header.less -->
			<nav class="navbar navbar-static-top" role="navigation">
				<!-- Sidebar toggle button-->
				<a href="#" class="sidebar-toggle" data-toggle="offcanvas"
					role="button"> <span class="sr-only">Toggle navigation</span> <span
					class="icon-bar"></span> <span class="icon-bar"></span> <span
					class="icon-bar"></span>
				</a>
				<div class="navbar-custom-menu">
					<ul class="nav navbar-nav">
						<!-- Messages: style can be found in dropdown.less-->
						<li class="dropdown messages-menu"></li>
						<!-- Notifications: style can be found in dropdown.less -->

						<!-- Tasks: style can be found in dropdown.less -->

						<!-- User Account: style can be found in dropdown.less -->

					</ul>
				</div>
			</nav>
		</header>
		<!-- Left side column. contains the logo and sidebar -->
		<aside class="main-sidebar">
			<!-- sidebar: style can be found in sidebar.less -->
			<section class="sidebar">
				<!-- Sidebar user panel -->
				<div class="user-panel">
					<div class="pull-left image"></div>

				</div>
				<!-- search form -->
				<form action="#" method="get" class="sidebar-form">
					<div class="input-group">
						<input type="text" name="q" class="form-control"
							placeholder="Search..." /> <span class="input-group-btn">
							<button type='submit' name='seach' id='search-btn'
								class="btn btn-flat">
								<i class="fa fa-search"></i>
							</button>
						</span>
					</div>
				</form>
				<!-- /.search form -->
				<!-- sidebar menu: : style can be found in sidebar.less -->
				<ul class="sidebar-menu">
					
					<li class="treeview"><a href="#"> <i
							class="fa fa-dashboard"></i> <span>Danh sách trang</span> <i
							class="fa fa-angle-left pull-right"></i>
					</a>
						<ul class="treeview-menu">
							<li><a href="index"><i class="fa fa-circle-o"></i> Trang
									chủ</a></li>
							<li><a href="sale"><i class="fa fa-circle-o"></i> Khuyễn
									Mãi</a></li>
							<li><a href="index"><i class="fa fa-circle-o"></i>Địa
									điểm</a></li>
							<li><a href="index"><i class="fa fa-circle-o"></i> Ẩm
									thực</a></li>
							<li><a href="index"><i class="fa fa-circle-o"></i> Đặt
									Tour</a></li>
							<li><a href="index"><i class="fa fa-circle-o"></i> Khách
									Sạn</a></li>
							<li><a href="index"><i class="fa fa-circle-o"></i> Vé
									Máy Bay</a></li>
							<li><a href="index"><i class="fa fa-circle-o"></i> Quà
									Tặng</a></li>
						</ul></li>

					<li></li>








				</ul>
			</section>
			<!-- /.sidebar -->
		</aside>

		<!-- Right side column. Contains the navbar and content of the page -->
		<div class="content-wrapper">


			<!-- Main content -->
			<form action="savebookCar" method="post">
			<input type="hidden" name="car.carId" value="<c:out value="${carBycarId.carId}"></c:out>" /> 
				<section class="content">
					<div class="row">

						<div class="col-md-9">
							<div class="box box-primary">
								<div class="box-header with-border">
									<h3 class="box-title">Điền đầy đủ thông tin đặt xe</h3>
								</div>
								<!-- /.box-header -->
								<div class="box-body">


									<div class="form-group">
										<label>Nhập họ tên :</label> <input name="name"
											class="form-control" placeholder="Tiêu đề:" />
									</div>
									<label>Số lượng người đi</label>
									<div class="form-group">

										<input type="number" name="personNumber"
											class="form-control"  />
									</div>
									<div class="form-group">
										<label>Ngày đi</label>
										<input type="date" name="timeGo"
											class="form-control"  />
									</div>

									<div class="form-group">
										<label>Thông tin cụ thể</label>
										<textarea id="editor1" name="place" cols="80" rows="10">
						
					</textarea>
									</div>
									<div class="form-group">
										<label>Số điện thoại liên hệ:</label>
										<input type="number" name="phoneNumber"
											class="form-control"  />
									</div>
								</div>
								<!-- /.box-body -->
								<div class="box-footer">
									<div class="pull-right">

										<button type="submit" class="btn btn-primary">Đặt xe ngay</button>
									</div>
									<button class="btn btn-default">
										<i class="fa fa-times"></i> Hủy
									</button>
								</div>
								<!-- /.box-footer -->
							</div>
							<!-- /. box -->
						</div>
						<!-- /.col -->
					</div>
					<!-- /.row -->
				</section>
				<!-- /.content -->
			</form>
		</div>
		<!-- /.content-wrapper -->

		<jsp:include page="footerAdmin.jsp" />