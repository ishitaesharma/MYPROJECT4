/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.46
 * Generated at: 2022-01-18 02:53:45 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import in.co.sunrays.project4.controller.TimetableCtl;
import java.util.LinkedHashMap;
import in.co.sunrays.project4.util.HTMLUtility;
import in.co.sunrays.project4.bean.TimetableBean;
import java.util.List;
import in.co.sunrays.project4.controller.TimetableListCtl;
import in.co.sunrays.project4.util.DataUtility;
import in.co.sunrays.project4.util.ServletUtility;
import in.co.sunrays.project4.controller.LoginCtl;
import in.co.sunrays.project4.bean.RoleBean;
import in.co.sunrays.project4.bean.UserBean;
import in.co.sunrays.project4.controller.ORSView;

public final class TimetableView_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/jsp/Footer.jsp", Long.valueOf(1642443668610L));
    _jspx_dependants.put("/jsp/Header.jsp", Long.valueOf(1642445401592L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("java.util.LinkedHashMap");
    _jspx_imports_classes.add("in.co.sunrays.project4.controller.LoginCtl");
    _jspx_imports_classes.add("java.util.List");
    _jspx_imports_classes.add("in.co.sunrays.project4.controller.ORSView");
    _jspx_imports_classes.add("in.co.sunrays.project4.util.HTMLUtility");
    _jspx_imports_classes.add("in.co.sunrays.project4.bean.RoleBean");
    _jspx_imports_classes.add("in.co.sunrays.project4.util.DataUtility");
    _jspx_imports_classes.add("in.co.sunrays.project4.controller.TimetableCtl");
    _jspx_imports_classes.add("in.co.sunrays.project4.controller.TimetableListCtl");
    _jspx_imports_classes.add("in.co.sunrays.project4.util.ServletUtility");
    _jspx_imports_classes.add("in.co.sunrays.project4.bean.TimetableBean");
    _jspx_imports_classes.add("in.co.sunrays.project4.bean.UserBean");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<link rel=\"icon\" type=\"image/png\" href=\"");
      out.print(ORSView.APP_CONTEXT);
      out.write("/img/logo.png\" sizes=\"16*16\"/>\n");
      out.write("<title>Timetable Registration Page</title>\n");
      out.write("\n");
      out.write("  <link rel=\"stylesheet\" href=\"//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"/resources/demos/style.css\">\n");
      out.write("  <script src=\"https://code.jquery.com/jquery-1.12.4.js\"></script>\n");
      out.write("  <script src=\"https://code.jquery.com/ui/1.12.1/jquery-ui.js\"></script>\n");
      out.write("\n");
      out.write("  <script>\n");
      out.write("  \n");
      out.write(" // var d = new Date();\n");
      out.write("  function disableSunday(d){\n");
      out.write("	  var day = d.getDay();\n");
      out.write("	  if(day==0)\n");
      out.write("	  {\n");
      out.write("	   return [false];\n");
      out.write("	  }else\n");
      out.write("	  {\n");
      out.write("		  return [true];\n");
      out.write("	  }\n");
      out.write("  }\n");
      out.write("  \n");
      out.write("   $( function() {\n");
      out.write("	  $(\"#udate5\").datepicker({\n");
      out.write("		  changeMonth :true,\n");
      out.write("		  changeYear :true,\n");
      out.write("		  yearRange :'0:+2',\n");
      out.write("		  dateFormat:'mm/dd/yy',\n");
      out.write("\n");
      out.write("// Disable for Sunday\n");
      out.write("		  beforeShowDay : disableSunday,		  \n");
      out.write("// Disable for back date\n");
      out.write("		  minDate : 0   \n");
      out.write("	  });\n");
      out.write("  } );\n");
      out.write(" </script>\n");
      out.write("\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body>\n");
      in.co.sunrays.project4.bean.TimetableBean bean = null;
      bean = (in.co.sunrays.project4.bean.TimetableBean) _jspx_page_context.getAttribute("bean", javax.servlet.jsp.PageContext.REQUEST_SCOPE);
      if (bean == null){
        bean = new in.co.sunrays.project4.bean.TimetableBean();
        _jspx_page_context.setAttribute("bean", bean, javax.servlet.jsp.PageContext.REQUEST_SCOPE);
      }
      out.write("\n");
      out.write("<form action=\"");
      out.print(ORSView.TIMETABLE_CTL );
      out.write("\" method=\"post\">\n");
      out.write("\n");
      out.write("	");
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("<HEAD>\n");
      out.write("<style>\n");
      out.write("form {\n");
      out.write("	height: 85% !important;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("<title>HEADER</title>\n");
      out.write("</HEAD>\n");
      out.write("<link rel=\"stylesheet\"\n");
      out.write("	href=\"//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css\">\n");
      out.write("<link rel=\"stylesheet\" href=\"/resources/demos/style.css\">\n");
      out.write("<script src=\"https://code.jquery.com/jquery-1.12.4.js\"></script>\n");
      out.write("<script src=\"https://code.jquery.com/ui/1.12.1/jquery-ui.js\"></script>\n");
      out.write("<script>\n");
      out.write("	$(function() {\n");
      out.write("		$(\"#datepicker\").datepicker({\n");
      out.write("			dateFormat : 'mm/dd/yy',\n");
      out.write("			//defaultDate : \"06/06/2001\",\n");
      out.write("			changeMonth : true,\n");
      out.write("			changeYear : true,\n");
      out.write("			//yearRange: \"c-20:c+0\",\n");
      out.write("			//yearRange : \"1980:2025\",\n");
      out.write("			maxDate : '12/31/2003',\n");
      out.write("			minDate : '01/01/1981'\n");
      out.write("		//yearRange : \"-30: -18\"\n");
      out.write("		});\n");
      out.write("	});\n");
      out.write("</script>\n");
      out.write("<body>\n");
      out.write("	");

		UserBean ub = (UserBean) session.getAttribute("user");
		boolean userLoggedIn = ub != null;
		String welcomeMsg = "Hi, ";
		if (userLoggedIn) {
			String role = (String) session.getAttribute("role");
			welcomeMsg += ub.getFirstName() + " (" + role + ")";
		} else {
			welcomeMsg += "Guest";
		}
	
      out.write("\n");
      out.write("\n");
      out.write("	<table>\n");
      out.write("		<tr>\n");
      out.write("			<th></th>\n");
      out.write("			<td width=\"90%\"><a href=\"");
      out.print(ORSView.WELCOME_CTL);
      out.write("\">Welcome</b></a>\n");
      out.write("				| ");

				if (userLoggedIn) {
			
      out.write(" <a\n");
      out.write("				href=\" ");
      out.print(ORSView.LOGIN_CTL);
      out.write("?operation=");
      out.print(LoginCtl.OP_LOG_OUT);
      out.write("\">Logout</b></a>\n");
      out.write("\n");
      out.write("				");

					} else {
				
      out.write(" <a href=\"");
      out.print(ORSView.LOGIN_CTL);
      out.write("\">Login</b></a> ");

 	}
 
      out.write("</td>\n");
      out.write("			<td rowspan=\"2\">\n");
      out.write("				<h1 align=\"right\">\n");
      out.write("					<img src=\"");
      out.print(ORSView.APP_CONTEXT);
      out.write("/img/Logo.jpg\" width=\"350\"\n");
      out.write("						height=\"90\">\n");
      out.write("				</h1>\n");
      out.write("			</td>\n");
      out.write("		</tr>\n");
      out.write("\n");
      out.write("		<tr>\n");
      out.write("			<th></th>\n");
      out.write("			<td>\n");
      out.write("				<h3>");
      out.print(welcomeMsg);
      out.write("</h3>\n");
      out.write("			</td>\n");
      out.write("		</tr>\n");
      out.write("\n");
      out.write("		");

			if (userLoggedIn) {
		
      out.write("\n");
      out.write("\n");
      out.write("		<tr>\n");
      out.write("			<th></th>\n");
      out.write("			<td colspan=\"2\"><font style=\"font-size: 18px\"> <a\n");
      out.write("					href=\"");
      out.print(ORSView.MY_PROFILE_CTL);
      out.write("\">My Profile</b></a> | <a\n");
      out.write("					href=\"");
      out.print(ORSView.CHANGE_PASSWORD_CTL);
      out.write("\">Change Password</b></a> | <a\n");
      out.write("					href=\"");
      out.print(ORSView.GET_MARKSHEET_CTL);
      out.write("\">Get Marksheet</b></a> | <a\n");
      out.write("					href=\"");
      out.print(ORSView.MARKSHEET_MERIT_LIST_CTL);
      out.write("\">Marksheet Merit\n");
      out.write("						List</b>\n");
      out.write("				</a> | ");

					if (ub.getRoleId() == RoleBean.ADMIN) {
				
      out.write(" <a href=\"");
      out.print(ORSView.MARKSHEET_CTL);
      out.write("\">Add Marksheet</b></a> | <a\n");
      out.write("					href=\"");
      out.print(ORSView.MARKSHEET_LIST_CTL);
      out.write("\">Marksheet List</b></a> | <a\n");
      out.write("					href=\"");
      out.print(ORSView.USER_CTL);
      out.write("\">Add User</b></a> | <a\n");
      out.write("					href=\"");
      out.print(ORSView.USER_LIST_CTL);
      out.write("\">User List</b></a> | <a\n");
      out.write("					href=\"");
      out.print(ORSView.COLLEGE_CTL);
      out.write("\">Add College</b></a> | <a\n");
      out.write("					href=\"");
      out.print(ORSView.COLLEGE_LIST_CTL);
      out.write("\">College List</b></a> | <a\n");
      out.write("					href=\"");
      out.print(ORSView.ROLE_CTL);
      out.write("\">Add Role</b></a> | <a\n");
      out.write("					href=\"");
      out.print(ORSView.ROLE_LIST_CTL);
      out.write("\">Role List</b></a> | <a\n");
      out.write("					href=\"");
      out.print(ORSView.STUDENT_CTL);
      out.write("\">Add Student</b></a> | <a\n");
      out.write("					href=\"");
      out.print(ORSView.STUDENT_LIST_CTL);
      out.write("\">Student List</b></a> | <a\n");
      out.write("					href=\"");
      out.print(ORSView.COURSE_CTL);
      out.write("\">Add Course</b></a> | <a\n");
      out.write("					href=\"");
      out.print(ORSView.COURSE_LIST_CTL);
      out.write("\">Course List</b></a> | <a\n");
      out.write("					href=\"");
      out.print(ORSView.SUBJECT_CTL);
      out.write("\">Add Subject</b></a> | <a\n");
      out.write("					href=\"");
      out.print(ORSView.SUBJECT_LIST_CTL);
      out.write("\">Subject List</b></a> | <a\n");
      out.write("					href=\"");
      out.print(ORSView.FACULTY_CTL);
      out.write("\">Add Faculty</b></a> | <a\n");
      out.write("					href=\"");
      out.print(ORSView.FACULTY_LIST_CTL);
      out.write("\">Faculty List</b></a> | <a\n");
      out.write("					href=\"");
      out.print(ORSView.TIMETABLE_CTL);
      out.write("\">Add TimeTable</b></a> | <a\n");
      out.write("					href=\"");
      out.print(ORSView.TIMETABLE_LIST_CTL);
      out.write("\">TimeTable List</b></a> | <a\n");
      out.write("					target=\"blank\" href=\"");
      out.print(ORSView.JAVA_DOC_VIEW);
      out.write("\">Java Doc</b></a> | ");

 	}
 
      out.write(' ');

 	if (ub.getRoleId() == RoleBean.STUDENT) {
 
      out.write(" <a href=\"");
      out.print(ORSView.COLLEGE_LIST_CTL);
      out.write("\">College List</b></a> | <a\n");
      out.write("					href=\"");
      out.print(ORSView.STUDENT_LIST_CTL);
      out.write("\">Student List</b></a> | <a\n");
      out.write("					href=\"");
      out.print(ORSView.COURSE_LIST_CTL);
      out.write("\">Course List</b></a> | <a\n");
      out.write("					href=\"");
      out.print(ORSView.SUBJECT_LIST_CTL);
      out.write("\">Subject List</b></a> | <a\n");
      out.write("					href=\"");
      out.print(ORSView.FACULTY_LIST_CTL);
      out.write("\">Faculty List</b></a> | <a\n");
      out.write("					href=\"");
      out.print(ORSView.TIMETABLE_LIST_CTL);
      out.write("\">TimeTable List</b></a> | ");

 	}
 
      out.write(' ');

 	if (ub.getRoleId() == RoleBean.KIOSK) {
 
      out.write(" <a href=\"");
      out.print(ORSView.COLLEGE_LIST_CTL);
      out.write("\">College List</b></a> | <a\n");
      out.write("					href=\"");
      out.print(ORSView.TIMETABLE_LIST_CTL);
      out.write("\">TimeTable List</b></a> | <a\n");
      out.write("					href=\"");
      out.print(ORSView.COURSE_LIST_CTL);
      out.write("\">Course List</b></a> | ");

 	}
 
      out.write(' ');

 	if (ub.getRoleId() == RoleBean.FACULTY) {
 
      out.write(" <a href=\"");
      out.print(ORSView.MARKSHEET_CTL);
      out.write("\">Add Marksheet</b></a> | <a\n");
      out.write("					href=\"");
      out.print(ORSView.MARKSHEET_LIST_CTL);
      out.write("\">Marksheet List</b></a> | <a\n");
      out.write("					href=\"");
      out.print(ORSView.COLLEGE_LIST_CTL);
      out.write("\">College List</b></a> | <a\n");
      out.write("					href=\"");
      out.print(ORSView.STUDENT_CTL);
      out.write("\">Add Student</b></a> | <a\n");
      out.write("					href=\"");
      out.print(ORSView.STUDENT_LIST_CTL);
      out.write("\">Student List</b></a> | <a\n");
      out.write("					href=\"");
      out.print(ORSView.COURSE_LIST_CTL);
      out.write("\">Course List</b></a> | <a\n");
      out.write("					href=\"");
      out.print(ORSView.SUBJECT_CTL);
      out.write("\">Add Subject</b></a> | <a\n");
      out.write("					href=\"");
      out.print(ORSView.SUBJECT_LIST_CTL);
      out.write("\">Subject List</b></a> | <a\n");
      out.write("					href=\"");
      out.print(ORSView.TIMETABLE_CTL);
      out.write("\">Add TimeTable</b></a> | <a\n");
      out.write("					href=\"");
      out.print(ORSView.TIMETABLE_LIST_CTL);
      out.write("\">TimeTable List</b></a> | ");

 	}
 
      out.write(' ');

 	if (ub.getRoleId() == RoleBean.COLLEGE) {
 
      out.write(" <a href=\"");
      out.print(ORSView.MARKSHEET_CTL);
      out.write("\">Add Marksheet</b></a> | <a\n");
      out.write("					href=\"");
      out.print(ORSView.MARKSHEET_LIST_CTL);
      out.write("\">Marksheet List</b></a> | <a\n");
      out.write("					href=\"");
      out.print(ORSView.STUDENT_CTL);
      out.write("\">Add Student</b></a> | <a\n");
      out.write("					href=\"");
      out.print(ORSView.STUDENT_LIST_CTL);
      out.write("\">Student List</b></a> | <a\n");
      out.write("					href=\"");
      out.print(ORSView.FACULTY_LIST_CTL);
      out.write("\">Faculty List</b></a> | <a\n");
      out.write("					href=\"");
      out.print(ORSView.TIMETABLE_LIST_CTL);
      out.write("\">TimeTable List</b></a> | <a\n");
      out.write("					href=\"");
      out.print(ORSView.COURSE_LIST_CTL);
      out.write("\">Course List</b></a> | ");

 	}
 
      out.write("\n");
      out.write("\n");
      out.write("			</font></td>\n");
      out.write("		</tr>\n");
      out.write("		");

			}
		
      out.write("\n");
      out.write("	</table>\n");
      out.write("	<hr>\n");
      out.write("</body>\n");
      out.write("</html>");
      out.write("\n");
      out.write("\n");
      out.write("<center>\n");
      out.write("	");

	List <TimetableBean> courseList =(List<TimetableBean>)request.getAttribute("CourseList"); 
	List <TimetableBean> subjectList = (List<TimetableBean>)request.getAttribute("SubjectList");
	
      out.write("\n");
      out.write("	\n");
      out.write("	<input type=\"hidden\" name=\"id\" value=\"");
      out.print(bean.getId() );
      out.write("\">\n");
      out.write("	<input type=\"hidden\" name=\"createdby\" value=\"");
      out.print(bean.getCreatedBy() );
      out.write("\">\n");
      out.write("	<input type=\"hidden\" name=\"modifiedby\" value=\"");
      out.print(bean.getModifiedBy() );
      out.write("\">\n");
      out.write("	<input type=\"hidden\" name=\"createddatetime\" value=\"");
      out.print(DataUtility.getTimestamp(bean.getCreatedDatetime()) );
      out.write("\">\n");
      out.write("	<input type=\"hidden\" name=\"modifiedby\" value=\"");
      out.print(DataUtility.getTimestamp(bean.getModifiedDatetime()));
      out.write("\">\n");
      out.write("	\n");
      out.write("	<div align = \"center\">\n");
      out.write("		<h1 >\n");
      out.write("			");
 if(bean != null && bean.getId() >0 ){ 
      out.write("\n");
      out.write("		<tr><th>Update TimeTable</th></tr>		\n");
      out.write("			");
 }else{ 
      out.write("\n");
      out.write("		<tr ><th >Add TimeTable</th></tr>	\n");
      out.write("			");
 } 
      out.write("\n");
      out.write("		</h1>\n");
      out.write("	<h2 align=\"center\"><font style=\"color: red\">");
      out.print(ServletUtility.getErrorMessage(request));
      out.write("</font></h2>\n");
      out.write("	<h2 align=\"center\"><font style=\"color: green\">");
      out.print(ServletUtility.getSuccessMessage(request) );
      out.write("</font></h2>\n");
      out.write("	</div>\n");
      out.write("\n");
      out.write("<table>\n");
      out.write("	<tr>\n");
      out.write("	<th align=\"left\">Course <span style=\"color: red\">*</span></th>\n");
      out.write("	<td>");
      out.print(HTMLUtility.getList("courseId", String.valueOf(bean.getCourseId()), courseList) );
      out.write("</td>\n");
      out.write("	<td style=\"position: fixed;\"><font color=\"red\">");
      out.print(ServletUtility.getErrorMessage("courseId",request) );
      out.write("</font> \n");
      out.write("	</td></tr>\n");
      out.write("	\n");
      out.write(" <tr><th style=\"padding: 3px\"></th></tr>   \n");
      out.write("	\n");
      out.write("	<tr><th align=\"left\">Subject <span style=\"color: red\">*</span></th>\n");
      out.write("	<td>");
      out.print(HTMLUtility.getList("subjectId", String.valueOf(bean.getSubjectId()), subjectList) );
      out.write("</td>\n");
      out.write("	<td style=\"position: fixed;\"><font color=\"red\">");
      out.print(ServletUtility.getErrorMessage("subjectId",request) );
      out.write("</font> \n");
      out.write("	</td></tr>\n");
      out.write("	\n");
      out.write(" <tr><th style=\"padding: 3px\"></th></tr>   \n");
      out.write("	\n");
      out.write("	<tr>\n");
      out.write("	<th align=\"left\">Semester<span style=\"color: red\">*</span></th>\n");
      out.write("	<td>");

		LinkedHashMap<String , String> map = new LinkedHashMap< String , String>();
		map.put("1st","1st");
		map.put("2nd","2nd");
		map.put("3rd","3rd");
		map.put("4th","4th");
		map.put("5th","5th");
		map.put("6th","6th");
		map.put("7th","7th");
		map.put("8th","8th");
	
		String htmlList = HTMLUtility.getList("semester",String.valueOf(bean.getSemester()), map);
	
      out.write('\n');
      out.write('	');
      out.print(htmlList );
      out.write("\n");
      out.write("	</td>\n");
      out.write("	<td style=\"position: fixed;\"><font color=\"red\">");
      out.print(ServletUtility.getErrorMessage("semester",request) );
      out.write("</font> \n");
      out.write("	</td></tr>\n");
      out.write("	\n");
      out.write(" <tr><th style=\"padding: 3px\"></th></tr>   \n");
      out.write("	<tr><th align=\"left\">Exam Date <span style=\"color: red\">*</span></th>\n");
      out.write("	<td> <input type=\"text\" readonly=\"readonly\" id=\"udate5\" size=\"24\" placeholder=\"Select Date\" name=\"ExDate\" value=\"");
      out.print(DataUtility.getDateString(bean.getExamDate()) );
      out.write("\">\n");
      out.write("	<td style=\"position: fixed;\"><font color=\"red\">");
      out.print(ServletUtility.getErrorMessage("ExDate",request) );
      out.write("</font> \n");
      out.write("	</td></tr>\n");
      out.write("	\n");
      out.write(" <tr><th style=\"padding: 3px\"></th></tr>   \n");
      out.write("	<tr><th align=\"left\">Exam Time <span style=\"color: red\">*</span></span></th>\n");
      out.write("	<td>\n");
      out.write("	");

		LinkedHashMap<String , String > map1 = new LinkedHashMap<String  ,String >();
		map1.put("08:00 AM to 11:00 AM","08:00 AM to 11:00 AM");
		map1.put("12:00 PM to 03:00 PM","12:00 PM to 03:00 PM");
		map1.put("04:00 PM to 07:00 PM","04:00 PM to 07:00 PM");
	
		String htmlList1 = HTMLUtility.getList("ExTime", bean.getExamTime(), map1);
	
      out.write('\n');
      out.write('	');
      out.print(htmlList1 );
      out.write("\n");
      out.write("	</td>\n");
      out.write("	<td style=\"position: fixed;\"><font color=\"red\">");
      out.print(ServletUtility.getErrorMessage("ExTime",request) );
      out.write("</font> \n");
      out.write("	</td></tr>\n");
      out.write("	\n");
      out.write("\n");
      out.write(" \n");
      out.write(" 	<tr><th style=\"padding: 3px\"></th>\n");
      out.write("	<td></td></tr>\n");
      out.write("	\n");
      out.write("	<tr><th></th><td></td>\n");
      out.write("	</tr>\n");
      out.write("	\n");
      out.write("	<tr align=\"center\">	\n");
      out.write("	");

	if(bean != null && bean.getId() > 0){
	
      out.write("\n");
      out.write("		<td colspan=\"2\">\n");
      out.write("		<input type=\"submit\" name=\"operation\" value=\"");
      out.print(TimetableCtl.OP_UPDATE);
      out.write("\">\n");
      out.write("		<input type=\"submit\" name=\"operation\" value=\"");
      out.print(TimetableCtl.OP_CANCEL);
      out.write("\">\n");
      out.write("		</td>\n");
      out.write("		");
} else { 
      out.write("\n");
      out.write("		\n");
      out.write("		<td colspan=\"2\">\n");
      out.write("		<input type=\"submit\" name=\"operation\" value=\"");
      out.print(TimetableCtl.OP_SAVE);
      out.write("\">\n");
      out.write("		<input type=\"submit\" name=\"operation\" value=\"");
      out.print(TimetableCtl.OP_RESET);
      out.write("\">\n");
      out.write("		</td>\n");
      out.write("		");
 } 
      out.write("\n");
      out.write("	</tr>\n");
      out.write("</table>\n");
      out.write("</form>	\n");
      out.write("</center>\n");
      out.write("	");
      out.write("\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<style >\n");
      out.write(".footer{\n");
      out.write("position: fixed;\n");
      out.write("  left: 0;\n");
      out.write("  bottom: 0;\n");
      out.write("  width: 100%;\n");
      out.write("  background-color: white;\n");
      out.write("  color: black;\n");
      out.write("  text-align: center;\n");
      out.write("  }</style>\n");
      out.write("  <title>FOOTER</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<div class = \"footer\">\n");
      out.write("<HR>\n");
      out.write("     <H3>&copy; Copyright RAYS Technologies</H3>\n");
      out.write("</div>\n");
      out.write("</body>\n");
      out.write("</html>");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
