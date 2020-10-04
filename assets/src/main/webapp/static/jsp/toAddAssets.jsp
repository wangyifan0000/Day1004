<%--
  Created by IntelliJ IDEA.
  User: 86150
  Date: 2020/9/20
  Time: 11:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<script src="/static/js/jquery-1.12.4.js"></script>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/doAddAssets" method="post">
    <table border="1px">
        <tr>
            <td>资产编号<input type="text" name="assetsId"></td>
        </tr>
        <tr>
            <td>资产名称<input type="text" name="assetsName" ></td>
        </tr>
        <tr>
            <td>资产类型<select name="assetsType">
            <option value="0">电子设备</option>
            <option value="1">机械设备</option>
            <option value="2">运输设备</option>
        </select>
            </td>
        </tr>
        <tr>
            <td>入库时间<input type="text" name="intoDate"></td>
        </tr>
        <tr>
            <td><input type="submit" value="保存">
                <input type="button" value="返回" onclick="fanhui()">
            </td>
        </tr>
    </table>
</form>
<script>
    $("form").submit(function () {
        var projectname = $("[name='projectname']").val();
        var startdate = $("[name='startdate']").val();
        var status = $("[name='status']").val();
        var enddate = $("[name='enddate']").val();
        if (projectname == "") {
            alert("项目名称不能为空");
            return false;
        }
        if (startdate == "") {
            alert("项目开始申报时间不能为空");
            return false;
        }
        if (enddate == "") {
            alert("项目结束申报时间不能为空");
            return false;
        }

        if (status == "") {
            alert("请选取状态");
            return false;
        }
        var reg = /^[1-9]\d{3}-(0[1-9]|1[0-2])-(0[1-9]|[1-2][0-9]|3[0-1])$/;
        if (!startdate.match(reg)) {
            alert("时间格式不正确!!!");
            return false;
        }
        var reg = /^[1-9]\d{3}-(0[1-9]|1[0-2])-(0[1-9]|[1-2][0-9]|3[0-1])$/;
        if (!enddate.match(reg)) {
            alert("时间格式不正确!!!");
            return false;
        }
    })

   /* function reback() {
        $("[name='type']").val("");
    }*/
    function fanhui() {
        location.href="/select"
    }
</script>
</body>
</html>
