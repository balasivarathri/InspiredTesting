package org.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;
import org.hamcrest.Matchers.*;

public class StepDefTest {

    @Given("user should be able to create a payload")
    public void user_should_be_able_to_create_a_payload() {
        RestAssured.baseURI = "http://jsonplaceholder.typicode.com";
        given().log().all().body("{\n" +
                        "  \"PostId\": 1,\n" +
                        "  \"Name\": \"bala\",\n" +
                        "  \"Email\": \"balasivarathri@gmail.com\",\n" +
                        "  \"Body\": \"14-06-2023\"\n" +
                        "}").header("Content-Type","application/json")
                .when().post("/posts")
                .then().statusCode(201);
        //System.out.println(response);
    }
}
