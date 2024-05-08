public class PlanoOperadora2 {
    public static void main(String[] args) {
        
        String plano = "M"; 

        System.out.println("O plano escolhido, dá direito ao/s seguinte/s benefício/s:");

		switch (plano) {
			case "T": {
				System.out.println("5Gb Youtube");
			}
			case "M": {
				System.out.println("WhatsApp e Instagram grátis");
			}
			case "B": {
				System.out.println("100 minutos de ligação");
			}
		}
    }
}
