<%-- 
    Document   : index
    Created on : Mar 8, 2022, 11:58:10 AM
    Author     : H P
--%>

<%@page import="com.tech.blog.Helper.ConnectionProvider"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        
        <!--CSS-->
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
        <link href="css/mystyle.css" rel="stylesheet" type="text/css"/>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    </head>
    
    <body>
        <!--navbar-->
       <%@include file="normal_navbar.jsp"%>
       
       <!--banner-->
       <div class="container-fluid p-0 m-0">
           
           <div class="jumbotron primary-background text-white">
               <div class="container">
                   <h3 class="display-3">Welcome to Techblog</h3> 
               <p>Welcome to technical blog, world of technology. A programming language is any set of rules that converts strings, or graphical program elements in the case of visual programming languages, to various kinds of machine code output. Programming languages are one kind of computer language, and are used in computer programming to implement algorithms.</p>
               <a href="register.jsp" class="btn btn-outline-light btn-lg"><span class="fa fa-external-link"></span> Start it free!</a>
               <a href="login.jsp" class="btn btn-outline-light btn-lg"><span class="fa fa-user-circle-o fa-spin"></span> Login</a>

               
               </div>
               
           </div>
           
       
       </div>
       
       <!--//cards-->
       <div class="container">
           <div class="row mb-2">
               
               <div class="col-md-4">
                   
                   <div class="card">
                       <img class="card-img-top" src="img/java (1).png" alt="Card image cap" style="height:230px">
                   <div class="card-body">
                     
                   <h5 class="card-title">Java Programming</h5>
                   <p class="card-text">Java is a class-based, object-oriented programming language and is designed to have as few implementation dependencies as possible. A general-purpose programming language made for developers to write once run anywhere that is compiled Java code can run on all platforms that support Java. </p>
                   <a href="https://www.guru99.com/java-platform.html" target="_blank" class="btn primary-background text-white">Read more</a>
                   </div>
                   </div>
                   
               </div>
               <div class="col-md-4">
                   
                   <div class="card">
                        <img class="card-img-top" src="img/java (1).png" alt="Card image cap" style="height:230px">
                   <div class="card-body">
                   <h5 class="card-title">C++ Programming</h5>
                   <p class="card-text">C++ is a general-purpose programming language and is widely used nowadays for competitive programming. It has imperative, object-oriented and generic programming features. C++ runs on lots of platforms like Windows, Linux, Unix, Mac etc.</p>
                   <a href="https://www.guru99.com/cpp-tutorial.html" target="_blank" class="btn primary-background text-white">Read more</a>
                   </div>
                   </div>
                   
               </div>
               <div class="col-md-4">
                   
                   <div class="card">
                        <img class="card-img-top" src="img/java (1).png" alt="Card image cap" style="height:230px">
                   <div class="card-body">
                   <h5 class="card-title">Java Programming</h5>
                   <p class="card-text">A programming language is any set of rules that converts strings, or graphical program elements in the case of visual programming languages, to various kinds of machine code output. Programming languages are one kind of computer language, and are used in computer programming to implement algorithms.</p>
                   <a href="#" class="btn primary-background text-white">Read more</a>
                   </div>
                   </div>
                   
               </div>
               
           </div>
           <div class="row">
               
               <div class="col-md-4">
                   
                   <div class="card">
                        <img class="card-img-top" src="img/java (1).png" alt="Card image cap" style="height:230px">
                   <div class="card-body">
                   <h5 class="card-title">Java Programming</h5>
                   <p class="card-text">A programming language is any set of rules that converts strings, or graphical program elements in the case of visual programming languages, to various kinds of machine code output. Programming languages are one kind of computer language, and are used in computer programming to implement algorithms.</p>
                   <a href="#" class="btn primary-background text-white">Read more</a>
                   </div>
                   </div>
                   
               </div>
               <div class="col-md-4">
                   
                   <div class="card">
                        <img class="card-img-top" src="img/java (1).png" alt="Card image cap" style="height:230px">
                   <div class="card-body">
                   <h5 class="card-title">Java Programming</h5>
                   <p class="card-text">A programming language is any set of rules that converts strings, or graphical program elements in the case of visual programming languages, to various kinds of machine code output. Programming languages are one kind of computer language, and are used in computer programming to implement algorithms.</p>
                   <a href="#" class="btn primary-background text-white">Read more</a>
                   </div>
                   </div>
                   
               </div>
               <div class="col-md-4">
                   
                   <div class="card">
                        <img class="card-img-top" src="img/java (1).png" alt="Card image cap" style="height:230px">
                   <div class="card-body">
                   <h5 class="card-title">Java Programming</h5>
                   <p class="card-text">A programming language is any set of rules that converts strings, or graphical program elements in the case of visual programming languages, to various kinds of machine code output. Programming languages are one kind of computer language, and are used in computer programming to implement algorithms.</p>
                   <a href="#" class="btn primary-background text-white">Read more</a>
                   </div>
                   </div>
                   
               </div>
               
           </div>
           
       </div>
       
        
     <!--javascript-->   
    <script src="https://code.jquery.com/jquery-3.6.0.min.js" integrity="sha256-/xUj+3OJU5yExlq6GSYGSHk7tPXikynS7ogEvDej/m4=" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
    <script src="js/myjs.js" type="text/javascript"></script>
    
    </body>
</html>
