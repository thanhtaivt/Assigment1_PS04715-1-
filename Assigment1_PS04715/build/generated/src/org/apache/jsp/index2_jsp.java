package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index2_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<head>\n");
      out.write("\t<meta charset=\"UTF-8\">\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("\t<title>Space Science Website Template</title>\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/style.css\" type=\"text/css\">\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"css/mobile.css\">\n");
      out.write("\t<script src=\"js/mobile.js\" type=\"text/javascript\"></script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\t<div id=\"page\">\n");
      out.write("\t\t<div id=\"header\">\n");
      out.write("\t\t\t<div>\n");
      out.write("\t\t\t\t<a href=\"index.html\" class=\"logo\"><img src=\"images/logo.png\" alt=\"\"></a>\n");
      out.write("\t\t\t\t<ul id=\"navigation\">\n");
      out.write("\t\t\t\t\t<li class=\"selected\">\n");
      out.write("\t\t\t\t\t\t<a href=\"index.html\">Home</a>\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t<a href=\"about.html\">About</a>\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t<li class=\"menu\">\n");
      out.write("\t\t\t\t\t\t<a href=\"projects.html\">Projects</a>\n");
      out.write("\t\t\t\t\t\t<ul class=\"primary\">\n");
      out.write("\t\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"proj1.html\">proj 1</a>\n");
      out.write("\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t<li class=\"menu\">\n");
      out.write("\t\t\t\t\t\t<a href=\"blog.html\">Blog</a>\n");
      out.write("\t\t\t\t\t\t<ul class=\"secondary\">\n");
      out.write("\t\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"singlepost.html\">Single post</a>\n");
      out.write("\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t<a href=\"contact.html\">Contact</a>\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div id=\"body\" class=\"home\">\n");
      out.write("\t\t\t<div class=\"header\">\n");
      out.write("\t\t\t\t<div>\n");
      out.write("\t\t\t\t\t<img src=\"images/satellite.png\" alt=\"\" class=\"satellite\">\n");
      out.write("\t\t\t\t\t<h1>SOYUZ TMA-M</h1>\n");
      out.write("\t\t\t\t\t<h2>SPACECRAFT</h2>\n");
      out.write("\t\t\t\t\t<a href=\"blog.html\" class=\"more\">Read More</a>\n");
      out.write("\t\t\t\t\t<h3>FEATURED PROJECTS</h3>\n");
      out.write("\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t<a href=\"projects.html\"><img src=\"images/project-image1.jpg\" alt=\"\"></a>\n");
      out.write("\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t<a href=\"projects.html\"><img src=\"images/project-image2.jpg\" alt=\"\"></a>\n");
      out.write("\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t<a href=\"projects.html\"><img src=\"images/project-image3.jpg\" alt=\"\"></a>\n");
      out.write("\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t<a href=\"projects.html\"><img src=\"images/project-image4.jpg\" alt=\"\"></a>\n");
      out.write("\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"body\">\n");
      out.write("\t\t\t\t<div>\n");
      out.write("\t\t\t\t\t<h1>OUR MISSION</h1>\n");
      out.write("\t\t\t\t\t<p>This website template has been designed by Free Website Templates for you, for free. You can replace all this text with your own text.</p>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"footer\">\n");
      out.write("\t\t\t\t<div>\n");
      out.write("\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t<h1>FEATURED VIDEO</h1>\n");
      out.write("\t\t\t\t\t\t\t<a href=\"blog.html\"><img src=\"images/mars-rover.jpg\" alt=\"\"><span></span></a>\n");
      out.write("\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t<h1>LATEST BLOG</h1>\n");
      out.write("\t\t\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"blog.html\"><img src=\"images/finding-planet.jpg\" alt=\"\"></a>\n");
      out.write("\t\t\t\t\t\t\t\t\t<h1>FINDING PLANET X-123</h1>\n");
      out.write("\t\t\t\t\t\t\t\t\t<span>FEBRUARY 6, 2023</span>\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"blog.html\" class=\"more\">Read More</a>\n");
      out.write("\t\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"blog.html\"><img src=\"images/new-satellitedish.jpg\" alt=\"\"></a>\n");
      out.write("\t\t\t\t\t\t\t\t\t<h1>NEW SATELLITE DISH</h1>\n");
      out.write("\t\t\t\t\t\t\t\t\t<span>FEBRUARY 3, 2023</span>\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"blog.html\" class=\"more\">Read More</a>\n");
      out.write("\t\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div id=\"footer\">\n");
      out.write("\t\t\t<div class=\"connect\">\n");
      out.write("\t\t\t\t<div>\n");
      out.write("\t\t\t\t\t<h1>FOLLOW OUR  MISSIONS ON</h1>\n");
      out.write("\t\t\t\t\t<div>\n");
      out.write("\t\t\t\t\t\t<a href=\"http://freewebsitetemplates.com/go/facebook/\" class=\"facebook\">facebook</a>\n");
      out.write("\t\t\t\t\t\t<a href=\"http://freewebsitetemplates.com/go/twitter/\" class=\"twitter\">twitter</a>\n");
      out.write("\t\t\t\t\t\t<a href=\"http://freewebsitetemplates.com/go/googleplus/\" class=\"googleplus\">googleplus</a>\n");
      out.write("\t\t\t\t\t\t<a href=\"http://pinterest.com/fwtemplates/\" class=\"pinterest\">pinterest</a>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"footnote\">\n");
      out.write("\t\t\t\t<div>\n");
      out.write("\t\t\t\t\t<p>&copy; 2023 BY SPACE PROSPECTION | ALL RIGHTS RESERVED</p>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("</body>\n");
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
