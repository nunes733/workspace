package net.antoniopassos.appwebpizzaria.controle;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import net.antoniopassos.appwebpizzaria.modelo.CarrinhoDeCompras;


public class ServletController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.processaRequisicao(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.processaRequisicao(request, response);
	}
	
	private void processaRequisicao (HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		HttpSession sessao = request.getSession();
		CarrinhoDeCompras carrinho = (CarrinhoDeCompras)sessao.getAttribute("carrinho");
		if (carrinho == null){
		carrinho = new CarrinhoDeCompras();
		}
		
		String cmd = request.getParameter("cmd");
		
		if (cmd.equals("AdicionarItem")){
			long codigo = Long.parseLong(request.getParameter("codigo"));
			carrinho.removerItem(codigo);
			sessao.setAttribute("carrinho", carrinho);
			RequestDispatcher view = request.getRequestDispatcher("MostrarCarrinho.jsp");
			view.forward(request, response);
		
		} else if (cmd.equals("ExcluirItem")){			
			long codigo = Long.parseLong(request.getParameter("codigo"));
			carrinho.removerItem(codigo);
			sessao.setAttribute("carrinho", carrinho);
			RequestDispatcher view = request.getRequestDispatcher("MostrarCarrinho.jsp");
			view.forward(request, response);
		
		} else if (cmd.equals("FecharPedido")){
			RequestDispatcher view = request.getRequestDispatcher("SeuPedido.jsp");
			view.forward(request, response);
		}
		}
}
