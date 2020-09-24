package CountryCurrency;

public class Main {

	public static void main(String[] args) {
		KRW krw = new KRW(1500, "원");
		USD usd = new USD(100.50,"dollar");
		EUR eur = new EUR(260.87, "eur");
		JPY jpy = new JPY(1400, "yen");
		
		Currency[] currencies = {krw,usd,eur,jpy};
		
		for(Currency c : currencies) {
			System.out.println(c.toString());
		}
	
	}
}
