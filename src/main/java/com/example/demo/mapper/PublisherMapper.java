package com.example.demo.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import com.example.demo.entities.Publisher;
import com.example.demo.controlers.resources.PublisherRes;

import java.util.List;

@Mapper(uses = BookMapper.class)
public interface PublisherMapper {
    PublisherMapper INSTANCE = Mappers.getMapper(PublisherMapper.class);

    Publisher publisherToResuorce(PublisherRes resource);

    PublisherRes publisherToPublisherRes(Publisher publisher);

    List<PublisherRes> toPublisherResList(List<Publisher> publishers);
}
