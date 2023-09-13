package org.example;

import org.example.BaeldungApproach.ImageFileProcessor;
import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;

import javax.enterprise.inject.se.SeContainer;
import javax.enterprise.inject.se.SeContainerInitializer;

public class Main {


    public static void main(String[] args) {

//        Weld weld = new Weld();
//        WeldContainer container = weld.initialize();
//        ImageFileProcessor imageFileProcessor = container.select(ImageFileProcessor.class).get();
//
//        System.out.println("Here is the title "+ imageFileProcessor.getTitle());
//        container.shutdown();

        SeContainerInitializer initializer = SeContainerInitializer.newInstance();
        SeContainer initialize = initializer.initialize();
        ImageFileProcessor processor =  initialize.select(ImageFileProcessor.class).get();
        System.out.println("Here is the title "+processor.getTitle());

    }


}