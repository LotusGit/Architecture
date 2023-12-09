package ma.xproce.inventoryservice.dto;

import jakarta.persistence.ManyToOne;
import lombok.*;
import ma.xproce.inventoryservice.dao.entities.Creator;

import java.util.Date;

@Getter @Setter @AllArgsConstructor @NoArgsConstructor @Builder
@ToString
public class VideoDTO {
    private String name, url, description;
    private CreatorDTO creator;
}
