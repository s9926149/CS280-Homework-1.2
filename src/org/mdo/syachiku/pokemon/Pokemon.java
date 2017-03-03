package org.mdo.syachiku.pokemon;

public abstract class Pokemon {
	String index;
	String name;
	String category;
	float height;
	float weight;
    String abilities;
    String gender;
	
    @Override
	public String toString() {
		return "Pokemon [index=" + index + ", name=" + name + ", category=" + category + ", height=" + height
				+ ", weight=" + weight + ", abilities=" + abilities + ", gender=" + gender + "]";
	}
}
