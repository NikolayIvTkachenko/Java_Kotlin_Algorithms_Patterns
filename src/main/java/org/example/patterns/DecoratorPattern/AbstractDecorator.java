package org.example.patterns.DecoratorPattern;

public abstract class AbstractDecorator extends Component {

    protected Component component;

    public void setTheComponent(Component c) {
        component = c;
    }

    @Override
    public void makeHouse() {
        if(component != null) {
            component.makeHouse(); //Delegating Task
        }
    }
}
