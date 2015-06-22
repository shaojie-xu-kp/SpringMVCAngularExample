<!doctype html>
<html ng-app>
	<head>
		<title>Hello AngularJS</title>
		<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.0.8/angular.min.js"></script>
	</head>

<script>
function Hello($scope, $http) {
    $http.get('http://localhost:8080/InfinitagroupSpringProject/rest/customers/').
        success(function(data) {
            $scope.greeting = data;
        });
}
</script>

	<body>
		<div ng-controller="Hello">
			<p>The ID is {{greeting.id}}</p>
			<p>The content is {{greeting.email}}</p>
		</div>
	</body>
</html>