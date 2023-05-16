import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class EchoTest {
    @Test
    void shouldReturnPostRequest() {
        // given - when - then
        given()
                .baseUri("https://postman-echo.com")
                .body("hello world")
                .when()
                .post("/post")
                .then()
                .statusCode(200)
                .body("data", equalTo("hello world"))
        ;
    }
}


