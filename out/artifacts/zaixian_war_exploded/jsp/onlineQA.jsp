<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: yansh
  Date: 2017/12/4
  Time: 14:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<c:set value="${pageContext.request.contextPath}" var="path"/>
<html>
<head>
    <title>在线问答</title>
    <link rel="stylesheet" href="${path}/bootstrap-3.3.7-dist/css/bootstrap.min.css">
    <script src="${path}/bootstrap-3.3.7-dist/angular.min.js"></script>
</head>
<body>
<div class="container" ng-app="myApp" ng-controller="questionController">
    <h2 style="display: inline-block">QUESTION</h2>
    <button type="button" class="btn btn-info" style="float: right;margin-top: 25px" onclick="question()">我要提问</button>
    <table class="table table-striped">
        <thead>
        <tr>
            <th>序号</th>
            <th>问题</th>
            <th>回答次数</th>
            <th>最后修改</th>
        </tr>
        </thead>
        <tbody>
        <tr ng-repeat="question in questions">
            <td>{{$index + 1}}</td>
            <td><a href="${path}/question/showAnswers?qid={{question.id}}">{{ question.title }}</a></td>
            <td>{{ question.answercount }}</td>
            <td>{{ question.lastmodified }}</td>
        </tr>
        </tbody>
    </table>
</div>
<a href=""></a>
<script type="text/javascript">
    var app = angular.module('myApp', []);
    app.controller('questionController', function($scope, $http) {
        $http.get("/question/showQuestions")
            .success(function (response) {$scope.questions = response;});
    });
    function question() {
        location.href='${path}/jsp/question.jsp';
    }
</script>
</body>
</html>
