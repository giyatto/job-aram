/**
 * Created by yongmin on 2019. 2. 13..
 */
(function (angular) {
    'use strict';
    var jobAramDirective = angular.module('jobAramDirective', []);
    
    jobAramDirective.directive('list', [function () {
        return ({
            restrict: 'E',
            templateUrl: getTimeVersionedUrl('/static/template/dataList.jsp')
        });
    }]);


    jobAramDirective.directive('fileUpload', [function () {
        return ({
            restrict: 'E',
            templateUrl: getTimeVersionedUrl('/static/template/popup/fileUploadModal.jsp')
        });
    }]);

    jobAramDirective.directive('ngEnter', function () {
        return function (scope, element, attrs) {
            element.bind("keydown keypress", function (event) {
                if(event.which === 13) {
                    scope.$apply(function (){
                        scope.$eval(attrs.ngEnter);
                    });
                    event.preventDefault();
                }
            });
        };
    });


})(window.angular);

function getTimeVersionedUrl(url) {
    if (!url || url.indexOf('.html') < 0) return url;
    return url + '?' + Date.now().toString();
}


