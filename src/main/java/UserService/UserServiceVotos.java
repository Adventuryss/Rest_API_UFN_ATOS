package UserService;

import java.util.List;

import com.bruno.AulaAtosUFNRestAPISpring.Models.Cidade;
import com.bruno.AulaAtosUFNRestAPISpring.Models.Votos;
import com.bruno.AulaAtosUFNRestAPISpring.Repositories.CidadeRepository;
import com.bruno.AulaAtosUFNRestAPISpring.Repositories.UrnaRepository;




public class UserServiceVotos {

	private UrnaRepository urnaRepository;
	
	public List<Votos> getUsersByNumeroCandidato(Integer numeroCandidato){
		return urnaRepository.findByNumeroCandidato(numeroCandidato);
	}
	
}
