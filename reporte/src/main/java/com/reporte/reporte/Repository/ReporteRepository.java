package com.reporte.reporte.Repository;

import com.reporte.reporte.Model.Reportemodel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface ReporteRepository extends JpaRepository<Reportemodel, Long> {
    List<Reportemodel> findByFechaBetween(LocalDate inicio, LocalDate fin);
}
