package br.com.model.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.ArrayList;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class AppList implements Serializable {
    @JsonProperty("apps")
    private ArrayList<Game> apps;
}
