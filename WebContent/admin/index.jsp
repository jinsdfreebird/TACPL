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
  
<style>
  .carousel-inner > .item > img,
  .carousel-inner > .item > a > img {
      width: 70%;
      margin: auto;
  }
  </style>
<title>Home Page</title>
</head>
<body>
<div class="container-fluid">
<div class="panel panel-default">
  <div class="panel-body">
	<div id="myCarousel" class="carousel slide" data-ride="carousel">
    <!-- Indicators -->
    <ol class="carousel-indicators">
      <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
      <li data-target="#myCarousel" data-slide-to="1"></li>
      <li data-target="#myCarousel" data-slide-to="2"></li>
      
    </ol>

    <!-- Wrapper for slides -->
    <div class="carousel-inner" role="listbox">
      <div class="item active">
        <img src="<%=request.getContextPath()%>/admin/image/Web3.jpg" alt="web solutions"  height="300">
      </div>

	<div class="item">
        <img src="<%=request.getContextPath()%>/admin/image/ERP-Solution.jpg" alt="Flower"  height="300">
      </div>

      <div class="item">
        <img src="<%=request.getContextPath()%>/admin/image/webAppDev.png" alt="web app develpment"  height="300">
      </div>

    <!-- Left and right controls -->
    <a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
      <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
      <span class="sr-only">Previous</span>
    </a>
    <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
      <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
      <span class="sr-only">Next</span>
    </a>
  </div>
	</div>
  </div>
  <!-- header -->
<jsp:include page="header1.jsp"></jsp:include>
  <!-- header off -->
  <div style="padding-top: 35px;"></div>
  <div>
  <div class="row">
  <div class="col-md-8">
  <div class="row">
  	<div class="col-md-2" ></div>
  	<div class="col-md-9" style="border:1px solid;border-color:#319AC4;padding-top:0;">
  	
  	<div><h3>advertisement title</h3></div>
  	<div><p> description</p></div>
  	</div>
  	<div class="col-md-1"></div>
  </div>
  <br>
  <div class="row">
  	<div class="col-md-2" ></div>
  	<div class="col-md-9" style="border:1px solid;border-color:#319AC4;padding-top:0;">
  	
  	<div><h3>advertisement title</h3></div>
  	<div><p> description</p></div>
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