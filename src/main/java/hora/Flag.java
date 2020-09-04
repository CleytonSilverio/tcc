package hora;

import java.util.Date;
import java.util.List;
import java.util.TimerTask;

import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;

import br.edu.tcc.entidade.Aluno;
import br.edu.tcc.repositorio.AlunoRepositorio;

public class Flag extends TimerTask {

//	int flag = 0;
	Date data, data2;
	String ipfixo;
	
	@Autowired
	AlunoRepositorio repositorio;

	@Override
	public void run() {
//		flag++;
//		System.out.println(flag);
		List<Aluno> alunos = repositorio.findAll();
		System.out.println(new Date());
		data = new Date();
		for(Aluno a : alunos){
			if(a.getFlag() == 0) {
				ipfixo = pegarIp();
			}
			if(a.getFlag() < 5 && ipfixo == pegarIp()) {
				a.setFlag(a.getFlag() + 1);
			}
			if (a.getFlag() == 5) {
				//metodo pra falar que o cara tava na aula
				a.setFlag(0);
			}
		}
			long hora = data.getTime();
			data2 = new Date(hora + (60000));
		
		System.out.println(data2);
		if (data.after(data2)) {
			System.out.println("Finalizando.");
			System.exit(0);
		}
	}
	
	public String pegarIp() {

		HttpServletRequest request = (HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext().getRequest();
		String ip = request.getRemoteAddr();

		return ip;
	}
}
