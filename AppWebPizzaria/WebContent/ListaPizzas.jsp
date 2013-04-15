<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<%@ page import="net.antoniopassos.appwebpizzaria.modelo.Pizza" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>DAWJ - AppWebPizzaria</title>
</head>
<body style="width: 750px">

<jsp:include page="cabecalho.jsp"> 
	<jsp:param value="DAWJ - AppWebPizzaria" name="cabecalho" /> 
</jsp:include> 
 
<h3 align="center">Nossas saborosas pizzas!!!</h3> 
 
<jsp:useBean id="CardapioBean" class="net.antoniopassos.appwebpizzaria.modelo.Cardapio" scope="session"/> 
 
<table border="1"> 
		<tr> 
			<th>Codigo</th> 
			<th>Nome</th> 
  			<th>Descricao</th> 
  			<th>Preco</th> 
  			<th>Acao</th> 
 		</tr> 
	<c:forEach var="pizza" items="${CardapioBean.cardapio}">
 	 	<tr> 
   			<td><c:out value="${pizza.codigo}" /></td> 
   			<td><c:out value="${pizza.nome}" /></td> 
   			<td><c:out value="${pizza.descricao}" /></td> 
      		<td><c:out value="${pizza.preco}" /></td> 
   			<td><input type="button" value="Adicionar ao carrinho" 
   			onclick="javascript:document.location='ServletController?cmd=AdicionarItem&codigo=${pizza.codigo}'"/> 
   			</td> 
  		</tr>  	 
	</c:forEach> 
</table> 
<br /> 

<jsp:include page="rodape.jsp" />
	
</body>
</html>