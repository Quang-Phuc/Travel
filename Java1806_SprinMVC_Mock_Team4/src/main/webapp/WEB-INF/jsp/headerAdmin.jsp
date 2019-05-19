<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
  <head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>AdminLTE 2 | Compose Message</title>
    <meta content='width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no' name='viewport'>
    <!-- Bootstrap 3.3.2 -->
    <link href="css2/bootstrap.min.css" rel="stylesheet" type="text/css" />
    <!-- Font Awesome Icons -->
    <link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css" rel="stylesheet" type="text/css" />
    <!-- Ionicons -->
    <link href="http://code.ionicframework.com/ionicons/2.0.0/css/ionicons.min.css" rel="stylesheet" type="text/css" />
    <!-- fullCalendar 2.2.5-->
    <link href="css2/fullcalendar.min.css" rel="stylesheet" type="text/css" />
    <link href="css2/fullcalendar.print.css" rel="stylesheet" type="text/css" media='print' />
    <!-- Theme style -->
    <link href="css2/AdminLTE.min.css" rel="stylesheet" type="text/css" />
    <!-- AdminLTE Skins. Choose a skin from the css/skins
         folder instead of downloading all of them to reduce the load. -->
    <link href="css2/_all-skins.min.css" rel="stylesheet" type="text/css" />
    <!-- iCheck -->
    <link href="css2/blue.css" rel="stylesheet" type="text/css" />
    <!-- bootstrap wysihtml5 - text editor -->
    <link href="css2/bootstrap3-wysihtml5.min.css" rel="stylesheet" type="text/css" />
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
          <a href="#" class="sidebar-toggle" data-toggle="offcanvas" role="button">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </a>
          <div class="navbar-custom-menu">
            <ul class="nav navbar-nav">
              <!-- Messages: style can be found in dropdown.less-->
              <li class="dropdown messages-menu">
                
                
              </li>
              <!-- Notifications: style can be found in dropdown.less -->
              
              <!-- Tasks: style can be found in dropdown.less -->
             
              <!-- User Account: style can be found in dropdown.less -->
              <li class="dropdown user user-menu">
                <a href="admin" class="dropdown-toggle" data-toggle="dropdown">
                  <span class="hidden-xs">Đăng xuất</span>
                </a>
                <ul class="dropdown-menu">
                  <!-- User image -->
                  <li class="user-header">
                    <img src="../../dist/img/user2-160x160.jpg" class="img-circle" alt="User Image" />
                    <p>
                      Alexander Pierce - Web Developer
                      <small>Member since Nov. 2012</small>
                    </p>
                  </li>
                  <!-- Menu Body -->
                  <li class="user-body">
                    <div class="col-xs-4 text-center">
                      <a href="#">Followers</a>
                    </div>
                    <div class="col-xs-4 text-center">
                      <a href="#">Sales</a>
                    </div>
                    <div class="col-xs-4 text-center">
                      <a href="#">Friends</a>
                    </div>
                  </li>
                  <!-- Menu Footer-->
                  <li class="user-footer">
                    <div class="pull-left">
                      <a href="#" class="btn btn-default btn-flat">Profile</a>
                    </div>
                    <div class="pull-right">
                      <a href="#" class="btn btn-default btn-flat">Sign out</a>
                    </div>
                  </li>
                </ul>
              </li>
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
            <div class="pull-left image">
              
            </div>
            <div class="pull-left info">
              <p>Xin chào :<c:out value="${userSession.userName }"></c:out></p>

              <a href="#"><i class="fa fa-circle text-success"></i> Online</a>
            </div>
          </div>
          <!-- search form -->
          <form action="#" method="get" class="sidebar-form">
            <div class="input-group">
              <input type="text" name="q" class="form-control" placeholder="Search..."/>
              <span class="input-group-btn">
                <button type='submit' name='seach' id='search-btn' class="btn btn-flat"><i class="fa fa-search"></i></button>
              </span>
            </div>
          </form>
          <!-- /.search form -->
          <!-- sidebar menu: : style can be found in sidebar.less -->
          <ul class="sidebar-menu">
            <li class="header">MENU ADMIN</li>
            <li class="treeview">
              <a href="#">
                <i class="fa fa-dashboard"></i> <span>Danh sách trang</span> <i class="fa fa-angle-left pull-right"></i>
              </a>
              <ul class="treeview-menu">
                <li><a href="index"><i class="fa fa-circle-o"></i> Trang chủ</a></li>
                <li><a href="sale"><i class="fa fa-circle-o"></i> Khuyễn Mãi</a></li>
				 <li><a href="index"><i class="fa fa-circle-o"></i>Địa điểm</a></li>
                <li><a href="index"><i class="fa fa-circle-o"></i> Ẩm thực</a></li>
				 <li><a href="index"><i class="fa fa-circle-o"></i> Đặt Tour</a></li>
                <li><a href="index"><i class="fa fa-circle-o"></i> Khách Sạn</a></li>
				 <li><a href="index"><i class="fa fa-circle-o"></i> Vé Máy Bay</a></li>
                <li><a href="index"><i class="fa fa-circle-o"></i> Quà Tặng</a></li>
              </ul>
            </li>
            
            <li>
             
            </li>
            <li class="treeview">
              <a href="#">
                <i class="fa fa-pie-chart"></i>
                <span>Đăng tin</span>
                <i class="fa fa-angle-left pull-right"></i>
              </a>
              <ul class="treeview-menu">
                <li><a href="saveHome"><i class="fa fa-circle-o"></i>Tin trang chủ - Home</a></li>
                <li><a href="saveTravel"><i class="fa fa-circle-o"></i>Tin địa điểm</a></li>
				 <li><a href="saveTravelContent"><i class="fa fa-circle-o"></i>Thông tin chi tiết địa điểm</a></li>
                <li><a href="saveSale"><i class="fa fa-circle-o"></i>Tin khuyễn mãi</a></li>
				 <li><a href="index"><i class="fa fa-circle-o"></i>Tin Đặt Tour</a></li>
                <li><a href="index"><i class="fa fa-circle-o"></i>Tin Khách Sạn</a></li>
				 <li><a href="savePlanes"><i class="fa fa-circle-o"></i>Tin Vé Máy Bay</a></li>
                <li><a href="saveCar"><i class="fa fa-circle-o"></i> Tin Xe</a></li>
              </ul>
            </li>
            
            
           
            
            
            <li class="treeview">
              <a href="#">
                <i class="fa fa-share"></i> <span>Quản lý người dùng</span>
                <i class="fa fa-angle-left pull-right"></i>
              </a>
              <ul class="treeview-menu">
                <li><a href="register"><i class="fa fa-circle-o"></i> Thêm người dùng</a></li>
                <li>
                  <a href="viewUser"><i class="fa fa-circle-o"></i> Danh sách người dùng <i class="fa fa-angle-left pull-right"></i></a>
                  
                </li>
               
              </ul>
            </li>
            <li><a href="index"><i class="fa fa-book"></i>Tài Liệu</a></li>
           
          </ul>
        </section>
        <!-- /.sidebar -->
      </aside>

      <!-- Right side column. Contains the navbar and content of the page -->
      <div class="content-wrapper">
        <!-- Content Header (Page header) -->
        <section class="content-header">
          
          <ol class="breadcrumb">
            <li><a href="#"><i class="fa fa-dashboard"></i> Home</a></li>
            <li class="active">Mailbox</li>
          </ol>
        </section>