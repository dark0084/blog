package com.lhw.blog;

import com.lhw.blog.domain.Post;
import com.lhw.blog.repository.PostRepository;

import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
import static org.springframework.web.reactive.function.server.RequestPredicates.accept;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;
import static org.springframework.web.reactive.function.server.ServerResponse.ok;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

import org.springframework.ui.ModelMap;
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Configuration
public class BlogRouter {
	@Autowired
	private PostRepository postRepository;

	@Bean
	public RouterFunction<ServerResponse> routes() {
		Flux<Post> posts = postRepository.findAll();
		ModelMap model = new ModelMap();
		model.addAttribute("posts", posts);
		return route(GET("/").or(GET("/index")).and(accept(MediaType.TEXT_HTML)), req -> ok().render("index", model));
	}
}