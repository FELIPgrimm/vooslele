package com.example.voosdolele.model;



import com.example.voosdolele.model.Assento;


import com.example.voosdolele.model.Passageiro;
import com.example.voosdolele.model.Voo;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "reserva")
public class Reserva {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "passageiro_id", nullable = false)
    private Passageiro passageiro;

    @ManyToOne
    @JoinColumn(name = "assento_id", nullable = false)
    private com.example.voosdolele.model.Assento assento;

    @ManyToOne
    @JoinColumn(name = "voo_id", nullable = false)
    private Voo voo;

    @Column(name = "data_reserva", nullable = false)
    private LocalDateTime dataReserva;

    public Reserva() {
    }

    public Reserva(Passageiro passageiro, com.example.voosdolele.model.Assento assento, Voo voo, LocalDateTime dataReserva) {
        this.passageiro = passageiro;
        this.assento = assento;
        this.voo = voo;
        this.dataReserva = dataReserva;
    }

    // Getters e Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Passageiro getPassageiro() {
        return passageiro;
    }

    public void setPassageiro(Passageiro passageiro) {
        this.passageiro = passageiro;
    }

    public com.example.voosdolele.model.Assento getAssento() {
        return assento;
    }

    public void setAssento(com.example.voosdolele.model.Assento assento) {
        this.assento = assento;
    }

    public Voo getVoo() {
        return voo;
    }

    public void setVoo(Voo voo) {
        this.voo = voo;
    }

    public LocalDateTime getDataReserva() {
        return dataReserva;
    }

    public void setDataReserva(LocalDateTime dataReserva) {
        this.dataReserva = dataReserva;
    }
}
