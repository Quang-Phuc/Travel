<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<jsp:include page="header.jsp" />
<!-- KRAJ jqueryslidemenu  -->
<div id="content">
   <c:forEach items="${findHomeByTravelIdTitle}" var="findHomeByTravelIdTitle">
       <div class="kolona_lijevo">
         <h2>
            <a href="Detail?homeId=
            <c:out value="${findHomeByTravelIdTitle.homeId }"></c:out>
            ">
            <c:out value="${findHomeByTravelIdTitle.homeTitle }"></c:out>
            </a> 
         <p hidden id="myParagraph" >
            <c:out value="${findHomeByTravelIdTitle.imageHome }"></c:out>
         </p>
         <p >
            <script>
               var theString =  document.getElementById("myParagraph").innerHTML;
               var varTitle = $('<textarea />').html(theString).text();
               document.write(varTitle);
               
            
            </script>
         </p>
         <p>
            <c:out value="${findHomeByTravelIdTitle.homeShortContents }"></c:out>
         </p>
         <p>&nbsp;</p>
         <div class="clear"></div>
      </div> 
     <%--  ${findHomeByTravelIdTitle.title} --%>
   </c:forEach>
   <div class="clear"></div>
</div>
</div>
<!-- end items-wrapper -->
<div class="clear"></div>
</div>
<!-- end container -->
<div class="clear"></div>
<jsp:include page="footerIndex.jsp" />