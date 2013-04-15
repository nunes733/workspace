<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<%@ page import="net.antoniopassos.appwebpizzaria.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>DAWJ – AppWebPizzaria</title>
</head>
<body style="width: 750px">
<jsp:include page="cabecalho.jsp"> 
	<jsp:param value="DAWJ - AppWebPizzaria" name="cabecalho" /> 
</jsp:include> 
<h3 align="center">Seu pedido</h3>
<table border="1" align="center"> 
		<tr> 
  			<th>Pizza</th> 
  			<th>Preço unitário</th> 
  			<th>Quantidade</th> 
  			<th>Total</th> 
 		</tr> 
 	<c:forEach var="item" items="${carrinho.itens}"> 
  		<tr> 
   			<td><c:out value="${item.nome}" /></td> 
   			<td><c:out value="${item.preco}" /></td> 
   			<td><c:out value="${item.quantidade}" /></td> 
   			<td><c:out value="${item.total}" /></td> 
  		</tr> 
 	</c:forEach> 
 		<tr>
 			<td colspan="4" align="center"><b>Total do pedido:</b> <c:out value="${carrinho.total}" /></td>
 		</tr> 
</table> 
 
<%
session.removeAttribute("carrinho");
%> 
 
<p align="center"> 
<input type="button" value="Fazer novo pedido" onclick="javascript:document.location='ListaPizzas.jsp'"/> 
</p> 
 
<jsp:include page="rodape.jsp" />

</body>
</html>