<%@ page language="java" import="java.util.*" pageEncoding="utf-8" %>
<%@ include file="/template/common/head.jsp" %>
<html>
<head>
    <title>护理服务项</title>
    <%@ include file="/template/common/Bootstraphead.jsp" %>
</head>
<body>
<c:if test="${make=='content'}">
    ${manageNursingContent.manageNursingContentContent}
</c:if>
<c:if test="${make=='forpeople'}">
    ${manageNursingContent.manageNursingContentForpeople}
</c:if>
<c:if test="${make=='look'}">
    ${manageNursingContent.manageNursingContentLook}
</c:if>


</body>
</html>