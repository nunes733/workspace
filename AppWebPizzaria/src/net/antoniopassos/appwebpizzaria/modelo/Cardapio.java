package net.antoniopassos.appwebpizzaria.modelo;

import java.util.*;

public class Cardapio {
	private List<Pizza> cardapio;

	public Cardapio() {
		this.cardapio = new ArrayList<Pizza>();
		this.montarCardapio();
	}

	private void montarCardapio() {
		Pizza pizza = null;

		pizza = new Pizza(1, "Aliche",
				"Mussarela, molho de tomate, alinhe, cebola e orégano", 12.90);
		this.cardapio.add(pizza);

		pizza = new Pizza(2, "Atum",
				"Mussarela, molho de tomate, atum e orégano", 12.90);
		this.cardapio.add(pizza);

		pizza = new Pizza(3, "Caipira",
				"Mussarela, molho de tomate, frago, ovos, milho e orégano",
				12.90);
		this.cardapio.add(pizza);

		pizza = new Pizza(
				4,
				"Calabresa",
				"Mussarela, molho de tomate, calabresa, cebola, azeitona e orégano",
				12.90);
		this.cardapio.add(pizza);

		pizza = new Pizza(5, "Champignon",
				"Mussarela, molho de tomate, champignon e orégano", 12.90);
		this.cardapio.add(pizza);

		pizza = new Pizza(
				6,
				"Havaiana",
				"Mussarela, molho de tomate, lombinho, palmito, azeitona e orégano",
				12.90);
		this.cardapio.add(pizza);

		pizza = new Pizza(
				7,
				"Napolitana",
				"Mussarela, molho de tomate, presunto, tomate, cebola e orégano",
				12.90);
		this.cardapio.add(pizza);

		pizza = new Pizza(
				8,
				"Portuguesa",
				"Mussarela, molho de tomate, presunto, calabresa, ovos, cebola, pimentão, azeitona e orégano",
				12.90);
		this.cardapio.add(pizza);

		pizza = new Pizza(9, "Romeu e Julieta", "Mussarela e goiabada", 12.90);
		this.cardapio.add(pizza);

		pizza = new Pizza(10, "Chocolate", "Mussarela e chocolate", 12.90);
		this.cardapio.add(pizza);

		pizza = new Pizza(11, "Banana", "Mussarela, banana e canela", 12.90);
		this.cardapio.add(pizza);

		pizza = new Pizza(12, "Coco", "Mussarela, coco e leite condensado",
				12.90);
		this.cardapio.add(pizza);
	}

	public List<Pizza> getCardapio() {
		return this.cardapio;
	}

	public Pizza getPizza(long codigo) {
		Pizza pizza = null;

		Iterator<Pizza> iterator = this.getCardapio().iterator();
		while (iterator.hasNext()) {
			pizza = (Pizza) iterator.next();
			if (pizza.getCodigo() == codigo) {
				return pizza;
			}
		}

		return null;
	}
}
