<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: hongzhenyue
  Date: 17/3/3
  Time: 上午11:27
  To change this template use File | Settings | File Templates.

  Spring MVC静态页面
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>staticPage</title>
</head>
<body>
<h2>Spring Landing Pag</h2>
<p>Click below button to get a simple HTML page</p>
<form:form method="GET" action="/staticPage">
    <table>
        <tr>
            <td>
                <input type="submit" value="Get HTML Page"/>
            </td>
        </tr>
    </table>
</form:form>
</body>
</html>
