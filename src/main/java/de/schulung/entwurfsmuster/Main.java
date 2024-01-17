package de.schulung.entwurfsmuster;

import de.schulung.entwurfsmuster.behavioral.lazyload.LazyLoadPattern;
import de.schulung.entwurfsmuster.behavioral.observer.ObserverPattern;
import de.schulung.entwurfsmuster.structual.adapter.AdapterPattern;
import de.schulung.entwurfsmuster.behavioral.chainofresponsibility.ChainOfResponsibility;
import de.schulung.entwurfsmuster.structual.composite.CompositePattern;
import de.schulung.entwurfsmuster.behavioral.visitor.VisitorPattern;
import de.schulung.entwurfsmuster.behavioral.state.StatePattern;
import de.schulung.entwurfsmuster.behavioral.strategy.StrategyPattern;
import de.schulung.entwurfsmuster.behavioral.templatemethod.TemplateMethod;

public class Main {

    public static void main(String[] args) {
        print(StrategyPattern.class);
        StrategyPattern.run();

        print(TemplateMethod.class);
        TemplateMethod.run();

        print(StatePattern.class);
        StatePattern.run();

        print(ChainOfResponsibility.class);
        ChainOfResponsibility.run();

        print(VisitorPattern.class);
        VisitorPattern.run();

        print(AdapterPattern.class);
        AdapterPattern.run();

        print(CompositePattern.class);
        CompositePattern.run();

        print(ObserverPattern.class);
        ObserverPattern.run();

        print(LazyLoadPattern.class);
        LazyLoadPattern.run();

    }


    public static void print(Class<?> clazz) {

        System.out.println();
        System.out.println("=".repeat(60));
        System.out.println(clazz.getSimpleName()+":");
        System.out.println();
    }

}