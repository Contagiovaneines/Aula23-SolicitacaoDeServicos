package com.example.solicitacaoservicos.repository;
import com.example.solicitacaoservicos.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
