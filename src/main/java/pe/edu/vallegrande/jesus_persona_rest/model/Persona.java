package pe.edu.vallegrande.jesus_persona_rest.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
@Table("personas")
public class Persona {

    @Id
    private Long id;
    private String nombre;
    private String apellido;
    private String email;
    
}
