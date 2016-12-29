package org.o7planning.simplewebapp.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
@WebServlet(urlPatterns = { "/publicweb"})
public class PublicFileServlet extends HttpServlet {
  private static final long serialVersionUID = 1L;
 
  public PublicFileServlet() {
      super();
  }
 
  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
          throws ServletException, IOException {
      RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher("/PublicFile1.jsp");
      dispatcher.forward(request, response);
      
  }
 
  @Override
  protected void doPost(HttpServletRequest request, HttpServletResponse response)
          throws ServletException, IOException {
      doGet(request, response);
  }
 
}
