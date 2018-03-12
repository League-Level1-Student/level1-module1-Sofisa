
public class BackPackTwo {
public static void main(String[] args) {
	Backpack a = new Backpack();
	Pencil b = new Pencil();
	Ruler c = new Ruler();
	Textbook d = new Textbook();
	a.putInBackpack(b);
	a.putInBackpack(c);
	a.putInBackpack(d);
	a.goToSchool();
}
}
