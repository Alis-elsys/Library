package com.example.demo.services.implementation;

import com.example.demo.entities.Fine;
import com.example.demo.repository.FineRepository;
import com.example.demo.services.FineService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class FineServiceImp implements FineService {
    private final FineRepository fineRepository;

    @Override
    public List<Fine> findAll() { return fineRepository.findAll(); }
    

    @Override
    public Fine findById(Long id) { return fineRepository.findById(id).orElse(null); }

    @Override
    public Fine save(Fine fine) { return fineRepository.save(fine); }

    @Override
    public Fine update(Fine fine) {
        Fine fileTemp = fineRepository.findById(fine.getId()).orElse(null);
        if (fileTemp != null) {
            fileTemp.setId(fine.getId());
            fileTemp.setAmount(fine.getAmount());
            fileTemp.setDueDate(fine.getDueDate());
            fileTemp.setPaid(fine.isPaid());
            fileTemp.setUser(fine.getUser());
            return fineRepository.save(fileTemp);
        }
        fineRepository.save(fine);
        return fine;
    }

    @Override
    public void deleteById(Long id) { fineRepository.deleteById(id); }
    
}
