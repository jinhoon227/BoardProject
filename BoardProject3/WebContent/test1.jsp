<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
	try{
		
		Class c= Class.forName("com.mysql.jdbc.Driver");
		if(c!= null){
			out.println("loading complete");
		}
	}catch(ClassNotFoundException e){
		out.println(e);
	}
%>