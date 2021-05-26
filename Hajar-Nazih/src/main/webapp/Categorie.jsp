<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
  <meta name="Auteur" content="www.twitter.com/cheeriottis">
  <link href='http://fonts.googleapis.com/css?family=Pacifico' rel='stylesheet' type='text/css'>
  <link rel="stylesheet" href="style.css">
<title>Acceuil</title>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" integrity="sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7" crossorigin="anonymous">

<style type="text/css">
	body {
		background-image:url(jhh.jpg); 
	}
	h1.type {
		color: #0c0c0c;
		font-size: 44px;
		font-family: 'Raleway';
		font-weight: 700;
		text-transform: uppercase;
		text-align: center;
	}
	h2#recherche{
		width: 600px;
		color: #ffffff;
		font-size: 24px;
		font-family: 'Raleway';
		font-weight: 500;
		text-transform: uppercase;
		margin-left: 5%;
		margin-bottom: 50px;
	}

	ul {
		list-style: none;
		width: 50%;
		float: right;
		margin-top: -5%;
	}

	ul li {
		width: 23%;
		float: left;
	}
	
	ul li a {
		float: left;
		color: #000000;
		font-family: 'Raleway';
		text-decoration: none;
		font-size: 16px;
		font-weight: 500;
		text-transform: uppercase;
		background-color: #ffffff;
		padding: 10px;
	}
	
	li#tit {
		margin-left: 30px;
	}
	
	div#divdiv {
		padding : 30px;
		margin: 0 100px 100px 100px;
		border: 1px solid #fff;
	}
	div#retour {
		margin-top:-5%;
		margin-left:45%;
	}
</style>


</head>
<body>

<h1 class="type">Gestion du bibliotheque</h1>
<p class="text-center" style="width:60%;margin:0 auto;border-radius:50px;font-size: 16px;font-weight: 500; color:rgba(192, 57, 43,1.0);font-family:'Raleway';padding:20px;border:1px solid #fff; background: rgba(255,255,255,0.9);">
Par : Hajar Nazih <span style="font-size: 20px;font-weight:700 "></span></p><br><br><br>

<body>
	<div id="divdiv">
	<h2 id="recherche">Rechercher un document par Categorie</h2>
	<form action="ResCategorie.jsp" class="text-center">
		 <div class="col-lg-6">
		    <div class="input-group">
		      <input type="text" class="form-control" name="type" placeholder="Entrer le Categorie ....">
		      <span class="input-group-btn">
		        <button class="btn btn-warning" type="submit">Rechercher</button>
		      </span>
		    </div><!-- /input-group -->
		  </div><!-- /.col-lg-6 -->
	</form>
	</div>
	<div id="retour"><a class="btn btn-warning" href="index.jsp">
	 		<span class="glyphicon glyphicon-home" aria-hidden="true"></span> Retour
	</a></div>
	
<!-- Latest compiled and minified JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js" integrity="sha384-0mSbJDEHialfmuBBQP6A4Qrprq5OVfW37PRR3j5ELqxss1yVqOtnepnHVP9aJ7xS" crossorigin="anonymous"></script>	
	
</body>
</html>
