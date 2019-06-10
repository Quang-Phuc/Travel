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
                </div><!-- /.box-header -->
                <div class="box-body">
                  <table id="example2" class="table table-bordered table-hover">
                    <thead>
                      <tr>
                        <th>Tên người đặt</th>
                        <th>Số người đi</th>
                        <th>Thời gian đi</th>
                        <th>Địa điểm đón</th>
                         <th>Số điện thoại</th>
                        <th>Function</th>
                        
                      </tr>
                    </thead>
                    <tbody>
                    <c:forEach items="${findAllBookCars}" var="findAllBookCars">
                      <tr>
                      <td><c:out value="${findAllBookCars.name}"></c:out></td>
                        <td><c:out value="${findAllBookCars.personNumber }"></c:out></td>
                        <td><c:out value="${findAllBookCars.timeGo }"></c:out></td>
                        <td><c:out value="${findAllBookCars.place }"></c:out></td>
                        <td> <c:out value="${findAllBookCars.phoneNumber }"></c:out></td>
                        <td> <a href="deleteContentTravel?travelContentId=<c:out value="${listContentTravel.travelContentId }"></c:out>">Xoa</a> 
                        	 <a href="updateContentTravel?travelContentId=<c:out value="${listContentTravel.travelContentId }"></c:out>">Sua</a> 
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
                        
                      </tr>
                    </tfoot>
                  </table>
                </div><!-- /.box-body -->
              </div><!-- /.box -->

             
            </div><!-- /.col -->
          </div><!-- /.row -->
        </section><!-- /.content -->
      </div><!-- /.content-wrapper -->
     <jsp:include page="footerAdmin.jsp" />  