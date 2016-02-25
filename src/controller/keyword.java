package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import VO.jobCategoryVO;
import VO.keywordVO;
import DAO.jobCategoryDAO;
import DAO.keywordDAO;

/**
 * Servlet implementation class keyword
 */
@WebServlet("/keyword")
public class keyword extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public keyword() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String flag = request.getParameter("flag");
		if(flag.equals("load"))
		{
			load(request,response);
		}
	}

	private void load(HttpServletRequest request, HttpServletResponse response) throws IOException {
		// TODO Auto-generated method stub
		jobCategoryDAO JD = new jobCategoryDAO();
		List ls = JD.serch();
		int siz = ls.size();
		HttpSession hs = request.getSession();
		hs.setAttribute("loadJD", ls);
		response.sendRedirect("admin/addKeyword.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String flag = request.getParameter("flag");
		if(flag.equals("insert"))
		{
			insert(request, response);
		}
	}

	private void insert(HttpServletRequest request, HttpServletResponse response) throws IOException {
		// TODO Auto-generated method stub
		String Keyword = request.getParameter("Keyword");
		int Cat_ID = Integer.parseInt(request.getParameter("Cat_ID"));
		
		jobCategoryVO jobCategoryVO = new jobCategoryVO();
		jobCategoryVO.setCat_ID(Cat_ID);		
		
		keywordVO keywordVO = new keywordVO();
		keywordVO.setKeyword(Keyword);
		keywordVO.setCat_ID(jobCategoryVO);
		
		keywordDAO keywordDAO = new keywordDAO();
		keywordDAO.insert(keywordVO);
		
		load(request,response);
	}

}
