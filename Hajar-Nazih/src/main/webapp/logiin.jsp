<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     
        <%!
    String message="";
    String etat="";
    int cpt=0;
    %>
    
    <%
    if(request.getAttribute("msg")!=null)
    {
    	cpt=Integer.parseInt(request.getAttribute("cpt").toString());
    	message=request.getAttribute("msg").toString()+" <br/>"+ cpt+" ieme tetative";
    	if(cpt>3)
    		etat="disabled";
    }
    %>
    
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<style>
body {font-family: Arial, Helvetica, sans-serif;}
	body {
		background-image:url(jhh.jpg); 
	}
form {border: 3px solid #f1f1f1;}

input[type=text], input[type=password] {
  width: 100%;
  padding: 12px 20px;
  margin: 8px 0;
  display: inline-block;
  border: 1px solid #ccc;
  box-sizing: border-box;
}

</style>
</head>
<body>

<h2>Authentification</h2>
<form action="index.jsp" class="text-center">
  <div class="imgcontainer">
   
  </div>

  <div class="container">
    <label for="login"><b>Login</b></label>
    <input type="text" placeholder="Enter Login" name="Login" required>

    <label for="pass"><b>Password</b></label>
    <input type="password" placeholder="Enter Password" name="pass" required>
        
    <button type="submit">Login</button>
    <label>
      <input type="checkbox" checked="checked" name="remember"> Remember me
    </label>
  </div>

  <div class="container" style="background-color:#f1f1f1">
    <button type="button" class="cancelbtn">Cancel</button>
    <span class="pass">Forgot <a href="#">password?</a></span>
  </div>
</form>

</body>

<style>
body {font-family: Arial, Helvetica, sans-serif;}
	body {
		background-image:url(jhh.jpg); 
	}
* {box-sizing: border-box;}

/* Full-width input fields */
input[type=text], input[type=password] {
  width: 100%;
  padding: 15px;
  margin: 5px 0 22px 0;
  display: inline-block;
  border: none;
  background: #f1f1f1;
}

/* Add a background color when the inputs get focus */
input[type=text]:focus, input[type=password]:focus {
  background-color: #ddd;
  outline: none;
}

/* Set a style for all buttons */
button {
  background-color: #04AA6D;
  color: white;
  padding: 14px 20px;
  margin: 8px 0;
  border: none;
  cursor: pointer;
  width: 100%;
  opacity: 0.9;
}

button:hover {
  opacity:1;
}

/* Extra styles for the cancel button */
.cancelbtn {
  padding: 14px 120px;
  background-color:  #f5a0ea ;
  margin-top:-1.25%;
}

/* Float cancel and signup buttons and add an equal width */
.cancelbtn, .signupbtn {
  float: right;
  width: 25%;
}

/* Add padding to container elements */
.container {
  padding: 16px;
}

/* The Modal (background) */
.modal {
  display: none; /* Hidden by default */
  position: fixed; /* Stay in place */
  z-index: 1; /* Sit on top */
  left: 0;
  top: 0;
  width: 100%; /* Full width */
  height: 100%; /* Full height */
  overflow: auto; /* Enable scroll if needed */
  background-color: #474e5d;
  padding-top: 50px;
}

/* Modal Content/Box */
.modal-content {
  background-color: #fefefe;
  margin: 5% auto 15% auto; /* 5% from the top, 15% from the bottom and centered */
  border: 1px solid #888;
  width: 80%; /* Could be more or less, depending on screen size */
}

/* Style the horizontal ruler */
hr {
  border: 1px solid #f1f1f1;
  margin-bottom: 25px;
}
 
/* The Close Button (x) */
.close {
  position: absolute;
  right: 35px;
  top: 15px;
  font-size: 40px;
  font-weight: bold;
  color: #f1f1f1;
}

.close:hover,
.close:focus {
  color: #f44336;
  cursor: pointer;
}

/* Clear floats */
.clearfix::after {
  content: "";
  clear: both;
  display: table;
}

/* Change styles for cancel button and signup button on extra small screens */
@media smallscreen and (max-width: 100px) {
  .cancelbtn, .signupbtn {
     width: 100%;
  }
}
</style>
<body>



<button onclick="document.getElementById('id01').style.display='block'" style="width:auto;">Inscription</button>

<div id="id01" class="modal">
  <span onclick="document.getElementById('id01').style.display='none'" class="close" title="Close Modal">&times;</span>
  <form action="index.jsp" class="text-center">
    <div class="bibliodao">
      <h1>Sign Up</h1>
      <p>Please fill in this form to create an account.</p>
      <hr>
     <label for="prenom"><b>Prenom</b></label>
      <input type="text" placeholder="Enter Prenom" name="prenom" required>
      
       <label for="nom"><b>NOM</b></label>
      <input type="text" placeholder="Enter nom" name="nom" required>
    
      <label for="login"><b>Login</b></label>
      <input type="text" placeholder="Enter Login" name="login" required>

      <label for="pass"><b>Password</b></label>
      <input type="password" placeholder="Enter Password" name="pass" required>

      <label for="pass-repeat"><b>Repeat Password</b></label>
      <input type="password" placeholder="Repeat Password" name="pass-repeat" required>
      
        <label for="role"><b>role</b></label>
      <input type="text" placeholder="role" name="role" required>
      
      <label>
        <input type="checkbox" checked="checked" name="remember" style="margin-bottom:15px"> Remember me
      </label>

      <p>By creating an account you agree to our <a href="#" style="color:dodgerblue">Terms & Privacy</a>.</p>

      <div class="clearfix">
        <button type="button" onclick="document.getElementById('id01').style.display='none'" class="cancelbtn">Cancel</button>
        <button type="submit" class="signupbtn">Inscription</button>
      </div>
    </div>
  </form>
</div>

<script>
// Get the modal
var modal = document.getElementById('id01');

// When the user clicks anywhere outside of the modal, close it
window.onclick = function(event) {
  if (event.target == modal) {
	  modal.style.display = "none";
  }
}
</script>

</body>
</html>
