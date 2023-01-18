package witcher;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Witcher brujo = new Witcher();
		brujo.setName("Geralt de Rivia");
		brujo.setHealth(15);
		brujo.setHasSoul(false);
		if(brujo.isDeath()) {
			System.out.println(brujo.getName() + " está muerto");
		}else {
			System.out.println(brujo.getName() + " está vivo");
		}
	}
}
