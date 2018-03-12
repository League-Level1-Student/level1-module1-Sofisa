
public class SpongeBob {
	public static void main(String[] args) {
		SeaCreature spongebob = new SeaCreature("spongebob");
		SeaCreature squidward = new SeaCreature("squidward");
		SeaCreature patrick = new SeaCreature("patrick");
		spongebob.eat();
		spongebob.laugh();
		System.out.println(squidward.getName());
		System.out.println(patrick.getName());
		squidward.eat();
		squidward.laugh();
		patrick.eat();
		patrick.laugh();
	}
}
