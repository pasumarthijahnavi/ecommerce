package com.wiley;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AddPro
 */
public class AddPro extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddPro() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	//	response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			//HttpSession session=request.getSession(true);
			 
		
			 Class.forName("com.mysql.cj.jdbc.Driver");
			 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","");
		    int pid=Integer.parseInt(request.getParameter("productid"));
		    int productidx = 0;
			String productnamex = null;
			int pricex = 0;
		    PreparedStatement pst = con.prepareStatement("SELECT * from products where productid=?");
		    pst.setInt(1,pid);
		    ResultSet rs = pst.executeQuery();

			 
		    while(rs.next())
			{
		    productidx = rs.getInt(1);
			productnamex = rs.getString(2);
			 pricex = rs.getInt(3);
			}
PreparedStatement ps = con.prepareStatement("INSERT into carttable (productidx,productnamex,pricex) values(?,?,?)");
			
			ps.setInt(1,productidx);
			ps.setString(2,productnamex);
			ps.setInt(3,pricex);
			
			ps.executeUpdate();
			PrintWriter pw=response.getWriter();
			 
			pw.print("Product successfully added in the cart");
			    
       RequestDispatcher rd = request.getRequestDispatcher("/viewproducts.jsp");
      
			
			rd.include(request, response);
			//con.close();
			 
			 
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		
		
	 	//doGet(request, response);
	}

		
	

}
