import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;
import java.io.BufferedReader;


public class FileAnalyzer {
	public static void main(String[] args) throws Exception {
		
		FileReader file = new FileReader("redditPosts.txt");
		//FileReader file = new FileReader("Sheep"); sheep was a quick .txt to test certain functions while writing code
		BufferedReader reader = new BufferedReader(file);
		
		String text = "";
		String postLines = reader.readLine();
		int swearLineCounter = 0;
		int fTotalCounter = 0;
		int btchTotalCounter = 0;
		int dckTotalCounter = 0;
		int doucheTotalCounter = 0;
		int ckTotalCounter = 0;
		int assTotalCounter = 0;
		int twtTotalCounter = 0;
		int pissTotalCounter = 0;
		int fwordTotalCounter = 0;
		
		int lineTotal = 0;
		/*int [] swearType = new int [285];
			int F = 0;
			int B = 0;
			int Dk = 0;
			int Ds = 0;
			int Cs = 0;
			int A = 0;
			int T = 0;
			int Ft = 0;*/ //continue to find function for array
		
		while ((postLines = reader.readLine())!=null) {
			Scanner in = new Scanner(postLines);
			while (in.hasNext()) {
				String input = in.next();
				
	//fk word Counter
				if (input.equalsIgnoreCase("fuck")) {
					fTotalCounter++;
				}
				else if (input.equalsIgnoreCase("fck")) {
					fTotalCounter++;
				}
				else if (input.equalsIgnoreCase("fuk")) {
					fTotalCounter++;
				}
				else if (input.equalsIgnoreCase("fucker")) {
					fTotalCounter++;
				}
				else if (input.equalsIgnoreCase("fucks")) {
					fTotalCounter++;
				}
				else if (input.equalsIgnoreCase("fucking")) {
					fTotalCounter++;
				}
	//bch word Counter			
				else if (input.equalsIgnoreCase("bitch")) {
					btchTotalCounter++;
				}
				else if (input.equalsIgnoreCase("bitches")) {
					btchTotalCounter++;
				}
				else if (input.equalsIgnoreCase("bitching")) {
					btchTotalCounter++;
				}
	//dk word Counter			
				else if (input.equalsIgnoreCase("dick")) {
					dckTotalCounter++;
				}
	//dhe word Counter
				else if (input.equalsIgnoreCase("douche")) {
					doucheTotalCounter++;
				}
	//Ck word Counter
				else if (input.equalsIgnoreCase("cock")) {
					ckTotalCounter++;
				}
				else if (input.equalsIgnoreCase("cocksucker")) {
					ckTotalCounter++;
				}
	//Ass word Counter
				else if (input.equalsIgnoreCase("ass")) {
					assTotalCounter++;
				}
				else if (input.equalsIgnoreCase("asses")) {
					assTotalCounter++;
				}
				else if (input.equalsIgnoreCase("asshole")) {
					assTotalCounter++;
				}
				else if (input.equalsIgnoreCase("assholes")) {
					assTotalCounter++;
				}
	//Twt word counter
				else if (input.equalsIgnoreCase("twat")) {
					twtTotalCounter++;
				}
	//Ps word counter
				else if (input.equalsIgnoreCase("piss")) {
					pissTotalCounter++;
				}
				else if (input.equalsIgnoreCase("pissed")) {
					pissTotalCounter++;
				}
	//f-word word Counter			
				else if (input.equalsIgnoreCase("fag")) {
					fwordTotalCounter++;
				}
				else if (input.equalsIgnoreCase("faggot")) {
					fwordTotalCounter++;
				}
				else if (input.equalsIgnoreCase("faggots")) {
					fwordTotalCounter++;
				}
			}
				text += postLines+"\n";
				lineTotal++;
	
				
//fk Line Counter
			if (postLines.contains("fuck")) {
				swearLineCounter++;
			}
			else if (postLines.contains("fck")) {
				swearLineCounter++;
			}
			else if (postLines.contains("fuk")) {
				swearLineCounter++;
			}
			else if (postLines.contains("fucker")) {
				swearLineCounter++;
			}
			else if (postLines.contains("fucks")) {
				swearLineCounter++;
			}
			else if (postLines.contains("fucking")) {
				swearLineCounter++;
			}
//bch Line Counter			
			else if (postLines.contains("bitch")) {
				swearLineCounter++;
			}
			else if (postLines.contains("bitches")) {
				swearLineCounter++;
			}
			else if (postLines.contains("bitching")) {
				swearLineCounter++;
			}
//dk Line Counter			
			else if (postLines.contains("dick")) {
				swearLineCounter++;
			}
//dhe Line Counter
			else if (postLines.contains("douche")) {
				swearLineCounter++;
			}
//Ck Line Counter
			else if (postLines.contains("cock")) {
				swearLineCounter++;
			}
			else if (postLines.contains("cocksucker")) {
				swearLineCounter++;
			}
//Ass Line Counter
			else if (postLines.contains("ass")) {
				swearLineCounter++;
			}
			else if (postLines.contains("asses")) {
				swearLineCounter++;
			}
			else if (postLines.contains("asshole")) {
				swearLineCounter++;
			}
			else if (postLines.contains("assholes")) {
				swearLineCounter++;
			}
//Twt Line Counter
			else if (postLines.contains("twat")) {
				swearLineCounter++;
			}
			//Piss word counter
			else if (postLines.contains("piss")) {
				swearLineCounter++;
			}
			else if (postLines.contains("pissed")) {
				swearLineCounter++;
			}
			else if (postLines.contains("fag")) {
				swearLineCounter++;
			}
			else if (postLines.contains("faggot")) {
				swearLineCounter++;
			}
			else if (postLines.contains("faggots")) {
				swearLineCounter++;
			}
		}
		double curseRatio = (double)swearLineCounter*100/lineTotal;
		double curseRatioRound = Math.round(curseRatio * 100.0) / 100.0;
		System.out.println("Would you like to see an analysis of swearing used in the text file? Type '1' for Yes or '2' for No.");
		int yN = 0;
		Scanner userInput = new Scanner (System.in);	
		yN = userInput.nextInt();
			if (yN == 1) {
				
		System.out.println("Total times f**k was used: "+fTotalCounter);
		System.out.println("Total times bi**h was used: "+btchTotalCounter);
		System.out.println("Total times d**k was used: "+dckTotalCounter);
		System.out.println("Total times do**he was used: "+doucheTotalCounter);
		System.out.println("Total times c**k was used: "+ckTotalCounter);
		System.out.println("Total times a** was used: "+assTotalCounter);
		System.out.println("Total times t**t was used: "+twtTotalCounter);
		System.out.println("Total times p**s was used: "+pissTotalCounter);
		System.out.println("Total times f****t was used: "+fwordTotalCounter);
		System.out.println("Total lines with swearing: "+swearLineCounter);
		System.out.println("Total number of posts: "+lineTotal);
		System.out.println("Percentage of posts with swearing: "+curseRatioRound+"%");
		}
			else {
				System.out.println("I don't blame you. Let's go to church instead!");
			}
	}
	
}
