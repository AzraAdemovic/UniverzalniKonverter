import java.util.Scanner;

public class KonvertTest {
	public static Scanner unos = new Scanner(System.in);

	public static void main(String[] args) {

		Konvert konvertiraj = new Konvert();
		System.out.println("Unesite koju konverziju zelite: KilogramUFunte , FuntiUkg, IncUCm,CelzijusUF,FuCelzijuse ");

		String konverzija = unos.nextLine();

		System.out.println(" Unesite kolicinu koju zelite konvertovati : ");

		double kolicina = unos.nextDouble();

		switch (konverzija) {
		case "KilogramUFunte":
			System.out.println(konvertiraj.VratiKilogramUFunte(kolicina) + "lb");
			break;
		case "FuntiUkg":
			System.out.println(konvertiraj.VratiFuntiUkg(kolicina) + "kg");
			break;
		case "IncUCm":
			System.out.println(konvertiraj.VratiIncUcm(kolicina) + "cm");
			break;
		case "CelzijusUF":
			System.out.println(konvertiraj.VratiCelzijuseuF(kolicina) + "F");
			break;
		case "FuCelzijuse":
			System.out.println(konvertiraj.VratiFuCelzijuse(kolicina) + "C");
			break;

		default:
			System.out.println("Unesite navedene konverzije.");
			break;

		}

	}

}
