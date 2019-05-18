<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<jsp:include page="headerAdmin.jsp" />

        <!-- Main content -->
        <form action="saveCar" method="post">
        <section class="content">
          <div class="row">
            
            <div class="col-md-9">
              <div class="box box-primary">
                <div class="box-header with-border">
                  <h3 class="box-title">Update</h3>
                </div><!-- /.box-header -->
                <div class="box-body">
					
                  <div class="form-group">
                  <label>Tiêu đề Xe</label>
                    <input name ="carTitle" class= "form-control" placeholder="Tiêu đề:"/>
                  </div>
				   <label>Mô tả ngắn Xe</label>
                  <div class="form-group">
				 
                   <textarea  name="carShortContents" cols="80" rows="10">
						
					</textarea>
                  </div>
                  <div class="form-group">
				  <label>Mô tả chi tiết </label>
                   <textarea id="editor1" name="carContents" cols="80" rows="10">
						
					</textarea>
                  </div>
                 <div class="form-group">
				  <label>Image :</label>
                   <textarea id="editor2" name="carImage" cols="80" rows="10">
					
					</textarea>
                  </div>
                  
                  
                  <div class="form-group">
				  <label>Điện thoại liên hệ :</label>
                   <input type="number" name="carNumberPhone" class= "form-control" placeholder="Số điện thoại liên hệ:"/>
                  </div>
                  
                    <div class="form-group">
				  <label>Tên chủ xe:</label>
                   <input type="text" name="carNameDriver"class= "form-control" placeholder="Tên chủ xe"/>
                  </div>
                  
                  
                  <div class="form-group">
				 <label>Thông tin chi tiết chủ xe:</label>
                   <textarea  name="carInforDriver" cols="80" rows="10">
						
					</textarea>
                  </div>
                  
                </div><!-- /.box-body -->
                <div class="box-footer">
                  <div class="pull-right">
                   
                    <button type="submit" class="btn btn-primary">Đăng tin xe</button>
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