<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<div class="modal fade" id="fileUploadModal" role="dialog" tabindex='-1'>
    <div class="modal-dialog modal-lg fileUpload-modal">
        <!-- Modal content-->
        <div class="modal-content">
            <div class="modal-header">
                <h3>엑셀 업로드</h3>
            </div>
            <div class="modal-body">
                <input type="file" ng-model="file" accept=".xlsx" max-length="256" ngf-select="onClickExcelUpload($file)"/>
                <br/>
                <span>※ 엑셀 업로드 시 '다운로드' 버튼을 눌러 템플릿 파일을 참고하세요. </span>
                <%--<span><a href="/static/file/register_template.xlsx">탬플릿 다운로드</a></span>--%>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-success" ng-click="uploadFile()">확인</button>
                <button type="button" class="btn btn-danger" data-dismiss="modal">취소</button>
                <%--<button type="button" class="btn btn-danger" ng-click="cancel()">취소</button>--%>
            </div>
        </div>
    </div>
</div>