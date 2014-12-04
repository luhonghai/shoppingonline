<%@ page import="uk.ac.gre.cw.shoppingonline.service.CustomerService" %>
<%@ page import="uk.ac.gre.cw.shoppingonline.jdo.entities.Customer" %><%
  try {
    String email = request.getParameter("email");
    String password = request.getParameter("password");
    CustomerService customerService = new CustomerService();
    Customer customer = customerService.login(email, password);
    if (customer != null) {
      session.setAttribute("customer", customer);
      response.sendRedirect(request.getContextPath());
    } else {
      response.sendRedirect(request.getContextPath() + "/login");
    }
  } catch (Exception ex) {
    response.getWriter().print("Error: " + ex.getMessage());
    session.setAttribute("error", ex.getMessage());
    ex.printStackTrace();
    response.sendRedirect(request.getContextPath() + "/login");
  }
%>