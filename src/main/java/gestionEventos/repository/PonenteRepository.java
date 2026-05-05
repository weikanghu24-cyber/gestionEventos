package gestionEventos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import gestionEventos.model.Ponente;

public interface PonenteRepository extends JpaRepository<Ponente, Long> {
}
