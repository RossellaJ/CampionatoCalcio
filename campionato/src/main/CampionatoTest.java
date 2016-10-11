package main;


import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import campionato.Campionato;
import campionato.Giocatore;
import campionato.Partita;
import campionato.ServizioCampionato;
import campionato.Squadra;

public class CampionatoTest {

	public static void main(String[] args)throws ParseException {
		

	
Campionato c = new Campionato("Serie A");
ServizioCampionato s = new ServizioCampionato();
Squadra sq = new Squadra();

//List<Giocatore> fattoRete = new ArrayList<Giocatore>();

List<Giocatore> marcatori = new ArrayList<Giocatore>();
List<Giocatore> espulsi = new ArrayList<Giocatore>();
List<Giocatore> ammoniti = new ArrayList<Giocatore>();

//List<Giocatore> marcatori1 = new ArrayList<Giocatore>();
//List<Giocatore> espulsi1 = new ArrayList<Giocatore>();
//List<Giocatore> ammoniti1 = new ArrayList<Giocatore>();

Giocatore g1 = s.registraGiocatore(c,sq, "A", "A", "Att", "1", 28, 0, 0, 0, 0, "gigufn");
Giocatore g2 = s.registraGiocatore(c,sq, "B", "B", "Att", "2", 28, 0, 0, 0, 0, "hdej");
Giocatore g3 = s.registraGiocatore(c,sq, "C", "C", "Att", "3", 28, 0, 0, 0, 0, "hfgdh");
Giocatore g4 = s.registraGiocatore(c,sq, "D", "D", "Att", "4", 28, 0, 0, 0, 0, "retfs");
Giocatore g5 = s.registraGiocatore(c,sq, "E", "E", "Cent", "5", 28, 0, 0, 0, 0, "yeuvjsv");
Giocatore g6 = s.registraGiocatore(c,sq, "F", "F", "Cent", "6", 28, 0, 0, 0, 0, "hareacv");
Giocatore g7 = s.registraGiocatore(c,sq, "G", "G", "Cent", "7", 28, 0, 0, 0, 0, "kisns");
Giocatore g8 = s.registraGiocatore(c,sq, "H", "H", "Cent", "8", 28, 0, 0, 0, 0, "isksh");
Giocatore g9 = s.registraGiocatore(c,sq, "I", "I", "Dif", "9", 28, 0, 0, 0, 0, "hsib");
Giocatore g10 = s.registraGiocatore(c,sq, "L", "L", "Dif", "10", 28, 0, 0, 0, 0, "haujkk");
Giocatore g11 = s.registraGiocatore(c,sq, "M", "M", "Dif", "11", 28, 0, 0, 0, 0, "gayh");
Giocatore g12 = s.registraGiocatore(c,sq, "N", "N", "Dif", "12", 28, 0, 0, 0, 0, "eewae");
Giocatore g13 = s.registraGiocatore(c,sq, "O", "O", "Dif", "13", 28, 0, 0, 0, 0, "daerrrt");
Giocatore g14 = s.registraGiocatore(c,sq, "P", "P", "Dif", "14", 28, 0, 0, 0, 0, "earggt");
Giocatore g15 = s.registraGiocatore(c,sq, "Q", "Q", "Dif", "15", 28, 0, 0, 0, 0, "earf");
Giocatore g16 = s.registraGiocatore(c,sq, "R", "R", "Dif", "16", 28, 0, 0, 0, 0, "ragtt");
Giocatore g17 = s.registraGiocatore(c,sq, "R", "R", "Dif", "16", 28, 0, 0, 0, 0, "ragtt");

for(Map.Entry<String, Giocatore> m : c.getGiocatori().entrySet()){
	
System.out.println(m.getKey()+"\t\t"+m.getValue().getNome()+" "+m.getValue().getCognome()
+"\t"+m.getValue().getReti()+"\t"+m.getValue().getAmmonizioni()
+"\t"+m.getValue().getEspulsioni());

}

System.out.println(c.getGiocatori().size());
System.out.println();

//2

Squadra sq1 = s.registraSquadra(c, "Juve", 0, 0, 0);
Squadra sq2 = s.registraSquadra(c, "Milan", 0, 0, 0);
//Squadra s3 = s.registraSquadra(c, "Inter", 0, 0, 0);
//Squadra s4 = s.registraSquadra(c, "Torino", 0, 0, 0);


for(Squadra ss : c.getSquadre()){
//	System.out.println("Squadre partetipante: " + s.registraSquadra(c, "Juve", 0, 0, 0));
	System.out.println(ss.getNome());
}
System.out.println();
System.out.println(c.getSquadre().size());



//3

System.out.println(s.assegnaGiocatoreSquadra(c, g1, sq1));
System.out.println(s.assegnaGiocatoreSquadra(c, g2, sq2));
System.out.println(s.assegnaGiocatoreSquadra(c, g3, sq1));
System.out.println(s.assegnaGiocatoreSquadra(c, g4, sq2));
System.out.println(s.assegnaGiocatoreSquadra(c, g5, sq1));
System.out.println(s.assegnaGiocatoreSquadra(c, g6, sq2));
System.out.println(s.assegnaGiocatoreSquadra(c, g7, sq1));
System.out.println(s.assegnaGiocatoreSquadra(c, g8, sq2));
System.out.println(s.assegnaGiocatoreSquadra(c, g9, sq1));
System.out.println(s.assegnaGiocatoreSquadra(c, g10, sq2));
System.out.println(s.assegnaGiocatoreSquadra(c, g11, sq1));
System.out.println(s.assegnaGiocatoreSquadra(c, g12, sq2));
System.out.println(s.assegnaGiocatoreSquadra(c, g13, sq1));
System.out.println(s.assegnaGiocatoreSquadra(c, g14, sq2));
System.out.println(s.assegnaGiocatoreSquadra(c, g15, sq1));
System.out.println(s.assegnaGiocatoreSquadra(c, g16, sq2));

for(Giocatore g: sq1.getGiocatori()){
System.out.println(g.getNome());
}
System.out.println();
for(Giocatore g: sq2.getGiocatori()){
System.out.println(g.getNome());
}
System.out.println();

/*
for(Giocatore g: s1.getRosa()){
System.out.println(g.getNome());
}
System.out.println();

for(Giocatore g: s2.getRosa()){
System.out.println(g.getNome());
}
System.out.println();
*/

//4
marcatori.add(g1);
marcatori.add(g1);
marcatori.add(g1);
marcatori.add(g1);
marcatori.add(g2);

ammoniti.add(g5);
ammoniti.add(g6);

espulsi.add(g10);

//marcatori1.add(g1);

Partita p = s.registraPartita(c, sq1, sq2, 4, 1, "27-09-2016", marcatori, ammoniti, espulsi);
//Partita p2 = s.registraPartita(c, sq2, sq1, 0, 1, "29-05-2017", marcatori1, ammoniti1, espulsi1);

for(Map.Entry<String, Giocatore> m : c.getGiocatori().entrySet()){
System.out.println(m.getKey()+"\t"+m.getValue().getNome()
+"\t"+m.getValue().getReti()+"\t"+m.getValue().getAmmonizioni()
+"\t"+m.getValue().getEspulsioni());

}
System.out.println();

/*
//metodo 5
for(Map.Entry<String, Squadra> S : c.getPartecipanti().entrySet()){
System.out.println(S.getValue().getNome()+"\t"+S.getValue().getPunti()
+"\t"+S.getValue().getRetiFatte()+"\t"+S.getValue().getRetiSubite()
+"\t"+S.getValue().getDiffReti());
}
System.out.println();
}

Squadra S = s.getCampione(c);
Giocatore G = s.getCapocannoniere(c);

System.out.println(G.getNome()+" "+G.getCognome());
System.out.println(S.getNome());

}

*/ 
		 
	}

}
