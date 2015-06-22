(function () {
    'use strict';
    var app = angular.module('basicsInjavaBlogSpot', [
        // Angular modules
        'ngRoute',

        // 3rd Party Modules
        'ui.bootstrap'
        
    ]);

    app.config(['$routeProvider', configRoutes]);

    function configRoutes($routeProvider) {
        $routeProvider
            .when('/', {
                templateUrl: 'app/home/home.html',
                controller: 'HomeCtrl',
                controllerAs: 'vm',
                resolve: {
                    initialData: ['basicsInjavaBlogSpotApi', function (basicsInjavaBlogSpotApi) {
                        return basicsInjavaBlogSpotApi.allPost();
                    }]
                }
            })     .when('/blog/:title', {
                templateUrl: 'app/home/blogpost.html',
                controller: 'BlogPostCtrl',
                controllerAs: 'vm',
                resolve: {
                    initialData: ['$route','basicsInjavaBlogSpotApi', function ($route,basicsInjavaBlogSpotApi) {
                                	return basicsInjavaBlogSpotApi.getSiglePost($route.current.params.title);
                    }]
                }
            })    .when('/adminhome', {
                templateUrl: 'app/admin/adminhome.html',
                controller: 'adminCtrl',
                controllerAs: 'vm',   resolve: {
                    initialData: ['basicsInjavaBlogSpotApi', function (basicsInjavaBlogSpotApi) {
                        return basicsInjavaBlogSpotApi.allPost();
                    }]
                }
            });


        $routeProvider.otherwise('/');
    }

    app.run(['$route', function ($route) {
        // Include $route to kick start the router.
    }]);
})();
