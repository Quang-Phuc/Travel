<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>VDS 3</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link rel="stylesheet" href="css/style.css" type="text/css" media="screen" />
<link href="css/slide.css" rel="stylesheet" type="text/css" media="screen" />
<link rel="stylesheet" href="css/prettyphoto.css" type="text/css" media="screen" />
<script type="text/javascript" src="js/jquery-1.4.2.min.js"></script>
<script type="text/javascript" src="js/jquery.cycle.all.min.js"></script>
<script type="text/javascript" src="js/scripts.js"></script>
<script type="text/javascript" src="js/jqueryslidemenu.js"></script>
<script type="text/javascript" src="js/jquery.prettyphoto.js"></script>
<script type="text/javascript" src="js/init.js"></script>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
</head>
<jsp:include page="body.jsp" />
      <!-- KRAJ jqueryslidemenu  -->
      
     
        <div class="sivo_block1">
          <div class="sivo_block2">
            
              <div class="maliChitiet">
                
                     <h2> <c:out value="${listHomeByHomeId.homeTitle }"></c:out> </h2>
                      
                        <p hidden id="myParagraph" >
							<c:out value="${listHomeByHomeId.imageHome }"></c:out>
						</p>
						<p >
						<script>
						
						
							var theString =  document.getElementById("myParagraph").innerHTML;
							var varTitle = $('<textarea />').html(theString).text();
							document.write(varTitle);
							
							
						</script>
						</p>
						
						<p hidden id="myParagraph2" >
							<c:out value="${listHomeByHomeId.homeShortContents }"></c:out>
						</p>
						<p >
						<script>
						
						
							var theString =  document.getElementById("myParagraph2").innerHTML;
							var varTitle = $('<textarea />').html(theString).text();
							document.write(varTitle);
							
							
						</script>
						</p>
						
						<p hidden id="myParagraph1" >
							<c:out value="${listHomeByHomeId.homeContents }"></c:out>
						</p>
						<p >
						<script>
						
						
							var theString =  document.getElementById("myParagraph1").innerHTML;
							var varTitle = $('<textarea />').html(theString).text();
							document.write(varTitle);
							
							
						</script>
						</p>
						
                        
                        
                        
                        
                        
                        
                          
                         
              </div>
              
            
             
              
           
            <!-- end sivo_block1  -->
          </div>
          <!-- end sivo_block2 -->
        </div>
        <!-- end sivo_block3 -->
      
      <!-- end sivo_block  -->
      
        <!-- end items-wrapper -->
        <div class="clear"></div>
      </div>
      <!-- end container -->
      <div class="clear"></div>
     <jsp:include page="footerIndex.jsp" /> 
