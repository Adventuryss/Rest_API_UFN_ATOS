package UserService;

import java.util.List;

import com.bruno.AulaAtosUFNRestAPISpring.Models.Cidade;
import com.bruno.AulaAtosUFNRestAPISpring.Models.ProfessorAluno;
import com.bruno.AulaAtosUFNRestAPISpring.Models.Votos;
import com.bruno.AulaAtosUFNRestAPISpring.Repositories.CidadeRepository;
import com.bruno.AulaAtosUFNRestAPISpring.Repositories.ProfessorAlunoRepository;
import com.bruno.AulaAtosUFNRestAPISpring.Repositories.UrnaRepository;




public class UserServiceProfessorAluno {

	private ProfessorAlunoRepository professorAlunoRepository;
	
	public List<ProfessorAluno> getUsersByTipo(String tipo){
		return professorAlunoRepository.findByTipo(tipo);
	}
	
}
