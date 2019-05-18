<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<jsp:include page="headerAdmin.jsp" />
        <!-- Main content -->
        <form action="saveHome" method="post">
        <section class="content">
          <div class="row">
            
            <div class="col-md-9">
              <div class="box box-primary">
                <div class="box-header with-border">
                  <h3 class="box-title">Đăng tin</h3>
                </div><!-- /.box-header -->
                <div class="box-body">
					 <input type="hidden" name ="homeId" class= "form-control" value="<c:out value="${listHomeByHomeId.homeId}"></c:out>"/>
                  <div class="form-group">
                  <label>Tiêu đề</label>
                    <input name ="homeTitle" class= "form-control" value="<c:out value="${listHomeByHomeId.homeTitle}"></c:out>"/>
                  </div>
				   <label>Mô tả ngắn</label>
                  <div class="form-group">
				 	
                   <textarea  name="homeShortContents" cols="80" rows="10">
						<c:out value="${listHomeByHomeId.homeShortContents}"></c:out>
					</textarea>
                  </div>
                  <div class="form-group">
				  <label>Mô tả chi tiết trang chủ</label>
                   <textarea id="editor1" name="homeContents" cols="80" rows="10">
						<c:out value="${listHomeByHomeId.homeContents}"></c:out>
					</textarea>
                  </div>
                 <div class="form-group">
				  <label>Image :</label>
                   <textarea id="editor2" name="imageHome" cols="80" rows="10">
						<c:out value="${listHomeByHomeId.imageHome}"></c:out>
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