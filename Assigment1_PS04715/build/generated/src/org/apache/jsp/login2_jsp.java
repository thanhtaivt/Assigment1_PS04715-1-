package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login2_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<!doctype html>\n");
      out.write("<!-- Website template by freewebsitetemplates.com -->\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <title>Space Science Website Template</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/style.css\" type=\"text/css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/mobile.css\">\n");
      out.write("        <script src=\"js/mobile.js\" type=\"text/javascript\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div id=\"page\">\n");
      out.write("            <div id=\"header\">\n");
      out.write("                <div>\n");
      out.write("                    <a href=\"index.html\" class=\"logo\"><img src=\"images/logo.png\" alt=\"\"></a>\n");
      out.write("                    <ul id=\"navigation\">\n");
      out.write("                        <li class=\"selected\">\n");
      out.write("                            <a href=\"index2.jsp\">Home</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"about.html\">About</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"menu\">\n");
      out.write("                            <a href=\"projects.html\">Projects</a>\n");
      out.write("                            <ul class=\"primary\">\n");
      out.write("                                <li>\n");
      out.write("                                    <a href=\"proj1.html\">proj 1</a>\n");
      out.write("                                </li>\n");
      out.write("                            </ul>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"menu\">\n");
      out.write("                            <a href=\"blog.html\">Blog</a>\n");
      out.write("                            <ul class=\"secondary\">\n");
      out.write("                                <li>\n");
      out.write("                                    <a href=\"singlepost.html\">Single post</a>\n");
      out.write("                                </li>\n");
      out.write("                            </ul>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"login.jsp\">Login</a>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div id=\"body\" class=\"home\">\n");
      out.write("                <div class=\"header\">\n");
      out.write("                    <div>\n");
      out.write("                        <img src=\"images/satellite.png\" alt=\"\" class=\"satellite\">\n");
      out.write("                        <h1>SOYUZ TMA-M</h1>\n");
      out.write("                        <h2>SPACECRAFT</h2>\n");
      out.write("                        <a href=\"blog.html\" class=\"more\">Read More</a>\n");
      out.write("                        <h3>Top 4 Cac Ca Si</h3>\n");
      out.write("                        <ul>\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"projects.html\"><img src=\"images/project-image1.jpg\" alt=\"\"></a>\n");
      out.write("                            </li>\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"projects.html\"><img src=\"images/project-image2.jpg\" alt=\"\"></a>\n");
      out.write("                            </li>\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"projects.html\"><img src=\"images/project-image3.jpg\" alt=\"\"></a>\n");
      out.write("                            </li>\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"projects.html\"><img src=\"images/project-image4.jpg\" alt=\"\"></a>\n");
      out.write("                            </li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"body\">\n");
      out.write("                    <div>\n");
      out.write("                        <h1>OUR MISSION</h1>\n");
      out.write("                        <p>This website template has been designed by Free Website Templates for you, for free. You can replace all this text with your own text.</p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"footer\">\n");
      out.write("                    <div><center>\n");
      out.write("                        <ul>\n");
      out.write("                            <div>                      \n");
      out.write("                            <h1 style=\"color: #ffffff\">Login</h1>\n");
      out.write("       <form action=\"ControllerCustomers\">\n");
      out.write("            <h4 style=\"color: #ffffff\">Username:</h4> <input type=\"text\" name=\"txtUser\" value=\"\"/><br/>\n");
      out.write("            <h4 style=\"color: #ffffff\">Password: </h4><input type=\"password\" name=\"txtPass\" value=\"\"/><br/>\n");
      out.write("            <input type=\"submit\" name=\"action\" value=\"Login\"/>\n");
      out.write("            <input type=\"reset\" name=\"Reset\" value=\"Reset\"/>\n");
      out.write("            \n");
      out.write("            </form>\n");
      out.write("                        </ul>\n");
      out.write("                        </center>\n");
      out.write("</div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div id=\"footer\">\n");
      out.write("                <div class=\"connect\">\n");
      out.write("                    <div>\n");
      out.write("                        <h1>FOLLOW OUR  MISSIONS ON</h1>\n");
      out.write("                        <div>\n");
      out.write("                            <a href=\"http://freewebsitetemplates.com/go/facebook/\" class=\"facebook\">facebook</a>\n");
      out.write("                            <a href=\"http://freewebsitetemplates.com/go/twitter/\" class=\"twitter\">twitter</a>\n");
      out.write("                            <a href=\"http://freewebsitetemplates.com/go/googleplus/\" class=\"googleplus\">googleplus</a>\n");
      out.write("                            <a href=\"http://pinterest.com/fwtemplates/\" class=\"pinterest\">pinterest</a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"footnote\">\n");
      out.write("                    <div>\n");
      out.write("                        <p>&copy; 2023 BY SPACE PROSPECTION | ALL RIGHTS RESERVED</p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
