package com.example.demo.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import com.example.demo.entities.Transaction;
import com.example.demo.controlers.resources.TransactionRes;

import java.util.List;

@Mapper
public interface TransactionMapper {
    TransactionMapper INSTANCE = Mappers.getMapper(TransactionMapper.class);

    @Mapping(source = "book", target = "book")
    @Mapping(source = "user", target = "user")
    Transaction transactionToResuorce(TransactionRes resource);

    @Mapping(source = "book", target = "book")
    @Mapping(source = "user", target = "user")
    TransactionRes transactionToTransactionRes(Transaction transaction);
}
