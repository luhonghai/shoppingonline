<%@ page import="uk.ac.gre.cw.shoppingonline.service.CustomerService" %>
<%@ page import="uk.ac.gre.cw.shoppingonline.jdo.entities.Customer" %><%
  try {
    String name = request.getParameter("name");
    String email = request.getParameter("email");
    String password = request.getParameter("password");
    CustomerService customerService = new CustomerService();
    Customer customer = new Customer();
    customer.setName(name);
    customer.setEmail(email);
    customer.setPassword(password);
    if (customerService.create(customer)) {
      session.setAttribute("customer", customer);
      response.sendRedirect(request.getContextPath());
    } else {
      response.sendRedirect(request.getContextPath() + "/login");
    }
  } catch (Exception ex) {
     response.getWriter().print("Error: " + ex.getMessage());
     ex.printStackTrace();
    response.sendRedirect(request.getContextPath() + "/login");
  }
%>