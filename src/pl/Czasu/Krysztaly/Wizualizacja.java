package pl.Czasu.Krysztaly;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Wizualizacja {

	protected JFrame frame;
	private JPanel panel;
	private JTextField textFieldNadnaturalne, textFieldNienaturalne, textFieldWzrost, textFieldWaga, textFieldWiek, textFieldStatusUrodzenia, textFieldZywotnosc, 
		textFieldSilaFizyczna, textFieldZrecznosc, textFieldSzybkosc, textFieldInteligencja, textFieldMadrosc, textFieldUmiejetnosciMagiczne, textFieldPrezencja,
		textFieldCharyzma, textFieldWiara, textFieldZauwazenie, textFieldBazowaOdpornoscPsychicznoFizyczna, textFieldOdpornoscNaIluzje, textFieldOdpornoscNaSugestie,
		textFieldOdpornoscNaZaklecia, textFieldOdpornoscNaSzok, textFieldOdpornoscNaEnergie, textFieldBazowaOdpornoscFizyczna, textFieldOdpornoscNaTrucizny, 
		textFieldOdpornoscNaGazy, textFieldOdpornoscNaTemperature, textFieldOdornoscNaElektrycznosc, textFieldOdpornoscNaPolimorfie, textFieldZawody, 
		textFieldUmiejetnoscWladaniaBronia, textFieldRasa, textFieldPlec, textFieldProfesjaGlowna, textFieldProfesjaDrugorzedna, textFieldPoziomProfesjiGlownej,
		textFieldPoziomProfesjiDrugorzednej;
	
	/**
	 * Create the application.
	 */
	public Wizualizacja() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1100, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		panel = new JPanel();
		panel.setBounds(0, 0, 1084, 10);
		frame.getContentPane().add(panel);
		
		JLabel lblRasa = new JLabel("Rasa");
		lblRasa.setBounds(10, 10, 34, 14);
		frame.getContentPane().add(lblRasa);
		
		textFieldRasa = new JTextField();
		textFieldRasa.setText(GeneratorPostaci.Rasa);
		textFieldRasa.setBounds(42, 10, 86, 20);
		frame.getContentPane().add(textFieldRasa);
		textFieldRasa.setColumns(10);
		
		JLabel lblPlec = new JLabel("Płeć");
		lblPlec.setBounds(150, 10, 27, 14);
		frame.getContentPane().add(lblPlec);
		
		textFieldPlec = new JTextField();
		textFieldPlec.setText(GeneratorPostaci.Plec);
		textFieldPlec.setBounds(186, 10, 86, 20);
		frame.getContentPane().add(textFieldPlec);
		textFieldPlec.setColumns(10);
		
		JLabel lblProfesjaGlowna = new JLabel("Profesja Główna");
		lblProfesjaGlowna.setBounds(291, 10, 103, 14);
		frame.getContentPane().add(lblProfesjaGlowna);
		
		textFieldProfesjaGlowna = new JTextField();
		textFieldProfesjaGlowna.setText(GeneratorPostaci.ProfesjaG);
		textFieldProfesjaGlowna.setBounds(404, 10, 86, 20);
		frame.getContentPane().add(textFieldProfesjaGlowna);
		textFieldProfesjaGlowna.setColumns(10);
	
		JLabel lblPoziomProfesjiGlownej = new JLabel("Poziom Profesji Głównej");
		lblPoziomProfesjiGlownej.setBounds(594, 10, 140, 14);
		frame.getContentPane().add(lblPoziomProfesjiGlownej);
		
		textFieldPoziomProfesjiGlownej = new JTextField();
		textFieldPoziomProfesjiGlownej.setText(GeneratorPostaci.PoziomPG);
		textFieldPoziomProfesjiGlownej.setBounds(744, 10, 86, 20);
		frame.getContentPane().add(textFieldPoziomProfesjiGlownej);
		textFieldPoziomProfesjiGlownej.setColumns(10);
		
		JLabel lblProfesjaDrugorzedna = new JLabel("Profesja Drugorzędna");
		lblProfesjaDrugorzedna.setBounds(269, 53, 125, 14);
		frame.getContentPane().add(lblProfesjaDrugorzedna);
		
		textFieldProfesjaDrugorzedna = new JTextField();
		textFieldProfesjaDrugorzedna.setText(GeneratorPostaci.ProfesjaD);
		textFieldProfesjaDrugorzedna.setBounds(404, 50, 86, 20);
		frame.getContentPane().add(textFieldProfesjaDrugorzedna);
		textFieldProfesjaDrugorzedna.setColumns(10);
		
		JLabel lblPoziomProfesjiDrugorzednej = new JLabel("Poziom Profesji Drugorzędnej");
		lblPoziomProfesjiDrugorzednej.setBounds(559, 50, 175, 14);
		frame.getContentPane().add(lblPoziomProfesjiDrugorzednej);
		
		textFieldPoziomProfesjiDrugorzednej = new JTextField();
		textFieldPoziomProfesjiDrugorzednej.setText(GeneratorPostaci.PoziomPD);
		textFieldPoziomProfesjiDrugorzednej.setBounds(744, 50, 86, 20);
		frame.getContentPane().add(textFieldPoziomProfesjiDrugorzednej);
		textFieldPoziomProfesjiDrugorzednej.setColumns(10);
		
		JLabel lblNadnaturalne = new JLabel("Nadnaturalne");
		lblNadnaturalne.setBounds(10, 90, 65, 14);
		frame.getContentPane().add(lblNadnaturalne);
		
		textFieldNadnaturalne = new JTextField();
		textFieldNadnaturalne.setText(MetodyIOdnosniki.wypisz(GeneratorPostaci.Nadnaturalne));
		textFieldNadnaturalne.setBounds(100, 90, 449, 20);
		frame.getContentPane().add(textFieldNadnaturalne);
		textFieldNadnaturalne.setColumns(10);
		
		JLabel lblNienaturalne = new JLabel("Nienaturalne");
		lblNienaturalne.setBounds(10, 120, 61, 14);
		frame.getContentPane().add(lblNienaturalne);
		
		textFieldNienaturalne = new JTextField();
		textFieldNienaturalne.setText(MetodyIOdnosniki.wypisz(GeneratorPostaci.Nienaturalne));
		textFieldNienaturalne.setBounds(100, 120, 538, 20);
		textFieldNienaturalne.getText();
		frame.getContentPane().add(textFieldNienaturalne);
		textFieldNienaturalne.setColumns(10);
		
		JLabel lblWzrost = new JLabel("Wzrost");
		lblWzrost.setBounds(10, 160, 48, 14);
		frame.getContentPane().add(lblWzrost);
		
		textFieldWzrost = new JTextField();
		textFieldWzrost.setText(GeneratorPostaci.Wzrost);
		textFieldWzrost.setBounds(68, 160, 24, 20);
		frame.getContentPane().add(textFieldWzrost);
		textFieldWzrost.setColumns(10);
		
		JLabel lblWaga = new JLabel("Waga");
		lblWaga.setBounds(137, 160, 40, 14);
		frame.getContentPane().add(lblWaga);
		
		textFieldWaga = new JTextField();
		textFieldWaga.setText(GeneratorPostaci.Waga);
		textFieldWaga.setBounds(195, 160, 24, 20);
		frame.getContentPane().add(textFieldWaga);
		textFieldWaga.setColumns(10);
		
		JLabel lblWiek = new JLabel("Wiek");
		lblWiek.setBounds(269, 160, 39, 14);
		frame.getContentPane().add(lblWiek);
		
		textFieldWiek = new JTextField();
		textFieldWiek.setText(GeneratorPostaci.Wiek);
		textFieldWiek.setBounds(314, 160, 24, 20);
		frame.getContentPane().add(textFieldWiek);
		textFieldWiek.setColumns(10);
		
		JLabel lblStatusUrodzenia = new JLabel("Status urodzenia");
		lblStatusUrodzenia.setBounds(353, 160, 105, 14);
		frame.getContentPane().add(lblStatusUrodzenia);
		
		textFieldStatusUrodzenia = new JTextField();
		textFieldStatusUrodzenia.setText(GeneratorPostaci.StatusUrodzenia);
		textFieldStatusUrodzenia.setBounds(463, 160, 282, 20);
		frame.getContentPane().add(textFieldStatusUrodzenia);
		textFieldStatusUrodzenia.setColumns(10);
		
		JLabel lblŻywotnosc = new JLabel("Żywotność");
		lblŻywotnosc.setBounds(0, 190, 62, 14);
		frame.getContentPane().add(lblŻywotnosc);
		
		textFieldZywotnosc = new JTextField();
		textFieldZywotnosc.setText(GeneratorPostaci.Zywotnosc);
		textFieldZywotnosc.setBounds(68, 190, 24, 20);
		frame.getContentPane().add(textFieldZywotnosc);
		textFieldZywotnosc.setColumns(10);
		
		JLabel lblSilaFizyczna = new JLabel("Siła Fizyczna");
		lblSilaFizyczna.setBounds(100, 190, 77, 14);
		frame.getContentPane().add(lblSilaFizyczna);
		
		textFieldSilaFizyczna = new JTextField();
		textFieldSilaFizyczna.setText(GeneratorPostaci.SilaFizyczna);
		textFieldSilaFizyczna.setBounds(195, 190, 24, 20);
		frame.getContentPane().add(textFieldSilaFizyczna);
		textFieldSilaFizyczna.setColumns(10);
		
		JLabel label = new JLabel("Zręczność");
		label.setBounds(237, 190, 71, 14);
		frame.getContentPane().add(label);
		
		textFieldZrecznosc = new JTextField();
		textFieldZrecznosc.setText(GeneratorPostaci.Zrecznosc);
		textFieldZrecznosc.setBounds(314, 190, 24, 20);
		frame.getContentPane().add(textFieldZrecznosc);
		textFieldZrecznosc.setColumns(10);
		
		JLabel lblSzybkosc = new JLabel("Szybkość");
		lblSzybkosc.setBounds(357, 190, 71, 14);
		frame.getContentPane().add(lblSzybkosc);
		
		textFieldSzybkosc = new JTextField();
		textFieldSzybkosc.setText(GeneratorPostaci.Szybkosc);
		textFieldSzybkosc.setBounds(434, 190, 24, 20);
		frame.getContentPane().add(textFieldSzybkosc);
		textFieldSzybkosc.setColumns(10);
		
		JLabel lblInteligencja = new JLabel("Inteligencja");
		lblInteligencja.setBounds(10, 220, 56, 14);
		frame.getContentPane().add(lblInteligencja);
		
		textFieldInteligencja = new JTextField();
		textFieldInteligencja.setText(GeneratorPostaci.Inteligencja);
		textFieldInteligencja.setBounds(68, 220, 24, 20);
		frame.getContentPane().add(textFieldInteligencja);
		textFieldInteligencja.setColumns(10);
		
		JLabel lblMadrosc = new JLabel("Mądrość");
		lblMadrosc.setBounds(137, 220, 40, 14);
		frame.getContentPane().add(lblMadrosc);
		
		textFieldMadrosc = new JTextField();
		textFieldMadrosc.setText(GeneratorPostaci.Madrosc);
		textFieldMadrosc.setBounds(195, 220, 24, 20);
		frame.getContentPane().add(textFieldMadrosc);
		textFieldMadrosc.setColumns(10);
		
		JLabel lblUmiejetnosciMagiczne = new JLabel("Umiejętności Magiczne");
		lblUmiejetnosciMagiczne.setBounds(318, 220, 107, 14);
		frame.getContentPane().add(lblUmiejetnosciMagiczne);
		
		textFieldUmiejetnosciMagiczne = new JTextField();
		textFieldUmiejetnosciMagiczne.setText(GeneratorPostaci.UmiejetnosciMagiczne);
		textFieldUmiejetnosciMagiczne.setBounds(434, 220, 24, 20);
		frame.getContentPane().add(textFieldUmiejetnosciMagiczne);
		textFieldUmiejetnosciMagiczne.setColumns(10);
		
		JLabel lblPrezencja = new JLabel("Prezencja");
		lblPrezencja.setBounds(10, 250, 47, 14);
		frame.getContentPane().add(lblPrezencja);
		
		textFieldPrezencja = new JTextField();
		textFieldPrezencja.setText(GeneratorPostaci.Prezencja);
		textFieldPrezencja.setBounds(68, 250, 24, 20);
		frame.getContentPane().add(textFieldPrezencja);
		textFieldPrezencja.setColumns(10);
		
		JLabel lblCharyzma = new JLabel("Charyzma");
		lblCharyzma.setBounds(129, 250, 48, 14);
		frame.getContentPane().add(lblCharyzma);
		
		textFieldCharyzma = new JTextField();
		textFieldCharyzma.setText(GeneratorPostaci.Charyzma);
		textFieldCharyzma.setBounds(195, 250, 24, 20);
		frame.getContentPane().add(textFieldCharyzma);
		textFieldCharyzma.setColumns(10);
		
		JLabel lblWiara = new JLabel("Wiara");
		lblWiara.setBounds(280, 250, 28, 14);
		frame.getContentPane().add(lblWiara);
		
		textFieldWiara = new JTextField();
		textFieldWiara.setText(GeneratorPostaci.Wiara);
		textFieldWiara.setBounds(314, 250, 24, 20);
		frame.getContentPane().add(textFieldWiara);
		textFieldWiara.setColumns(10);
		
		JLabel lblZauwazenie = new JLabel("Zauważenie");
		lblZauwazenie.setBounds(368, 250, 57, 14);
		frame.getContentPane().add(lblZauwazenie);
		
		textFieldZauwazenie = new JTextField();
		textFieldZauwazenie.setText(GeneratorPostaci.Zauwazenie);
		textFieldZauwazenie.setBounds(434, 250, 24, 20);
		frame.getContentPane().add(textFieldZauwazenie);
		textFieldZauwazenie.setColumns(10);
		
		JLabel lblBazowaOdpornoscPsychicznoFizyczna = new JLabel("Bazowa odporność Psychiczno - Fizyczna");
		lblBazowaOdpornoscPsychicznoFizyczna.setBounds(10, 280, 196, 14);
		frame.getContentPane().add(lblBazowaOdpornoscPsychicznoFizyczna);
		
		textFieldBazowaOdpornoscPsychicznoFizyczna = new JTextField();
		textFieldBazowaOdpornoscPsychicznoFizyczna.setText(GeneratorPostaci.BazowaPF);
		textFieldBazowaOdpornoscPsychicznoFizyczna.setBounds(434, 280, 24, 20);
		frame.getContentPane().add(textFieldBazowaOdpornoscPsychicznoFizyczna);
		textFieldBazowaOdpornoscPsychicznoFizyczna.setColumns(10);
		
		JLabel lblOdpornoscNaIluzje = new JLabel("Odporność na Iluzje");
		lblOdpornoscNaIluzje.setBounds(10, 310, 96, 14);
		frame.getContentPane().add(lblOdpornoscNaIluzje);
		
		textFieldOdpornoscNaIluzje = new JTextField();
		textFieldOdpornoscNaIluzje.setText(GeneratorPostaci.OIlu);
		textFieldOdpornoscNaIluzje.setBounds(123, 310, 24, 20);
		frame.getContentPane().add(textFieldOdpornoscNaIluzje);
		textFieldOdpornoscNaIluzje.setColumns(10);
		
		JLabel lblOdpornoscNaSugestie = new JLabel("Odporność na Sugestie");
		lblOdpornoscNaSugestie.setBounds(161, 310, 111, 14);
		frame.getContentPane().add(lblOdpornoscNaSugestie);
		
		textFieldOdpornoscNaSugestie = new JTextField();
		textFieldOdpornoscNaSugestie.setText(GeneratorPostaci.OSug);
		textFieldOdpornoscNaSugestie.setBounds(285, 310, 24, 20);
		frame.getContentPane().add(textFieldOdpornoscNaSugestie);
		textFieldOdpornoscNaSugestie.setColumns(10);
		
		JLabel lblOdpornoscNaZaklecia = new JLabel("Odporność na Zaklęcia");
		lblOdpornoscNaZaklecia.setBounds(317, 310, 108, 14);
		frame.getContentPane().add(lblOdpornoscNaZaklecia);
		
		textFieldOdpornoscNaZaklecia = new JTextField();
		textFieldOdpornoscNaZaklecia.setText(GeneratorPostaci.OZak);
		textFieldOdpornoscNaZaklecia.setBounds(434, 310, 24, 20);
		frame.getContentPane().add(textFieldOdpornoscNaZaklecia);
		textFieldOdpornoscNaZaklecia.setColumns(10);
		
		JLabel lblOdpornoscNaSzok = new JLabel("Odporność na Szok");
		lblOdpornoscNaSzok.setBounds(10, 340, 92, 14);
		frame.getContentPane().add(lblOdpornoscNaSzok);
		
		textFieldOdpornoscNaSzok = new JTextField();
		textFieldOdpornoscNaSzok.setText(GeneratorPostaci.OSzo);
		textFieldOdpornoscNaSzok.setBounds(123, 340, 24, 20);
		frame.getContentPane().add(textFieldOdpornoscNaSzok);
		textFieldOdpornoscNaSzok.setColumns(10);
		
		JLabel lblOdpornoscNaEnergie = new JLabel("Odporność na Energie");
		lblOdpornoscNaEnergie.setBounds(161, 340, 111, 14);
		frame.getContentPane().add(lblOdpornoscNaEnergie);
		
		textFieldOdpornoscNaEnergie = new JTextField();
		textFieldOdpornoscNaEnergie.setText(GeneratorPostaci.OEne);
		textFieldOdpornoscNaEnergie.setBounds(285, 340, 24, 20);
		frame.getContentPane().add(textFieldOdpornoscNaEnergie);
		textFieldOdpornoscNaEnergie.setColumns(10);
		
		JLabel lblBazowaOdpornoscFizyczna = new JLabel("Bazowa odporność Fizyczna");
		lblBazowaOdpornoscFizyczna.setBounds(10, 370, 134, 14);
		frame.getContentPane().add(lblBazowaOdpornoscFizyczna);
		
		textFieldBazowaOdpornoscFizyczna = new JTextField();
		textFieldBazowaOdpornoscFizyczna.setText(GeneratorPostaci.BazowaF);
		textFieldBazowaOdpornoscFizyczna.setBounds(161, 370, 24, 20);
		frame.getContentPane().add(textFieldBazowaOdpornoscFizyczna);
		textFieldBazowaOdpornoscFizyczna.setColumns(10);
		
		JLabel lblOdpornoscNaTrucizny = new JLabel("Odporność na Trucizny");
		lblOdpornoscNaTrucizny.setBounds(10, 400, 110, 14);
		frame.getContentPane().add(lblOdpornoscNaTrucizny);
		
		textFieldOdpornoscNaTrucizny = new JTextField();
		textFieldOdpornoscNaTrucizny.setText(GeneratorPostaci.OTru);
		textFieldOdpornoscNaTrucizny.setBounds(123, 400, 24, 20);
		frame.getContentPane().add(textFieldOdpornoscNaTrucizny);
		textFieldOdpornoscNaTrucizny.setColumns(10);
		
		JLabel lblOdpornoscNaGazy = new JLabel("Odporność na Gazy");
		lblOdpornoscNaGazy.setBounds(161, 400, 94, 14);
		frame.getContentPane().add(lblOdpornoscNaGazy);
		
		textFieldOdpornoscNaGazy = new JTextField();
		textFieldOdpornoscNaGazy.setText(GeneratorPostaci.OGaz);
		textFieldOdpornoscNaGazy.setBounds(285, 400, 24, 20);
		frame.getContentPane().add(textFieldOdpornoscNaGazy);
		textFieldOdpornoscNaGazy.setColumns(10);
		
		JLabel lblOdpornscNaTemperature = new JLabel("Odporność na Temperaturę");
		lblOdpornscNaTemperature.setBounds(314, 400, 132, 14);
		frame.getContentPane().add(lblOdpornscNaTemperature);
		
		textFieldOdpornoscNaTemperature = new JTextField();
		textFieldOdpornoscNaTemperature.setText(GeneratorPostaci.OTem);
		textFieldOdpornoscNaTemperature.setBounds(452, 400, 24, 20);
		frame.getContentPane().add(textFieldOdpornoscNaTemperature);
		textFieldOdpornoscNaTemperature.setColumns(10);
		
		JLabel lblOdpornoscNaElektrycznosc = new JLabel("Odporność na Elektryczność");
		lblOdpornoscNaElektrycznosc.setBounds(10, 430, 135, 14);
		frame.getContentPane().add(lblOdpornoscNaElektrycznosc);
		
		textFieldOdornoscNaElektrycznosc = new JTextField();
		textFieldOdornoscNaElektrycznosc.setText(GeneratorPostaci.OEle);
		textFieldOdornoscNaElektrycznosc.setBounds(161, 430, 24, 20);
		frame.getContentPane().add(textFieldOdornoscNaElektrycznosc);
		textFieldOdornoscNaElektrycznosc.setColumns(10);
		
		JLabel lblOdpornoscNaPolimorfie = new JLabel("Odporność na Polimorfie");
		lblOdpornoscNaPolimorfie.setBounds(191, 430, 116, 14);
		frame.getContentPane().add(lblOdpornoscNaPolimorfie);
		
		textFieldOdpornoscNaPolimorfie = new JTextField();
		textFieldOdpornoscNaPolimorfie.setText(GeneratorPostaci.OPol);
		textFieldOdpornoscNaPolimorfie.setBounds(317, 430, 24, 20);
		frame.getContentPane().add(textFieldOdpornoscNaPolimorfie);
		textFieldOdpornoscNaPolimorfie.setColumns(10);
		
		JLabel lblZawody = new JLabel("Zawody");
		lblZawody.setBounds(10, 460, 38, 14);
		frame.getContentPane().add(lblZawody);
		
		textFieldZawody = new JTextField();
		textFieldZawody.setText(MetodyIOdnosniki.wypisz(GeneratorPostaci.Zawody));
		textFieldZawody.setBounds(74, 460, 475, 20);
		frame.getContentPane().add(textFieldZawody);
		textFieldZawody.setColumns(10);
		
		JLabel lblUmiejetnoscWladaniaBronia = new JLabel("Umiejętność władania bronią");
		lblUmiejetnoscWladaniaBronia.setBounds(10, 490, 137, 14);
		frame.getContentPane().add(lblUmiejetnoscWladaniaBronia);
		
		textFieldUmiejetnoscWladaniaBronia = new JTextField();
		textFieldUmiejetnoscWladaniaBronia.setText(MetodyIOdnosniki.wypisz(GeneratorPostaci.UWD));
		textFieldUmiejetnoscWladaniaBronia.setBounds(161, 490, 660, 20);
		frame.getContentPane().add(textFieldUmiejetnoscWladaniaBronia);
		textFieldUmiejetnoscWladaniaBronia.setColumns(10);			
	}	
}
