<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<jsp:include page="headerAdmin.jsp" />

        <!-- Main content -->
        <form action="saveTravel" method="post">
        <section class="content">
          <div class="row">
            
            <div class="col-md-9">
              <div class="box box-primary">
                <div class="box-header with-border">
                  <h3 class="box-title">Đăng địa danh</h3>
                </div><!-- /.box-header -->
                <div class="box-body">
					
                  <div class="form-group">
                  <label>Tên Địa Danh</label>
                    <input name ="title" class= "form-control" placeholder="Tên địa danh"/>
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