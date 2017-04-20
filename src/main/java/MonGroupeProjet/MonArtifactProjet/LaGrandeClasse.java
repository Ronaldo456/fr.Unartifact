package MonGroupeProjet.MonArtifactProjet;

//import java.io.IOException;
import java.util.Scanner;

public class LaGrandeClasse implements Runnable {
	LaMap uneMap = new LaMap();

	LaGrandeClasse(String texteInitial) {
		this.uneMap = new LaMap(texteInitial);
	}

	public void run() {
		String word;
		Scanner scan = new Scanner(uneMap.getTexteInitial());
		while (scan.hasNext()) {
			uneMap.incrementerNbr();
			uneMap.incrementerNbrTotal();
			word = scan.next();
			if (uneMap.getHm().containsKey(word)) {
				uneMap.modifierHm(word);
			} else {
				uneMap.nouveauMot(word);
			}
		}
		scan.close();
		// uneMap.setHmFromText();
		synchronized (uneMap) {
			System.out.println(uneMap);
			System.out.println();
		}
	}

	public int getNbrTotal() {
		return uneMap.getNbrTotal();
	}
}
