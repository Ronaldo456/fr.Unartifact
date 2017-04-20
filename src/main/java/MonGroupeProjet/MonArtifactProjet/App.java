package MonGroupeProjet.MonArtifactProjet;
import java.io.*;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException, InterruptedException
    {
    	String texteInitial = new String("Rome (en italien : Roma, prononcé ['ro?ma]) est\n la capitale de l'Italie depuis 1871. Située au centre-ouest de la péninsule "
    			+ "italienne, sur les côtes de la mer Tyrrhénienne, elle est également la capitale de la région du Latium, et fut celle de l'Empire romain durant plusieurs "
    			+ "siècles.\n En 2014, elle compte 2 869 461 habitants établis sur 1 285 km², ce qui fait d'elle la commune la plus peuplée d'Italie et la plus étendue d'Europe "
    			+ "après Moscou et Londres1. Son aire urbaine, qui recense 4 321 244 habitants en 20132, est en revanche moins importante que celle de Milan et Naples3. Elle "
    			+ "présente en outre la particularité de contenir un État enclavé dans son territoire : la Cité du Vatican (Città del Vaticano), "
    			+ "dont le pape est le souverain. C'est le seul exemple existant d'un pays à l'intérieur d'une ville : Rome est donc la capitale de deux États.");

    	String texteInitial2 = new String("L'histoire de Rome s'étend sur plus de vingt-huit siècles, depuis sa fondation mythique par Romulus en 753 av. J.-C. jusqu'à "
    			+ "son rôle actuel de capitale de la République italienne. Second berceau de la civilisation occidentale après Athènes, la ville fut successivement le "
    			+ "centre de la Monarchie romaine, de la République romaine (509 av. J.-C. – 27 av. J.-C.), puis de l'Empire romain (27 av. J.-C. – 476). Durant cette "
    			+ "période, Rome aurait compté entre un et deux millions d'habitants et domine l'Europe, l'Afrique du Nord et le Moyen-Orient tant militairement que "
    			+ "culturellement, diffusant dans ces territoires la langue latine, ses arts et techniques ainsi que la religion chrétienne. Depuis le ier siècle, elle "
    			+ "abrite le siège de l'Église catholique romaine, au sein des États pontificaux (752-1870) puis de la Cité du Vatican. Considérablement agrandie par de "
    			+ "grands travaux sous Jules César et surtout sous Auguste, la ville est partiellement détruite lors du Grand incendie de Rome - le Circus Maximus notamment."
    			+ " À partir du xve siècle, presque tous les papes depuis Nicolas V (1447-1455) perpétuent la tradition de l'architecture romaine et ambitionnent de faire de"
    			+ " Rome le principal centre culturel et artistique de l'Occident. La ville devient l'un des foyers de la Renaissance italienne, avec Florence et Venise, et "
    			+ "donne naissance au style baroque - dont témoigne encore son centre historique, classé par l'UNESCO comme site du patrimoine mondial4. Des artistes comme "
    			+ "Michel-Ange, Raphaël ou Le Bernin s'y installent et produisent des œuvres telles que la Basilique Saint-Pierre, la Chapelle Sixtine, la Fontaine de Trevi, "
    			+ "le Capitole ou les Chambres de Raphaël. Au xixe siècle, Rome est le symbole de l'unité italienne et devient la capitale du Royaume d'Italie, puis de la "
    			+ "République après la Seconde Guerre mondiale. "
    			+ "Ville globale, Rome est la troisième destination touristique la plus visitée d'Europe derrière Londres et Paris5. La Ville Eternelle est l'une des plus"
    			+ " belles villes du monde, et fréquentée par les touristes depuis le xviiie siècle. Le siège de la papauté et le pèlerinage de Rome en font un lieu "
    			+ "incontournable pour les chrétiens du monde entier depuis des siècles. Les musées du Vatican et le Colisée sont parmi les sites les plus fréquentés."
    			+ " Rome est aussi l'un des plus grands sites archéologiques du monde, et compte également de nombreux ponts et fontaines, 900 églises, ainsi qu'un grand "
    			+ "nombre de musées et d'universités. Outre le tourisme, l'économie de la « Ville Eternelle » est également orientée vers les nouvelles technologies, les "
    			+ "médias et les télécommunications depuis les années 2000. Cernée par sept collines, la ville se situe à l'embouchure du Tibre et est divisée en vingt-deux"
    			+ " rioni. Rome a aussi organisé les Jeux olympiques d'été en 1960. Rome n'est jumelée qu'avec une seule autre ville, Paris, ce qui est vrai dans l'autre "
    			+ "sens, avec ce slogan : « Seul Paris est digne de Rome, seule Rome est digne de Paris. »");
    	
    	
    	
    	LaGrandeClasse map1 = new LaGrandeClasse(texteInitial);
    	Thread thread = new Thread(map1);

    	LaGrandeClasse map2 = new LaGrandeClasse(texteInitial2);
    	Thread thread2 = new Thread(map2);
    	thread.start();
    	thread2.start();
    	
    	thread.join();
    	thread2.join();
    	
//    	System.out.println(map1.getNbrTotal());
    	
//    	HashMap <String, Integer> hm = new HashMap<String, Integer> ();
//    	String word;
//    	Scanner scan = new Scanner(texteInitial);
////    	scan.useDelimiter("[^A-Za-z]+");
//    	while(scan.hasNext()){
//    		word = scan.next();
//    		if(hm.containsKey(word)){
//    			hm.put(word, hm.get(word)+1);
//    		}else{
//    			hm.put(word, 1);
//    		}
//    	}
//    	
//    	LaMap uneMap = new LaMap(hm);
//    	System.out.println(uneMap);
    	
    	
    	
//    	scan.close();
    	
//    	while(scan.hasNextLine()){
//        	System.out.println(scan.next());
//    		
//    	}
    	
//    	System.out.println(texteInitial.charAt(0));
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
//    	File f = new File("C:\\Users\\Soufiane ACHOUR\\Documents\\Projets_Java\\MonArtifactProjet\\texteApplication.txt");
//    	FileReader f_reader;
//		try {
//			f_reader = new FileReader(f);
//	    	BufferedReader reader = new BufferedReader(f_reader);
//	    	
//	    	System.out.println(reader.readLine());
//	    	
//	    	reader.close();
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
    	
    	
    	
    	
        System.out.println( "Hello World!" );
    }
}
