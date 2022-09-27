package by.home.maxzzzit;


public class ZapisRaznihParametrov {
	private char simvol = 'a';
	private int param;
	private String nameDirektor;
	
	@Override
	public String toString() {
		return "Параметры [имя=" + simvol + ", параметры=" + param + "]";
	}
	
	public static void main(String[]args) {
		ZapisRaznihParametrov pr = new ZapisRaznihParametrov();
		pr.parametri(23, 34, 2, 66, 8);
		pr.setNameDirektor("Lena");
		String rez = pr.getNameDirektor();
		System.out.println(rez);
	}
	
	public void parametri (int... param) {
		this.simvol = simvol;
		int summa = 0;
		for (int temp : param) {
			simvol++;
			summa += temp;
			System.out.print(temp+" "+ simvol+" = "+summa+ "\n");
		}
		System.out.println("Общая сумма = "+summa);
	}
	
	public String getNameDirektor() {
		return nameDirektor;
	}
	public void setNameDirektor(String nameDirektor) {
		this.nameDirektor = nameDirektor;
	}
}