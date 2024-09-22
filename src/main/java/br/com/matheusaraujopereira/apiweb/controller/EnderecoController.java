package br.com.matheusaraujopereira.apiweb.controller;

import br.com.matheusaraujopereira.apiweb.model.Endereco;
import br.com.matheusaraujopereira.apiweb.repository.EnderecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/enderecos")
public class EnderecoController {

    @Autowired
    private EnderecoRepository enderecoRepository;

    @PostMapping
    public ResponseEntity<Endereco> createEndereco(@RequestBody Endereco endereco) {
        Endereco savedEndereco = enderecoRepository.save(endereco);
        return ResponseEntity.ok(savedEndereco);
    }

    @GetMapping
    public List<Endereco> getAllEnderecos() {
        return enderecoRepository.findAll();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Endereco> updateEndereco(@PathVariable Long id, @RequestBody Endereco enderecoDetails) {
        Optional<Endereco> optionalEndereco = enderecoRepository.findById(id);
        if (optionalEndereco.isPresent()) {
            Endereco endereco = optionalEndereco.get();
            endereco.setRua(enderecoDetails.getRua());
            endereco.setNumero(enderecoDetails.getNumero());
            endereco.setComplemento(enderecoDetails.getComplemento());
            endereco.setBairro(enderecoDetails.getBairro());
            endereco.setCidade(enderecoDetails.getCidade());
            endereco.setEstado(enderecoDetails.getEstado());
            endereco.setCep(enderecoDetails.getCep());
            Endereco updatedEndereco = enderecoRepository.save(endereco);
            return ResponseEntity.ok(updatedEndereco);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteEndereco(@PathVariable Long id) {
        if (enderecoRepository.existsById(id)) {
            enderecoRepository.deleteById(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
