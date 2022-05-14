package qtss.Locadoras.service;

import java.util.Calendar;
import java.util.Date;

import javax.xml.crypto.Data;

import qtss.Locadoras.model.Cliente;
import qtss.Locadoras.model.Jogo;
import qtss.Locadoras.model.Locacao;
import qtss.Locadoras.util.DataUtil;

public class LocacalService {
	
    public static void main( String[] args )
    {
    	Cliente cliente = new Cliente("Sonic");
    	Jogo jogo = new Jogo("Super Mario", 250.50, 100);
    	
    	LocacalService locacaoService = new LocacalService();
    	Locacao locacao = locacaoService.alugarjogo(cliente, jogo);
    	
    	System.out.println(locacao.getJogo().getNome().equals(jogo.getNome()));
    	System.out.println(locacao.getCliente().getNome().equals(cliente.getNome()));
    	System.out.println(locacao.getValor() == (jogo.getValor()));
    	
    	Calendar calendar = Calendar.getInstance();
    	
    	System.out.println(calendar.get(calendar.MONTH));
    	
    	System.out.println(new DataUtil().verificaDataIguais(locacao.getRetirada(), new Date()));
    	
    }
	
	private final int diasPadrao = 5;
	
	public Locacao alugarjogo(Cliente cliente, Jogo jogo) {
		
		Locacao locacao = new Locacao();
		locacao.setCliente(cliente);
		locacao.setJogo(jogo);
		locacao.setValor(locacao.getValor());
		locacao.setRetirada(new Date());
		locacao.setRetirada(new Date());
		
		Date devolucao = new DataUtil().addDias(new Date(), diasPadrao);
		locacao.setDevolucao(devolucao);
		
		return locacao;
					
	}
}
