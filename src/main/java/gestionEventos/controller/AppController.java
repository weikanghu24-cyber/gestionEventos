package gestionEventos.controller;

import gestionEventos.model.Evento;
import gestionEventos.model.Ponente;
import gestionEventos.repository.EventoRepository;
import gestionEventos.repository.PonenteRepository;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class AppController {

    private final EventoRepository eventoRepo;
    private final PonenteRepository ponenteRepo;

    public AppController(EventoRepository eventoRepo, PonenteRepository ponenteRepo) {
        this.eventoRepo = eventoRepo;
        this.ponenteRepo = ponenteRepo;
    }

    // GET /inicio — Página principal
    @GetMapping({"/", "/inicio"})
    public String inicio() {
        return "inicio";
    }

    // GET /listadoEvento — Tabla de eventos
    @GetMapping("/listadoEvento")
    public String listadoEvento(Model model) {
        model.addAttribute("eventos", eventoRepo.findAll());
        return "listadoEvento";
    }

    // GET /listadoPonente — Tabla de ponentes
    @GetMapping("/listadoPonente")
    public String listadoPonente(Model model) {
        model.addAttribute("ponentes", ponenteRepo.findAll());
        return "listadoPonente";
    }

    // GET /altaEvento — Formulario alta evento
    @GetMapping("/altaEvento")
    public String altaEventoForm(Model model) {
        model.addAttribute("evento", new Evento());
        return "altaEvento";
    }

    // POST /altaEvento — Guardar evento
    @PostMapping("/altaEvento")
    public String altaEventoSubmit(@ModelAttribute Evento evento) {
        eventoRepo.save(evento);
        return "redirect:/listadoEvento";
    }

    // GET /altaPonente — Formulario alta ponente
    @GetMapping("/altaPonente")
    public String altaPonenteForm(Model model) {
        model.addAttribute("ponente", new Ponente());
        return "altaPonente";
    }

    // POST /altaPonente — Guardar ponente
    @PostMapping("/altaPonente")
    public String altaPonenteSubmit(@ModelAttribute Ponente ponente) {
        ponenteRepo.save(ponente);
        return "redirect:/listadoPonente";
    }
}
