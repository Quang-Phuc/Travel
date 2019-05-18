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
                        <th>Sale Title</th>
                        <th>Image Sale</th>
                        <th>Sale Short Contents</th>
                        <th>Sale Contents</th>
                        <th>Function</th>
                        
                      </tr>
                    </thead>
                    <tbody>
                    <c:forEach items="${listSale}" var="listSale">
                      <tr>
                        <td><c:out value="${listSale.saleTitle }"></c:out></td>
                        <td><c:out value="${listSale.saleImage }"></c:out></td>
                        <td><c:out value="${listSale.saleShort }"></c:out></td>
                        <td> <c:out value="${listSale.saleContent }"></c:out></td>
                        <td> <a href="deleteSale?saleId=<c:out value="${listSale.saleId }"></c:out>">Xoa</a> 
                        	 <a href="updateSale?saleId=<c:out value="${listSale.saleId }"></c:out>">Sua</a> 
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