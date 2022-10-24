<%-- 
    Document   : register
    Created on : Apr 3, 2022, 12:04:42 AM
    Author     : H P
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Register page</title>
        <!--CSS-->
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
        <link href="css/mystyle.css" rel="stylesheet" type="text/css"/>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    </head>
    <body>
       <!--navbar-->
       <%@include file="normal_navbar.jsp"%>
       
       <main class="primary-background p-5">
           <div class="container ">
               
               <div class="col-md-6 offset-md-3">
                   
                   <div class="card">
                       
                       <div class="card-header text-center primary-background text-white">
                           <span class="fa fa-user-circle fa-3x"></span>
                           <p>Register Here</p>
                           <br>
                       </div>
                       <div class="card-body">
                           <form id="reg-form" action="RegisterServlet" method="POST">
                                <div class="form-group">
                                   <label for="exampleInputName">name</label>
                                   <input name="user_name" type="text" class="form-control" id="name" aria-describedby="emailHelp" placeholder="Enter Name">
                                  
                               </div>
                               <div class="form-group">
                                   <label for="exampleInputEmail1">Email address</label>
                                   <input name="user_email" type="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter email">
                                   <small id="emailHelp" class="form-text text-muted">We'll never share your email with anyone else.</small>
                               </div>
                               <div class="form-group">
                                   <label for="exampleInputPassword1">Password</label>
                                   <input name="user_password" type="password" class="form-control" id="exampleInputPassword">
                               </div>
                               <div class="form-group">
                                   <label for="gender">Select gender</label>
                                   <br>
                                   <input type="radio"  id="gender" name="gender" value="male">Male
                                   <input type="radio"  id="gender" name="gender" value="female">Female
                               </div>
                               <div class="form-group form-check">
                               <input name="check" type="checkbox" class="form-check-input" id="exampleCheck1">
                               <label class="form-check-label" for="exampleCheck1">Agree term and condition</label>
                               </div>
                               <br>
                               <div class="container text-center" id="loader" style="display: none;">
                                   <span class="fa fa-refresh fa-spin fa-3x"> </span>
                                   <H4>Please wait...</H4>
                               </div>
                               <br>
                               <button id="submit-btn" type="submit" class="btn btn-primary">submit</button>
                           </form>
                       </div>
                       
                       
                   </div>
                   
               </div>
               
               
               
           </div>
           
           
           
           
       </main>
       
        
        
        
        
         <!--javascript-->   
         <script src="https://code.jquery.com/jquery-3.6.0.min.js" integrity="sha256-/xUj+3OJU5yExlq6GSYGSHk7tPXikynS7ogEvDej/m4=" crossorigin="anonymous"></script>
         <script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
         <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
         <script src="js/myjs.js" type="text/javascript"></script>
         <script src="https://cdnjs.cloudflare.com/ajax/libs/sweetalert/2.1.2/sweetalert.min.js"></script>
         <script> 
     $ (document).ready(function(){
                console.log("loaded...");
                
                $('#reg-form').on('submit',function(event){
                    event.preventDefault();
                    
                    let form=new FormData(this);
                    $("#submit-btn").hide();
                    $("#loader").show();
                    // send register servlet
                    $.ajax({
                        url: "RegisterServlet",
                        type: 'POST',
                        data: form,
                        success: function(data, textStatus, jqXHR) {
                            console.log(data);
                            
                             $("#submit-btn").show();
                             $("#loader").hide();
                             
                        if(data.trim () === 'done')
                        {
                             swal({
                                 title: " Registeration Successful ! ",
                                 text: " You are redirected to login page !",
                                 icon:"success"
                             } )
                            .then((value) => {
                                
                              window.location="login.jsp";
                            });

                        }
                        else
                        {
                            swal(data);
                        }

                        },
                        error: function(jqXHR, textStatus, errorThrown){
                            console.log(jqXHR);
                            
                            $("#submit-btn").show();
                            $("#loader").hide();
                            swal(  " Something went wrong ! "  );
                        },
                        processData: false,
                        contentType: false
                    });
                });
            });    
         </script>    
    </body>
</html>
