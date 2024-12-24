package com.example.solicitacaoservicos.controller;

import com.example.solicitacaoservicos.model.Cliente;
import com.example.solicitacaoservicos.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    // Exibir lista de clientes
    @GetMapping
    public String listarTodos(Model model) {
        List<Cliente> listaClientes = clienteService.listarTodos();
        model.addAttribute("clientes", listaClientes);
        return "clientes/listar";
    }

    // Exibir cliente por ID
    @GetMapping("/{id}")
    public String buscarPorId(@PathVariable Long id, Model model) {
        Cliente cliente = clienteService.buscarPorId(id).orElse(null);
        model.addAttribute("cliente", cliente);
        return "clientes/detalhes";
    }

    // Salvar cliente
    @PostMapping
    public String salvar(@ModelAttribute Cliente cliente) {
        clienteService.salvar(cliente);
        return "redirect:/clientes";
    }

    // Excluir cliente
    @PostMapping("/{id}/excluir")
    public String excluir(@PathVariable Long id) {
        clienteService.excluir(id);
        return "redirect:/clientes";
    }

    // Editar cliente
    @GetMapping("/{id}/editar")
    public String editar(@PathVariable Long id, Model model) {
        Cliente cliente = clienteService.buscarPorId(id).orElse(null);
        if (cliente != null) {
            model.addAttribute("cliente", cliente);
            return "clientes/editar";
        } else {
            return "redirect:/clientes";
        }
    }

    // Atualizar cliente após edição 
    @PostMapping("/{id}/editar")
    public String atualizar(@PathVariable Long id, @ModelAttribute Cliente cliente) {
        cliente.setId(id);
        clienteService.salvar(cliente);
        return "redirect:/clientes";
    }

    // Exibir formulário de criação de novo cliente
    @GetMapping("/novo")
    public String novoCliente(Model model) {
        model.addAttribute("cliente", new Cliente());
        return "clientes/novo";
    }
}
