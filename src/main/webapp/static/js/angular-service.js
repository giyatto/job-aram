/**
 * Created by yongmin on 2019. 2. 13..
 */
(function (angular) {
    'use strict';
    var jobAramFactory = angular.module('jobAramFactory', []);

    jobAramFactory.factory('jobAramFactory', [ '$q', '$http', '$location', function ($q, $http, $location) {

        var file = null;

        function setFile(target) {
            file = target;
        }

        function upload() {
            var deferred = $q.defer();
            $http({
                method:'POST',
                url:"/jobAram/fileUpload",
                data:{file:file}
            }).success(function(data, status, headers, config) {
                deferred.resolve(data);
            }).
            error(function(data, status, headers, config) {
                deferred.reject(status);
            });
            return deferred.promise;
        }


        return ({
            setFile:setFile,
            upload:upload
        });
    }
    ]);

})(window.angular);