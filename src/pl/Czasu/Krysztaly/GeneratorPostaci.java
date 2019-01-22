package pl.Czasu.Krysztaly;

import java.awt.EventQueue;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;

public class GeneratorPostaci {
	protected static JComboBox<String> comboBoxRasa, comboBoxPlec, comboBoxProfesjaGlowna, comboBoxProfesjaDrugorzedna;
	protected static String Rasa, Plec, ProfesjaG, PoziomPG, ProfesjaD, PoziomPD, Wzrost, Waga, Wiek, StatusUrodzenia, Zywotnosc, SilaFizyczna, Zrecznosc, Szybkosc, Inteligencja,
		Madrosc, UmiejetnosciMagiczne, Prezencja, Charyzma, Wiara, Zauwazenie, BazowaPF, OIlu, OSug, OZak, OSzo, OEne, BazowaF, OTru, OGaz, OTem, OEle, OPol;
	protected static String[] Profesje, Nadnaturalne, Nienaturalne, Zawody, UWD;
	
	public static void main(String[] args) {
		JSpinner spinnerF, spinnerP, spinnerD;
		SpinnerNumberModel spinnermodelF, spinnermodelP, spinnermodelD;
		int numerRasy, numerPlci, ileFunkcji, numerFunkcji, numerFunkcji2 = 35, poziom, poziom2 = 0, ileBieglosci, minBieglosc, dodatekBieglosc;
		String rasa, plec, funkcjaBieglosc; 
		String[] funkcje = new String[2];
		
		String[] dostepneRasy = {"Człowiek", "Półelf", "Elf", "Półork", "Półolbrzym", "Krasnolud", "Gnom", "Hobbit", "Reptillion"};
		String[] dostepnePlcie = {"Mężczyzna", "Kobieta"};
		String[] Lista1 = {}, Lista2;
		comboBoxRasa = new JComboBox<>(dostepneRasy);
		comboBoxPlec = new JComboBox<>(dostepnePlcie);
		String[] opcje = {"OK"};
		String wybororRasy = "Wybór Rasy";
		String wyborPlci = "Wybór Płci";
		String wyborIlisciProfesji = "Ile Profesji będzie posiadałą postać?";
		String wyborProfesjiGlownej = "Wybór Profesji Głównej";
		String wyborProfesjiDrugorzednej = "Wybór Profesji Drugorzędnej";
		String wyborPoziomuProfesjiGlownej = "Wybór poziomu Profesji Głównej";
		String wyborPoziomuProfesjiDrugorzednej = "Wybór poziomu Profesji Drugorzednej";
		
		
		JOptionPane.showOptionDialog(null, comboBoxRasa, wybororRasy, JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opcje, opcje[0]); 
		rasa = (String) comboBoxRasa.getSelectedItem();
		numerRasy = WyborRasyPlciFunkcjiPoziomu.WR(rasa);

		JOptionPane.showOptionDialog(null, comboBoxPlec, wyborPlci, JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opcje, opcje[0]);
		plec = (String) comboBoxPlec.getSelectedItem();
		numerPlci = WyborRasyPlciFunkcjiPoziomu.WP(plec);
				
		spinnermodelF = new SpinnerNumberModel(1, 1, 2, 1);
		spinnerF = new JSpinner(spinnermodelF);
		JOptionPane.showOptionDialog(null, spinnerF, wyborIlisciProfesji, JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opcje, opcje[0]);
		ileFunkcji = (int) spinnerF.getValue();
		
		if(ileFunkcji == 1) {
			Lista1 = MetodyIOdnosniki.WybranaFunkcjaJedynak(numerRasy);
		} else if(ileFunkcji == 2) {
			Lista1 = MetodyIOdnosniki.WybranaFunkcja(numerRasy);
		}
		
		comboBoxProfesjaGlowna = new JComboBox<>(Lista1);
		JOptionPane.showOptionDialog(null, comboBoxProfesjaGlowna, wyborProfesjiGlownej, JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opcje, opcje[0]);
		funkcje[0] = (String) comboBoxProfesjaGlowna.getSelectedItem();
		numerFunkcji = WyborRasyPlciFunkcjiPoziomu.WF(funkcje[0]);
		Lista2 = MetodyIOdnosniki.WybranaFunkcja2(numerRasy, numerFunkcji);
		
		spinnermodelP = new SpinnerNumberModel(0, 0, WyborRasyPlciFunkcjiPoziomu.WybranyPoziom(numerFunkcji, numerRasy), 1);
		spinnerP = new JSpinner(spinnermodelP);
		JOptionPane.showOptionDialog(null, spinnerP, wyborPoziomuProfesjiGlownej, JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opcje, opcje[0]);
		poziom = (int) spinnerP.getValue();
		
		if(ileFunkcji == 1){
			funkcje[1] = "brak";	
		} else if(ileFunkcji == 2) {
			comboBoxProfesjaDrugorzedna = new JComboBox<>(Lista2);
			JOptionPane.showOptionDialog(null, comboBoxProfesjaDrugorzedna, wyborProfesjiDrugorzednej, JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opcje, opcje[0]);
			funkcje[1] = (String) comboBoxProfesjaDrugorzedna.getSelectedItem();
			numerFunkcji2 = WyborRasyPlciFunkcjiPoziomu.WF(funkcje[1]);
		
			spinnermodelD = new SpinnerNumberModel(0, 0, WyborRasyPlciFunkcjiPoziomu.WybranyPoziom2(numerFunkcji2, numerRasy, poziom), 1);
			spinnerD = new JSpinner(spinnermodelD);
			JOptionPane.showOptionDialog(null, spinnerD, wyborPoziomuProfesjiDrugorzednej, JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opcje, opcje[0]);
			poziom2 = (int) spinnerD.getValue();
		}
		/**
		rasa = Wizualizacja.Rasa;
		numerRasy = Wizualizacja.NumerRasy;
		plec = Wizualizacja.Plec;
		numerPlci = Wizualizacja.NumerPlci;
		funkcje = new String[2];
		numerFunkcji = Wizualizacja.NumerFunkcji;
		funkcje[0] = Wizualizacja.Profesje[0];
		poziom = Wizualizacja.Poziom;
		numerFunkcji2 = Wizualizacja.NumerFunkcji2;
		funkcje[1] = Wizualizacja.Profesje[1];
		poziom2 = Wizualizacja.Poziom2;
			**/
		TworzeniePostaci podstawa = TworzeniePostaci.Wspolczynniki(numerRasy, numerPlci);
		TworzeniePostaci podstawaB = TworzeniePostaci.Wspolczynniki(numerRasy, numerPlci); 
		TworzeniePostaci funkcjan1 = TworzeniePostaci.Funkcja(funkcje[0]);
		TworzeniePostaci funkcjan2 = TworzeniePostaci.Funkcja(funkcje[1]);
		TworzeniePostaci rozwoj1 = TworzeniePostaci.Rozwoj(funkcje[0]);
		TworzeniePostaci rozwoj2 = TworzeniePostaci.Rozwoj(funkcje[1]);
		TworzeniePostaci postac = new TworzeniePostaci();
		
		postac.setRasa(rasa);
		
		postac.setPlec(plec);
		
		postac.setFunkcja(funkcje);
		
		postac.setStatus_urodzenia(MetodyIOdnosniki.sp(numerFunkcji, numerFunkcji2));
		
		postac.setNadnaturalne(MetodyIOdnosniki.ZdNad());
		
		postac.setNienaturalne(MetodyIOdnosniki.ZdNie());
		
		if(!(postac.getNadnaturalne() == null) && (!(postac.getNienaturalne() == null))){
			if(MetodyIOdnosniki.zawiera(postac.getNadnaturalne(), "Silacz") && MetodyIOdnosniki.zawiera(postac.getNienaturalne(), "Jednoręki")) {
				MetodyIOdnosniki.extracted();
			} else if(MetodyIOdnosniki.zawiera(postac.getNadnaturalne(), "Akrobata") && (MetodyIOdnosniki.zawiera(postac.getNienaturalne(), "Garbaty") || MetodyIOdnosniki.zawiera(postac.getNienaturalne(), "Jednoręki"))) {
				MetodyIOdnosniki.extracted();
			} else if(MetodyIOdnosniki.zawiera(postac.getNadnaturalne(), "Szybki") && (MetodyIOdnosniki.zawiera(postac.getNienaturalne(), "Karzeł") || MetodyIOdnosniki.zawiera(postac.getNienaturalne(), "Kulawy") || MetodyIOdnosniki.zawiera(postac.getNienaturalne(), "Platfus") || MetodyIOdnosniki.zawiera(postac.getNienaturalne(), "Flegmatyk") || MetodyIOdnosniki.zawiera(postac.getNienaturalne(), "Jednooki"))) {
				MetodyIOdnosniki.extracted();
			} else if(MetodyIOdnosniki.zawiera(postac.getNadnaturalne(), "Geniusz") && MetodyIOdnosniki.zawiera(postac.getNienaturalne(), "Debil")) {
				MetodyIOdnosniki.extracted();
			} else if(MetodyIOdnosniki.zawiera(postac.getNadnaturalne(), "Mędrzec") && (MetodyIOdnosniki.zawiera(postac.getNienaturalne(), "Amnezja") || MetodyIOdnosniki.zawiera(postac.getNienaturalne(), "Głupiec"))) {
				MetodyIOdnosniki.extracted();
			} else if(MetodyIOdnosniki.zawiera(postac.getNadnaturalne(), "Magik") && MetodyIOdnosniki.zawiera(postac.getNienaturalne(), "Jednoręki")) {
				MetodyIOdnosniki.extracted();
			} else if(MetodyIOdnosniki.zawiera(postac.getNadnaturalne(), "Piękniś") && (MetodyIOdnosniki.zawiera(postac.getNienaturalne(), "Kulawy") || MetodyIOdnosniki.zawiera(postac.getNienaturalne(), "Zezowaty") || MetodyIOdnosniki.zawiera(postac.getNienaturalne(), "Garbaty") || MetodyIOdnosniki.zawiera(postac.getNienaturalne(), "Szpetny") || MetodyIOdnosniki.zawiera(postac.getNienaturalne(), "Pryszczaty") || MetodyIOdnosniki.zawiera(postac.getNienaturalne(), "Brudas"))) {
				MetodyIOdnosniki.extracted();
			} else if(MetodyIOdnosniki.zawiera(postac.getNadnaturalne(), "Elokwentny") && MetodyIOdnosniki.zawiera(postac.getNienaturalne(), "Jąkała")) {
				MetodyIOdnosniki.extracted();
			}
		}
		
		int[] ZliczanieBonusuNienaturalnych = ZdolnoscNadnaturalnaINienaturalna.BonusNienaturalne(postac.getNienaturalne());
		int[] ZliczanieBonusuNadnaturalnych = ZdolnoscNadnaturalnaINienaturalna.BonusNadnaturalne(postac.getNadnaturalne());
		
		int startM = 0;
		if(!(postac.getNadnaturalne() == null)) {
			if(MetodyIOdnosniki.zawiera(postac.getNadnaturalne(), "Mędrzec")){
				startM = (ZdolnoscNadnaturalnaINienaturalna.Medrzec(numerRasy, numerPlci) + MetodyIOdnosniki.wieksze(funkcjan1.getMadrosc(), funkcjan2.getMadrosc()));
			}
		} else if(!(postac.getNienaturalne() == null) && !(ZliczanieBonusuNienaturalnych[11] == 0 || ZliczanieBonusuNienaturalnych[12] == 0)) {
			int MaN1 = 1; int MaN2 = 1;
			for(int i = 0; i < ZliczanieBonusuNienaturalnych[11]; i++) {
				MaN1 += ZdolnoscNadnaturalnaINienaturalna.Debonus10();
			}
			
			for(int j = 0; j < ZliczanieBonusuNienaturalnych[12]; j++) {
				MaN2 += 3;
			}
			
			startM = (((int)(podstawa.getMadrosc() / (MaN1 * MaN2) )) + MetodyIOdnosniki.wieksze(funkcjan1.getMadrosc(), funkcjan2.getMadrosc()));
					if(ZliczanieBonusuNienaturalnych[12] > 0 && postac.getMadrosc() > 30) {
						startM = 30;
					} 
		} else {
			startM = podstawa.getMadrosc() + MetodyIOdnosniki.wieksze(funkcjan1.getMadrosc(), funkcjan2.getMadrosc());
		}
		
		if(!(postac.getNienaturalne() == null) && MetodyIOdnosniki.zawiera(postac.getNienaturalne(), "Karzeł")) {
			postac.setWzrost(ZdolnoscNadnaturalnaINienaturalna.Karzel(numerRasy, numerPlci));
		} else {
			postac.setWzrost(WzrostWagaWiek.robWzrost(numerRasy, numerPlci));
		}
		
		if(!(postac.getNienaturalne() == null) && MetodyIOdnosniki.zawiera(postac.getNienaturalne(), "Grubas")) {
			postac.setWaga(WzrostWagaWiek.robWaga(numerRasy, numerPlci) * 2);
		} else {
			postac.setWaga(WzrostWagaWiek.robWaga(numerRasy, numerPlci));
		}
		
		int dodajemyWiek = MetodyIOdnosniki.wiekZFunkcji(numerFunkcji2);
		postac.setWiek(WzrostWagaWiek.robWiek(numerRasy) + dodajemyWiek);
		
		postac.setZawod(MetodyIOdnosniki.Zawody(postac.getStatus_urodzenia(), Math.round((startM - MetodyIOdnosniki.k100())/20)));
		
		int[] ZliczanieBonusuZawodow = LosowanieZawodow.BonusZawod(postac.getZawod());
			
		if(!(postac.getNadnaturalne() == null) && !(ZliczanieBonusuNadnaturalnych[0] == 0 || ZliczanieBonusuNadnaturalnych[1] == 0)){
			int Z1 = 1; int Z2 = 0;
			for(int i = 0; i < ZliczanieBonusuNienaturalnych[6]; i++) {
				Z1 += 1;
			}
			
			for(int j = 0; j < ZliczanieBonusuNienaturalnych[10]; j++) {
				Z2 = ZdolnoscNadnaturalnaINienaturalna.Bonus();
			}		
			postac.setZywotnosc(((MetodyIOdnosniki.Blogoslawienstwo(podstawa.getZywotnosc(), podstawaB.getZywotnosc(), MetodyIOdnosniki.Blogo(postac.getNadnaturalne())) + WzrostWagaWiek.extra(postac.getWaga(), numerRasy, numerPlci)) * Z1) + Z2 + (MetodyIOdnosniki.wieksze(funkcjan1.getZywotnosc(),funkcjan2.getZywotnosc()) * Z1));
		} else {
			postac.setZywotnosc(MetodyIOdnosniki.Blogoslawienstwo(podstawa.getZywotnosc(), podstawaB.getZywotnosc(), MetodyIOdnosniki.Blogo(postac.getNadnaturalne())) + MetodyIOdnosniki.wieksze(funkcjan1.getZywotnosc(),funkcjan2.getZywotnosc()) + WzrostWagaWiek.extra(postac.getWaga(), numerRasy, numerPlci));
		}
			
		if((!(postac.getNadnaturalne() == null)) && MetodyIOdnosniki.zawiera(postac.getNadnaturalne(), "Silacz")) {
			postac.setSila_Fizyczna(ZdolnoscNadnaturalnaINienaturalna.Silacz(numerRasy, numerPlci) + MetodyIOdnosniki.wieksze(funkcjan1.getSila_Fizyczna(), funkcjan2.getSila_Fizyczna()) + WzrostWagaWiek.extra(postac.getWaga(), numerRasy, numerPlci));
		} else if(!(postac.getNienaturalne() == null) && MetodyIOdnosniki.zawiera(postac.getNienaturalne(), "Jednoręki")) {
			postac.setSila_Fizyczna(((int)((MetodyIOdnosniki.Blogoslawienstwo(podstawa.getSila_Fizyczna(), podstawaB.getSila_Fizyczna(), MetodyIOdnosniki.Blogo(postac.getNadnaturalne())) + WzrostWagaWiek.extra(postac.getWaga(), numerRasy, numerPlci) / 4))) + MetodyIOdnosniki.wieksze(funkcjan1.getSila_Fizyczna(), funkcjan2.getSila_Fizyczna())) ;
		} else {
			postac.setSila_Fizyczna(MetodyIOdnosniki.Blogoslawienstwo(podstawa.getSila_Fizyczna(), podstawaB.getSila_Fizyczna(), MetodyIOdnosniki.Blogo(postac.getNadnaturalne())) + MetodyIOdnosniki.wieksze(funkcjan1.getSila_Fizyczna(), funkcjan2.getSila_Fizyczna()) + WzrostWagaWiek.extra(postac.getWaga(), numerRasy, numerPlci));
		}
			
		if((!(postac.getNadnaturalne() == null)) && MetodyIOdnosniki.zawiera(postac.getNadnaturalne(), "Akrobata")) {
			postac.setZrecznosc(ZdolnoscNadnaturalnaINienaturalna.Akrobata(numerRasy, numerPlci) + MetodyIOdnosniki.wieksze(funkcjan1.getZrecznosc(), funkcjan2.getZrecznosc()) + ((int)(WzrostWagaWiek.extra(postac.getWaga(), numerRasy, numerPlci)) / 2));
		} else if(!(postac.getNienaturalne() == null) && !(ZliczanieBonusuNienaturalnych[6] == 0 || ZliczanieBonusuNienaturalnych[10] == 0)) {
			int ZrN1 = 0; int ZrN2 = 1; int ZrN3 = 0;
			for(int i = 0; i < ZliczanieBonusuNienaturalnych[6]; i++) {
				ZrN1 += ZdolnoscNadnaturalnaINienaturalna.Debonus10();
			}			
			for(int j = 0; j < ZliczanieBonusuNienaturalnych[10]; j++) {
				ZrN2 += 3;
			}
			for(int k = 0; k < ZliczanieBonusuNienaturalnych[13]; k++) {
				ZrN3 += ZdolnoscNadnaturalnaINienaturalna.Debonus20();;
			}
			postac.setZrecznosc((int)((MetodyIOdnosniki.Blogoslawienstwo(podstawa.getZrecznosc(), podstawaB.getZrecznosc(), MetodyIOdnosniki.Blogo(postac.getNadnaturalne())) + ((int)WzrostWagaWiek.extra(postac.getWaga(), numerRasy, numerPlci) / 2) - ZrN1 - ZrN3) / ZrN2) + MetodyIOdnosniki.wieksze(funkcjan1.getZrecznosc(), funkcjan2.getZrecznosc()));
		} else {
			postac.setZrecznosc(MetodyIOdnosniki.Blogoslawienstwo(podstawa.getZrecznosc(), podstawaB.getZrecznosc(), MetodyIOdnosniki.Blogo(postac.getNadnaturalne())) + ((int)(WzrostWagaWiek.extra(postac.getWaga(), numerRasy, numerPlci)) / 2)  + MetodyIOdnosniki.wieksze(funkcjan1.getZrecznosc(), funkcjan2.getZrecznosc()));
		}
				
		if((!(postac.getNadnaturalne() == null)) && MetodyIOdnosniki.zawiera(postac.getNadnaturalne(), "Szybki")){
			postac.setSzybkosc(ZdolnoscNadnaturalnaINienaturalna.Szybki(numerRasy, numerPlci) + MetodyIOdnosniki.wieksze(funkcjan1.getSzybkosc(), funkcjan2.getSzybkosc()) + ((int)(WzrostWagaWiek.extra(postac.getWaga(), numerRasy, numerPlci)) / 2));
		} else if(!(postac.getNienaturalne() == null) && !(ZliczanieBonusuNienaturalnych[0] == 0 || ZliczanieBonusuNienaturalnych[1] == 0 || ZliczanieBonusuNienaturalnych[2] == 0 || ZliczanieBonusuNienaturalnych[3] == 0 || ZliczanieBonusuNienaturalnych[4] == 0)) {
			int SzN1 = 0; int SzN2 = 0; int SzN3 = 0; int SzN4 = 0; int SzN5 = 0; int SzN6 = 0;
			for(int i = 0; i < ZliczanieBonusuNienaturalnych[0]; i++) {
				SzN1 += ((int)(WzrostWagaWiek.wz(0, numerRasy, numerPlci) - postac.getWzrost()) / 2);
			}
			for(int j = 0; j < ZliczanieBonusuNienaturalnych[1]; j++) {
				SzN2 += 1;
			}
			for(int k = 0; k < ZliczanieBonusuNienaturalnych[2]; k++) {
				SzN3 += ZdolnoscNadnaturalnaINienaturalna.Debonus10();
			}
			for(int l = 0; l < ZliczanieBonusuNienaturalnych[3]; l++) {
				SzN4 += 1;
			}
			for(int m = 0; m < ZliczanieBonusuNienaturalnych[4]; m++) {
				SzN5 += ZdolnoscNadnaturalnaINienaturalna.Jednooki();
			}
			for(int n = 0; n < ZliczanieBonusuNienaturalnych[13]; n++) {
				SzN6 += ZdolnoscNadnaturalnaINienaturalna.Debonus20();
			}
			postac.setSzybkosc(((int)(MetodyIOdnosniki.Blogoslawienstwo(podstawa.getSzybkosc(), podstawaB.getSzybkosc(), MetodyIOdnosniki.Blogo(postac.getNadnaturalne())) + SzN1 - (SzN3 + SzN5 + SzN6)) / SzN2 * SzN4) + MetodyIOdnosniki.wieksze(funkcjan1.getSzybkosc(), funkcjan2.getSzybkosc()));
		} else {
			postac.setSzybkosc(MetodyIOdnosniki.Blogoslawienstwo(podstawa.getSzybkosc(), podstawaB.getSzybkosc(), MetodyIOdnosniki.Blogo(postac.getNadnaturalne())) + ((int)(WzrostWagaWiek.extra(postac.getWaga(), numerRasy, numerPlci)) / 2) + MetodyIOdnosniki.wieksze(funkcjan1.getSzybkosc(), funkcjan2.getSzybkosc()));
		}
				
		if((!(postac.getNadnaturalne() == null)) && MetodyIOdnosniki.zawiera(postac.getNadnaturalne(), "Geniusz")) {
			postac.setInteligencja(ZdolnoscNadnaturalnaINienaturalna.Geniusz(numerRasy, numerPlci) + MetodyIOdnosniki.wieksze(funkcjan1.getInteligencja(), funkcjan2.getInteligencja()));
		} else if(!(postac.getNienaturalne() == null) && MetodyIOdnosniki.zawiera(postac.getNienaturalne(), "Debil")) {
			postac.setInteligencja(((int)(MetodyIOdnosniki.Blogoslawienstwo(podstawa.getInteligencja(), podstawaB.getInteligencja(), MetodyIOdnosniki.Blogo(postac.getNadnaturalne())) / 10)) + MetodyIOdnosniki.wieksze(funkcjan1.getInteligencja(), funkcjan2.getIlosc_Bieglosci()));
				if(postac.getInteligencja() > 30) {
					postac.setInteligencja(30);
				}
		} else {
			postac.setInteligencja(MetodyIOdnosniki.Blogoslawienstwo(podstawa.getInteligencja(), podstawaB.getInteligencja(), MetodyIOdnosniki.Blogo(postac.getNadnaturalne())) + MetodyIOdnosniki.wieksze(funkcjan1.getInteligencja(), funkcjan2.getInteligencja()));
		}
				
		if(!(postac.getNadnaturalne() == null) && MetodyIOdnosniki.zawiera(postac.getNadnaturalne(), "Mędrzec")) {
			postac.setMadrosc(ZdolnoscNadnaturalnaINienaturalna.Medrzec(numerRasy, numerPlci) + MetodyIOdnosniki.wieksze(funkcjan1.getMadrosc(), funkcjan2.getMadrosc())); 
		} else if(!(postac.getNienaturalne() == null) && !(ZliczanieBonusuNienaturalnych[11] == 0 || ZliczanieBonusuNienaturalnych[12] == 0)) {
			int MaN1 = 1; int MaN2 = 1; int MaN3 = 0;
			for(int i = 0; i < ZliczanieBonusuNienaturalnych[11]; i++) {
				MaN1 = ZdolnoscNadnaturalnaINienaturalna.Debonus10();
			}
			for(int j = 0; j < ZliczanieBonusuNienaturalnych[12]; j++) {
				MaN2 += 3;
			}
			for(int k = 0; k < ZliczanieBonusuNienaturalnych[13]; k++) {
				MaN2 += ZdolnoscNadnaturalnaINienaturalna.Debonus20();
			}
			postac.setMadrosc(((int)(MetodyIOdnosniki.Blogoslawienstwo(podstawa.getMadrosc(), podstawaB.getMadrosc(), MetodyIOdnosniki.Blogo(postac.getNadnaturalne())) - MaN3 / (MaN1 * MaN2) )) + MetodyIOdnosniki.wieksze(funkcjan1.getMadrosc(), funkcjan2.getMadrosc()));
				if(ZliczanieBonusuNienaturalnych[12] > 0 && postac.getMadrosc() > 30) {
					postac.setMadrosc(30);
				}
		} else {
			postac.setMadrosc(MetodyIOdnosniki.Blogoslawienstwo(podstawa.getMadrosc(), podstawaB.getMadrosc(), MetodyIOdnosniki.Blogo(postac.getNadnaturalne())) + MetodyIOdnosniki.wieksze(funkcjan1.getMadrosc(), funkcjan2.getMadrosc()));
		}
				
		if((!(postac.getNadnaturalne() == null)) && MetodyIOdnosniki.zawiera(postac.getNadnaturalne(), "Magik")) {
			postac.setUmiejetnosci_Magiczne(ZdolnoscNadnaturalnaINienaturalna.Magik(numerRasy, numerPlci) + MetodyIOdnosniki.wieksze(funkcjan1.getUmiejetnosci_Magiczne(), funkcjan2.getUmiejetnosci_Magiczne()));
		} else if(!(postac.getNienaturalne() == null) && !(ZliczanieBonusuNienaturalnych[10] == 0)) {
			int UMN = 1;
			for(int i = 0; i < ZliczanieBonusuNienaturalnych[10]; i++) {
				UMN += 3;
			}
			postac.setUmiejetnosci_Magiczne(((int)(MetodyIOdnosniki.Blogoslawienstwo(podstawa.getUmiejetnosci_Magiczne(), podstawaB.getUmiejetnosci_Magiczne(), MetodyIOdnosniki.Blogo(postac.getNadnaturalne())) / UMN)) + MetodyIOdnosniki.wieksze(funkcjan1.getUmiejetnosci_Magiczne(), funkcjan2.getUmiejetnosci_Magiczne()));
		} else {
			postac.setUmiejetnosci_Magiczne(MetodyIOdnosniki.Blogoslawienstwo(podstawa.getUmiejetnosci_Magiczne(), podstawaB.getUmiejetnosci_Magiczne(), MetodyIOdnosniki.Blogo(postac.getNadnaturalne())) + MetodyIOdnosniki.wieksze(funkcjan1.getUmiejetnosci_Magiczne(), funkcjan2.getUmiejetnosci_Magiczne()));
		} 
				
		if((!(postac.getNadnaturalne() == null)) && MetodyIOdnosniki.zawiera(postac.getNadnaturalne(), "Piękniś")) {
			postac.setPrezencja(ZdolnoscNadnaturalnaINienaturalna.Pieknis(numerRasy, numerPlci) + MetodyIOdnosniki.wieksze(funkcjan1.getPrezencja(), funkcjan2.getPrezencja()));
		} else if(!(postac.getNienaturalne() == null) && !(ZliczanieBonusuNienaturalnych[1] == 0 || ZliczanieBonusuNienaturalnych[5] == 0 || ZliczanieBonusuNienaturalnych[6] == 0 || ZliczanieBonusuNienaturalnych[7] == 0 || ZliczanieBonusuNienaturalnych[8] == 0 || ZliczanieBonusuNienaturalnych[9] == 0)) {
			int PrN1 = 0; int PrN2 = 0; int PrN3 = 0; int PrN4 = 1; int PrN5 = 0; int PrN6 = 0; int PrN7 = 0;
			for(int i = 0; i < ZliczanieBonusuNienaturalnych[1]; i++) {
				PrN1 += ZdolnoscNadnaturalnaINienaturalna.Kulawy();
			}			
			for(int j = 0; j < ZliczanieBonusuNienaturalnych[5]; j++) {
				PrN2 += ZdolnoscNadnaturalnaINienaturalna.Debonus10();
			}
			for(int k = 0; k < ZliczanieBonusuNienaturalnych[6]; k++) {
				PrN3 += ZdolnoscNadnaturalnaINienaturalna.Debonus10();
			}
			for(int l = 0; l < ZliczanieBonusuNienaturalnych[7]; l++) {
				PrN4 += 1;
			}
			for(int m = 0; m < ZliczanieBonusuNienaturalnych[8]; m++) {
				PrN5 += ZdolnoscNadnaturalnaINienaturalna.Debonus20();
			}
			for(int n = 0; n < ZliczanieBonusuNienaturalnych[9]; n++) {
				PrN6 += ZdolnoscNadnaturalnaINienaturalna.Debonus20();
			}
			for(int o = 0; o < ZliczanieBonusuNienaturalnych[13]; o++) {
				PrN7 += ZdolnoscNadnaturalnaINienaturalna.Debonus20();
			}
			postac.setPrezencja(((int)(MetodyIOdnosniki.Blogoslawienstwo(podstawa.getPrezencja(), podstawaB.getPrezencja(), MetodyIOdnosniki.Blogo(postac.getNadnaturalne())) - (PrN1 + PrN2 +  + PrN4 + PrN5 + PrN6 + PrN7)) / PrN3) + MetodyIOdnosniki.wieksze(funkcjan1.getPrezencja(), funkcjan2.getPrezencja()));
		} else {
			postac.setPrezencja(MetodyIOdnosniki.Blogoslawienstwo(podstawa.getPrezencja(), podstawaB.getPrezencja(), MetodyIOdnosniki.Blogo(postac.getNadnaturalne())) + MetodyIOdnosniki.wieksze(funkcjan1.getPrezencja(), funkcjan2.getPrezencja()));
		}
				
		if((!(postac.getNadnaturalne() == null)) && MetodyIOdnosniki.zawiera(postac.getNadnaturalne(), "Elokwentny")) {
			postac.setCharyzma(ZdolnoscNadnaturalnaINienaturalna.Elokwentny(numerRasy, numerPlci) + MetodyIOdnosniki.wieksze(funkcjan1.getCharyzma(), funkcjan2.getCharyzma()));
		} else if(!(postac.getNienaturalne() == null) && MetodyIOdnosniki.zawiera(postac.getNienaturalne(), "Jąkała")) {
			postac.setCharyzma(MetodyIOdnosniki.Blogoslawienstwo(podstawa.getCharyzma(), podstawaB.getCharyzma(), MetodyIOdnosniki.Blogo(postac.getNadnaturalne())) - ZdolnoscNadnaturalnaINienaturalna.Jakala() + MetodyIOdnosniki.wieksze(funkcjan1.getCharyzma(), funkcjan2.getCharyzma()));
		} else {
			postac.setCharyzma(MetodyIOdnosniki.Blogoslawienstwo(podstawa.getCharyzma(), podstawaB.getCharyzma(), MetodyIOdnosniki.Blogo(postac.getNadnaturalne())) + MetodyIOdnosniki.wieksze(funkcjan1.getCharyzma(), funkcjan2.getCharyzma()));
		}
				
		if((!(postac.getNadnaturalne() == null)) && MetodyIOdnosniki.zawiera(postac.getNadnaturalne(), "Fanatyk")) {
			postac.setWiara(ZdolnoscNadnaturalnaINienaturalna.Fanatyk() + MetodyIOdnosniki.wieksze(funkcjan1.getWiara(), funkcjan2.getWiara()));
		} else {
			postac.setWiara(MetodyIOdnosniki.Blogoslawienstwo(podstawa.getWiara(), podstawaB.getWiara(), MetodyIOdnosniki.Blogo(postac.getNadnaturalne())) + MetodyIOdnosniki.wieksze(funkcjan1.getWiara(), funkcjan2.getWiara()));
		}
			
		if((!(postac.getNadnaturalne() == null)) && MetodyIOdnosniki.zawiera(postac.getNadnaturalne(), "Ulubieniec bogów")) {
			postac.setZauwazenie(ZdolnoscNadnaturalnaINienaturalna.UlubieniecBogow(numerFunkcji) + MetodyIOdnosniki.wieksze(funkcjan1.getZauwazenie(), funkcjan2.getZauwazenie()));
		} else {
			postac.setZauwazenie(MetodyIOdnosniki.Blogoslawienstwo(podstawa.getZauwazenie(), podstawaB.getZauwazenie(), MetodyIOdnosniki.Blogo(postac.getNadnaturalne())) + MetodyIOdnosniki.wieksze(funkcjan1.getZauwazenie(), funkcjan2.getZauwazenie()));
		}	
		
		if((!(postac.getNadnaturalne() == null)) && MetodyIOdnosniki.zawiera(postac.getNadnaturalne(), "Odporny na Iluzje")) {
			postac.setOdpornosc_na_Iluzje(podstawa.getOdpornosc_na_Iluzje() + ZdolnoscNadnaturalnaINienaturalna.Bonus() + MetodyIOdnosniki.wieksze(funkcjan1.getOdpornosc_na_Iluzje(), funkcjan2.getOdpornosc_na_Iluzje()));
		} else {
			postac.setOdpornosc_na_Iluzje(podstawa.getOdpornosc_na_Iluzje() + MetodyIOdnosniki.wieksze(funkcjan1.getOdpornosc_na_Iluzje(), funkcjan2.getOdpornosc_na_Iluzje()));
		}
			
		if((!(postac.getNadnaturalne() == null)) && MetodyIOdnosniki.zawiera(postac.getNadnaturalne(), "Odporny na Sugestie")) {
			postac.setOdpornosc_na_Sugestie(podstawa.getOdpornosc_na_Sugestie() + ZdolnoscNadnaturalnaINienaturalna.Bonus() + MetodyIOdnosniki.wieksze(funkcjan1.getOdpornosc_na_Sugestie(), funkcjan2.getOdpornosc_na_Sugestie()));
		} else {
			postac.setOdpornosc_na_Sugestie(podstawa.getOdpornosc_na_Sugestie() + MetodyIOdnosniki.wieksze(funkcjan1.getOdpornosc_na_Sugestie(), funkcjan2.getOdpornosc_na_Sugestie()));
		}
				
		if((!(postac.getNadnaturalne() == null)) && MetodyIOdnosniki.zawiera(postac.getNadnaturalne(), "Odporny na Zaklęcia")) {
			postac.setOdpornosc_na_Zaklecia(podstawa.getOdpornosc_na_Zaklecia() + ZdolnoscNadnaturalnaINienaturalna.Bonus() + MetodyIOdnosniki.wieksze(funkcjan1.getOdpornosc_na_Zaklecia(), funkcjan2.getOdpornosc_na_Zaklecia()));
		} else {
			postac.setOdpornosc_na_Zaklecia(podstawa.getOdpornosc_na_Zaklecia() + MetodyIOdnosniki.wieksze(funkcjan1.getOdpornosc_na_Zaklecia(), funkcjan2.getOdpornosc_na_Zaklecia()));
		}
				
		if((!(postac.getNadnaturalne() == null)) && MetodyIOdnosniki.zawiera(postac.getNadnaturalne(), "Odporny na Szok")) {
			postac.setOdpornosc_na_Szok(podstawa.getOdpornosc_na_Szok() + ZdolnoscNadnaturalnaINienaturalna.Bonus() + MetodyIOdnosniki.wieksze(funkcjan1.getOdpornosc_na_Szok(), funkcjan2.getOdpornosc_na_Szok()));
		} else {
			postac.setOdpornosc_na_Szok(podstawa.getOdpornosc_na_Szok() + MetodyIOdnosniki.wieksze(funkcjan1.getOdpornosc_na_Szok(), funkcjan2.getOdpornosc_na_Szok()));
		}
				
		if((!(postac.getNadnaturalne() == null)) && MetodyIOdnosniki.zawiera(postac.getNadnaturalne(), "Odporny na Energie")) {
			postac.setOdpornosc_na_Energie(podstawa.getOdpornosc_na_Energie() + ZdolnoscNadnaturalnaINienaturalna.Bonus() + MetodyIOdnosniki.wieksze(funkcjan1.getOdpornosc_na_Energie(), funkcjan2.getOdpornosc_na_Energie()));
		} else {
			postac.setOdpornosc_na_Energie(podstawa.getOdpornosc_na_Energie() + MetodyIOdnosniki.wieksze(funkcjan1.getOdpornosc_na_Energie(), funkcjan2.getOdpornosc_na_Energie()));
		}
				
		if(!(postac.getNadnaturalne() == null) && !(ZliczanieBonusuNadnaturalnych[2] == 0 || ZliczanieBonusuNadnaturalnych[3] == 0)){
			int OT1 = 0; int OT2 = 0;
			for(int i = 0; i < ZliczanieBonusuNienaturalnych[11]; i++) {
				OT1 = ZdolnoscNadnaturalnaINienaturalna.Bonus();
			}
			for(int j = 0; j < ZliczanieBonusuNienaturalnych[12]; j++) {
				OT2 = ZdolnoscNadnaturalnaINienaturalna.Bonus();
			}
			postac.setOdpornosc_na_Trucizny(podstawa.getOdpornosc_na_Trucizny() + OT1 + OT2 + MetodyIOdnosniki.wieksze(funkcjan1.getOdpornosc_na_Trucizny(), funkcjan2.getOdpornosc_na_Trucizny())); 
		} else {
			postac.setOdpornosc_na_Trucizny(podstawa.getOdpornosc_na_Trucizny() + MetodyIOdnosniki.wieksze(funkcjan1.getOdpornosc_na_Trucizny(), funkcjan2.getOdpornosc_na_Trucizny()));
		}
				
		if((!(postac.getNadnaturalne() == null)) && MetodyIOdnosniki.zawiera(postac.getNadnaturalne(), "Odporny na Gazy")) {
			postac.setOdpornosc_na_Gazy(podstawa.getOdpornosc_na_Gazy() + ZdolnoscNadnaturalnaINienaturalna.Bonus() + MetodyIOdnosniki.wieksze(funkcjan1.getOdpornosc_na_Gazy(), funkcjan2.getOdpornosc_na_Gazy()));
		} else {
			postac.setOdpornosc_na_Gazy(podstawa.getOdpornosc_na_Gazy() + MetodyIOdnosniki.wieksze(funkcjan1.getOdpornosc_na_Gazy(), funkcjan2.getOdpornosc_na_Gazy()));
		}
				
		if((!(postac.getNadnaturalne() == null)) && MetodyIOdnosniki.zawiera(postac.getNadnaturalne(), "Odporny na Temperature")) {
			postac.setOdpornosc_na_Temperature(podstawa.getOdpornosc_na_Temperature() + ZdolnoscNadnaturalnaINienaturalna.Bonus() + MetodyIOdnosniki.wieksze(funkcjan1.getOdpornosc_na_Temperature(), funkcjan2.getOdpornosc_na_Temperature()));
		} else {
			postac.setOdpornosc_na_Temperature(podstawa.getOdpornosc_na_Temperature() + MetodyIOdnosniki.wieksze(funkcjan1.getOdpornosc_na_Temperature(), funkcjan2.getOdpornosc_na_Temperature()));
		}
				
		if((!(postac.getNadnaturalne() == null)) && MetodyIOdnosniki.zawiera(postac.getNadnaturalne(), "Odporny na Elektryczność")) {
			postac.setOdpornosc_na_Elektrycznosc(podstawa.getOdpornosc_na_Elektrycznosc() + ZdolnoscNadnaturalnaINienaturalna.Bonus() + MetodyIOdnosniki.wieksze(funkcjan1.getOdpornosc_na_Elektrycznosc(), funkcjan2.getOdpornosc_na_Elektrycznosc()));
		} else {
			postac.setOdpornosc_na_Elektrycznosc(podstawa.getOdpornosc_na_Elektrycznosc() + MetodyIOdnosniki.wieksze(funkcjan1.getOdpornosc_na_Elektrycznosc(), funkcjan2.getOdpornosc_na_Elektrycznosc()));
		}
				
		if((!(postac.getNadnaturalne() == null)) && MetodyIOdnosniki.zawiera(postac.getNadnaturalne(), "Odporny na Polimorfie")) {
			postac.setOdpornosc_na_Polimorfie(podstawa.getOdpornosc_na_Polimorfie() + ZdolnoscNadnaturalnaINienaturalna.Bonus() + MetodyIOdnosniki.wieksze(funkcjan1.getOdpornosc_na_Polimorfie(), funkcjan2.getOdpornosc_na_Polimorfie()));
		} else {
			postac.setOdpornosc_na_Polimorfie(podstawa.getOdpornosc_na_Polimorfie() + MetodyIOdnosniki.wieksze(funkcjan1.getOdpornosc_na_Polimorfie(), funkcjan2.getOdpornosc_na_Polimorfie()));
		}
					
		ileBieglosci = MetodyIOdnosniki.wieksze(funkcjan1.getIlosc_Bieglosci(), funkcjan2.getIlosc_Bieglosci());
		minBieglosc = MetodyIOdnosniki.wieksze(funkcjan1.getMinimalna_Bieglosc(), funkcjan2.getMinimalna_Bieglosc());
		funkcjaBieglosc = MetodyIOdnosniki.ktoraFunkcja(funkcjan1.getIlosc_Bieglosci(), funkcjan2.getIlosc_Bieglosci(), funkcje[0], funkcje[1]);
		postac.setBronie(MetodyIOdnosniki.LosowanieBroni(ileBieglosci, rasa, funkcjaBieglosc));
		
		
		
		postac.setBieglosc(MetodyIOdnosniki.LosowanieBieglosci(ileBieglosci, minBieglosc));
		if(!(postac.getNadnaturalne() == null) && MetodyIOdnosniki.zawiera(postac.getNadnaturalne(), "Fechmistrz")) {
			postac.setBieglosc(MetodyIOdnosniki.testFechmistrz(postac.getBronie(), postac.getBieglosc()));
		}
			
		if(!(postac.getZawod() == null)){
			postac.setWiek(postac.getWiek() + MetodyIOdnosniki.wiekZaZawody(postac.getZawod()) + MetodyIOdnosniki.wiekZZawodow(postac.getZawod()));
			
			int Sf1 = 0; int Sf2 = 0;
			for(int i = 0; i < ZliczanieBonusuZawodow[0]; i++) {
				Sf1 += LosowanieZawodow.bonusZ20Plus();
			}
			for(int j = 0; j < ZliczanieBonusuZawodow[1]; j++) {
				Sf2 += LosowanieZawodow.bonusZ10Plus();
			}
			postac.setSila_Fizyczna(postac.getSila_Fizyczna() + Sf1 + Sf2);
			
				
			int Zr1 = 0; int Zr2 = 0; int Zr3 = 0;
			for(int i = 0; i < ZliczanieBonusuZawodow[2]; i++) {
				Zr1 += LosowanieZawodow.bonusZ5();
			}
			for(int j = 0; j < ZliczanieBonusuZawodow[3]; j++) {
				Zr2 += LosowanieZawodow.bonusZ10();
			}
			for(int k = 0; k < ZliczanieBonusuZawodow[14]; k++) {
				Zr3 += LosowanieZawodow.bonusZ10();
			}
			postac.setZrecznosc(postac.getZrecznosc() + Zr1 + Zr2 + Zr3);
			
			int Iq1 = 0; int Iq2 = 0;
			for(int i = 0; i < ZliczanieBonusuZawodow[4]; i++) {
				Iq1 += LosowanieZawodow.bonusZ10();
			}
			for(int j = 0; j < ZliczanieBonusuZawodow[14]; j++) {
				Iq2 += LosowanieZawodow.bonusZ10();
			}
			postac.setInteligencja(postac.getInteligencja() + Iq1 + Iq2);
			
			int Ma1 = 0; int Ma2 = 0; int Ma3 = 0; int Ma4 = 0; int Ma5 = 0; int Ma6 = 0;
			for(int i = 0; i < ZliczanieBonusuZawodow[5]; i++) {
				Ma1 += LosowanieZawodow.bonusZ3();
			}
			for(int j = 0; j < ZliczanieBonusuZawodow[6]; j++) {
				Ma2 += LosowanieZawodow.bonusZ2();
			}
			for(int k = 0; k < ZliczanieBonusuZawodow[7]; k++) {
				Ma3 += LosowanieZawodow.bonusZ5();
			}
			for(int l = 0; l < ZliczanieBonusuZawodow[8]; l++) {
				Ma4 += LosowanieZawodow.bonusZ20();
			}
			for(int m = 0; m < ZliczanieBonusuZawodow[4]; m++) {
				Ma5 += LosowanieZawodow.bonusZ20();
			}
			for(int n = 0; n < ZliczanieBonusuZawodow[14]; n++) {
				Ma6 += LosowanieZawodow.bonusZ10();
			}
			postac.setMadrosc(postac.getMadrosc() + Ma1 + Ma2 + Ma3 + Ma4 + Ma5 + Ma6);
			
			int Pr1 = 0; int Pr2 = 0; int Pr3 = 0;
			for(int i = 0; i < ZliczanieBonusuZawodow[9]; i++) {
				Pr1 += LosowanieZawodow.bonusZ5();
			}
			for(int j = 0; j < ZliczanieBonusuZawodow[10]; j++) {
				Pr2 += LosowanieZawodow.bonusZ10();
			}
			for(int k = 0; k < ZliczanieBonusuZawodow[11]; k++) {
				Pr3 += LosowanieZawodow.bonusZ20();
			}
			postac.setPrezencja(postac.getPrezencja() + Pr1 + Pr2 + Pr3);
			
			int Ch1 = 0; int Ch2 = 0;
			for(int i = 0; i < ZliczanieBonusuZawodow[12]; i++) {
				Ch1 += LosowanieZawodow.bonusZ10();
			}
			for(int j = 0; j < ZliczanieBonusuZawodow[13]; j++) {
				Ch2 += LosowanieZawodow.bonusZ10Plus();
			}
			postac.setCharyzma(postac.getCharyzma() + Ch1 + Ch2);
		}
		
		postac.setBazowa_odpornosc_Psychiczno_Fizyczna(podstawa.getBazowa_odpornosc_Psychiczno_Fizyczna() + MetodyIOdnosniki.bazowaPF(postac.getInteligencja(), postac.getMadrosc(), postac.getZywotnosc()));	
		postac.setBazowa_odpornosc_Fizyczna(podstawa.getBazowa_odpornosc_Fizyczna() + MetodyIOdnosniki.bazowaF(postac.getZywotnosc(), postac.getSila_Fizyczna()));

		dodatekBieglosc = MetodyIOdnosniki.wieksze(funkcjan1.getDodatek_do_Bieglosci(), funkcjan2.getDodatek_do_Bieglosci());
		postac.setBieglosc(MetodyIOdnosniki.DodatkiBieglosci(postac.getBronie(), postac.getBieglosc(), dodatekBieglosc, numerRasy));
		if(!(postac.getZawod() == null)) {
			postac.setBieglosc(MetodyIOdnosniki.DodatekZawod(postac.getBronie(), postac.getBieglosc(), postac.getZawod().toArray(new String[postac.getZawod().size()])));
		}
			
		for(int i = 0; i < poziom; i++) {
			if(!(postac.getNadnaturalne() == null) && MetodyIOdnosniki.zawiera(postac.getNadnaturalne(), "Twardziel")){
				postac.setZywotnosc(postac.getZywotnosc() + (MetodyIOdnosniki.rozwojPostaci(rozwoj1.getZywotnosc(), rozwoj2.getZywotnosc(), poziom, poziom2) * MetodyIOdnosniki.superio(postac.getZywotnosc()) * 2));
			} else {
				postac.setZywotnosc(postac.getZywotnosc() + MetodyIOdnosniki.rozwojPostaci(rozwoj1.getZywotnosc(), rozwoj2.getZywotnosc(), poziom, poziom2) * MetodyIOdnosniki.superio(postac.getZywotnosc()));
			}
		
			postac.setSila_Fizyczna(postac.getSila_Fizyczna() + MetodyIOdnosniki.rozwojPostaci(rozwoj1.getSila_Fizyczna(), rozwoj2.getSila_Fizyczna(), poziom, poziom2) * MetodyIOdnosniki.superio(postac.getSila_Fizyczna()));
			postac.setZrecznosc(postac.getZrecznosc() + MetodyIOdnosniki.rozwojPostaci(rozwoj1.getZrecznosc(), rozwoj2.getZrecznosc(), poziom, poziom2));
			postac.setSzybkosc(postac.getSzybkosc() + MetodyIOdnosniki.rozwojPostaci(rozwoj1.getSzybkosc(), rozwoj2.getSzybkosc(), poziom, poziom2));
			
			if(!(postac.getNienaturalne() == null) && MetodyIOdnosniki.zawiera(postac.getNienaturalne(), "Debil")) {
				postac.setInteligencja(postac.getInteligencja() + MetodyIOdnosniki.rozwojPostaci(rozwoj1.getInteligencja(), rozwoj2.getInteligencja(), poziom, poziom2));
					if(postac.getInteligencja() > 30) {
						postac.setInteligencja(30);
				}
			} else {
				postac.setInteligencja(postac.getInteligencja() + MetodyIOdnosniki.rozwojPostaci(rozwoj1.getInteligencja(), rozwoj2.getInteligencja(), poziom, poziom2));
			}
					
			postac.setMadrosc(postac.getMadrosc() + MetodyIOdnosniki.rozwojPostaci(rozwoj1.getMadrosc(), rozwoj2.getMadrosc(), poziom, poziom2));
			postac.setUmiejetnosci_Magiczne(postac.getUmiejetnosci_Magiczne() + MetodyIOdnosniki.rozwojPostaci(rozwoj1.getUmiejetnosci_Magiczne(), rozwoj2.getUmiejetnosci_Magiczne(), poziom, poziom2));

			if(!(postac.getNienaturalne() == null) && MetodyIOdnosniki.zawiera(postac.getNienaturalne(), "Szpetny")) { 
				postac.setPrezencja(postac.getPrezencja() + ((int)(MetodyIOdnosniki.rozwojPostaci(rozwoj1.getPrezencja(), rozwoj2.getPrezencja(), poziom, poziom2) / 2)));
			} else {
				postac.setPrezencja(postac.getPrezencja() + MetodyIOdnosniki.rozwojPostaci(rozwoj1.getPrezencja(), rozwoj2.getPrezencja(), poziom, poziom2));
			}
			
			postac.setCharyzma(postac.getCharyzma() + MetodyIOdnosniki.rozwojPostaci(rozwoj1.getCharyzma(), rozwoj2.getCharyzma(), poziom, poziom2));
			postac.setWiara(postac.getWiara() + MetodyIOdnosniki.rozwojPostaci(rozwoj1.getWiara(), rozwoj2.getWiara(), poziom, poziom2));
			postac.setZauwazenie(postac.getZauwazenie() + MetodyIOdnosniki.rozwojPostaci(rozwoj1.getZauwazenie(), rozwoj2.getZauwazenie(), poziom, poziom2));
			postac.setBazowa_odpornosc_Psychiczno_Fizyczna(postac.getBazowa_odpornosc_Psychiczno_Fizyczna() + MetodyIOdnosniki.rozwojPostaci(rozwoj1.getBazowa_odpornosc_Psychiczno_Fizyczna(), rozwoj2.getBazowa_odpornosc_Psychiczno_Fizyczna(), poziom, poziom2));
			postac.setBazowa_odpornosc_Fizyczna(postac.getBazowa_odpornosc_Fizyczna() + MetodyIOdnosniki.rozwojPostaci(rozwoj1.getBazowa_odpornosc_Fizyczna(), rozwoj2.getBazowa_odpornosc_Fizyczna(), poziom, poziom2));
			postac.setBieglosc(MetodyIOdnosniki.rozwojBieglosci(postac.getBieglosc(), MetodyIOdnosniki.rozwojPostaci(rozwoj1.getDodatek_do_Bieglosci(), rozwoj2.getDodatek_do_Bieglosci(), poziom, poziom2)));
		}
		
		postac.setBazowa_odpornosc_Psychiczno_Fizyczna(postac.getBazowa_odpornosc_Psychiczno_Fizyczna());	
		postac.setOdpornosc_na_Iluzje(postac.getOdpornosc_na_Iluzje() + postac.getBazowa_odpornosc_Psychiczno_Fizyczna());
		postac.setOdpornosc_na_Sugestie(postac.getOdpornosc_na_Sugestie() + postac.getBazowa_odpornosc_Psychiczno_Fizyczna());
		postac.setOdpornosc_na_Zaklecia(postac.getOdpornosc_na_Zaklecia() + postac.getBazowa_odpornosc_Psychiczno_Fizyczna());
		postac.setOdpornosc_na_Szok(postac.getOdpornosc_na_Szok() + postac.getBazowa_odpornosc_Psychiczno_Fizyczna());
		postac.setOdpornosc_na_Energie(postac.getOdpornosc_na_Energie() + postac.getBazowa_odpornosc_Psychiczno_Fizyczna());
		postac.setBazowa_odpornosc_Fizyczna(postac.getBazowa_odpornosc_Fizyczna());
		postac.setOdpornosc_na_Trucizny(postac.getOdpornosc_na_Trucizny() + postac.getBazowa_odpornosc_Fizyczna());
		postac.setOdpornosc_na_Gazy(postac.getOdpornosc_na_Gazy() + postac.getBazowa_odpornosc_Fizyczna());
		postac.setOdpornosc_na_Temperature(postac.getOdpornosc_na_Temperature() + postac.getBazowa_odpornosc_Fizyczna());
		postac.setOdpornosc_na_Elektrycznosc(postac.getOdpornosc_na_Elektrycznosc() + postac.getBazowa_odpornosc_Fizyczna());
		postac.setOdpornosc_na_Polimorfie(postac.getOdpornosc_na_Polimorfie() + postac.getBazowa_odpornosc_Fizyczna());
		postac.setUmiejetnosc_wladania_bronia(MetodyIOdnosniki.razem(postac.getBronie(), postac.getBieglosc(), ileBieglosci));
		//System.out.println(Arrays.toString(MetodyIOdnosniki.SprawdzTo(postac.getZawod().toArray(new String[postac.getZawod().size()]))));
		
		Rasa = postac.getRasa();
		Plec = postac.getPlec();
		Profesje = postac.getFunkcja();
		ProfesjaG = Profesje[0];
		PoziomPG = String.valueOf(poziom);
		ProfesjaD = Profesje[1];
		PoziomPD = String.valueOf(poziom2);
		Nadnaturalne = MetodyIOdnosniki.SprawdzTo(postac.getNadnaturalne());
		Nienaturalne = MetodyIOdnosniki.SprawdzTo(postac.getNienaturalne());
		Wzrost = String.valueOf(postac.getWzrost());
		Waga = String.valueOf(postac.getWaga());
		Wiek = String.valueOf(postac.getWiek());
		StatusUrodzenia = postac.getStatus_urodzenia();
		Zywotnosc = String.valueOf(postac.getZywotnosc());
		SilaFizyczna = String.valueOf(postac.getSila_Fizyczna());
		Zrecznosc = String.valueOf(postac.getZrecznosc());
		Szybkosc = String.valueOf(postac.getSzybkosc());
		Inteligencja = String.valueOf(postac.getInteligencja());
		Madrosc = String.valueOf(postac.getMadrosc());
		UmiejetnosciMagiczne = String.valueOf(postac.getUmiejetnosci_Magiczne());
		Prezencja = String.valueOf(postac.getPrezencja());
		Charyzma = String.valueOf(postac.getCharyzma());
		Wiara = String.valueOf(postac.getWiara());
		Zauwazenie = String.valueOf(postac.getZauwazenie());
		BazowaPF = String.valueOf(postac.getBazowa_odpornosc_Psychiczno_Fizyczna());
		OIlu = String.valueOf(postac.getOdpornosc_na_Iluzje());
		OSug = String.valueOf(postac.getOdpornosc_na_Sugestie());
		OZak = String.valueOf(postac.getOdpornosc_na_Zaklecia());
		OSzo = String.valueOf(postac.getOdpornosc_na_Szok());
		OEne = String.valueOf(postac.getOdpornosc_na_Energie());
		BazowaF = String.valueOf(postac.getBazowa_odpornosc_Fizyczna());
		OTru = String.valueOf(postac.getOdpornosc_na_Trucizny());
		OGaz = String.valueOf(postac.getOdpornosc_na_Gazy());
		OTem = String.valueOf(postac.getOdpornosc_na_Temperature());
		OEle = String.valueOf(postac.getOdpornosc_na_Elektrycznosc());
		OPol = String.valueOf(postac.getOdpornosc_na_Polimorfie());
		Zawody = MetodyIOdnosniki.SprawdzTo(LosowanieZawodow.nowaLista(postac.getZawod()));
		UWD = MetodyIOdnosniki.SprawdzTo(postac.getUmiejetnosc_wladania_bronia());
		
		/**
		 * Uruchomienie Wizualizacji.
		 */
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Wizualizacja window = new Wizualizacja();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
