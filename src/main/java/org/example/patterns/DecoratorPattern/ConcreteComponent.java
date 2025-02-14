package org.example.patterns.DecoratorPattern;

public class ConcreteComponent extends Component {
    @Override
    public void makeHouse() {
        System.out.println("Original House is complete. It is closed for modification.");
    }
}
