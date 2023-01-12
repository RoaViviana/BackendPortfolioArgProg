package com.portfolio.vivi.repositorios;

import com.portfolio.vivi.modelo.Contacto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactoRepository extends JpaRepository<Contacto, Long> {
}
