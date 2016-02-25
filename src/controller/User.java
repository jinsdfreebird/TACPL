package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.io.File;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;




import org.apache.catalina.connector.Request;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import com.sun.org.apache.regexp.internal.recompile;

import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.Random;

import DAO.candidateRegistrationDAO;
import DAO.jobCategoryDAO;
import DAO.roleDAO;
import DAO.userDAO;
import VO.candidateRegistratioVO;
import VO.jobCategoryVO;
import VO.roleVO;
import VO.userVO;

/**
 * Servlet implementation class User
 */
@MultipartConfig
@WebServlet("/User")
public class User extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String String = null;

	   private boolean isMultipart;
	   private String filePath;
	   private int maxFileSize = 5000 * 2024;
	   private int maxMemSize = 400 * 1024;
	   private File file ;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public User() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String flag = request.getParameter("flag");
		System.out.println(flag); 
		if(flag.equals("load"))
		{
			search(request,response);
		}
		else if(flag.equals("loadUser"))
		{
			searchuser(request,response);
		}
		else if(flag.equals("active"))
		{
			System.out.println("inside active");
			activate(request,response);
		}
		else if(flag.equals("deactive"))
		{
			System.out.println("inside deactive");
			deactivate(request,response);
		}
		
	}

	private void select(HttpServletRequest request, HttpServletResponse response) throws IOException {
		// TODO Auto-generated method stub
		
		System.out.println("select method");
		String select[];
		select = request.getParameterValues("chkName");
		String action = request.getParameter("action");
		System.out.println(select.length);
		
		if(select != null)
		{
			if("Deactive".equals(action))
			{	
			
				for(int i=0; i<=select.length-1; i++)
				{
					int a = Integer.parseInt(select[i]);
					userVO userVO = new userVO();
					userVO.setUser_ID(a);
					userVO.setActivation(action);
					userDAO userDAO = new userDAO();
					List ls=userDAO.activate(userVO);
					System.out.println("deactive block");
					//response.sendRedirect("admin/Active_Users.jsp");
					//active(select[i]);
				
				}
			
			}
			else if("Active".equals(action))
			{
				for(int i=0; i<=select.length-1; i++)
				{	
					int a = Integer.parseInt(select[i]);
					userVO userVO = new userVO();
					userVO.setUser_ID(a);
					String Eid = userVO.getUser_E_id();
					System.out.println(Eid);
					userVO.setActivation(action);
					userDAO userDAO = new userDAO();
					List ls=userDAO.activate(userVO);
					System.out.println("active block");
					String msg = "your request has been approved";
					sendEmail(Eid,msg);
					//deactive(select[i]);
			
				}
			}
		}
		/*PrintWriter out = response.getWriter();
		out.println("<script>window.onunload = function(){window.opener.location.reload();}</script>");*/
		
		searchuser(request, response);
		//response.sendRedirect("admin/Active_Users.jsp");
	}

	private void sendEmail(String eid, String msg) {
		// TODO Auto-generated method stub
		final String username = "mktg@tekattitude.com";
	    final String password = "Mktg4TekPL";

	    Properties props = new Properties();
	    props.put("mail.smtp.auth", "true");
	    props.put("mail.smtp.starttls.enable", "true");
	    props.put("mail.smtp.host", "smtpout.secureserver.net");
	    props.put("mail.smtp.port", "25");

	    Session session = Session.getInstance(props,
	      new javax.mail.Authenticator() {
	        protected PasswordAuthentication getPasswordAuthentication() {
	            return new PasswordAuthentication(username, password);
	        }
	      });

	    try {

	        Message message = new MimeMessage(session);
	        message.setFrom(new InternetAddress("hrd@tekattitude.com"));
	        message.setRecipients(Message.RecipientType.TO,
	            InternetAddress.parse(eid));
	        message.setSubject("request");
	        message.setText(msg);

	        Transport.send(message);

	        System.out.println("Done");

	    } catch (MessagingException e) {
	        throw new RuntimeException(e);
	    }
	}

	private void searchUser(HttpServletRequest request,HttpServletResponse response) {
		// TODO Auto-generated method stub
			String search = request.getParameter("search");
			
	}

	private void deactivate(HttpServletRequest request,HttpServletResponse response) throws IOException {
		// TODO Auto-generated method stub
		int User_ID = Integer.parseInt(request.getParameter("User_ID"));
		String Activation = request.getParameter("Activation");
		
		System.out.println(Activation);
		userVO userVO = new userVO();
		userVO.setUser_ID(User_ID);
		userVO.setActivation(Activation);
			
		System.out.println("inside deactivate");
		userDAO userDAO = new userDAO();
		List ls=userDAO.activate(userVO);
		
		/*PrintWriter out = response.getWriter();
		out.println("<script>window.onunload = function(){window.opener.location.reload();}</script>");
		*/
		searchuser(request, response);
		//response.sendRedirect("admin/Active_Users.jsp");
		
	}

	private void activate(HttpServletRequest request,
			HttpServletResponse response) throws IOException {
		// TODO Auto-generated method stub
		int User_ID = Integer.parseInt(request.getParameter("User_ID"));
		String Activation = request.getParameter("Activation");
		String Eid = request.getParameter("Eid");
		System.out.println(Activation);
		userVO userVO = new userVO();
		userVO.setUser_ID(User_ID);
		userVO.setActivation(Activation);
		System.out.println(Eid);
		
		userDAO userDAO = new userDAO();
		List ls=userDAO.activate(userVO);
		/*HttpSession session = request.getSession();
		session.setAttribute("activate", ls);*/
		/*
		PrintWriter out = response.getWriter();
		
		out.println("<script>window.onunload = function(){window.opener.location.reload();}</script>");
		System.out.println("abc");*/
		String msg = "your request has been approved";
		sendEmail(Eid,msg);
		searchuser(request, response);
		//response.sendRedirect("admin/Active_Users.jsp");
	
	}

	private void searchuser(HttpServletRequest request,HttpServletResponse response) throws IOException {
		// TODO Auto-generated method stub
		userDAO userDAO = new userDAO();
		List ls = userDAO.search();
		int size = ls.size();
		System.out.println(size);
		HttpSession hs = request.getSession();
		hs.setAttribute("loadud", ls);
		System.out.println("inside search user");
		response.sendRedirect("admin/Active_Users.jsp");
	}

	private void search(HttpServletRequest request, HttpServletResponse response) throws IOException {
		// TODO Auto-generated method stub
		
		jobCategoryDAO JD = new jobCategoryDAO();
		List ls = JD.serch();
		int siz = ls.size();
		//System.out.println(siz);
		
		/*Iterator itr = ls.iterator(); 
		int Cat_ID = ((jobCategoryVO) itr.next()).getCat_ID();
		
		System.out.println(Cat_ID);*/
		HttpSession hs = request.getSession();
		hs.setAttribute("loadJD", ls);
		
		response.sendRedirect("admin/register.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("inside do post");
		String flag = request.getParameter("flag");
		System.out.println(flag);
		if(flag.equals("insert"))
		{
			System.out.println("inside insert");
			insert(request,response);
		}
		else if(flag.equals("select"))
		{
			System.out.println("inside select");
			select(request, response);
		}
		else if(flag.equals("searchUser"))
		{
			searchUser(request,response);
		}
		
	}
	
	private void fileUpload(String cat_name, HttpServletRequest request, HttpServletResponse response) throws IOException {
		// TODO Auto-generated method stub
		filePath = "C:\\TACPL\\java workspace\\HRM_WebDesign\\WebContent\\";
		   int path = filePath.lastIndexOf('\\');
		   String path1= filePath.substring(0, path) +"\\doc\\";
		  // System.out.println(path1);
		   filePath =path1+cat_name+"\\";
		   System.out.println(filePath);
		   createDirectoryIfNeeded(filePath);
		   System.out.println("derectory");
		   isMultipart = ServletFileUpload.isMultipartContent(request);
		   System.out.println(isMultipart);
		   
		response.setContentType("text/html");
	     java.io.PrintWriter out = response.getWriter( );
	    if( !isMultipart )
	      {
	         out.println("<html>");
	         out.println("<head>");
	         out.println("<title>Servlet upload</title>");  
	         out.println("</head>");
	         out.println("<body>");
	         out.println("<p>No file uploaded</p>"); 
	         out.println("</body>");
	         out.println("</html>");
	         return;
	      }
	    System.out.println("if block over");
DiskFileItemFactory factory = new DiskFileItemFactory();
	    
		// maximum size that will be stored in memory
	      factory.setSizeThreshold(maxMemSize);
	      System.out.println("factory size set");
	      // Location to save data that is larger than maxMemSize.
	      String path2= filePath.substring(0, path) +"\\temp\\";
	      factory.setRepository(new File(path2));
	      System.out.println("repository set");
	      // Create a new file upload handler
	      ServletFileUpload upload = new ServletFileUpload(factory);
	
		// maximum file size to be uploaded.
	      upload.setSizeMax( maxFileSize );
	      System.out.println("max size set");
	      try{ 
	      // Parse the request to get file items.
	
	    	  List fileItems = upload.parseRequest(request);
	          int size = fileItems.size();
	          System.out.println(size);
	          // Process the uploaded file items
	          Iterator i = fileItems.iterator();
	          System.out.println(i);
	          out.println("<html>");
	          out.println("<head>");
	          out.println("<title>Servlet upload</title>");  
	          out.println("</head>");
	          out.println("<body>");
	          while ( i.hasNext () ) 
	          {
	             FileItem fi = (FileItem)i.next();
	             if ( !fi.isFormField () )	
	             {
	                // Get the uploaded file parameters
	            	  String fileName = fi.getName();
	    			  System.out.println(fileName);
	            	  		 /* String fieldName = fi.getFieldName();
	    			            String contentType = fi.getContentType();
	    			            boolean isInMemory = fi.isInMemory();
	    			            long sizeInBytes = fi.getSize();*/
	            	  
	            	  
	                // Write the file
	                
	                if( fileName.lastIndexOf("\\") >= 0 ){
	                   file = new File( filePath + 
	                   fileName.substring( fileName.lastIndexOf("\\"))) ;
	                }else{
	                   file = new File( filePath + 
	                   fileName.substring(fileName.lastIndexOf("\\")+1)) ;
	                }
	                
	                
	                           
	                
	                String src = path1.concat(encryptFileName(fileName));
	                
	                File f3 = new File(src);  
	                fi.write(f3);
	                
	                
	                List myFileList=null;
	                
	                HttpSession session = request.getSession();
	                myFileList = (List) session.getAttribute("fileList");
	                
	                if(myFileList != null){
	                			myFileList.add(f3.getName());
	    		            }else{
	    		            	myFileList = new ArrayList<String>();
	    		            
	    		            	myFileList.add(f3.getName());
	    		            	
	    		            }
	               
	                session.setAttribute("fileList", myFileList);
	                
	             }
	          }
	          out.println("</body>");
	          out.println("</html>");
	          
	          
	          
	          /*Below code is to fetch the list of upload file name's */
	          /*Begin*/
	          HttpSession session = request.getSession();
	          List myFileList = (List) session.getAttribute("fileList");
	          
	          Iterator itr =  myFileList.iterator();
	          
	          
	         
	          System.out.println("Fetching file Names from session :");
	          int j = 0 ;
	          while (itr.hasNext()) {  
	    					      	System.out.println(" File Name "+ (++j) +" :"+itr.next());
	    							}
	          
	          /*Ends*/
	          response.sendRedirect("<%=request.getContextPath()%>/fileupload.jsp");
	       }catch(Exception ex) {
	           System.out.println(ex);
	       }
 
		
		   HttpSession session1 = request.getSession();
		   session1.setAttribute("url", filePath);
		  System.out.println("attribute set");
		  
	    }


	private void insert(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();
		/*String s = (String) session.getAttribute("url");
		System.out.println(s);*/
		
		String User_E_id = request.getParameter("User_E_id");
		String password = request.getParameter("password");
		int Role_ID = Integer.parseInt(request.getParameter("Role_ID"));
		String User_Fname = request.getParameter("User_Fname");
		String User_Lname = request.getParameter("User_Lname");
		String Address = request.getParameter("Address");
		String PH_no = request.getParameter("PH_no");
		String MO_no = request.getParameter("MO_no");
		String hint_que= request.getParameter("hint_que");
		String hint_ans = request.getParameter("hint_ans");
		String files = request.getParameter("files[0]");
		String Cndt_Refrence = request.getParameter("Cndt_Refrence");
		int Cat_ID = Integer.parseInt(request.getParameter("Cat_ID"));
		String Activation = request.getParameter("Activation");
	
		
		roleVO roleVO = new roleVO();
		roleVO.setRole_ID(Role_ID);
		
		jobCategoryVO jobCategoryVO = new jobCategoryVO();
		jobCategoryVO.setCat_ID(Cat_ID);		
		jobCategoryDAO jobCategoryDAO = new jobCategoryDAO();
		List ls =jobCategoryDAO.findname(jobCategoryVO);
		Iterator itr = ls.iterator(); 
		String Cat_name = ((jobCategoryVO) itr.next()).getCat_name();
		//System.out.println("inside insert");
		//System.out.println(ls);
		/*String path = Cndt_Resume+Cat_name+"\\";
		System.out.println(path);
		session.setAttribute("Fpath", Cat_name);*/
		
		fileUpload(Cat_name,request, response);
		//createDirectoryIfNeeded(path);
		
		userVO userVO = new userVO();
		userVO.setAddress(Address);
		userVO.setHint_ans(hint_ans);
		userVO.setHint_que(hint_que);
		userVO.setMO_no(MO_no);
		userVO.setPassword(password);
		userVO.setPH_no(PH_no);
		userVO.setUser_E_id(User_E_id);
		userVO.setUser_Fname(User_Fname);
		userVO.setUser_Lname(User_Lname);
		userVO.setRole_ID(roleVO);
		userVO.setActivation(Activation);
		
		
		/*userDAO userDAO = new userDAO();
		userDAO.insert(userVO);
		*/
		String Cndt_Resume= (String) session.getAttribute("url");
		candidateRegistratioVO candidateRegistratioVO = new candidateRegistratioVO();
		candidateRegistratioVO.setCndt_Refrence(Cndt_Refrence);
		//candidateRegistratioVO.setCndt_Resume());
		candidateRegistratioVO.setUser_ID(userVO);
		candidateRegistratioVO.setCat_ID(jobCategoryVO);
		
		/*candidateRegistrationDAO candidateRegistrationDAO = new candidateRegistrationDAO();
		candidateRegistrationDAO.insert(candidateRegistratioVO);*/
				
		String msg = "You have new Request for job from "+User_Fname+" "+User_Lname+".";
		/*sendMail(User_E_id, msg);*/
	}
	
	

		   private String encryptFileName(String fileName){
			 
		   Random r = new Random();
		   String file[] = fileName.split("\\.");
		  
		   byte[] unencodedFile = file[0].getBytes();
		   MessageDigest md = null;
		   try {
		   md = MessageDigest.getInstance("MD5");
		   } catch (Exception e) {}
		   md.reset();
		   md.update(unencodedFile);
		   byte[] encodedFile = md.digest();
		   StringBuffer buf = new StringBuffer();
		   for (int i = 0; i < encodedFile.length; i++) {
		   if (((int) encodedFile[i] & 0xff) < 0x10) {
		   buf.append("0");
		   }
		   buf.append(Long.toString((int) encodedFile[i] & 0xff, 16));
		   }
		  
		   String encryptedFileName=(buf.toString()).concat(String.valueOf(r.nextInt())); 

		   
		   return encryptedFileName+"."+file[1];
	   }

	private void createDirectoryIfNeeded(String directoryName)
	{
	  File theDir = new File(directoryName);
	 
	  // if the directory does not exist, create it
	  if (!theDir.exists())
	  {
	    System.out.println("creating directory: " + directoryName);
	    theDir.mkdir();
	  }
	}
	
protected void sendMail(String email,String msg){
	
	final String username = "mktg@tekattitude.com";
    final String password = "Mktg4TekPL";

    Properties props = new Properties();
    props.put("mail.smtp.auth", "true");
    props.put("mail.smtp.starttls.enable", "true");
    props.put("mail.smtp.host", "smtpout.secureserver.net");
    props.put("mail.smtp.port", "25");

    Session session = Session.getInstance(props,
      new javax.mail.Authenticator() {
        protected PasswordAuthentication getPasswordAuthentication() {
            return new PasswordAuthentication(username, password);
        }
      });

    try {

        Message message = new MimeMessage(session);
        message.setFrom(new InternetAddress("mktg@tekattitude.com"));
        message.setRecipients(Message.RecipientType.TO,
            InternetAddress.parse("hrd@tekattitude.com"));
        message.setSubject("request");
        message.setText(msg);

        Transport.send(message);

        System.out.println("Done");

    } catch (MessagingException e) {
        throw new RuntimeException(e);
    }
		
	
 }

}	


