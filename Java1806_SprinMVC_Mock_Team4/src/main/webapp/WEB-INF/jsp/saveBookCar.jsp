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
                  <h3 class="box-title">Điền đầy đủ thông tin đặt xe</h3>
                </div><!-- /.box-header -->
                <div class="box-body">
					 
                  
                  <div class="form-group">
                  <label>Nhập họ tên :</label>
                    <input name ="homeTitle" class= "form-control" placeholder="Tiêu đề:"/>
                  </div>
				   <label>Số lượng người đi</label>
                  <div class="form-group">
				 
                   <textarea  name="homeShortContents" cols="80" rows="10">
						
					</textarea>
                  </div>
                  <div class="form-group">
				  <label>Ngày đi</label>
                   <textarea id="editor1" name="homeContents" cols="80" rows="10">
						
					</textarea>
                  </div>
                  
                  <div class="form-group">
				  <label>Điểm đón</label>
                   <textarea id="editor1" name="homeContents" cols="80" rows="10">
						
					</textarea>
                  </div>
                 <div class="form-group">
				  <label>Số điện thoại liên hệ:</label>
                   <textarea id="editor2" name="imageHome" cols="80" rows="10">
						
					</textarea>
                  </div>
                </div><!-- /.box-body -->
                <div class="box-footer">
                  <div class="pull-right">
                   
                    <button type="submit" class="btn btn-primary">Đăng tin</button>
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