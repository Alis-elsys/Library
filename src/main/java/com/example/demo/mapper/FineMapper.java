package com.example.demo.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import com.example.demo.entities.Fine;
import com.example.demo.controlers.resources.FineRes;

import java.util.List;

@Mapper
public interface FineMapper {
    FineMapper INSTANCE = Mappers.getMapper(FineMapper.class);

    @Mapping(source = "user", target = "user")
    @Mapping(source = "transaction", target = "transaction")
    Fine fineToResuorce(FineRes resource);

    @Mapping(source = "user", target = "user")
    @Mapping(source = "transaction", target = "transaction")
    FineRes fineToFineRes(Fine fine);

    List<FineRes> toFineResList(List<Fine> fines);
}
