package de.schulung.entwurfsmuster.behavioral;

import de.schulung.entwurfsmuster.behavioral.adapter.AdapterPattern;
import de.schulung.entwurfsmuster.behavioral.chainofresponsibility.ChainOfResponsibility;
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

    }


    public static void print(Class<?> clazz) {

        System.out.println();
        System.out.println("=".repeat(60));
        System.out.println(clazz.getSimpleName()+":");
        System.out.println();
    }

}