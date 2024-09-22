package br.com.matheusaraujopereira.apiweb.repository;

import br.com.matheusaraujopereira.apiweb.model.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {
}
