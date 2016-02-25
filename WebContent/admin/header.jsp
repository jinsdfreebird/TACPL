<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div class="panel panel-default">
  <div class="panel-body">
	<div class="row" style="background-color: #319AC4">
  	<div class="col-md-2">
  	<a href="index.jsp">
  	<img alt="tech-attitude"style="background-color: white;" src="<%=request.getContextPath()%>/admin/image/Tech-Attitude-Consultancy-Pvt_-Ltd.png">
  	</a>
	</div>
	<div class="col-md-8">
	<div class="row">
		<div class="col-md-1" style="padding-top: 35px; "><a href="index.jsp"><font color="white">HOME</font></a></div>
  		<div class="col-md-1" style="padding-top: 35px; "><a href="login.jsp"><font color="white">Login</font></a></div>
  		<div class="col-md-2" style="padding-top: 35px; "><a href="<%=request.getContextPath() %>/User?flag=loadUser"><font color="white">Active User</font></a></div>
  		<div class="col-md-2" style="padding-top: 35px; "><a href="addJobCategory.jsp"><font color="white">job Category</font></a></div>
  		<div class="col-md-1" style="padding-top: 35px; "><a href="addRole.jsp"><font color="white">Role</font></a></div>
  		<div class="col-md-2" style="padding-top: 35px; "><a href="<%=request.getContextPath()%>/keyword?flag=load"><font color="white">add key words </font></a></div>
  		
  	</div>
  </div>
  <div class="col-md-2">
  </div>
  </div>
  </div>
  </div>
</body>
</html>