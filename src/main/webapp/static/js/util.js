"use strict";

function isEmpty(v) {

    if (v === null || v === undefined || v.length === 0) {
        return true;
    }

    return false;
}

function setFocus(id) {
    window.setTimeout(function () {
        var obj = document.getElementById(id);

        if (obj !== null) {
            obj.focus();
        }
    }, 0);
}

function showInfo(message) {
    swal({
        title: '알림' ,
        text: message,
        type: "success",
        confirmButtonText: "확인"
    });
}

function showError(message, focusCtrlId) {
    swal({
        title: '헉 !!' ,
        text: message,
        type: "error",
        confirmButtonText: "확인"
    }, function (data) {

        if (focusCtrlId !== null || focusCtrlId !== undefined) {
            setFocus(focusCtrlId);
        }

        return false;
    });

    return false;
}

