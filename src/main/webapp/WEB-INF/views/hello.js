function Hello($scope, $http) {
    $http.get('http://localhost:8080/InfinitagroupSpringProject/rest/customers/').
        success(function(data) {
            $scope.greeting = data;
        });
}