(function () {
    'use strict';

    angular.module('basicsInjavaBlogSpot').controller('adminCtrl', adminCtrl);

    adminCtrl.$inject = ['$location', '$routeParams', 'initialData','basicsInjavaBlogSpotApi'];

    /* @ngInject */
    function adminCtrl($location, $routeParams, initialData,basicsInjavaBlogSpotApi) {
        /* jshint validthis: true */
        var vm = this;

        vm.activate = activate;
        vm.currentEdit = {};
        vm.itemToEdit = {};
        vm.go = go;
        vm.allblogs = initialData;
        vm.editItem=editItem;
        vm.cancelEdit=cancelEdit;
        vm.addItem=addItem;
        vm.update=update;
        vm.deleteItem=deleteItem;
       

        activate();

        ////////////////

        function activate() {
        }
        function deleteItem(id){
            var toDeletPost = {
                    'id':id
                };
          
                	basicsInjavaBlogSpotApi.deletePost(toDeletPost).then(function(data){
                        _.remove(vm.allblogs, { 'id': id });
                    });
               
        }
        
        function addItem(){
            var newPost = {
                title: vm.newBlogTitle,
                
                content:vm.newBlogContent
            };

            basicsInjavaBlogSpotApi.addPost(newPost).then(function(data){
                vm.newBlogTitle = '';
                vm.allblogs.push(data);
            });
        }
        

        function go(path){
            $location.path('leagues/' + $routeParams.id + '/' + path);
        }
        
        function update(item){
        	console.log(item);
        	basicsInjavaBlogSpotApi.addPost(vm.itemToEdit).then(function(data){
                vm.currentEdit[item.id] = false;
                item.title = vm.itemToEdit.title;
                item.content=vm.itemToEdit.content;
            });
        }
        
        function cancelEdit(id){
            vm.currentEdit[id] = false;
        }
        
        function editItem(item){
        	console.log(item);
            vm.currentEdit[item.id] = true;
            vm.itemToEdit = angular.copy(item);
        }
        
    }
})();