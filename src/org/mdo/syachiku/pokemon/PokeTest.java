package org.mdo.syachiku.pokemon;

public class PokeTest {

	public static void main(String[] args) {
		
		Pokemon pokemon1 = new Charmander("�p���s");
		pokemon1.height = 2.0f; //f=float
		pokemon1.weight = 12.7f;
		pokemon1.category = "Lizard";
		pokemon1.abilities = "Blaze";
		pokemon1.gender = "M";
		System.out.printf("�s��: %s, �W�r: %s, ����: %f, �魫: %f \n",pokemon1.index, pokemon1.name, pokemon1.height, pokemon1.weight);
		System.out.println(pokemon1);
	}

}
