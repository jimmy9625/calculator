package com.co.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import java.util.List;

import static com.co.userinterface.Calculator.NUMBER;
import static com.co.userinterface.Calculator.OPERATOR;

public class EnterOperation implements Task {

    private String operation;
    private String number1;
    private String number2;

    private EnterOperation(String operation, List<String> numbers) {
        this.operation = operation;
        this.number1 = numbers.get(0);
        this.number2 = numbers.get(1);
    }

    public static EnterOperation with(String operator, List<String> numbers) {
        return new EnterOperation(operator, numbers);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(NUMBER.of(number1)),
                Click.on(OPERATOR.of(operation)),
                Click.on(NUMBER.of(number2)),
                Click.on(OPERATOR.of("equals")));

    }
}
