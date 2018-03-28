

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class parser {
	 public static void main(String argv[]) {
		    try {
			File file = new File("C:\\Meet\\STUDY\\ICSI_660\\stanford-corenlp-full-2015-12-09\\Mar14_GroupB.txt.out");
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder docBuilder = dbFactory.newDocumentBuilder();
			org.w3c.dom.Document doc =  docBuilder.parse(file);
			((Node) doc.getDocumentElement()).normalize();
			NodeList nList = doc.getElementsByTagName("token");
			
			Node check_speaker = null;
			String element = "";
			String temp_element = "";
			String check_pronoun = "";
			String pronoun = "";
			
			int count_michael = 0;
			int count_george = 0;
			int count_amy = 0;
			int count_judith = 0;
			int count_tia = 0;
			int count_meg = 0;
			int count_vicky = 0;
			int count_eva = 0;
			int count_julie = 0;
			int count_rita = 0;
			int count_leah = 0;
			int count_caroline = 0;
			int count_cintihia = 0;
			int count_ariel = 0;
			int count_macy = 0;
			int count_lynn = 0;
			int count_rebecca = 0;
			int count_cinthia = 0;
			int count_mara = 0;
			int count_michelle = 0;
			int count_luke = 0;
			int count_ted = 0;
			int count_david = 0;
			int count_matthew = 0;
			int count_jake = 0;
			int count_rick = 0;
			int count_josh = 0;
			int count_tony = 0;
			int count_aaron = 0;
			int count_nick = 0;
			int count_john = 0;
			
			int i = 0;
			for (; i < nList.getLength(); i++) {
				Node nNode = nList.item(i);
				if((i+3) < nList.getLength()){ 	
					check_speaker = nList.item(i+3);
				}	
			
				if (nNode.getNodeType() == Node.ELEMENT_NODE) {
					Element eElement = (Element) nNode;
					Element temp_eElement = (Element) check_speaker;
					temp_element = eElement.getElementsByTagName("word").item(0).getTextContent();
					check_pronoun = temp_eElement.getElementsByTagName("word").item(0).getTextContent();
					pronoun = eElement.getElementsByTagName("POS").item(0).getTextContent();
				
					if((temp_element.equals("michael")  
						|| temp_element.equals("amy")
						|| temp_element.equals("george")
						|| temp_element.equals("luke")
						|| temp_element.equals("ted")
						|| temp_element.equals("david")
						|| temp_element.equals("matthew")
						|| temp_element.equals("jake")
						|| temp_element.equals("rick")
						|| temp_element.equals("josh")
						|| temp_element.equals("tony")
						|| temp_element.equals("aaron")
						|| temp_element.equals("nick")
						|| temp_element.equals("john")
						|| temp_element.equals("judith")
						|| temp_element.equals("tia")
						|| temp_element.equals("meg")
						|| temp_element.equals("vicky")
						|| temp_element.equals("eva")
						|| temp_element.equals("julie")
						|| temp_element.equals("rita")
						|| temp_element.equals("leah")
						|| temp_element.equals("caroline")
						|| temp_element.equals("cintihia")
						|| temp_element.equals("ariel")
						|| temp_element.equals("macy")
						|| temp_element.equals("lynn")
						|| temp_element.equals("rebecca")
						|| temp_element.equals("cinthia")
						|| temp_element.equals("mara")
						|| temp_element.equals("michelle")
						|| temp_element.equals("moderator")) 
						&& (check_pronoun.equals("PM") || check_pronoun.equals("AM"))) {
							element = temp_element;	
					}
	
						switch(element){
							case "michael" :
								pronoun = eElement.getElementsByTagName("POS").item(0).getTextContent();
								if(pronoun.equals("PRP") || pronoun.equals("PRP$")){ 
									count_michael += 1;
								}	
								break;
							case "amy" :
								pronoun = eElement.getElementsByTagName("POS").item(0).getTextContent();
								if(pronoun.equals("PRP") || pronoun.equals("PRP$"))
									count_amy += 1;
								break;
							case "george" :
								pronoun = eElement.getElementsByTagName("POS").item(0).getTextContent();
								if(pronoun.equals("PRP") || pronoun.equals("PRP$"))
									count_george += 1;	
								break;
							case "luke" :
								pronoun = eElement.getElementsByTagName("POS").item(0).getTextContent();
								if(pronoun.equals("PRP") || pronoun.equals("PRP$"))
									count_luke += 1;
								break;
							case "ted" :
								pronoun = eElement.getElementsByTagName("POS").item(0).getTextContent();
								if(pronoun.equals("PRP") || pronoun.equals("PRP$"))
									count_ted += 1;
								break;
							case "david" :
								pronoun = eElement.getElementsByTagName("POS").item(0).getTextContent();
								if(pronoun.equals("PRP") || pronoun.equals("PRP$"))
									count_david += 1;
								break;
							case "matthew" :
								pronoun = eElement.getElementsByTagName("POS").item(0).getTextContent();
								if(pronoun.equals("PRP") || pronoun.equals("PRP$"))
									count_matthew += 1;
								break;	
							case "jake" :
								pronoun = eElement.getElementsByTagName("POS").item(0).getTextContent();
								if(pronoun.equals("PRP") || pronoun.equals("PRP$"))
									count_jake += 1;
								break;
							case "rick" :
								pronoun = eElement.getElementsByTagName("POS").item(0).getTextContent();
								if(pronoun.equals("PRP") || pronoun.equals("PRP$"))
									count_rick += 1;
								break;
							case "josh" :
								pronoun = eElement.getElementsByTagName("POS").item(0).getTextContent();
								if(pronoun.equals("PRP") || pronoun.equals("PRP$"))
									count_josh += 1;
								break;
							case "tony" :
								pronoun = eElement.getElementsByTagName("POS").item(0).getTextContent();
								if(pronoun.equals("PRP") || pronoun.equals("PRP$"))
									count_tony += 1;
								break;
							case "aaron" :
								pronoun = eElement.getElementsByTagName("POS").item(0).getTextContent();
								if(pronoun.equals("PRP") || pronoun.equals("PRP$"))
									count_aaron += 1;
								break;
							case "nick" :
								pronoun = eElement.getElementsByTagName("POS").item(0).getTextContent();
								if(pronoun.equals("PRP") || pronoun.equals("PRP$"))
									count_nick += 1;
								break;
							case "john" :
								pronoun = eElement.getElementsByTagName("POS").item(0).getTextContent();
								if(pronoun.equals("PRP") || pronoun.equals("PRP$"))
									count_john += 1;
								break;
							case "judith" :
								pronoun = eElement.getElementsByTagName("POS").item(0).getTextContent();
								if(pronoun.equals("PRP") || pronoun.equals("PRP$"))
									count_judith += 1;
								break;
							case "tia" :
								pronoun = eElement.getElementsByTagName("POS").item(0).getTextContent();
								if(pronoun.equals("PRP") || pronoun.equals("PRP$"))
									count_tia += 1;
								break;
							case "meg" :
								pronoun = eElement.getElementsByTagName("POS").item(0).getTextContent();
								if(pronoun.equals("PRP") || pronoun.equals("PRP$"))
									count_meg += 1;
								break;
							case "vicky" :
								pronoun = eElement.getElementsByTagName("POS").item(0).getTextContent();
								if(pronoun.equals("PRP") || pronoun.equals("PRP$"))
									count_vicky += 1;
								break;
							case "eva" :
								pronoun = eElement.getElementsByTagName("POS").item(0).getTextContent();
								if(pronoun.equals("PRP") || pronoun.equals("PRP$"))
									count_eva += 1;
								break;
							case "julie" :
								pronoun = eElement.getElementsByTagName("POS").item(0).getTextContent();
								if(pronoun.equals("PRP") || pronoun.equals("PRP$"))
									count_julie += 1;
								break;
							case "rita" :
								pronoun = eElement.getElementsByTagName("POS").item(0).getTextContent();
								if(pronoun.equals("PRP") || pronoun.equals("PRP$"))
									count_rita += 1;
								break;
							case "leah" :
								pronoun = eElement.getElementsByTagName("POS").item(0).getTextContent();
								if(pronoun.equals("PRP") || pronoun.equals("PRP$"))
									count_leah += 1;
								break;
							case "caroline" :
								pronoun = eElement.getElementsByTagName("POS").item(0).getTextContent();
								if(pronoun.equals("PRP") || pronoun.equals("PRP$"))
									count_caroline += 1;
								break;
							case "cintihia" :
								pronoun = eElement.getElementsByTagName("POS").item(0).getTextContent();
								if(pronoun.equals("PRP") || pronoun.equals("PRP$"))
									count_cintihia += 1;
								break;
							case "ariel" :
								pronoun = eElement.getElementsByTagName("POS").item(0).getTextContent();
								if(pronoun.equals("PRP") || pronoun.equals("PRP$"))
									count_ariel += 1;
								break;
							case "macy" :
								pronoun = eElement.getElementsByTagName("POS").item(0).getTextContent();
								if(pronoun.equals("PRP") || pronoun.equals("PRP$"))
									count_macy += 1;
								break;
							case "lynn" :
								pronoun = eElement.getElementsByTagName("POS").item(0).getTextContent();
								if(pronoun.equals("PRP") || pronoun.equals("PRP$"))
									count_lynn += 1;
								break;
							case "rebecca" :
								pronoun = eElement.getElementsByTagName("POS").item(0).getTextContent();
								if(pronoun.equals("PRP") || pronoun.equals("PRP$"))
									count_rebecca += 1;
								break;
							case "cinthia" :
								pronoun = eElement.getElementsByTagName("POS").item(0).getTextContent();
								if(pronoun.equals("PRP") || pronoun.equals("PRP$"))
									count_cinthia += 1;
								break;
							case "mara" :
								pronoun = eElement.getElementsByTagName("POS").item(0).getTextContent();
								if(pronoun.equals("PRP") || pronoun.equals("PRP$"))
									count_mara += 1;
								break;
							case "michelle" :
								pronoun = eElement.getElementsByTagName("POS").item(0).getTextContent();
								if(pronoun.equals("PRP") || pronoun.equals("PRP$"))
									count_michelle += 1;
								break;
							default :
								break;
						}
				}
			}	
//			System.out.println("count_michael : "+count_michael);
//			System.out.println("count_george : "+count_george);
//			System.out.println("count_amy : "+count_amy);
			System.out.println("count_luke : "+count_luke);
//			System.out.println("count_ted : "+count_ted);
//			System.out.println("count_david : "+count_david);
			System.out.println("count_matthew : "+count_matthew);
			System.out.println("count_jake : "+count_jake);
//			System.out.println("count_rick : "+count_rick);
			System.out.println("count_josh : "+count_josh);
//			System.out.println("count_tony : "+count_tony);
			System.out.println("count_aaron : "+count_aaron);
//			System.out.println("count_nick : "+count_nick);
//			System.out.println("count_john : "+count_john);
//			System.out.println("count_judith : "+count_judith);
//			System.out.println("count_tia : "+count_tia);
//			System.out.println("count_meg : "+count_meg);
//			System.out.println("count_vicky : "+count_vicky);
			System.out.println("count_eva : "+count_eva);
			System.out.println("count_julie : "+count_julie);
//			System.out.println("count_rita : "+count_rita);
//			System.out.println("count_leah : "+count_leah);
//			System.out.println("count_caroline : "+count_caroline);
			System.out.println("count_cintihia : "+count_cintihia);
//			System.out.println("count_ariel : "+count_ariel);
			System.out.println("count_macy : "+count_macy);
			System.out.println("count_lynn : "+count_lynn);
//			System.out.println("count_rebecca : "+count_rebecca);
//			System.out.println("count_cinthia : "+count_cinthia);
//			System.out.println("count_mara : "+count_mara);
//			System.out.println("count_michelle : "+count_michelle);
		}catch (Exception e) {
		e.printStackTrace();
		}
	 }
}
