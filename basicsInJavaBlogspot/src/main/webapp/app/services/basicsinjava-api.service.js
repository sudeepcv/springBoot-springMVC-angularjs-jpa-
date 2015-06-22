(function () {
    'use strict';

    angular.module('basicsInjavaBlogSpot').factory('basicsInjavaBlogSpotApi', basicsInjavaBlogSpotApi);

    basicsInjavaBlogSpotApi.$inject = ['$http', 'appSpinner'];

    function basicsInjavaBlogSpotApi($http, appSpinner) {
        var service = {          
            allPost:allPost,
            addPost:addPost,
            deletePost:deletePost,     
            getSiglePost:getSiglePost
        };

        var baseUrl = 'http://basicsin-javablogspot.rhcloud.com';
//        var baseUrl='http://localhost:8080'
        var requestConfig = {
            headers: {
                'X-ZUMO-APPLICATION': 'GSECUHNQOOrCwgRHFFYLXWiViGnXNV88',                
            }
        };

        return service;
        
        function getSiglePost(title){
        	 var blog = {
                     'title':title
                 };
        	return httpPost('/blog',blog);
        }
        function allPost(){
        	return httpGet('/adminhome');
        } 
        function deletePost(id){
        	
            return httpPost('/deletePost' , id);
        }
        function addPost(newPost){
            return httpPost('/addpostAction', newPost);
        }


        /** Private Methods **/

    

        function httpDelete(url){
            return httpExecute(url, 'DELETE');
        }

        function httpExecute(requestUrl, method, data){
            appSpinner.showSpinner();
            return $http({
                url: baseUrl + requestUrl,
                method: method,
                data: data,
                headers: requestConfig.headers }).then(function(response){

                appSpinner.hideSpinner();
                console.log('**response from EXECUTE', response);
                return response.data;
            });
        }

        function httpGet(url){
            return httpExecute(url, 'GET');
        }

        function httpPatch(url, data){
            return httpExecute(url, 'PATCH', data);
        }

        function httpPost(url, data){
            return httpExecute(url, 'POST', data);
        }

        function saveItem(url, item){
            if (item.id) {
                return httpPatch(url + '/' + item.id, item);
            } else {
                return httpPost(url, item);
            }
        }
    }
})();
