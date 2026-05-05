package gestionEventos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import gestionEventos.model.Evento;

public interface EventoRepository extends JpaRepository<Evento, Long> {
}
