package com.ioc.constructor.injection.IOCConstructorInjection;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class Cake {
    private Bread bread;
    private Flavour flavour;

    public Cake() {
        log.info("default");
    }

    /*@Autowired(required = true)
    public Cake(Bread bread) {
        this.bread = bread;
        log.info("bread");
    }

    @Autowired(required = true)
    public Cake(Flavour flavour) {
        this.flavour = flavour;
        log.info("flavour");
    }*/


    @Autowired(required = true)
    public Cake(Bread bread, Flavour flavour) {
        this.bread = bread;
        this.flavour = flavour;
        log.info("bread, flavour");
    }
}
