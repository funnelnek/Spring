package com.funnelnek.spring;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;


public class RestAssuredTest {
    @Test
    public void givenUrl_whenJsonResponseHasArrayWithGivenValuesUnderKey_thenCorrect() {
        get("http://localhost:8080/api/calendars/4").then().assertThat().body("title", equalTo("Giving Data Context"));        
    }
}
