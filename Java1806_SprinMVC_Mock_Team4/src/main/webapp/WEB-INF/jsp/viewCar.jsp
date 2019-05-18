<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<jsp:include page="headerAdmin.jsp" />

<!-- Main content -->
<section class="content">
	<div class="row">
		<div class="col-xs-12">
			<div class="box">
				<div class="box-header">
					<h3 class="box-title">Hover Data Table</h3>
				</div>
				<!-- /.box-header -->
				<div class="box-body">
					<table id="example2" class="table table-bordered table-hover">
						<thead>
							<tr>
								<th>car Title</th>
								<th>car Image</th>
								
								<th>Car Contents</th>
								<th>Số điện thoại xe</th>
								<th>Thông tin lái xe</th>
								<th>Tên chủ xe</th>

								<th>Function</th>

							</tr>
						</thead>
						<tbody>
							<c:forEach items="${listCar}" var="listCar">
								<tr>
									<td><c:out value="${listCar.carTitle }"></c:out></td>
									<td><c:out value="${listCar.carImage }"></c:out></td>
									
									<td><c:out value="${listCar.carContents }"></c:out></td>
									<td><c:out value="${listCar.carNumberPhone }"></c:out></td>
									<td><c:out value="${listCar.carInforDriver }"></c:out></td>
									<td><c:out value="${listCar.carNameDriver }"></c:out></td>
									
									
									<td><a
										href="deleteCar?carId=<c:out value="${listCar.carId }"></c:out>">Xoa</a>
										<a
										href="updateCar?carId=<c:out value="${listCar.carId }"></c:out>">Sua</a>
									</td>

								</tr>
							</c:forEach>
						</tbody>
						<tfoot>
							<tr>
								<th>Rendering engine</th>
								<th>Browser</th>
								<th>Platform(s)</th>
								<th>Engine version</th>
								
								<th>Browser</th>
								<th>Platform(s)</th>
								<th>Engine version</th>

							</tr>
						</tfoot>
					</table>
				</div>
				<!-- /.box-body -->
			</div>
			<!-- /.box -->


		</div>
		<!-- /.col -->
	</div>
	<!-- /.row -->
</section>
<!-- /.content -->
</div>
<!-- /.content-wrapper -->
<jsp:include page="footerAdmin.jsp" />
