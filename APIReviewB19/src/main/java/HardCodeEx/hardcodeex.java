package HardCodeEx;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Test;

import static io.restassured.RestAssured.given;

    public class hardcodedex {
        String baseURI = RestAssured.baseURI = "http://hrm.syntaxtechs.net/syntaxapi/api";
        @Test
        public void agenerateToken(){
            RequestSpecification request=given().header("Content-Type","application/json").body("{\n" +
                    "\n" +
                    "  \"email\": \"concordia@gmail.com\",\n" +
                    "  \"password\": \"isnopassowrd\"\n" +
                    "}");
            Response response = request.when().post("/generateToken.php");
            response.prettyPrint();
        }

    }
