/* Apstraktna klasa iz 1.2. pretvorena u interfejs*/
/* interfejs mora ne moze imati atribute, a sve funkcije clanice su apstraktne 
 * pa je redundantno pisati 'abstract' pri deklaraciji. Takodje je redundantno
 * pisatu specifikator pristupa, jer ce to zavisiti od klase koja ga implementira*/
public interface GeometrijskaSlika {
	double getPovrsina();
	double getObim();
}


