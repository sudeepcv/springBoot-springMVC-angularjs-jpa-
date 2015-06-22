(function () {
    'use strict';

    angular.module('basicsInjavaBlogSpot').controller('HomeCtrl', HomeCtrl);
    HomeCtrl.$inject = ['$location', '$routeParams', 'initialData','basicsInjavaBlogSpotApi'];

    /* @ngInject */
    function HomeCtrl($location, $routeParams, initialData,basicsInjavaBlogSpotApi) {
        /* jshint validthis: true */
        var vm = this;

        vm.activate = activate;
        vm.allblogs = initialData;

        activate();

        ////////////////

        function activate() {
        }
        
   


    }
})();