<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width,initial-scale=1">
	<title>登录</title>
	<link rel="stylesheet" href="${ctx}/resource/login/auth.css">
</head>

<body>
	<div class="lowin">
		<div class="lowin-brand">
			<img src="${ctx}/resource/login/kodinger.jpg" alt="logo">
		</div>
		<div class="lowin-wrapper">
			<div class="lowin-box lowin-login">
				<div class="lowin-box-inner">
					<form action="${ctx}/teacher/login" method="post">
						<p>教师账户</p>
						<div class="lowin-group">
							<label>教师编号</label>
							<input type="text" autocomplete="teacherNum" name="teacherNum" class="lowin-input">
						</div>
						<div class="lowin-group password-group">
							<label>密码</label>
							<input type="password" name="teacherPassword" autocomplete="current-password" class="lowin-input">
						</div>
						<button class="lowin-btn login-btn">
							登录
						</button>
					</form>
				</div>
			</div>
		</div>
    </div>

	<script src="${ctx}/resource/login/auth.js"></script>
	<script>
		Auth.init({
			login_url: '${ctx}/teacher/login',
			forgot_url: '#forgot'
		});
	</script>
</body>
</html>