package org.mdo.syachiku.pokemon;

public class PokeTest {

	public static void main(String[] args) {
		
		Pokemon pokemon1 = new Charmander("小火龍");
		pokemon1.height = 2.0f; //f=float
		pokemon1.weight = 12.7f;
		pokemon1.category = "Lizard";
		pokemon1.abilities = "Blaze";
		pokemon1.gender = "M";
		System.out.printf("編號: %s, 名字: %s, 身高: %f, 體重: %f \n",pokemon1.index, pokemon1.name, pokemon1.height, pokemon1.weight);
		System.out.println(pokemon1);
	}

}
