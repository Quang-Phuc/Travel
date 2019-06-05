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
                        <th>travelContentTitle</th>
                        <th>travelContentImage</th>
                        <th>travelContentShort</th>
                        <th>travelContent</th>
                        <th>Function</th>
                        
                      </tr>
                    </thead>
                    <tbody>
                    <c:forEach items="${listContentTravel}" var="listContentTravel">
                      <tr>
                      <td><c:out value="${listContentTravel.travel.travelId}"></c:out></td>
                        <td><c:out value="${listContentTravel.travelContentTitle }"></c:out></td>
                        <td><c:out value="${listContentTravel.travelContentImage }"></c:out></td>
                        <td><c:out value="${listContentTravel.travelContentShort }"></c:out></td>
                        <td> <c:out value="${listContentTravel.travelContent }"></c:out></td>
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