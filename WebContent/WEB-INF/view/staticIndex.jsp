<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<html>
	<head>
		<title>Static Spring Landing Page</title>
	</head>
	
	<body>
		<h2>Static Spring Landing Page</h2>
		<p>Click the button below to get to a simple HTML page</p>
		
		<form:form method="GET" action="/SpringHelloWeb/staticPage">
			<table>
				<tr>
					<td>
						<input type="submit" value="Get HTML Page" />
					</td>
				</tr>
			</table>
		</form:form>
	</body>
</html>