<!DOCTYPE html>
<html>
<head>
<title>Search Page</title>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/app/css/styles.css">
</head>
<body>

<h2>Search Page</h2>
<form:form action="#" method="get" modelAttribute="employeeForm" style="text-align:center">
	<form:input path="searchCondition" />
	<button type="submit">Search</button>
</form:form>
<form:form action="${pageContext.request.contextPath}/employee/register">
	<button type="submit">Register</button>
</form:form>
<table>
	<tr>
		<th>Employee Id</th>
		<th>Name</th>
		<th>Join Date</th>
		<th>Department</th>
		<th>Position</th>
		<th>Email</th>
		<th>Ph No.</th>
		<th>Actions</th>
	</tr>
	<c:forEach items="${employees}" var="employee" varStatus="status">
		<tr>
			<td>${employee.employeeId}</td>
			<td>${employee.employeeName}</td>
			<td>${employee.joinDate}</td>
			<td>${employee.departmentName}</td>
			<td>${employee.positionName}</td>
			<td>${employee.email}</td>
			<td>${employee.phone}</td>
			<td><a href="#">Upload</a><a href="#" style="padding-left:30px;padding-right:30px">Edit</a><a href="#">Delete</a></td>
		</tr>
	</c:forEach>
</table>
</body>