package com.reporte.reporte.Model;
import jakarta.persistence.*;

import java.time.LocalDate;





@Entity
@Table (name = "reportes")


public class Reportemodel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;

    private String descripcion;

    private LocalDate fechaLocal;
}
