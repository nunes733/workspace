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
 
<h3 align="center">Seu carrinho de compras</h3> 
 
<c:choose> 
	<c:when test="${empty carrinho.itens}"> 
		<h3 align="center">Seu carrinho está vazio! Você ainda não escolheu nenhuma pizza!</h3> 
	</c:when> 
	<c:otherwise> 
		<table border="1" align="center"> 
				<tr> 
    				<th>Nome</th> 
    				<th>Preço unitário</th> 
    				<th>Quantidade</th> 
    				<th>Total</th> 
    				<th>Ação</th> 
   				</tr> 
			<c:forEach var="item" items="${carrinho.itens}"> 
    			<tr> 
     				<td><c:out value="${item.nome}" /></td> 
     				<td><c:out value="${item.preco}" /></td> 
     				<td><c:out value="${item.quantidade}" /></td> 
     				<td><c:out value="${item.total}" /></td> 
     				<td><input type="button" value="Excluir do carrinho"      
 					onclick="javascript:document.location='ServletController?cmd=ExcluirItem&codigo=${item.codigo}'" /> </td> 
    			</tr> 
   			</c:forEach> 
  		</table> 
 	</c:otherwise> 
</c:choose> 

<p align="center"><input type="button" value="Continuar comprando" onclick="javascript:document.location='ListaPizzas.jsp'" /> 
<input type="button" value="Ir ao caixa" onclick="javascript:document.location='ServletController?cmd=FecharPedido'" /> </p> 

<jsp:include page="rodape.jsp" />

</body>
</html>