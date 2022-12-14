<%@page import="com.tech.blog.Entities.User"%>
<%@page errorPage="error_page.jsp"%>
<%
User user =(User) session.getAttribute("currentUser");
if(user==null)
{
response.sendRedirect("login.jsp");
}
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>profile Page</title>
        
        
        <!--CSS-->
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
        <link href="css/mystyle.css" rel="stylesheet" type="text/css"/>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    </head>
    <body>
        
       <!--navbar-->
       
       <nav class="navbar navbar-expand-lg navbar-dark nav-background">
             <a class="navbar-brand" href="index.jsp"><span class="fa fa-users"> </span> Tech Blog</a>
             <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
             </button>

             <div class="collapse navbar-collapse" id="navbarSupportedContent">
                    <ul class="navbar-nav mr-auto">
                      <li class="nav-item active">
                          <a class="nav-link" href="#"><span class="fa fa-file-code-o"> </span> Learn code with Rounak <span class="sr-only">(current)</span></a>
                      </li>
                      <li class="nav-item dropdown">
                          <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                            <span class="fa fa-check-square-o"> </span> Categories
                          </a>
                  <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                          <a class="dropdown-item" href="#">Programming Language</a>
                          <a class="dropdown-item" href="#">Project Implementation</a>
                          <div class="dropdown-divider"></div>
                          <a class="dropdown-item" href="#">Data Structure</a>
                  </div>
                     </li>
      <li class="nav-item">
        <a class="nav-link" href="#"><span class="fa fa-address-book"> </span> Contact</a>
      </li>
      
       
      
    </ul>
                 <ul class="navbar-nav mr-right">
                    <li class="nav-item">
                    <a class="nav-link" href="#"><span class="fa fa-user-circle"> </span> <%= user.getName()%></a>
                    </li> 
                    
                    <li class="nav-item">
                    <a class="nav-link" href="LogoutServlet"><span class="fa fa-user-plus"> </span> Logout</a>
                    </li> 
                     
                     
                     
                 </ul>
         </div>
     </nav>
       <!--end of navbar-->
       
       
       
       
       
       <!--javascript-->   
    <script src="https://code.jquery.com/jquery-3.6.0.min.js" integrity="sha256-/xUj+3OJU5yExlq6GSYGSHk7tPXikynS7ogEvDej/m4=" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
    <script src="js/myjs.js" type="text/javascript"></script>
    </body>
</html>
