package br.com.matheusaraujopereira.apiweb.repository;

import br.com.matheusaraujopereira.apiweb.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
