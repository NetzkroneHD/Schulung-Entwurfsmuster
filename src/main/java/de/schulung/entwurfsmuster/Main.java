package de.schulung.entwurfsmuster;

import de.schulung.entwurfsmuster.state.StatePattern;
import de.schulung.entwurfsmuster.strategy.StrategyPattern;
import de.schulung.entwurfsmuster.templatemethod.TemplateMethod;

public class Main {

    public static void main(String[] args) {
        print(StrategyPattern.class);
        StrategyPattern.run();

        print(TemplateMethod.class);
        TemplateMethod.run();

        print(StatePattern.class);
        StatePattern.run();

    }


    public static void print(Class<?> clazz) {
        System.out.println();
        System.out.println("============================");
        System.out.println(clazz.getSimpleName()+":");
        System.out.println();
    }

}