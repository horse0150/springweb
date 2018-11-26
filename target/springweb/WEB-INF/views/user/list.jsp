<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户列表</title>
</head>
<body>
    <table>
        <tr>
            <th>ID</th>
            <th>手机号码</th>
        </tr>
        <c:forEach items="${userList} var=user">
            <tr>
                <td>${user.id}</td>
                <td>${user.phone}</td>
            </tr>
        </c:forEach>
    </table>

</body>
</html>
