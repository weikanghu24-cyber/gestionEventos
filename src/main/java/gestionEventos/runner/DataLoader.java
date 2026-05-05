package gestionEventos.runner;

import gestionEventos.model.Evento;
import gestionEventos.model.Ponente;
import gestionEventos.repository.EventoRepository;
import gestionEventos.repository.PonenteRepository;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class DataLoader implements CommandLineRunner {

    private final EventoRepository eventoRepo;
    private final PonenteRepository ponenteRepo;

    public DataLoader(EventoRepository eventoRepo, PonenteRepository ponenteRepo) {
        this.eventoRepo = eventoRepo;
        this.ponenteRepo = ponenteRepo;
    }

    @Override
    public void run(String... args) throws Exception {
        if (eventoRepo.count() == 0) {
            eventoRepo.save(new Evento("JavaDay Madrid", LocalDate.of(2025, 3, 15), "Auditorio Nacional, Madrid", 500));
            eventoRepo.save(new Evento("SpringConf 2025", LocalDate.of(2025, 4, 20), "Palacio de Congresos, Barcelona", 800));
            eventoRepo.save(new Evento("DevFest Sevilla", LocalDate.of(2025, 5, 10), "FIBES, Sevilla", 1200));
            eventoRepo.save(new Evento("CloudSummit Bilbao", LocalDate.of(2025, 6, 5), "BEC, Bilbao", 650));
            eventoRepo.save(new Evento("AI Expo Valencia", LocalDate.of(2025, 7, 22), "Feria Valencia", 2000));
            eventoRepo.save(new Evento("DataDriven Málaga", LocalDate.of(2025, 9, 18), "Palacio Ferias, Málaga", 400));
            eventoRepo.save(new Evento("HackDay Zaragoza", LocalDate.of(2025, 10, 3), "Palacio Aljafería, Zaragoza", 300));
            eventoRepo.save(new Evento("CyberSec Forum", LocalDate.of(2025, 11, 14), "IFEMA, Madrid", 900));
            eventoRepo.save(new Evento("AgileConf 2025", LocalDate.of(2025, 12, 1), "Fira Barcelona", 600));
            eventoRepo.save(new Evento("WebDev Summit", LocalDate.of(2026, 1, 25), "WiZink Center, Madrid", 1500));
        }

        if (ponenteRepo.count() == 0) {
            ponenteRepo.save(new Ponente("Carlos", "Martínez López", "Indra", "Inteligencia Artificial en la Industria"));
            ponenteRepo.save(new Ponente("Laura", "García Sánchez", "Telefónica", "5G y el futuro de las comunicaciones"));
            ponenteRepo.save(new Ponente("Miguel", "Fernández Ruiz", "Amadeus", "Microservicios con Spring Boot"));
            ponenteRepo.save(new Ponente("Ana", "Rodríguez Pérez", "BBVA", "Fintech y Seguridad Bancaria"));
            ponenteRepo.save(new Ponente("Javier", "López Torres", "Santander Tech", "DevOps y CI/CD moderno"));
            ponenteRepo.save(new Ponente("Elena", "Gómez Díaz", "Accenture", "Transformación Digital en Empresas"));
            ponenteRepo.save(new Ponente("Roberto", "Jiménez Castro", "GMV", "Ciberseguridad en Sistemas Críticos"));
            ponenteRepo.save(new Ponente("Patricia", "Moreno Vega", "Repsol Digital", "Big Data y Analytics"));
            ponenteRepo.save(new Ponente("Diego", "Hernández Molina", "Mapfre", "Cloud Híbrido con AWS y Azure"));
            ponenteRepo.save(new Ponente("Sofía", "Álvarez Blanco", "Iberdrola", "IoT y Energías Renovables"));
        }
    }
}
