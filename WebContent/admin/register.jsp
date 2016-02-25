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
<script type="text/javascript" src="<%=request.getContextPath() %>/admin/js/mail-psd.js"></script>
<script type="text/javascript">
currentg1 = 2; // This is input files added by default.
maxg1 = 5;
ming1 = 1;

function g1_app_child(){
    if(currentg1<maxg1)
    {
        var div = document.createElement("div");
        div.id = 'divfiles'+currentg1;
        /*div.style.width = "100px";
        div.style.height = "100px";
        div.style.background = "red";
        div.style.color = "white";*/
        div.innerHTML = '<input type="file" name="files['+currentg1+']" id="file'+currentg1+'" value="" />';
        document.getElementById('outer_div').appendChild(div);
        currentg1++;
        return false;
    }
    else
    {
        alert('Maximum '+maxg1+' Files are Allowed.');
        return false;
    }
}

function g1_delchild()
{
    if(currentg1>ming1)
    {
        cnt = currentg1-1;
        element = document.getElementById('divfiles'+cnt);
        element.parentNode.removeChild(element);
        currentg1--;
        return false;
    }
    else
    {
        alert('Minimum '+ming1+' Files are Allowed.');
        return false;
    }
}
</script>
<title>Registration Page</title>
</head>
<body>
<div class="container-fluid">
<!-- header -->
<jsp:include page="header1.jsp"></jsp:include>
  <!-- header off -->
  <div style="padding-top: 35px; padding-bottom: 35px">
 
  <div class="row">
  <div class="col-md-8">
  <div class="row">
  	<div class="col-md-2" ></div>
  	<div class="col-md-8" >
  	<form action="<%=request.getContextPath() %>/User" method="post" style="background:#DEEAEF " onsubmit="return CheckPassword()" enctype="multipart/form-data">
  	<div class="row" style="padding-top: 20px">
  		<div class="col-md-1"></div>
  		<div class="col-md-8">
  		<label style="padding-top: 8px"><span style="color:#319AC4; font-size: 16pt;" >Register Here</span></label>
  		</div>
  		
  	</div>
  	
  	  	<div class="row" style="padding-top: 20px;">
  		<div class="col-md-1"></div>
  		<div class="col-md-3">
  		<label style="padding-top: 8px; color:#319AC4;">Email ID:<span style="color: red;">  *</span></label>
  		</div>
  		<div class="col-md-7">
  		<input type="email" class="form-control" name="User_E_id" id="txtEmail" value="jinsdfreebird@gmail.com" required> 
  		</div>
  	</div>
  	 	<div class="row" style="padding-top: 20px">
  		<div class="col-md-1"></div>
  		<div class="col-md-3">
  		<label style="padding-top: 8px; color:#319AC4; ">Password:<span style="color: red;">  *</span></label>
  		</div>
  		<div class="col-md-7">
  		<input type="password" class="form-control" name="password" id="password" onchange="return CheckPassword()" value="Abc@1234" required>
  		</div>
  	</div>
  	<div class="row" style="padding-top: 20px">
  		<div class="col-md-1"></div>
  		<div class="col-md-3">
  		<label style="padding-top: 8px; color:#319AC4; ">Confirm Password:<span style="color: red;">  *</span></label>
  		</div>
  		<div class="col-md-7">
  		<input type="password" class="form-control" name="password" id="confPass" onchange="return CheckPassword()" value="Abc@1234" required>
  		</div>
  	</div>
  	<div class="row" style="padding-top: 20px">
  		<div class="col-md-1"></div>
  		<div class="col-md-8">
  		<label style="padding-top: 8px"><span style="color:black; font-size: 12pt;" >If forget Password</span></label>
  		</div>  		
  	</div>
  	<div class="row" style="padding-top: 20px;">
  		<div class="col-md-1"></div>
  		<div class="col-md-3">
  		<label style="padding-top: 8px; color:#319AC4; ">Hint Question:<span style="color: red;">  *</span></label>
  		</div>
  		<div class="col-md-7">
  		<input type="text" class="form-control" name="hint_que" value="abc?" required>
  		</div>
  	</div>
  	<div class="row" style="padding-top: 20px;">
  		<div class="col-md-1"></div>
  		<div class="col-md-3">
  		<label style="padding-top: 8px; color:#319AC4; ">Hint Answer:<span style="color: red;">  *</span></label>
  		</div>
  		<div class="col-md-7">
  		<input type="text" class="form-control" name="hint_ans" value="123" required>
  		</div>
  	</div>
  	<div class="row" style="padding-top: 20px;">
  		<div class="col-md-12">
  		<hr style="border-color: #319AC4;">
  		</div>
  	</div>
  	<div class="row" style="padding-top: 20px;">
  		<div class="col-md-1"></div>
  		<div class="col-md-3">
  		<label style="padding-top: 8px; color:#319AC4; ">First Name:<span style="color: red;">  *</span></label>
  		</div>
  		<div class="col-md-7">
  		<input type="text" class="form-control" name="User_Fname" value="jinal" required>
  		</div>
  	</div>
  	<div class="row" style="padding-top: 20px;">
  		<div class="col-md-1"></div>
  		<div class="col-md-3">
  		<label style="padding-top: 8px; color:#319AC4; ">Last Name:<span style="color: red;">  *</span></label>
  		</div>
  		<div class="col-md-7">
  		<input type="text" class="form-control" name="User_Lname" value="parmar" required>
  		</div>
  	</div>
  	<div class="row" style="padding-top: 20px">
  		<div class="col-md-1"></div>
  		<div class="col-md-3">
  		<label style="padding-top: 8px; color:#319AC4; ">address:</label>
  		</div>
  		<div class="col-md-7">
  		<textarea  class="form-control" name="Address" style="height: 140px; resize: none;"></textarea>
  		</div>
  	</div>
  	<div class="row" style="padding-top: 20px;">
  		<div class="col-md-1"></div>
  		<div class="col-md-3">
  		<label style="padding-top: 8px; color:#319AC4; ">Mobile NO:<span style="color: red;">  *</span></label>
  		</div>
  		<div class="col-md-7">
  		<input type="text" class="form-control" name="MO_no" value="9925061478" required>
  		</div>
  	</div>
  	<div class="row" style="padding-top: 20px;">
  		<div class="col-md-1"></div>
  		<div class="col-md-3">
  		<label style="padding-top: 8px; color:#319AC4; ">Phone NO:</label>
  		</div>
  		<div class="col-md-7">
  		<input type="text" class="form-control" name="PH_no" >
  		</div>
  	</div>
  	<div class="row" style="padding-top: 20px;">
  		<div class="col-md-1"></div>
  		<div class="col-md-3">
  		<label style="padding-top: 8px; color:#319AC4; ">Resume:<span style="color: red;">  *</span></label>
  		</div>
  		<div class="col-md-7">
  		<div id="divfiles0"><input class="form-control" type="file" name="files[0]" id="file0" value=""  required/></div>
   					
  		 <%-- <iframe src="<%=request.getContextPath() %>/admin/fileupload.jsp" name="Cndt_Resume" width="100%" height="150"> </iframe> --%>
  		<!-- <input type="file" class="form-control" name="files" id="file0" value="" required> -->
  		</div>
  	</div>
  	<div class="row" style="padding-top: 20px;">
  		<div class="col-md-1"></div>
  		<div class="col-md-3">
  		<label style="padding-top: 8px; color:#319AC4; ">Reference:<span style="color: red;">  *</span></label>
  		</div>
  		<div class="col-md-7">
  		<input type="text" class="form-control" name="Cndt_Refrence" value="web" required>
  		</div>
  	</div>
  	
  	<div class="row" style="padding-top: 20px;">
  		<div class="col-md-1"></div>
  		<div class="col-md-3">
  		<label style="padding-top: 8px; color:#319AC4; ">Job Category:<span style="color: red;">  *</span></label>
  		</div>
  		<div class="col-md-7">
  		<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
  			
			<select class="dropdown"  name="Cat_ID">
	              <c:forEach items="${sessionScope.loadJD}" var="i">
	                  <option value="${i.cat_ID }">${i.cat_name } </option>
	              </c:forEach>
	        </select>
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
  		<input type="hidden" name="Role_ID" value="1">
  		<input type="hidden" name="Activation" value="Deactive">
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