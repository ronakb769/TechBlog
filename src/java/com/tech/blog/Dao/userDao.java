
package com.tech.blog.Dao;
import java.sql.*;
import com.tech.blog.Entities.User;

public class userDao {
    private Connection con;

    public userDao(Connection con) {
        this.con = con;
    }
    
    //method to insert user to data base 
    public boolean saveUser(User user){
        boolean f = false;
        try
        {
        String query = "insert into user(name,email,password,gender) values(?,?,?,?)";
         PreparedStatement pst = this.con.prepareStatement(query);
         pst.setString(1, user.getName());
         pst.setString(2, user.getEmail());
         pst.setString(3, user.getPassword());
         pst.setString(4, user.getGender());
 
         pst.executeUpdate();
         f=true;
        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
        return f;
    }
    
    //get user by useremail and userpassword
    public User getUserByEmailAndPassword(String email, String password){
        User user = null;
        
        try{
            
            String query = "select * from user where email=? and password=?";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, email);
            pst.setString(2, password);
            
            
            ResultSet set = pst.executeQuery();
            if(set.next())
            {
              user = new User();
              // data from db
              String name = set.getString("name");
              // set to user object
              user.setName(name);
              
              user.setId(set.getInt("id"));
              user.setEmail(set.getString("email"));
              user.setPassword(set.getString("password"));
              user.setGender(set.getString("gender"));
              user.setProfile(set.getString("profile"));
            }
        } catch(Exception e){ 
           e.printStackTrace();
        }
       
        
        
        return user;
        }
   
   }

