/**
 * 
 */
'use strict';
angular.module('app', [])
.controller('controlador', ['$scope','$http', function($scope, $http) {
					$scope.newPage = function() {
						open('crearEvento.html',
								'top=300,left=300,width=300,height=300');
					}
					$scope.cancelar = function() {
						open('Calendario.html');
					}
					$scope.insert = function() {

						var insertarEv = {
							dia : $scope.dia,
							hora : $scope.hora,
							lugar : $scope.lugar,
							nombre : $scope.nombre
						};

						/*$http.post('http://localhost:8080/funme/crearEvento?insertarEv='+ insertarEv)
						.success(function(data) {
							alert("EXITO");
						}).error(function(data) {
							alert("ERROR");
						});*/

						
						$http.post('http://localhost:8080/funme/crearEvento?dia='+$scope.dia+'&hora='+$scope.hora+'&lugar='+$scope.lugar+'&nombre='+$scope.nombre)
						.success(function(data) {
						 alert("EXITO");
						}).error(function(data) {
						 alert("ERROR");
						});
						

						/*
						 * $http.get('http://rest-service.guides.spring.io/greeting')
						 * 
						 * .success(function(data) {
						 * 
						 * alert(2data.content);
						 * 
						 * }).error(function(data) {
						 * 
						 * alert("ERROR");
						 * 
						 * });
						 */

					}
					$scope.guardarRegistro = function() {
						var registro = {
								email : $scope.email,
								password : $scope.password,
								rpassword : $scope.rpassword,
								nombre : $scope.nombre,
								apellidos : $scope.apellidos,
								fecha : $scope.fecha,
								genero : $scope.genero
							};
						if($scope.password != $scope.rpassword){
							alert("Las passwords deben de coincidir");
						}
						else{
							if($scope.myForm.$valid){
								$http.post('http://localhost:8080/funme/guardarRegistro?email='+$scope.email+'&password='+$scope.password+'&nombre='+$scope.nombre+'&apellidos='+$scope.apellidos+'&fecha='+$scope.fecha+'&genero='+$scope.genero)
								.success(function(data) {
									open('Calendario.html');
								}).error(function(data) {
									open('Calendario.html');
								});
							}
						}

					}
					
				} ]);
