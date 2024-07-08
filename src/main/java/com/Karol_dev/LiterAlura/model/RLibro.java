package com.Karol_dev.LiterAlura.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.Karol_dev.LiterAlura.dto.LibroDTO;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)

public record RLibro(
        @JsonAlias({"results", "docs"}) List<LibroDTO> results
) { }