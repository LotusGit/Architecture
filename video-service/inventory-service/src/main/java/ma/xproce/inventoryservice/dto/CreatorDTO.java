package ma.xproce.inventoryservice.dto;

import jakarta.persistence.OneToMany;
import lombok.*;
import ma.xproce.inventoryservice.dao.entities.Video;

import java.util.Collection;
@Getter @Setter @AllArgsConstructor @NoArgsConstructor @Builder
@ToString
public class CreatorDTO {
    private String name, email;
}
