package dalton.neely.sonarqubefun;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.function.RouterFunction;
import org.springframework.web.servlet.function.ServerResponse;

import static org.springframework.web.servlet.function.RequestPredicates.GET;
import static org.springframework.web.servlet.function.RouterFunctions.route;
import static org.springframework.web.servlet.function.ServerResponse.ok;

@Component
public class Router {
    @Bean
    RouterFunction<ServerResponse> helloWorld() {return route(GET("/"), request -> ok().body("Hello, World!"));
    }
}
