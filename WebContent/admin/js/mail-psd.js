
	function CheckPassword()   
	{   
		
		var passw = /^(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{6,20}$/;  
		
		var pass = document.getElementById("password");
		var confPass = document.getElementById("confPass");
		
		if(pass.value.match(passw))   
		{   
		
		if(pass.value != confPass.value)
		{
			alert("Please Confirm Password");
			return false;
		}
		else
			{
			return true;
			}
		}
		else  
		{   
			alert('Wrong password to add correct password add characters upper case and lower case as well numerics and symbols password length must be 8 characters');
			return false;  
		}  
	}
