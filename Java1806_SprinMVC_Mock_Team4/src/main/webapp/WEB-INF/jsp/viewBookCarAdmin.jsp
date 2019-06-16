<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<jsp:include page="headerAdmin.jsp" />
<link href="https://fonts.googleapis.com/css?family=Poppins" rel="stylesheet" />
    <link href="css/search.css" rel="stylesheet" />
    <link href="https://fonts.googleapis.com/css?family=Poppins" rel="stylesheet" />
<!-- Search car -->
<div class="s003">
      <form action="sreachHome?traveltitle" method="get">
        <div class="inner-form">
            <div class="input-field first-wrap">
               <div class="input-select">
                  <select data-trigger="1" name="travelId">
                     <option placeholder="">-- Lự chọn xe --</option>
                     <c:forEach items="${findAllCar}" var="findAllCar">
                        <option>
                           
                           <c:out value="${findAllCar.carTitle}"></c:out>
                          
                        </option>
                     </c:forEach>
                  </select>
               </div>
            </div>
            <div class="input-field third-wrap">
               <button class="btn-search" type="submit">
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

<!-- End search car -->
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