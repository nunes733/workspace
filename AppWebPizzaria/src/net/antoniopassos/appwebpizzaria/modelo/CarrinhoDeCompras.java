package net.antoniopassos.appwebpizzaria.modelo;

import java.util.*;

public class CarrinhoDeCompras {
	private List<ItemDoPedido> itens; 
	private Cardapio cardapio;
	
	public CarrinhoDeCompras(){ 
		 this.itens = new ArrayList(); 
		 this.cardapio = new Cardapio(); 
		}
	
	public List<ItemDoPedido> getItens() { 
		 return itens; 
		}
	
	public void adicionarItem(long codigo){ 
		 for (ItemDoPedido itemDoPedido : itens){ 
		  if(itemDoPedido.getCodigo() == codigo){ 
		   itemDoPedido.incrementarQuantidade(); 
		   return; 
		  } 
		 } 
		   
		 ItemDoPedido item = new ItemDoPedido(cardapio.getPizza(codigo)); 
		 itens.add(item); 
		}
	
	public void removerItem(long codigo) { 
		 Iterator iterator = itens.iterator(); 
		 while (iterator.hasNext()) { 
		  ItemDoPedido item = (ItemDoPedido) iterator.next(); 
		  if (item.getCodigo() == codigo) { 
		   iterator.remove(); 
		  } 
		 } 
		}
	
	public double getTotal() { 
		 double total = 0; 
		 for (ItemDoPedido itemDoPedido : itens) { 
		  total += itemDoPedido.getTotal(); 
		 } 
		 return total; 
		}
}
