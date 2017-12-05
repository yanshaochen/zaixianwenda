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
    <title>我要提问</title>
    <link rel="stylesheet" href="${path}/bootstrap-3.3.7-dist/css/bootstrap.min.css">
    <script src="${path}/bootstrap-3.3.7-dist/angular.min.js"></script>
</head>
<body>
<div class="panel panel-primary" style="width: 30%;margin: auto;margin-top: 25px">
    <div class="panel-heading">
        <h3 class="panel-title">
            QUESTION
        </h3>
    </div>
    <div class="panel-body">
        <form role="form" class="required-validate" action="${path}/question/saveQuestion" method="post">
            <%--标题--%>
            <div class="form-group">
                <label for="title">问题</label>
                <input type="text" class="form-control" id="title" name="title"
                       placeholder="请输入问题.." required="required">
            </div>
            <%--描述--%>
            <div class="form-group">
                <label for="detaildesc">描述</label>
                <textarea class="form-control" rows="3" id="detaildesc" name="detaildesc"
                          placeholder="请输入问题描述.." required="required"></textarea>
            </div>
            <div class="form-group">
                <button type="submit" class="btn btn-primary">提交</button>
                <button type="button" class="btn btn-warning" onclick="cancel()" style="float: right">取消</button>
            </div>
        </form>
    </div>
</div>
<script type="text/javascript">
    function cancel() {
        location.href='${path}/jsp/onlineQA.jsp';
    }
</script>
</body>
</html>
