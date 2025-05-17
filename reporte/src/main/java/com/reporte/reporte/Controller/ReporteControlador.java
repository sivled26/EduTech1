package com.reporte.reporte.Controller;


import com.reporte.reporte.Model.Reportemodel;
import com.reporte.reporte.service.ReporteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api/reportes")
public class ReporteControlador {

    @Autowired
    private ReporteService reporteService;

    @GetMapping
    public ResponseEntity<List<Reportemodel>> obtenerReportes(
            @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate inicio,
            @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate fin) {

        List<Reportemodel> reportes = reporteService.obtenerReportesEntreFechas(inicio, fin);
        return ResponseEntity.ok(reportes);
    }
}