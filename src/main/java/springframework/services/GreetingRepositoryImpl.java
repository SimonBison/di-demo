package springframework.services;

import org.springframework.stereotype.Component;

@Component
public class GreetingRepositoryImpl implements GreetingRepository{

    @Override
    public String getEnglishGreeting(){
        return "Hello - Primary Greeting service";
    }

    @Override
    public String getSpanishGreeting(){
        return "Servicio de Saludo Primaro";
    }

    @Override
    public String getGermanGreeting(){

        return "Primaerer Grussdienst";
    }
}
