<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="items" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: hongzhenyue
  Date: 17/3/3
  Time: 下午2:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Spring MVC表单处理之-密码</title>
</head>
<body>
<h2>用户信息</h2>
<form:form method="post" action="/addUser">

    <table>

        <tr>
            <td><form:label path="username">username</form:label></td>
            <td><form:input path="username"></form:input></td>
        </tr>
        <tr>
            <td><form:label path="password">password</form:label></td>
            <td><form:input path="password"></form:input></td>
        </tr>

        <tr>
            <td><form:label path="address">地址：</form:label></td>
            <td><form:textarea path="address" rows="5" cols="30"/></td>
        </tr>

        <tr>
            <td><form:label path="receivePaper">订阅新闻？</form:label></td>
            <td><form:checkbox path="receivePaper"></form:checkbox></td>
        </tr>

        <tr>
            <td><form:label path="favorites">喜欢的技术/框架</form:label></td>
            <td>
                <form:checkboxes path="favorites" items="${favorites}"></form:checkboxes>
            </td>

        </tr>
        
        <tr>
            <td><form:label path="gender">性别</form:label></td>
            <td><form:radiobutton path="gender" value="M" label="男"></form:radiobutton></td>
            <td><form:radiobutton path="gender" value="F" label="女"></form:radiobutton></td>
        </tr>

        <tr>
            <td><form:label path="favoriteNumber">喜欢的数字</form:label></td>
            <td><form:radiobuttons path="favoriteNumber" items="${favoriteNumber}"></form:radiobuttons></td>
        </tr>
        <tr>
            <td><form:label path="country">国籍</form:label></td>
            <td><form:select path="country">
                <form:option value="None" label="place select"></form:option>
                <form:options items="${countrylist}"></form:options>
            </form:select></td>
        </tr>


        <tr>
            <td colspan="2">
                <input type="submit" value="提交"/>
            </td>
        </tr>

    </table>

</form:form>
</body>
</html>
