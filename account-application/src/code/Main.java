package code;

public class Main {

	public static void main(String[] args) {
		Service service = new Service();
		System.out.println(service.getJSON());
		System.out.println(service.getMostCommonFirstName("Gary"));
	}

}
