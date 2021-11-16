package com.devdojo.springtutorial.mapper;

import com.devdojo.springtutorial.domain.Anime;
import com.devdojo.springtutorial.requests.AnimePostRequestBody;
import com.devdojo.springtutorial.requests.AnimePutRequestBody;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public abstract class AnimeMapper {

    public static final AnimeMapper INSTANCE = Mappers.getMapper(AnimeMapper.class);

    public abstract Anime toAnime(AnimePostRequestBody animePostRequestBody);

    public abstract Anime toAnime(AnimePutRequestBody animePutRequestBody);
}
