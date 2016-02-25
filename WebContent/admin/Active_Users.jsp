<%@page import="VO.userVO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta charset="utf-8"> 
<meta content="15" http-equiv="Refresh">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="<%=request.getContextPath() %>/admin/css/boottstrap-theme.css" rel="stylesheet">
<link href="<%=request.getContextPath() %>/admin/css/bootstrap.css" rel="stylesheet">
<script type="text/javascript" src="<%=request.getContextPath() %>/admin/js/bootstrap.js"></script>
<script src="<%=request.getContextPath() %>/admin/js/jquery.min.js"></script>
<script src="<%=request.getContextPath() %>/admin/js/bootstrap.min.js"></script>
<script type="text/javascript" src="<%=request.getContextPath() %>/admin/js/selectall.js"></script>
<script language="JavaScript1.2"></script>
<title>Activation Page</title>
</head>
<body onunload="window.opener.location=window.opener.location;">
<div class="container-fluid">
<!-- header -->
<jsp:include page="header.jsp"></jsp:include>
  <!-- header off -->
  <div style="padding-top: 35px; padding-bottom: 35px">
 
  <div class="row">
  	<div class="col-md-8">
  		<div class="row">
  			<div class="col-md-1" ></div>
  			<div class="col-md-11" >
  			
  			
  			<div class="row" style="padding-top: 20px">
  			<div class="col-md-1"></div>
  			<div class="col-md-8">
  			<label style="padding-top: 8px"><span style="color:#319AC4; font-size: 16pt;" >Activate users</span></label>
  			</div>
  		
  	</div>
  	<form name="frm" action="<%=request.getContextPath() %>/User" method="post" style="background:#DEEAEF ">
  	<div class="row" style="padding-top: 20px;">
  		
  		<div class="col-md-12">
  		<div class="col-lg-6">
    	<div class="input-group">
    	<input type="text" class="form-control" placeholder="Search for...">
     	 <span class="input-group-btn">
     	 		<input type="hidden" name="flag" value="searchUser">
        		<button class="btn btn-default" type="button" name="search">Go!</button>
      	</span>
    	</div><!-- /input-group -->
 		 </div><!-- /.col-lg-6 -->  		
 		 </div>
  	</div>
  	</form>
  	<form name="frm" action="<%=request.getContextPath() %>/User" method="post" style="background:#DEEAEF ">
  	<div class="row" style="padding-top: 20px">
  	
  		<div class ="col-md-12">
  		<div class="panel panel-default">
  <!-- Default panel contents -->
  <div class="panel-heading" style="font-size: 14; color: #319AC4;">User Table</div>
  <div style="background:#DEEAEF;"><button type="submit" value="Deactive" style="background: #F31B43;" class="btn btn-default" name="action" ><font style="color: white;">Deactive</font></button>
  <button type="submit" name ="action" value="Active" style="background: green;" class="btn btn-default"><font style="color: white;" >Active</font></button>
  </div>
  
  <!-- Table -->
  <table class="table" style="background:#DEEAEF;">
  <tr>
  <th style="font-size: 14; color: #319AC4;">all: <input type="checkbox" name="allCheck" onClick="selectallMe()">
  
  <input type="hidden" name="flag" value="select">  </th>
  <th style="font-size: 14; color: #319AC4;">First Name</th>
  <th style="font-size: 14; color: #319AC4;">Last Name</th>
  <th style="font-size: 14; color: #319AC4;">Mobile N#</th>
  <th style="font-size: 14; color: #319AC4;">Email ID</th>
  <th style="font-size: 14; color: #319AC4;">Status</th>
  <th style="font-size: 14; color: #319AC4;">Active/Deactive</th>
  </tr>

  <%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
  <c:forEach items="${sessionScope.loadud}" var="i">
  <tr>
  <td><input type="checkbox" name="chkName" onClick="selectall()" value="${i.user_ID }"></td>
  <td style="font-size: 14; color: #319AC4;">${i.user_Fname }</td>
   <td style="font-size: 14; color: #319AC4;">${i.user_Lname }</td>
    <td style="font-size: 14; color: #319AC4;">${i.MO_no }</td>
     <td style="font-size: 14; color: #319AC4;">${i.user_E_id }</td>
      <td style="font-size: 14; color: #319AC4;">${i.activation }</td>
       <td style="font-size: 14; color: #319AC4;">
      <c:set var="s" scope="session" value="${i.activation }"></c:set>
      <c:set var="st" scope="session" value="Deactive"></c:set>
      <c:set var="str" value="Active"></c:set>
      <%-- <c:out value="${st}"></c:out>
      <c:out value="${str}"></c:out>
      <c:out value="${ s}"></c:out>  --%>
  <c:choose>
      <c:when test="${s == str }"><button type="button" style="background: #F31B43;" class="btn btn-default"><a href="<%=request.getContextPath()%>/User?flag=deactive&User_ID=${i.user_ID}&Activation=Deactive"><font style="color: white;">Deactive</font></a></button>
            </c:when>
       <c:otherwise>
      <%--  <c:out value="inside activate"></c:out> --%>
       <button type="button" class="btn btn-default" style="background: green;"><a href="<%=request.getContextPath()%>/User?flag=active&User_ID=${i.user_ID}&Eid=${i.user_E_id }&Activation=Active"><font style="color: white;">Active</font></a></button>
    </c:otherwise>
  </c:choose>
     
       </td>
  </tr>
   </c:forEach>
  </table>
</div>
  		</div>
  	
  	</div>
  	  	</form>
  	
  	</div>
  	</div>
  	  </div>
  
  <div class="col-md-4">
  <div><h3>Services</h3>
  <div><ul style="list-style-type:circle; font-size: 12pt; ">
  <li>Generic / Customized Software Solutions</li>
  <li>Business Intelligent Solutions</li>
  <li>Data Warehousing Solutions</li>
  <li>ERP evaluation, Implementation</li>
  <li>ERP Add-on, MIS</li>
  <li>Networking, Server setup</li>
  <li>Server maintenance</li>
  <li>Virtualization</li>
  <li>Data backup and recovery</li>
  <li>Hardware/Software repair</li>
  <li>Website design</li>
  <li>Website hosting</li>
  <li>Virus, popup, and spyware removal</li>
  <li>Automation Systems</li>
  </ul></div>
  </div>
  <div class="col-md-1">
  </div>
  </div>
  </div>
  </div>

<!-- footer -->
<jsp:include page="footer.jsp"></jsp:include>
  <!-- footer end  -->

 </div>
 </div>
</body>
</html>