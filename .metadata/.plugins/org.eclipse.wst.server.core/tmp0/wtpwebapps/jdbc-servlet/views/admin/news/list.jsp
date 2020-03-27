<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/common/taglib.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>
</head>
<body>
	<div class="main-content">
		<div class="main-content-inner">
			<div class="breadcrumbs ace-save-state" id="breadcrumbs">
				<ul class="breadcrumb">
					<li><i class="ace-icon fa fa-home home-icon"></i> <a
						href="<c:url value='/admin-home'/>">Trang chủ</a></li>
				</ul>
				<!-- /.breadcrumb -->
			</div>
			<form action="/admin-news-list" id = "formAdminNews" method = "GET">
			<div class="page-content">
				<div class="row">
					<div class="col-xs-12">
						<div class="container">
							<table class="table table-striped">
								<thead>
									<tr>
										<th>ID</th>
										<th>Tên bài viết</th>
										<th>Thể loại</th>
										<th>Mô tả</th>
										<th>Nội dung</th>
										<th>Hình ảnh</th>
										<th>Ngày tạo</th>
										<th>Người tạo</th>
									</tr>
								</thead>
								<tbody>
									<c:forEach var ="item" items="${model.listModel}">
									<tr>
										<td>${item.id}</td>
										<td>${item.title}</td>
										<td>${item.categoryId}</td>
										<td>${item.summary}</td>
										<td>${item.content}</td>
										<td>${item.thumbnail}</td>
										<td>${item.createdDate}</td>
										<td>${item.createdBy}</td>
									</tr>
									</c:forEach>
								</tbody>
							</table>
							<ul class="pagination" id="pagination"></ul>
							<input type = "hidden" value = "" name = "page" id = "page">
						</div>
					</div>
				</div>
			</div>
			</form>
		</div>
	</div>
	<!-- /.main-content -->
	<script type="text/javascript">
		//var limitItem = ${model.limitItem};
		var page =  ${model.page}
		var totalPage = ${model.totalPage};
		var limitPage = ${model.limitPage};
		
		$(function() {
			window.pagObj = $('#pagination').twbsPagination({
				totalPages : totalPage,
				visiblePages : limitPage,
				startPage: page,
				onPageClick : function(event, page) {
					$('#page').val(page);
					$('#formAdminNews').submit();
				}
			})
		});
	</script>
</body>
</html>