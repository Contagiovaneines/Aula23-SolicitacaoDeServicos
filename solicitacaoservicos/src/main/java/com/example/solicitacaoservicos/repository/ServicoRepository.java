package com.example.solicitacaoservicos.repository;
import com.example.solicitacaoservicos.model.Servico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServicoRepository extends JpaRepository<Servico, Long> {
}
