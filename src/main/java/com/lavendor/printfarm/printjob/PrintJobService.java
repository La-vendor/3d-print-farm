package com.lavendor.printfarm.printjob;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PrintJobService {

    private final PrintJobRepository printJobRepository;

    public void savePrintJob(PrintJob printJob){
        printJobRepository.save(printJob);
    }

    public List<PrintJob> findAllPrintJobs(){
        return printJobRepository.findAll();
    }

}
