<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<body>
	<div id="wrapper">

		<div id="container">
			<div id="top">
				<div id="languages">
					<ul>
						<li class="hr"><a id="liCroatian" href="#">Hrvatski</a></li>
						<li class="en"><a id="liEnglish" href="#">English</a></li>
						<li class="it"><a id="liItaliano" href="#">Italiano</a></li>
						<li class="de"><a id="liDeutsch" href="#">Deutsch</a></li>
					</ul>
				</div>
				<!-- Table information -->
				<table
					style="padding-left: 250px; padding-top: 20px; padding-bottom: 10px;">
					<tr>
						<th><h4>
								<strong>Nhận đặt Tour du lịch Đà Nẵng - <c:forEach
										items="${listTravel}" var="listTravel">

										<a
											href="DetailTravelContent?travelId=<c:out value="${listTravel.travelId }"></c:out>">
											<c:out value="${listTravel.title }"></c:out>
										</a> 
                      					  -
                       
    							</c:forEach>
								</strong>
							</h4></th>
					</tr>



					<tr style="padding-left: 500px;">
						<td><strong>Liên hệ : &nbsp; &nbsp;</strong> 0866578696</td>
					</tr>

					<tr>
						<td><strong>WebChat : &nbsp; &nbsp;</strong><a href="">Tongquyet1996</a>-<a
							href="">Si0976248990</a></td>
					</tr>

					<tr>
						<td><strong>Gmail : &nbsp; &nbsp;</strong>
							tongmanhquyet969@gmai.com</td>
					</tr>

					<tr>
						<td><strong>Hotline :&nbsp; &nbsp;</strong> 0976248990</td>
					</tr>
				</table>
				<!--End  Table information -->



			</div>
		</div>
		<!--End -->
		<div class="clear"></div>
		<div id="header">
			<div id="slideshow">
				<ul id="nav">
					<li id="prev"><a href="#">Previous</a></li>
					<li id="next"><a href="#">Next</a></li>
				</ul>
				<ul id="slides">
					<li><img src="images/slide1.jpg" alt="" /></li>
					<li><img src="images/slide2.jpg" alt="" /></li>
					<li><img src="images/slide3.jpg" alt="" /></li>
					<li><img src="images/slide4.jpg" alt="" /></li>
					<li><img src="images/slide5.jpg" alt="" /></li>
				</ul>
			</div>
		</div>
		<div id="sadrzaj">
			<div id="navigacija" class="jqueryslidemenu">
				<ul class="primary-menu">
					<li class="\"><a href="index">Home</a></li>
					<li><a href="sale">Khuyễn Mãi</a></li>
					<li><a href="#">Địa Điểm</a>
						<ul>
							<c:forEach items="${listTravel}" var="listTravel">

						<li><a
							href="DetailTravelContent?travelId=<c:out value="${listTravel.travelId }"></c:out>">
								<c:out value="${listTravel.title }"></c:out>
						</a></li>

					</c:forEach>
						</ul></li>


					

					<li><a href="#">Ẩm thực</a></li>

					<li><a href="#">Đặt Tour</a></li>
					<li class="drop"><a href="#">Khách Sạn &raquo;</a>
						<ul>
							<li><a href="#">Sample Drop Down Menu</a></li>
							<li><a href="#">Sample Drop Down Menu</a></li>
							<li><a href="#">Sample Drop Down Menu</a></li>
							<li><a href="#">Sample Drop Down Menu</a></li>
						</ul></li>
					<li class="drop"><a href="#">Vé Máy Bay &raquo;</a>
						<ul>

							<c:forEach items="${listPlanes}" var="listPlanes">
								<li><a
									href="<c:out value="${listPlanes.planesLink }"></c:out>">Đi
										tới trang</a></li>

							</c:forEach>







						</ul></li>
					<li class="last"><a href="car">Đặt xe</a></li>
				</ul>
			</div>