package com.reporte.reporte.service;

import com.reporte.reporte.Model.Reportemodel;
import com.reporte.reporte.Repository.ReporteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class ReporteService {

    @Autowired
    private ReporteRepository reporteRepository;

    public List<Reportemodel> obtenerReportesEntreFechas(LocalDate inicio, LocalDate fin) {
        return reporteRepository.findByFechaBetween(inicio, fin);
    }
}
