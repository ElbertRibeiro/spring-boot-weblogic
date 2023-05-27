package com.elbertribeiro.teste;

import org.springframework.stereotype.Service;

@Service
public class TesteService {
    public String retornoService(){
        return "Teste Weblogic com multiModules e service e @Autowired";
    }
}
