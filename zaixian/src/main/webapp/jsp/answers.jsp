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
    <title>我来回答</title>
    <link rel="stylesheet" href="${path}/bootstrap-3.3.7-dist/css/bootstrap.min.css">
    <script src="${path}/bootstrap-3.3.7-dist/angular.min.js"></script>
</head>
<body>
<div class="container">
    <h3>ANSWERS</h3>
    <dl class="dl-horizontal text-primary" style="font-size: 15px">
        <dt>问题</dt>
        <dd>${question.title}</dd>
        <dt>问题描述</dt>
        <dd>${question.detaildesc}</dd>
        <br>
        <dt class="text-success">网友回答</dt>
        <c:if test="${question.answers!=null}">
            <c:forEach var="answer" items="${question.answers}">
                <dd class="text-success">${answer.ansdate}</dd>
                <dd class="text-success">${answer.anscontent}</dd>
                <br>
            </c:forEach>
        </c:if>
        <dt>我来回答</dt>
        <dd>
            <form role="form" class="required-validate" action="${path}/answer/saveAnswer" method="post">
                <%--id--%>
                <div class="form-group">
                    <input name="qid" value="${question.id}" style="display: none">
                </div>
                <%--回答--%>
                <div class="form-group">
                    <textarea class="form-control" rows="3" name="anscontent"
                              placeholder="您的建议.." required="required"></textarea>
                </div>
                <div class="form-group">
                    <button type="submit" class="btn btn-primary">提交</button>
                    <button type="button" class="btn btn-warning" onclick="cancel()" style="float: right">取消</button>
                </div>
            </form>
        </dd>
    </dl>
</div>

<script type="text/javascript">
    function cancel() {
        location.href = '${path}/jsp/onlineQA.jsp';
    }
</script>
</body>
</html>
