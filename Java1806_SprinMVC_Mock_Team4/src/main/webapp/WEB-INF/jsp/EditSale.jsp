<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<jsp:include page="headerAdmin.jsp" />

        <!-- Main content -->
        <form action="saveSale" method="post">
        <section class="content">
          <div class="row">
            
            <div class="col-md-9">
              <div class="box box-primary">
                <div class="box-header with-border">
                  <h3 class="box-title">Update</h3>
                </div><!-- /.box-header -->
                <div class="box-body">
					
                  <div class="form-group">
                  <label>Tiêu đề</label>
                    <input name ="saleTitle" class= "form-control" value="<c:out value="${lisSaleBySaleId.saleTitle}"></c:out>"/>
                  </div>
				   <label>Mô tả ngắn</label>
                  <div class="form-group">
				 
                   <textarea  name="saleShort" cols="80" rows="10">
						<c:out value="${lisSaleBySaleId.saleShort}"></c:out>
					</textarea>
                  </div>
                  <div class="form-group">
				  <label>Mô tả chi tiết </label>
                   <textarea id="editor1" name="saleContent" cols="80" rows="10">
						<c:out value="${lisSaleBySaleId.saleContent}"></c:out>
					</textarea>
                  </div>
                 <div class="form-group">
				  <label>Image :</label>
                   <textarea id="editor2" name="saleImage" cols="80" rows="10">
						<c:out value="${lisSaleBySaleId.saleImage}"></c:out>
					</textarea>
                  </div>
                </div><!-- /.box-body -->
                <div class="box-footer">
                  <div class="pull-right">
                   
                    <button type="submit" class="btn btn-primary">Update</button>
                  </div>
                  <button class="btn btn-default"><i class="fa fa-times"></i> Hủy</button>
                </div><!-- /.box-footer -->
              </div><!-- /. box -->
            </div><!-- /.col -->
          </div><!-- /.row -->
        </section><!-- /.content -->
        </form>
      </div><!-- /.content-wrapper -->
     <jsp:include page="footerAdmin.jsp" />  