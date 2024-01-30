package com.lavendor.printfarm.printer;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PrinterService {

    private final PrinterRepository printerRepository;

    public void savePrinter(Printer printer){
        printerRepository.save(printer);
    }

    public List<Printer> findAllPrinters(){
        return printerRepository.findAll();
    }


}
