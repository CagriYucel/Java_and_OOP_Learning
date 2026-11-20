package Q2;

public class vitaminsMain_a {
	public static void main(String[] args) {
		vitamins vitamins1 = new vitamins();
		vitamins vitamins2 = new vitamins("B12", 65, "Eczacibasi", 1236545);
		vitamins vitamins3 = new vitamins("C Vit++", 45, "Quali-Blends", 3576455);

		System.out.println(vitamins1.toString());
		System.out.println(vitamins2);
		System.out.println(vitamins3);
	}
}
