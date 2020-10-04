<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 86150
  Date: 2020/9/20
  Time: 10:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<script type="text/javascript" src="/static/js/jquery-1.12.4.js"></script>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/selectByTypeAndId" method="post">
    <p>资产编号:<input type="text" name="assetsId"></p>
    <td>资产类型<select name="assetsType">
        <option value="0">电子设备</option>
        <option value="1">机械设备</option>
        <option value="2">运输设备</option>
    </select>
    </td>
    <input type="submit" value="查询"><p><input type="button" value="新增资产" onclick="addAssets()"></p>
    <table border="1px">
        <tr>
            <td>资产编号</td>
            <td>资产名称</td>
            <td>资产类型</td>
            <td>入库时间</td>
        </tr>
        <c:forEach var="assets" items="${Assets}">
            <tr>
                <td>${assets.assetid}</td>
                <td>${assets.assetname}</td>
                <td><c:if test="${assets.assettype}==0">已申报</c:if>
                    <c:if test="${assets.assettype}==1">审核中</c:if>
                    <c:if test="${assets.assettype}==2">已审核</c:if>
                </td>
                <td><fmt:formatDate value="${assets.intodate}" pattern="yyyy-MM-dd"/></td>
            </tr>
        </c:forEach>
        <tr>
            <a>${success}</a> <a>${fail}</a>
        </tr>
    </table>
</form>
<script>
    $(function () {
        $("tr:odd").css("background-color", "yellow");
    })
</script>
</body>
</html>
