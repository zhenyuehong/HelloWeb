<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: hongzhenyue
  Date: 17/3/3
  Time: 上午10:42
  To change this template use File | Settings | File Templates.
  Spring MVC表单处理
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Spring MVC表单处理</title>
</head>
<style>
    .error {
        color: #ff0000;
    }

    .errorStyle {
        color: #000;
        background-color: #ffEEEE;
        border: 3px solid #ff0000;
        padding: 8px;
        margin: 16px;
    }
</style>
<body>
<h2>Student Information</h2>
<form:form method="POST" action="/HelloWeb/addStudent" commandName="student">
    <form:errors path="*" cssClass="errorStyle" element="div"></form:errors>
    <table>
        <tr>
            <td><form:label path="name">名字：</form:label></td>
            <td><form:input path="name" /></td>
            <td><form:errors path="name" cssClass="error" /></td>
        </tr>
        <tr>
            <td><form:label path="age">年龄：</form:label></td>
            <td><form:input path="age" /></td>
        </tr>
        <tr>
            <td><form:label path="id">编号：</form:label></td>
            <td><form:input path="id" /></td>
        </tr>
        <tr>
            <td colspan="2">
                <input type="submit" value="提交表单"/>
            </td>
        </tr>
    </table>
</form:form>
</body>
</html>
