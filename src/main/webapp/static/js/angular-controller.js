/**
 * Created by yongmin on 2019. 2. 13..
 */

'use strict';

var jobAramApp = angular.module('jobAramApp', ['ngMaterial', 'ngMessages', 'ngFileUpload', 'jobAramDirective', 'jobAramFactory', 'ui.bootstrap']);


jobAramApp.controller('jobAramController', [
    '$q',
    '$scope',
    '$http',
    '$location',
    'jobAramFactory',
    '$mdDialog',
    '$mdConstant',
    'Upload',
    '$uibModal',
    function ($q, $scope, $http, $location, jobAramFactory, $mdDialog, $mdConstant, Upload, $uibModal) {


        $scope.onClickExcelUpload = function ($file) {
            jobAramFactory.setFile($file);
        };


        $scope.uploadFile = function () {
            var promise = jobAramFactory.upload();
            promise.then(function (data) {
                retrieve().then(function (result) {
                    alert("업로드되었습니다");
                });
            }, function (error) {
                alert("업로드 실패");
            });
        };


        $scope.onClickShowExcelUpload = function () {
            var param = {
                'mode' : 'ExcelUpload'
            };

            $mdDialog.show({
                locals: {'param' : param},
                multiple: true,
                controller: ExcelUploadDialogController,
                templateUrl: 'excel.upload.dialog',
                parent: angular.element(document.body),
                clickOutsideToClose:false,
                fullscreen: $scope.customFullscreen // Only for -xs, -sm breakpoints.
            }).then(function(answer) {

            });
        }

        function onClickDialog(param) {
            console.log("onClickDialog");
            return new Promise(function(resolve, reject) {
                $mdDialog.show({
                    locals: {'param' : param},
                    multiple: true,
                    controller: ExcelUploadDialogController,
                    templateUrl: 'excel.upload.dialog',
                    parent: angular.element(document.body),
                    clickOutsideToClose:false,
                    fullscreen: $scope.customFullscreen // Only for -xs, -sm breakpoints.
                }).then(function(answer) {
                    resolve();
                }, function() {
                    reject();
                });
            });
        }


        function ExcelUploadDialogController($scope, $mdDialog, $http, Upload, param) {
            $scope.hide = function() {
                console.log('ExcelUploadDialogController : hide');
                $mdDialog.hide();
            };

            $scope.cancel = function() {
                $mdDialog.cancel();
            };

            $scope.answer = function(answer) {
                console.log('ExcelUploadDialogController : ' + answer);
                $mdDialog.hide(answer);
            };

            $scope.uploadFile = "";

            $scope.onClickBrowseFile = function($file) {
                $scope.uploadFile = $file;
            }


            $scope.onClickExcelUpload = function() {
            	
                if (isEmpty($scope.uploadFile)) {
                    return;
                }

                Upload.upload({
                    url: '/jobAram/fileUpload',
                    method: 'POST',
                    data: {file:$scope.uploadFile}
                }).success(function(data, status, headers, config) {
                    showInfo(data.data.result + '건이 업로드 되었습니다.');
                    var param = {
                        mode : 'ExcelUploadSuccess'
                    };
                    $mdDialog.hide(param);
                }).error(function(data, status){
                    if (data.data.error !== undefined && data.data.error != null) {
                        showError(data.data.error);
                    } else {
                        console.log('ExcelUploadError ' + data);
                    }
                });
            }
        }

        // init();

    }]);

