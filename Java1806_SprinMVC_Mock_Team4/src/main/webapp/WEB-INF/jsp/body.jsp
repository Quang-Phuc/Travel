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


			<!-- search home -->
			<div class="s003">
				<form>
					<div class="inner-form">
						<div class="input-field first-wrap">
							<div class="input-select">
								<select data-trigger="" name="choices-single-defaul">
									<option placeholder="">-- Lựa chon --</option>
									<option>
										<c:forEach items="${listTravel}" var="listTravel">

											<a
												href="DetailTravelContent?travelId=<c:out value="${listTravel.travelId }"></c:out>">
												<c:out value="${listTravel.title }"></c:out>
											</a>


										</c:forEach>
									</option>

								</select>
							</div>
						</div>
						<!--  <div class="input-field second-wrap">
            <input id="search" type="text" placeholder="Enter Keywords?" />
          </div> -->
						<div class="input-field third-wrap">
							<button class="btn-search" type="button">
								<svg class="svg-inline--fa fa-search fa-w-16" aria-hidden="true"
									data-prefix="fas" data-icon="search" role="img"
									xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512">
                <path fill="currentColor"
										d="M505 442.7L405.3 343c-4.5-4.5-10.6-7-17-7H372c27.6-35.3 44-79.7 44-128C416 93.1 322.9 0 208 0S0 93.1 0 208s93.1 208 208 208c48.3 0 92.7-16.4 128-44v16.3c0 6.4 2.5 12.5 7 17l99.7 99.7c9.4 9.4 24.6 9.4 33.9 0l28.3-28.3c9.4-9.4 9.4-24.6.1-34zM208 336c-70.7 0-128-57.2-128-128 0-70.7 57.2-128 128-128 70.7 0 128 57.2 128 128 0 70.7-57.2 128-128 128z"></path>
              </svg>
							</button>
						</div>
					</div>
				</form>
			</div>
			<!-- End search home  -->