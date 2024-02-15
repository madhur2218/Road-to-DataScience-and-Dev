package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Samsung {
@Autowired
    Processor cpu;
    public Processor getCpu() {
        return cpu;
    }

    public void setCpu(Processor cpu) {
        this.cpu = cpu;
    }

    public void Config(){
        System.out.println("octa core, 4gb RAM, 12MP Camera");
    }


}
