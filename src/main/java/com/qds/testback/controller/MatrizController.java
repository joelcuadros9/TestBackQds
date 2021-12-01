package com.qds.testback.controller;

import com.qds.testback.service.MatrizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@CrossOrigin(origins = "*", methods= {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
@RestController
@RequestMapping("/matriz")
public class MatrizController {

    @Autowired
    MatrizService matrizService;

    //@GetMapping
    //private ArrayList<int[]> listarMatriz(){
    //    return matrizService.reverseMatriz();
    //}

    @PostMapping
    private ArrayList<int[]> reverseMatriz(@RequestBody ArrayList<int[]> matriz) {
        return matrizService.reverseMatriz(matriz);
    }

}
