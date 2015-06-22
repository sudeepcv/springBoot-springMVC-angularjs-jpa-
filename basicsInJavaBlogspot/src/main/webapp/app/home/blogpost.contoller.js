(function () {
    'use strict';

    angular.module('basicsInjavaBlogSpot').controller('BlogPostCtrl', BlogPostCtrl);
    BlogPostCtrl.$inject = ['$location', '$routeParams', 'initialData','basicsInjavaBlogSpotApi'];

    /* @ngInject */
    function BlogPostCtrl($location, $routeParams, initialData,basicsInjavaBlogSpotApi) {
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