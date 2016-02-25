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
<script language="JavaScript1.2">

</script>
<title>Add Category</title>
</head>
<body>
<div class="container-fluid">
<!-- header -->
<jsp:include page="header.jsp"></jsp:include>
  <!-- header off -->
  <div style="padding-top: 35px; padding-bottom: 35px">
 
  <div class="row">
  <div class="col-md-8">
  <div class="row">
  	<div class="col-md-2" ></div>
  	<div class="col-md-8" >
  	
  	<form action="<%=request.getContextPath() %>/jobCategory" method="post" style="background:#DEEAEF ">
  	
  	
  	<div class="row" style="padding-top: 20px">
  		<div class="col-md-1"></div>
  		<div class="col-md-8">
  		<label style="padding-top: 8px"><span style="color:#319AC4; font-size: 16pt;" >ADD Job category</span></label>
  		</div>
  		
  	</div>
  	
  	  	<div class="row" style="padding-top: 20px;">
  		<div class="col-md-1"></div>
  		<div class="col-md-3">
  		<label style="padding-top: 8px; color:#319AC4;">Category Name:<span style="color: red;">*</span></label>
  		</div>
  		<div class="col-md-7">
  		<input type="text" class="form-control" name="cat_name" id="txtEmail"required> 
  		</div>
  	</div>
  	 	
  	<div class="row" style="padding-top: 20px">
  		<div class="col-md-1"></div>
  		<div class="col-md-3">
  		<label style="padding-top: 8px; color:#319AC4; ">Category description:</label>
  		</div>
  		<div class="col-md-7">
  		<textarea  class="form-control" name="cat_dis" style="height: 140px; resize: none;"></textarea>
  		</div>
  	</div>
  	  	<div class="row" style="padding-top: 20px;">
  		<div class="col-md-1"></div>
  		<div class="col-md-9">
  		
  		</div>
 
  	</div>
  	
  	<div class="row" style="padding-top: 20px;padding-bottom: 20px">
  		<div class="col-md-5"></div>
  		<div class="col-md-3">
  		<input type="hidden" name="flag" value="insert">
  		<button type="submit" style="color:#319AC4">Submit</button>
  		</div>
  	</div>
  	</form>
  	</div>
  	</div>
  	<div class="col-md-1"></div>  </div>
  
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