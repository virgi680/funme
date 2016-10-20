<!DOCTYPE html>
<html lang="en">
<head>
  <title>Registro</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <style>
    /* Remove the navbar's default margin-bottom and rounded borders */ 
    .navbar {
     	margin-bottom: 0;
      	border-radius: 10px;
		background-color: #004d80;
    }
    
    /* Set height of the grid so .sidenav can be 100% (adjust as needed) */
    .row.content {height: 680px}
    
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
	<div class="collapse navbar-collapse" id="myNavbar">
				<a class="navbar-brand" href="#">
					<FONT SIZE=6>FunMe!</FONT>
				</a>

				<ul class="nav navbar-nav navbar-right">
					<li><a href="#"><span class="glyphicon glyphicon-home"></span>
							Inicio</a></li>
					<li><a href="#"><span class="glyphicon glyphicon-time"></span>
							Mis Eventos</a></li>
					<li><a href="#"><span class="glyphicon glyphicon-user"></span>
							Perfil</a></li>
					<li><a href="#"><span class="glyphicon glyphicon-log-out"></span>
							Cerrar Sesión</a></li>
				</ul>
			</div>
	
	</nav>

<div class="container-fluid text-center">    

  <div class="row content">
    <div class="col-sm-3 sidenav">

    </div>
    <div class="col-sm-6 text-left"> 
<div class="container-fluid text-center">   
    <h2>Registro</h2> 
    </div>
    
     <form action="crearRegistro" method="POST">
  <div class="form-group">
    <input class="form-control input-sm" type="email" id="email">
  </div>
    <div class="form-group">
    <input type="password" name="password" class="form-control input-sm" id="password">
  </div>
    <div class="form-group">
    <input type="rpassword" name="rpassword" class="form-control input-sm" id="rpassword">
  </div>
  <div class="form-group">
    <input type="nombre" name="nombre" class="form-control input-sm" id="nombre">
  </div>
    <div class="form-group">
    <input type="apellidos" name="apellidos" class="form-control input-sm" id="apellidos">
  </div>
      <div class="form-group">
    <input type="fecha" name="fecha" class="form-control input-sm" id="fecha">
  </div>
      <div class="form-group">
   <label class="radio-inline"><input type="radio" name="genero">Hombre</label>
     <label class="radio-inline"><input type="radio" name="genero">Mujer</label>
  </div>

  <div class="checkbox">
    <label><input type="checkbox"> Acepto los términos y condiciones que me invento</label>
  </div>
  <button type="submit" >Guardar</button>
</form>

    </div>
    <div class="col-sm-3 sidenav">


    </div>
  </div>
</div>

<footer class="container-fluid text-center">
  <p>Footer Text</p>
</footer>

</body>
</html>