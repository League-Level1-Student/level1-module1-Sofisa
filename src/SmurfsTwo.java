
public class SmurfsTwo {
public static void main(String[] args) {
	Smurf handysmurf = new Smurf("Handy");
	Smurf papasmurf = new Smurf("Papa");
	Smurf smurfette = new Smurf("Smurfette");
	handysmurf.eat();
	System.out.println(handysmurf.getName());
	System.out.println(papasmurf.getName());
	System.out.println(papasmurf.getHatColor());
	System.out.println(papasmurf.isGirlOrBoy());
	System.out.println(smurfette.getName());
	System.out.println(smurfette.getHatColor());
	System.out.println(smurfette.isGirlOrBoy());
}
}
