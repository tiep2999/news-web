<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/common/taglib.jsp"%>
<!DOCTYPE html>
<html>
<head>
<title><decorator:title default="Home" /></title>
<link
	href="<c:url value='/template/web/bootstrap/css/bootstrap.min.css' />"
	rel="stylesheet" type="text/css" media="all" />
<link href="<c:url value='/template/web/css/style.css' />"
	rel="stylesheet" type="text/css" media="all" />
<body>
	<!-- heading -->
	<%@include file="/common/web/header.jsp"%>
	<!-- heading -->

	<div class="container">
		<decorator:body />
	</div>

	<!-- footer -->
	<%@include file="/common/web/footer.jsp"%>
	<!-- footer -->

	<script type="text/javascript"
		src="<c:url value='/template/web/jquery/jquery.min.js' />"></script>
	<script type="text/javascript"
		src="<c:url value='/template/web/bootstrap/js/bootstrap.bundle.min.js' />"></script>
</body>
</html>