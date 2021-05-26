<%@page import="com.model.livre, com.web.rechAuteurserv"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
 pageEncoding="ISO-8859-1"%>
<! DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
  <link href='http://fonts.googleapis.com/css?family=Pacifico' rel='stylesheet' type='text/css'>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" integrity="sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7" crossorigin="anonymous">

<title>auteur</title>
<style type="text/css">
	body {
		background-image:url(jhh.jpg); 
	}
	h1.auteur {
		color: #ffffff;
		font-size: 44px;
		font-family: 'Raleway';
		font-weight: 700;
		text-transform: uppercase;
		text-align: center;
	}
	div#retour {
		margin-top:5%;
		margin-left:45%;
	}
	.table {
		color :#ff9dfa;
		width: 80%;
		margin: 30px auto;
		border: 1px solid #fff;
	}
	
	.table td, th {
		border: 1px solid #ff9dfa;
	}
	.table th {
		background: rgba(189, 195, 199,0.4);
	}
</style>
</head>
<%
String Auteur = "";

try {
	response.sendRedirect("livre");
	((livre) response).Affiche();
	
} catch ( Exception e ) { e.printStackTrace(); }
%>
<body>

<h1 class="auteur">Gestion du bibliotheque</h1>
<p class="text-center" style="width:60%;margin:0 auto;border-radius:50px;font-size: 16px;font-weight: 500; color:rgba(192, 57, 43,1.0);font-family:'Raleway';padding:20px;border:1px solid #fff; background: rgba(255,255,255,0.9);">
Par : Hajar Nazih <span style="font-size: 20px;font-weight:700 "></span></p><br><br><br>

 <%=Auteur%> <br>


	<div id="retour"><a class="btn btn-warning" href="index.jsp">
	 		<span class="glyphicon glyphicon-home" aria-hidden="true"></span> Retour
		</a></div>

<!-- Latest compiled and minified JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js" integrity="sha384-0mSbJDEHialfmuBBQP6A4Qrprq5OVfW37PRR3j5ELqxss1yVqOtnepnHVP9aJ7xS" crossorigin="anonymous"></script>	

</body>
</html>