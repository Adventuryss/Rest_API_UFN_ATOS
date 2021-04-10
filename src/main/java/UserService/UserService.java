package UserService;

import java.util.List;

import com.bruno.AulaAtosUFNRestAPISpring.Models.Cidade;
import com.bruno.AulaAtosUFNRestAPISpring.Repositories.CidadeRepository;




public class UserService {

	private CidadeRepository cidadeRepository;
	
	public List<Cidade> getUsersByAno(Integer ano){
		return cidadeRepository.findByAno(ano);
	}
	
}
