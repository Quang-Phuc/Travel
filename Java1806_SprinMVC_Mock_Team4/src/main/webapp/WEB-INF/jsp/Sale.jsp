<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<jsp:include page="header.jsp" />
			<!-- KRAJ jqueryslidemenu  -->
			<div id="content">
				<c:forEach items="${listSale}" var="listSale">
					<div class="kolona_lijevo">
						<h2>
						<a href="DetailSale?saleId=<c:out value="${listSale.saleId}"></c:out>"><c:out value="${listSale.saleTitle}"></c:out></a> 
							
						</h2>
						<p hidden id="myParagraph5" >
							<c:out value="${listSale.saleImage }"></c:out>
						</p>
						<p >
						<script>
						
						
							var theString =  document.getElementById("myParagraph5").innerHTML;
							var varTitle = $('<textarea />').html(theString).text();
							document.write(varTitle);
							
							
						</script>

						<p>&nbsp;</p>

						<div class="clear"></div>
					</div>
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