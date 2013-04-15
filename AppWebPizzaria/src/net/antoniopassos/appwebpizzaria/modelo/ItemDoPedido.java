package net.antoniopassos.appwebpizzaria.modelo;

public class ItemDoPedido {
	private Pizza item; 
	private int quantidade;
	
	public ItemDoPedido() { 
		 
	} 
	 
	public ItemDoPedido(Pizza item) { 
	 this.item = item; 
	 this.setQuantidade(1); 
	}
	
	public Pizza getItem() { 
		 return this.item; 
		} 
		 
		public void setItem(Pizza item) { 
		 this.item = item; 
		} 
		  
		public long getCodigo(){ 
		 return (this.item.getCodigo()); 
		} 
		  
		public String getNome(){ 
		 return (this.item.getNome()); 
		} 
		  
		public double getPreco(){ 
		 return (this.item.getPreco()); 
		} 
		 
		public void setQuantidade(int quantidade) { 
		 this.quantidade = quantidade; 
		} 
		  
		public int getQuantidade() { 
		 return this.quantidade; 
		} 
		  
		public void incrementarQuantidade(){ 
		 this.setQuantidade(this.getQuantidade() + 1); 
		} 
		 
		public void cancelarItem(){ 
		 this.setQuantidade(0); 
		} 
		  
		public double getTotal(){ 
		 return (this.getQuantidade() * this.getPreco()); 
		}
}
