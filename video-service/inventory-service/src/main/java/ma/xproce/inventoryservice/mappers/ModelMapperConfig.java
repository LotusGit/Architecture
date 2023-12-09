package ma.xproce.inventoryservice.mappers;

import ma.xproce.inventoryservice.dao.entities.Creator;
import ma.xproce.inventoryservice.dao.entities.Video;
import ma.xproce.inventoryservice.dto.CreatorDTO;
import ma.xproce.inventoryservice.dto.VideoDTO;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class ModelMapperConfig {
    private ModelMapper modelMapper= new ModelMapper();
    public CreatorDTO fromCreatorToCreatorDTO(Creator creator){
        return this.modelMapper.map(creator, CreatorDTO.class);
    }

    public Creator fromCreatorDTOtoCreator(CreatorDTO creatorDTO){
        return this.modelMapper.map(creatorDTO, Creator.class);
    }

    public Video fromVideoDTOtoVideo(VideoDTO videoDTO){
        return this.modelMapper.map(videoDTO, Video.class);
    }

    public VideoDTO fromVideotoVideoDTO(Video video){
        return this.modelMapper.map(video, VideoDTO.class);
    }
}
