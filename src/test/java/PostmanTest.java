import org.junit.jupiter.api.Test;


import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class PostmanTest {

    @Test
    void shouldReturnAccounts() {

        // Given - When - Then
        // Предусловия
        given()
                .baseUri("https://postman-echo.com")
                .body("Hi")
                // Выполняемые действия
                .when().log().all()
                .post("/post")
                // Проверки
                .then().log().all()
                .statusCode(100)
                .body("data", org.hamcrest.Matchers.equalTo("Hi"));
    }
}
