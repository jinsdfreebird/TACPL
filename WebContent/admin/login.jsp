<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta charset="utf-8"> 
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="<%=request.getContextPath() %>/admin/css/boottstrap-theme.css" rel="stylesheet">
<link href="<%=request.getContextPath() %>/admin/css/bootstrap.css" rel="stylesheet">
<script type="text/javascript" src="<%=request.getContextPath() %>/admin/js/bootstrap.js"></script>
<script src="<%=request.getContextPath() %>/admin/js/jquery.min.js"></script>
<script src="<%=request.getContextPath() %>/admin/js/bootstrap.min.js"></script>
  

<title>Login Page</title>
</head>
<body>
<div class="container-fluid">
<!-- header -->
<jsp:include page="header1.jsp"></jsp:include>
  <!-- header off -->
  <div style="padding-top: 35px;"></div>
  <div>
  <div class="row">
  <div class="col-md-8">
  <div class="row">
  	<div class="col-md-2" ></div>
  	<div class="col-md-6" >
  	<form action="" method="post" style="background:#DEEAEF ">
  	<div class="row" style="padding-top: 20px">
  		<div class="col-md-1"></div>
  		<div class="col-md-8">
  		<label style="padding-top: 8px"><span style="color:#319AC4; font-size: 16pt;" >Login Here</span></label>
  		</div>
  		
  	</div>
  	<div class="row" style="padding-top: 20px;">
  		<div class="col-md-1"></div>
  		<div class="col-md-3">
  		<label style="padding-top: 8px; color:#319AC4; ">Email ID:<span style="color: red;">*</span></label>
  		</div>
  		<div class="col-md-7">
  		<input type="email" class="form-control" name="User_E_id" required>
  		</div>
  	</div>
  	<div class="row" style="padding-top: 20px">
  		<div class="col-md-1"></div>
  		<div class="col-md-3">
  		<label style="padding-top: 8px; color:#319AC4; ">Password:<span style="color: red;">*</span></label>
  		</div>
  		<div class="col-md-7">
  		<input type="password" class="form-control" name="password">
  		</div>
  	</div>
  	<div class="row" style="padding-top: 20px">
  		<div class="col-md-5"></div>
  		<div class="col-md-3">
  		
  		<button type="submit" style="color:#319AC4">Sumbit</button>
  		
  		</div>
  	</div>
  	<div class="row" style="padding-top: 20px">
  		<div class="col-md-1"></div>
  		<div class="col-md-6">
  		<label style="padding-top: 8px; color:#319AC4; ">TO REGISTER <a href="<%=request.getContextPath()%>/User?flag=load"><span style="color: red"> click here</span></a></label>
  		</div>
  	</div>
  	</form>
  	
  	</div>
  	<div class="col-md-1"></div>
  </div>
  </div>
  <div class="col-md-3">
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
 

<!-- footer -->
<jsp:include page="footer.jsp"></jsp:include>
  <!-- footer end  -->
 </div>
 </div>
 </div>
</body>
</html>