package br.com.fiap.observability.controller;

import com.google.gson.Gson;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class ObervabilityController {

    @GetMapping("/code/")
    public String getCode(){

        Random random = new Random();

        return new Gson().toJson(random.nextInt(2));

    }


    @GetMapping("/http/")
    public ResponseEntity<Object> getHttp(){

        Random random = new Random();

        boolean cond = random.nextBoolean();

        if(cond){
            return new ResponseEntity<Object>("Sucesso !!!", new HttpHeaders(), HttpStatus.OK);

        }else{

            return new ResponseEntity<Object>("Erro forçado !!!", new HttpHeaders(), HttpStatus.INTERNAL_SERVER_ERROR);

        }

    }


}
