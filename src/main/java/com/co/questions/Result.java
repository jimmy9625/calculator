package com.co.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static com.co.userinterface.Calculator.RESULT;

public class Result implements Question<String> {
    public static Result obtains() {

        return new Result();
    }

    @Override
    public String answeredBy(Actor actor) {


        return Text.of(RESULT).viewedBy(actor).asString();

    }
}
