<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="cl.praxis.util.FactorialUtil"%>
<%@ page import="cl.praxis.util.ParidadUtil"%>
<%
	FactorialUtil factorialUtil = new FactorialUtil();
	ParidadUtil paridadUtil = new ParidadUtil();
%>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Desafio JEE01</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
	<div class="container">
        <h1>Desafio JEE01</h1>
        <div class="row">
            <div class="col-12 col-sm-12">
                <table class="table">
                    <thead>
                        <tr>
                            <th scope="col">#</th>
                            <th scope="col">Numero</th>
                            <th scope="col">Acciones</th>
                        </tr>
                    </thead>
                    <tbody>
                        <%
                        for (int i = 1; i < 11; i++) {
                        %>
                        <tr>
                            <th scope="row"><%= i %></th>
                            <td><%= i %></td>
                            <td>
                                <a href="FactorialServlet?num=<%= i %>">Factorial</a>
                                |
                                <a href="ParidadServlet?num=<%= i %>">Pares</a>
                            </td>
                        </tr>
                        <%
                        }
                        %>
                    </tbody>
                </table>
            </div>
        </div>
    </div>
    <script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/js/bootstrap.bundle.min.js" 
		integrity="sha384-A3rJD856KowSb7dwlZdYEkO39Gagi7vIsF0jrRAoQmDKKtQBHUuLZ9AsSv4jD4Xa"
		crossorigin="anonymous">
	</script>
</body>
</html>