package br.com.matheusaraujopereira.apiweb.repository;

import br.com.matheusaraujopereira.apiweb.model.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnderecoRepository extends JpaRepository<Endereco, Long> {
}
