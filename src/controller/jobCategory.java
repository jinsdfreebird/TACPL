package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.jobCategoryDAO;
import VO.jobCategoryVO;

/**
 * Servlet implementation class jobCategory
 */
@WebServlet("/jobCategory")
public class jobCategory extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public jobCategory() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String flag = request.getParameter("flag");
		if(flag.equals("insert"))
		{
			insert(request,response);
		}
		
	}

	private void insert(HttpServletRequest request, HttpServletResponse response) throws IOException {
		// TODO Auto-generated method stub
		String cat_name = request.getParameter("cat_name");
		String cat_dis = request.getParameter("cat_dis");
		
		jobCategoryVO jobCategoryVO = new jobCategoryVO();
		jobCategoryVO.setCat_name(cat_name);
		jobCategoryVO.setCat_dis(cat_dis);
		
		jobCategoryDAO jobCategoryDAO = new jobCategoryDAO();
		jobCategoryDAO.insert(jobCategoryVO);
		
		response.sendRedirect("admin/addJobCategory.jsp");
	}
	
}
