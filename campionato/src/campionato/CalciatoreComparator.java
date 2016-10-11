package campionato;

import java.util.Comparator;

public class CalciatoreComparator implements Comparator<Giocatore>{
	

	
	@Override
	public int compare(Giocatore o1, Giocatore o2) {

		int valReti = o1.getReti() - o2.getReti();

		if (valReti == 0) {

			int valAmmonizioni = o1.getAmmonizioni() - o2.getEspulsioni();

			if (valAmmonizioni == 0) {
				int valEspulsioni = o1.getEspulsioni() - o2.getEspulsioni();
				return valEspulsioni; 
			}
			return valAmmonizioni;
		}

		return valReti;

	}
}
