package org.example.automanager.services;

import lombok.RequiredArgsConstructor;
import org.example.automanager.repository.CarRepository;
import org.example.automanager.repository.InaccuracyRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class InaccuracyService {
    private final InaccuracyRepository inaccuracyRepository;
}
