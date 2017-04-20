package MonGroupeProjet.MonArtifactProjet;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

import org.omg.Messaging.SyncScopeHelper;

import java.util.Scanner;
import java.util.Set;


public class LaMap {
	private HashMap<String, Integer> hm;
	private Set<String> hs;
	private String texteInitial;
	private int nbr;
	private static int nbrTotal;
	private static int compteur=0;
	private int compteurLocal;
	
	LaMap(){}
	LaMap(HashMap<String, Integer> hm)
	{
		this.hm = hm;
		hs = hm.keySet();
		compteur++;
		compteurLocal = compteur;
	}
	LaMap(String texteInitial){
		this.texteInitial = texteInitial;
		hm = new HashMap<String, Integer>();
		compteur++;
		compteurLocal = compteur;
	}
	
	String getTexteInitial(){
		return this.texteInitial;
	}
	int getNbrTotal(){
		return nbrTotal;
	}

	public void incrementerNbr(){
		nbr++;
	}
	public synchronized void incrementerNbrTotal(){
		nbrTotal++;
	}
	public HashMap<String, Integer> getHm(){
		return hm;
	}
	public void modifierHm(String word){
		hm.put(word, hm.get(word)+1);
	}
	public void nouveauMot(String word){
		hm.put(word, 1);
	}
	
	public void setHmFromText() throws IOException{
		String word;
    	Scanner scan = new Scanner(texteInitial);
    	while(scan.hasNext()){
    		nbr++;
    		nbrTotal++;
    		word = scan.next();
    		if(hm.containsKey(word)){
    			hm.put(word, hm.get(word)+1);
    		}else{
    			hm.put(word, 1);
    		}
    	}
    	scan.close();
	}
	
	public void hsFromHm(){
		this.hs = hm.keySet();
	}
	
	
	
	@Override
	public String toString(){
//		Set<String> mots = hm.keySet();
		//"Key : count\n"
		StringBuilder sb = new StringBuilder();

		hm.entrySet().forEach(entry -> sb.append(entry.getKey()));
		
		
		for (Entry<String, Integer> entry : hm.entrySet()) {
			sb.append(entry.getKey()).append(':').append(entry.getValue()).append('\n');
		}
//
		
		hm.forEach(null);
		
		
		
//		/StringJoiner text = new StringJoiner(" ");
		return sb.toString();
		
		////		hsFromHm();
////		Iterator<String> iterator = hs.iterator();
////		String word;
////		while(iterator.hasNext()){
////			word = iterator.next();
////			text.add(word);
////			text.add(":");
////			text.add(hm.get(word).toString());
////			text.add("\n");
////		}
////		return text.toString();
//		String resultat = String.format("nbr%d : %d\nnbr Total : %d", compteurLocal, nbr, nbrTotal);
//		return resultat;
	}
	
	
//	public void run() {
//		try{
//			setHmFromText();
//			synchronized(hm){
////			hsFromHm();
//			System.out.println(this);}
//			System.out.println();
//			System.out.println();
//		}catch(IOException e){
//			System.out.println("Une erreur");
//			e.getCause().getMessage();
//		}
//	}
}


/*
 * <dependency>
    	<groupId>org.jfree</groupId>
    	<artifactId>jfreechart</artifactId>
    	<version>1.0.13</version>
    </dependency>
 */








