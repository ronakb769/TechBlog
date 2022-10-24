package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.tech.blog.Helper.ConnectionProvider;
import java.sql.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/normal_navbar.jsp");
  }

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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        \n");
      out.write("        <!--CSS-->\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css\" integrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\" crossorigin=\"anonymous\">\n");
      out.write("        <link href=\"css/mystyle.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("    <body>\n");
      out.write("        <!--navbar-->\n");
      out.write("       ");
      out.write("<nav class=\"navbar navbar-expand-lg navbar-dark nav-background\">\n");
      out.write("  <a class=\"navbar-brand\" href=\"index.jsp\"><span class=\"fa fa-users\"> </span> Tech Blog</a>\n");
      out.write("  <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("    <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("  </button>\n");
      out.write("\n");
      out.write("  <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\n");
      out.write("    <ul class=\"navbar-nav mr-auto\">\n");
      out.write("      <li class=\"nav-item active\">\n");
      out.write("        <a class=\"nav-link\" href=\"#\"><span class=\"fa fa-file-code-o\"> </span> Learn code with Rounak <span class=\"sr-only\">(current)</span></a>\n");
      out.write("      </li>\n");
      out.write("      <li class=\"nav-item dropdown\">\n");
      out.write("        <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdown\" role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("          <span class=\"fa fa-check-square-o\"> </span> Categories\n");
      out.write("        </a>\n");
      out.write("        <div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\n");
      out.write("          <a class=\"dropdown-item\" href=\"#\">Programming Language</a>\n");
      out.write("          <a class=\"dropdown-item\" href=\"#\">Project Implementation</a>\n");
      out.write("          <div class=\"dropdown-divider\"></div>\n");
      out.write("          <a class=\"dropdown-item\" href=\"#\">Data Structure</a>\n");
      out.write("        </div>\n");
      out.write("      </li>\n");
      out.write("      <li class=\"nav-item\">\n");
      out.write("        <a class=\"nav-link\" href=\"#\"><span class=\"fa fa-address-book\"> </span> Contact</a>\n");
      out.write("      </li>\n");
      out.write("      <li class=\"nav-item\">\n");
      out.write("        <a class=\"nav-link\" href=\"login.jsp\"><span class=\"fa fa-user-circle-o\"> </span> Login</a>\n");
      out.write("      </li>\n");
      out.write("       <li class=\"nav-item\">\n");
      out.write("        <a class=\"nav-link\" href=\"register.jsp\"><span class=\"fa fa-user-plus\"> </span> Register</a>\n");
      out.write("      </li>\n");
      out.write("      \n");
      out.write("    </ul>\n");
      out.write("    <form class=\"form-inline my-2 my-lg-0\">\n");
      out.write("      <input class=\"form-control mr-sm-2\" type=\"search\" placeholder=\"Search\" aria-label=\"Search\">\n");
      out.write("      <button class=\"btn btn-outline-light my-2 my-sm-0\" type=\"submit\">Search</button>\n");
      out.write("    </form>\n");
      out.write("  </div>\n");
      out.write("</nav>");
      out.write("\n");
      out.write("       \n");
      out.write("       <!--banner-->\n");
      out.write("       <div class=\"container-fluid p-0 m-0\">\n");
      out.write("           \n");
      out.write("           <div class=\"jumbotron primary-background text-white\">\n");
      out.write("               <div class=\"container\">\n");
      out.write("                   <h3 class=\"display-3\">Welcome to Techblog</h3> \n");
      out.write("               <p>Welcome to technical blog, world of technology. A programming language is any set of rules that converts strings, or graphical program elements in the case of visual programming languages, to various kinds of machine code output. Programming languages are one kind of computer language, and are used in computer programming to implement algorithms.</p>\n");
      out.write("               <a href=\"register.jsp\" class=\"btn btn-outline-light btn-lg\"><span class=\"fa fa-external-link\"></span> Start it free!</a>\n");
      out.write("               <a href=\"login.jsp\" class=\"btn btn-outline-light btn-lg\"><span class=\"fa fa-user-circle-o fa-spin\"></span> Login</a>\n");
      out.write("\n");
      out.write("               \n");
      out.write("               </div>\n");
      out.write("               \n");
      out.write("           </div>\n");
      out.write("           \n");
      out.write("       \n");
      out.write("       </div>\n");
      out.write("       \n");
      out.write("       <!--//cards-->\n");
      out.write("       <div class=\"container\">\n");
      out.write("           <div class=\"row mb-2\">\n");
      out.write("               \n");
      out.write("               <div class=\"col-md-4\">\n");
      out.write("                   \n");
      out.write("                   <div class=\"card\">\n");
      out.write("                       <img class=\"card-img-top\" src=\"img/java (1).png\" alt=\"Card image cap\" style=\"height:230px\">\n");
      out.write("                   <div class=\"card-body\">\n");
      out.write("                     \n");
      out.write("                   <h5 class=\"card-title\">Java Programming</h5>\n");
      out.write("                   <p class=\"card-text\">Java is a class-based, object-oriented programming language and is designed to have as few implementation dependencies as possible. A general-purpose programming language made for developers to write once run anywhere that is compiled Java code can run on all platforms that support Java. </p>\n");
      out.write("                   <a href=\"https://www.guru99.com/java-platform.html\" target=\"_blank\" class=\"btn primary-background text-white\">Read more</a>\n");
      out.write("                   </div>\n");
      out.write("                   </div>\n");
      out.write("                   \n");
      out.write("               </div>\n");
      out.write("               <div class=\"col-md-4\">\n");
      out.write("                   \n");
      out.write("                   <div class=\"card\">\n");
      out.write("                        <img class=\"card-img-top\" src=\"img/java (1).png\" alt=\"Card image cap\" style=\"height:230px\">\n");
      out.write("                   <div class=\"card-body\">\n");
      out.write("                   <h5 class=\"card-title\">C++ Programming</h5>\n");
      out.write("                   <p class=\"card-text\">C++ is a general-purpose programming language and is widely used nowadays for competitive programming. It has imperative, object-oriented and generic programming features. C++ runs on lots of platforms like Windows, Linux, Unix, Mac etc.</p>\n");
      out.write("                   <a href=\"https://www.guru99.com/cpp-tutorial.html\" target=\"_blank\" class=\"btn primary-background text-white\">Read more</a>\n");
      out.write("                   </div>\n");
      out.write("                   </div>\n");
      out.write("                   \n");
      out.write("               </div>\n");
      out.write("               <div class=\"col-md-4\">\n");
      out.write("                   \n");
      out.write("                   <div class=\"card\">\n");
      out.write("                        <img class=\"card-img-top\" src=\"img/java (1).png\" alt=\"Card image cap\" style=\"height:230px\">\n");
      out.write("                   <div class=\"card-body\">\n");
      out.write("                   <h5 class=\"card-title\">Java Programming</h5>\n");
      out.write("                   <p class=\"card-text\">A programming language is any set of rules that converts strings, or graphical program elements in the case of visual programming languages, to various kinds of machine code output. Programming languages are one kind of computer language, and are used in computer programming to implement algorithms.</p>\n");
      out.write("                   <a href=\"#\" class=\"btn primary-background text-white\">Read more</a>\n");
      out.write("                   </div>\n");
      out.write("                   </div>\n");
      out.write("                   \n");
      out.write("               </div>\n");
      out.write("               \n");
      out.write("           </div>\n");
      out.write("           <div class=\"row\">\n");
      out.write("               \n");
      out.write("               <div class=\"col-md-4\">\n");
      out.write("                   \n");
      out.write("                   <div class=\"card\">\n");
      out.write("                        <img class=\"card-img-top\" src=\"img/java (1).png\" alt=\"Card image cap\" style=\"height:230px\">\n");
      out.write("                   <div class=\"card-body\">\n");
      out.write("                   <h5 class=\"card-title\">Java Programming</h5>\n");
      out.write("                   <p class=\"card-text\">A programming language is any set of rules that converts strings, or graphical program elements in the case of visual programming languages, to various kinds of machine code output. Programming languages are one kind of computer language, and are used in computer programming to implement algorithms.</p>\n");
      out.write("                   <a href=\"#\" class=\"btn primary-background text-white\">Read more</a>\n");
      out.write("                   </div>\n");
      out.write("                   </div>\n");
      out.write("                   \n");
      out.write("               </div>\n");
      out.write("               <div class=\"col-md-4\">\n");
      out.write("                   \n");
      out.write("                   <div class=\"card\">\n");
      out.write("                        <img class=\"card-img-top\" src=\"img/java (1).png\" alt=\"Card image cap\" style=\"height:230px\">\n");
      out.write("                   <div class=\"card-body\">\n");
      out.write("                   <h5 class=\"card-title\">Java Programming</h5>\n");
      out.write("                   <p class=\"card-text\">A programming language is any set of rules that converts strings, or graphical program elements in the case of visual programming languages, to various kinds of machine code output. Programming languages are one kind of computer language, and are used in computer programming to implement algorithms.</p>\n");
      out.write("                   <a href=\"#\" class=\"btn primary-background text-white\">Read more</a>\n");
      out.write("                   </div>\n");
      out.write("                   </div>\n");
      out.write("                   \n");
      out.write("               </div>\n");
      out.write("               <div class=\"col-md-4\">\n");
      out.write("                   \n");
      out.write("                   <div class=\"card\">\n");
      out.write("                        <img class=\"card-img-top\" src=\"img/java (1).png\" alt=\"Card image cap\" style=\"height:230px\">\n");
      out.write("                   <div class=\"card-body\">\n");
      out.write("                   <h5 class=\"card-title\">Java Programming</h5>\n");
      out.write("                   <p class=\"card-text\">A programming language is any set of rules that converts strings, or graphical program elements in the case of visual programming languages, to various kinds of machine code output. Programming languages are one kind of computer language, and are used in computer programming to implement algorithms.</p>\n");
      out.write("                   <a href=\"#\" class=\"btn primary-background text-white\">Read more</a>\n");
      out.write("                   </div>\n");
      out.write("                   </div>\n");
      out.write("                   \n");
      out.write("               </div>\n");
      out.write("               \n");
      out.write("           </div>\n");
      out.write("           \n");
      out.write("       </div>\n");
      out.write("       \n");
      out.write("        \n");
      out.write("     <!--javascript-->   \n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.6.0.min.js\" integrity=\"sha256-/xUj+3OJU5yExlq6GSYGSHk7tPXikynS7ogEvDej/m4=\" crossorigin=\"anonymous\"></script>\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js\" integrity=\"sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q\" crossorigin=\"anonymous\"></script>\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js\" integrity=\"sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl\" crossorigin=\"anonymous\"></script>\n");
      out.write("    <script src=\"js/myjs.js\" type=\"text/javascript\"></script>\n");
      out.write("    \n");
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
