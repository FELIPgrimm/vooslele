package com.example.voosdolele.model;

import com.example.voosdolele.model.Voo;
import jakarta.persistence.*;

@Entity
@Table(name = "assento")
public class Assento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "numero", nullable = false)
    private String numero;

    @Column(name = "classe", nullable = false)
    private String classe; // Ex: "Econômica", "Executiva"

    @ManyToOne
    @JoinColumn(name = "voo_id", nullable = false)
    private Voo voo;

    public Assento() {
    }

    public Assento(String numero, String classe, Voo voo) {
        this.numero = numero;
        this.classe = classe;
        this.voo = voo;
    }

    // Getters e Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public Voo getVoo() {
        return voo;
    }

    public void setVoo(Voo voo) {
        this.voo = voo;
    }
}
