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
								<th>Link máy bay</th>


							</tr>
						</thead>
						<tbody>
							<c:forEach items="${listPlanes}" var="listPlanes">
								<tr>
									<td><c:out value="${listPlanes.planesLink }"></c:out></td>
									<td><a
										href="deletePlanes?planesId=<c:out value="${listPlanes.planesId }"></c:out>">Xoa</a>

									</td>

								</tr>
							</c:forEach>
						</tbody>
						<tfoot>
							<tr>
								<th>Rendering engine</th>


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
