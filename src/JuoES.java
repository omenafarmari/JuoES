package task;

public class JuoES {

	private int i = 0;

	public void juo() {
		i++;
		System.out.println("Join " + i + " ES ");
		juo();
	}

	public static void main(String[] args) {
		JuoES es = new JuoES();
		es.juo();
	}

}
