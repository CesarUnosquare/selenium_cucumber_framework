package api;

import io.restassured.response.Response;
import static io.restassured.RestAssured.*;

public class ApiClient {
    public static Response get(String url) {
        return given().when().get(url).then().extract().response();
    }

    public static Response post(String url, Object body) {
        return given().contentType("application/json")
                      .body(body)
                      .when().post(url).then().extract().response();
    }
}