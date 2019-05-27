package web;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.EmployeeBean;
import bean.EmployeesDispBean;
import service.EmployeeService;

/**
 * Servlet implementation class SearchSrvlet
 */
@WebServlet("/SearchSrvlet")
public class EmployeesDispServlet extends HttpServlet
{
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmployeesDispServlet()
    {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{

		System.out.println("１");
		EmployeeService empse = new EmployeeService();
		System.out.println("2");
		List<EmployeeBean> empList = new ArrayList<EmployeeBean>();
		empList = empse.employeecontroller();
		EmployeesDispBean bean = new EmployeesDispBean();
		bean.seteList(empList);
		request.setAttribute("bean", bean);
		RequestDispatcher disp = request.getRequestDispatcher("/employees_disp.jsp");
		disp.forward(request, response);


	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		doGet(request, response);
	}

}

