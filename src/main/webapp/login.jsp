<%@ page import="uk.ac.gre.cw.shoppingonline.jdo.entities.Customer" %>
<%@page contentType="text/html" pageEncoding="UTF-8" %>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@taglib prefix="section" tagdir="/WEB-INF/tags/layouts/sections" %>
<%
	Object sCustomer = session.getAttribute("customer");
	if (sCustomer != null && sCustomer instanceof Customer) {
		response.sendRedirect(request.getContextPath());
	}
%>
<t:main pageTitle="Shopping online">
	<section:login-form></section:login-form>
</t:main>