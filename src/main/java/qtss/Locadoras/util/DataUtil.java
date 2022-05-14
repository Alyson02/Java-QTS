package qtss.Locadoras.util;

import java.util.Calendar;
import java.util.Date;

public class DataUtil {
	public Date addDias (Date date, int qtdDias) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(Calendar.DAY_OF_MONTH, qtdDias);
		return calendar.getTime();
	}
	
	public Date obterDias (int dia, int mes, int ano) {
		Calendar calendar = Calendar.getInstance();
		
		calendar.set(Calendar.DAY_OF_MONTH, dia);
		calendar.set(Calendar.MONTH, mes + 1);
		calendar.set(Calendar.YEAR, ano);
		
		return calendar.getTime();
	}
	
	public boolean verificaDataIguais(Date date1, Date date2) {
		Calendar c1 = Calendar.getInstance();
		c1.setTime(date1);
		
		Calendar c2 = Calendar.getInstance();
		c2.setTime(date2);
		
		if(c1.YEAR == c2.YEAR && c1.MONTH == c2.MONTH && c1.DAY_OF_MONTH == c2.DAY_OF_MONTH)
			return true;
		else 
			return false;
	}
	
}
