public class PlanoOperadora {
    public static void main(String[] args) {
        
        String plano = "M"; 
		
		if(plano == "B") {
            System.out.println("O plano escolhido possui:");
			System.out.println("100 minutos de ligação");
		}else if(plano == "M") {
            System.out.println("O plano escolhido possui:");
			System.out.println("100 minutos de ligação");
			System.out.println("WhatsApp e Instagram grátis");	
		}else if(plano == "T") {
            System.out.println("O plano escolhido possui:");
			System.out.println("100 minutos de ligação");
			System.out.println("WhatsApp e Instagram grátis");	
			System.out.println("5Gb Youtube");	
		}
        else
            System.out.println("Você deve selecionar umas das opções: B, M ou T");
    }
}
