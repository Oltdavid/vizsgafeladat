package alapvizsga;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Main {

	static String elso_sor;

	public static void TorpekSzama(List<Torpek> a) {
		System.out.println("2. feladat A torpek száma: " + a.size() + " fő ");
	}

	public static void legMagasabb(List<Torpek> a) {

		int max = 0;
		Torpek maxTorpe = null; 
		for (Torpek torpek : a) {
			if (torpek.getMagassag() > max) {
				max = torpek.getMagassag();
				maxTorpe = torpek;
			}

		}
//
		System.out.println(" 3. feladatA legmagasabb torpe: " + maxTorpe.getMagassag() + "cm " + maxTorpe.getNev());
	}

	public static List<Torpek> torpeLista() throws IOException {
		List<Torpek> torpeLista = new ArrayList<>();
		List<String> beolvas = Files.readAllLines(Paths.get("tesztvizsga.txt"));

		elso_sor = beolvas.get(0);
		for (String sor : beolvas.subList(1, beolvas.size())) {
			String[] split = sor.split(",");

			Torpek o = new Torpek(split[0], split[1], split[2], Integer.parseInt(split[3]), Integer.parseInt(split[4]));

			torpeLista.add(o);
		}
		return torpeLista;
	}

	public static void main(String[] args) throws IOException {
		List<Torpek> torpeLista = torpeLista();
		System.out.println("1 . feladatFile beolvasva" + torpeLista());
		TorpekSzama(torpeLista());
		legMagasabb(torpeLista);

	}

}
