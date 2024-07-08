package com.Karol_dev.LiterAlura.model;

import com.Karol_dev.LiterAlura.dto.AutorDTO;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "autor")
public class Autor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String nombre;

    private int nacimento;

    private int fallecimento;

    @OneToMany(mappedBy = "autor", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Libro> libros = new ArrayList<>();


    public Autor(){}

    public Autor(String autor){
        this.nombre = autor;
    }

    public Autor(AutorDTO autorDto){
        this.nombre = autorDto.nombre();
        this.nacimento = autorDto.nacimento();
        this.fallecimento = autorDto.fallecimento();
    }

    public Autor(Autor autor) {
        this.id = autor.id;
        this.nombre = autor.nombre;
        this.nacimento = autor.nacimento;
        this.fallecimento = autor.fallecimento;
        this.libros = autor.libros;
    }

    public List<Libro> getLibros() {
        return libros;
    }

    public void setLibros(List<Libro> libros) {
        this.libros = libros;
    }

    public int getNascimento() {
        return nacimento;
    }

    public void setNascimento(int nascimento) {
        this.nacimento = nascimento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getFalecimento() {
        return fallecimento;
    }

    public void setFalecimento(int falecimento) {
        this.fallecimento = falecimento;
    }

    @Override
    public String toString() {
        return "Autor{" +
                "nombre='" + nombre + '\'' +
                ", nascimento=" + nacimento +
                ", falecimento=" + fallecimento +
                '}';
    }
}
