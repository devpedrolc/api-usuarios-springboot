package com.pedro.apiusuarios.service;

import com.pedro.apiusuarios.model.Usuario;
import com.pedro.apiusuarios.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {

    private final UsuarioRepository repository;

    public UsuarioService(UsuarioRepository repository) {
        this.repository = repository;
    }

    public Usuario salvar(Usuario usuario) {
        return repository.save(usuario);
    }

    public List<Usuario> listar() {
        return repository.findAll();
    }

    public Usuario buscarPorId(Long id) {
        Optional<Usuario> usuario = repository.findById(id);
        return usuario.orElse(null);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
    public Usuario atualizar(Long id, Usuario usuarioAtualizado) {
        Usuario usuario = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Usuário não encontrado"));

        usuario.setNome(usuarioAtualizado.getNome());
        usuario.setEmail(usuarioAtualizado.getEmail());
        usuario.setSenha(usuarioAtualizado.getSenha());

        return repository.save(usuario);
    }
}