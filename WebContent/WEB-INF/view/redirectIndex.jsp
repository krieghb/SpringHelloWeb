<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<html>
	<head>
		<title>Spring Page Redirection Main</title>
	</head>
	
	<body>
		<h2>Spring Page Redirection</h2>
		<p>Click the below button to redirect the result to a new page.</p>
		
		<form:form method="GET" action="/SpringHelloWeb/redirect">
			<table>
				<tr>
					<td>
						<input type="submit" value="Redirect Page" />
					</td>
				</tr>
			</table>
		</form:form>
	</body>
</html>