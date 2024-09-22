package br.com.matheusaraujopereira.apiweb.controller;

import br.com.matheusaraujopereira.apiweb.model.Funcionario;
import br.com.matheusaraujopereira.apiweb.repository.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/funcionarios")
public class FuncionarioController {

    @Autowired
    private FuncionarioRepository funcionarioRepository;

    @PostMapping
    public ResponseEntity<Funcionario> createFuncionario(@RequestBody Funcionario funcionario) {
        Funcionario savedFuncionario = funcionarioRepository.save(funcionario);
        return ResponseEntity.ok(savedFuncionario);
    }

    @GetMapping
    public List<Funcionario> getAllFuncionarios() {
        return funcionarioRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Funcionario> getFuncionarioById(@PathVariable Long id) {
        return funcionarioRepository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PutMapping("/{id}")
    public ResponseEntity<Funcionario> updateFuncionario(@PathVariable Long id, @RequestBody Funcionario funcionario) {
        return funcionarioRepository.findById(id)
                .map(existingFuncionario -> {
                    funcionario.setId(existingFuncionario.getId());
                    Funcionario updatedFuncionario = funcionarioRepository.save(funcionario);
                    return ResponseEntity.ok(updatedFuncionario);
                })
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteFuncionario(@PathVariable Long id) {
        return funcionarioRepository.findById(id)
                .map(existingFuncionario -> {
                    funcionarioRepository.delete(existingFuncionario);
                    return ResponseEntity.noContent().<Void>build();
                })
                .orElse(ResponseEntity.notFound().build());
    }
}
