<!DOCTYPE html>
<html lang="es">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">

<title>FunMe!</title>
 <!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

<script language="JavaScript">
function imprime(){
	localizacion = document.getElementsByName("interes")[0].value;
	document.getElementsByName("pruebamax")[0].value=localizacion;
	}
</script>


  <style>
    /* Remove the navbar's default margin-bottom and rounded borders */ 
    .navbar {
      margin-bottom: 0;
      border-radius: 0;
    }
    
    /* Set height of the grid so .sidenav can be 100% (adjust as needed) */
    .row.content {height: 450px}
    
    /* Set gray background color and 100% height */
    .sidenav {
      padding-top: 20px;
      background-color: #f1f1f1;
      height: 100%;
    }
    
    /* Set black background color, white text and some padding */
    footer {
      background-color: #555;
      color: white;
      padding: 15px;
    }
    
    /* On small screens, set height to 'auto' for sidenav and grid */
    @media screen and (max-width: 767px) {
      .sidenav {
        height: auto;
        padding: 15px;
      }
      .row.content {height:auto;} 
    }
  </style>
</head>


<body>
 <nav class="navbar navbar-inverse navbar-top">
  <div class="container-fluid">
    <div class="navbar-header">
              
    <a class="navbar-brand" href="#"> <h1>FunMe!</h1> </a>
    </div>
     <div class="collapse navbar-collapse" id="myNavbar">

    
     <ul class="nav navbar-nav navbar-right"> 
      <li>
      <a href="/p2"><span class="glyphicon glyphicon-home"></span> Inicio</a>
      <a href="#"><span class="glyphicon glyphicon-time"></span> Mis Eventos</a>
      </li>
     
      <li>
      <a href="#"><span class="glyphicon glyphicon-user"></span> Perfil</a>
      <a href="#"><span class="glyphicon glyphicon-log-out"></span> Cerrar Sesión</a>
      </li>
      
    </ul>
  </div>
  </div>
</nav>

<div class="container">

 
  
  <div class="jumbotron">
  


   <form action="registro.html" class="form-horizontal" method="post"> 
 



  <div class="form-group">
    <div class="col-sm-offset-2 col-sm-10">
    
    <!--  <a href=""  input type="submit" class="btn btn-info" role="button"> -->
    <!--<span class="glyphicon glyphicon-search"></span> Buscar</a>-->
    
     <input type="submit" />
    
    </div>
  </div>
</form>
</div>
</div>
</div>


</body>





</html>