<%@page import="in.co.sunrays.project4.controller.MarksheetCtl"%>
<%@page import="java.util.List"%>
<%@page import="in.co.sunrays.project4.util.HTMLUtility"%>
<%@page import="in.co.sunrays.project4.util.DataUtility"%>
<%@page import="in.co.sunrays.project4.util.ServletUtility"%>
<html>
<head>
<link rel="icon" type="image/png"
	href="<%=ORSView.APP_CONTEXT%>/img/logo.png" sizes="16*16" />
	<title>MARKSHEET REGISTRATION</title>
</head>
<body>

	<form action="<%=ORSView.MARKSHEET_CTL%>" method="post">
		<%@ include file="Header.jsp"%>

		<jsp:useBean id="bean"
			class="in.co.sunrays.project4.bean.MarksheetBean" scope="request"></jsp:useBean>

		<%
			List l = (List) request.getAttribute("studentList");
		%>

		<center>

			<h1>
				<%
					if (bean != null && bean.getId() > 0) {
				%><tr>
					<th><font>Update Marksheet</font></th>
				</tr>
				<%
					} else {
				%>
				<tr>
					<th><font>Add Marksheet</font></th>
				</tr>
				<%
					}
				%>

			</h1>

			<H2>
				<font color="red"> <%=ServletUtility.getErrorMessage(request)%>
				</font>
			</H2>
			<H2>
				<font color="green"> <%=ServletUtility.getSuccessMessage(request)%>
				</font>
			</H2>


			<input type="hidden" name="id" value="<%=bean.getId()%>"> <input
				type="hidden" name="createdBy" value="<%=bean.getCreatedBy()%>">
			<input type="hidden" name="modifiedBy"
				value="<%=bean.getModifiedBy()%>"> <input type="hidden"
				name="createdDatetime"
				value="<%=DataUtility.getTimestamp(bean.getCreatedDatetime())%>">
			<input type="hidden" name="modifiedDatetime"
				value="<%=DataUtility.getTimestamp(bean.getModifiedDatetime())%>">


			<table>
				<tr>
					<th align="left">Roll Number <span style="color: red">*</span></th>
					<td><input type="text" name="rollNo" size="25"
						placeholder="Enter Roll No"
						value="<%=DataUtility.getStringData(bean.getRollNo())%>"
						<%=(bean.getId() > 0) ? "readonly" : ""%>></td>
					<td style="position: fixed"><font color="red"> <%=ServletUtility.getErrorMessage("rollNo", request)%></font></td>
				</tr>
				<tr>
					<th align="left">Name <span style="color: red">*</span></th>
					<td><%=HTMLUtility.getList("name", String.valueOf(bean.getStudentId()), l)%></td>
					<td style="position: fixed"><font color="red"> <%=ServletUtility.getErrorMessage("name", request)%></font></td>
				</tr>
				<tr>
					<th align="left">Physics <span style="color: red">*</span></th>
					<td><input type="text" name="physics" size="25"
						placeholder="Enter Physics Marks"
						value="<%=DataUtility.getStringData(bean.getPhysics()).equals("0") ? ""
					: DataUtility.getStringData(bean.getPhysics())%>"></td>
					<td style="position: fixed"><font color="red"> <%=ServletUtility.getErrorMessage("physics", request)%></font></td>
				</tr>
				<tr>
					<th align="left">Chemistry <span style="color: red">*</span></th>
					<td><input type="text" name="chemistry" size="25"
						placeholder="Enter Chemistry Marks"
						value="<%=DataUtility.getStringData(bean.getChemistry()).equals("0") ? ""
					: DataUtility.getStringData(bean.getChemistry())%>"></td>
					<td style="position: fixed"><font color="red"> <%=ServletUtility.getErrorMessage("chemistry", request)%></font></td>
				</tr>
				<tr>
					<th align="left">Maths <span style="color: red">*</span></th>
					<td><input type="text" name="maths" size="25"
						value="<%=DataUtility.getStringData(bean.getMaths()).equals("0") ? ""
					: DataUtility.getStringData(bean.getMaths())%>"
						placeholder="Enter Maths Marks"></td>

					<td style="position: fixed"><font color="red"> <%=ServletUtility.getErrorMessage("maths", request)%></font></td>

				</tr>
				<tr>
					<th></th>
					<%
						if (bean.getId() > 0) {
					%>
					<td colspan="2">&nbsp; &emsp; <input type="submit"
						name="operation" value="<%=MarksheetCtl.OP_UPDATE%>">
						&nbsp; &nbsp; <input type="submit" name="operation"
						value="<%=MarksheetCtl.OP_CANCEL%>"></td>
					<%
						} else {
					%>
					<td colspan="2">&nbsp; &emsp; <input type="submit"
						name="operation" value="<%=MarksheetCtl.OP_SAVE%>"> &nbsp;
						&nbsp; <input type="submit" name="operation"
						value="<%=MarksheetCtl.OP_RESET%>"></td>
					<%
						}
					%>
				</tr>
			</table>
	</form>
	</center>
	<%@ include file="Footer.jsp"%>
</body>
</html>