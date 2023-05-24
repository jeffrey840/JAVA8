//package com.example.java8.controller;
//
//
//import com.google.gson.Gson;
//import ch.qos.logback.core.model.Model;
//import com.google.gson.reflect.TypeToken;
//import jakarta.annotation.PostConstruct;
//import org.aspectj.weaver.patterns.TypePatternQuestions;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.core.io.Resource;
//import org.springframework.core.io.ResourceLoader;
//import org.springframework.stereotype.Controller;
//import java.io.IOException;
//import java.nio.charset.StandardCharsets;
//import java.util.List;
//
//
//
//
//
//@Controller
//public class QuestionController {
//
//    private final ResourceLoader resourceLoader;
//
//    private List<TypePatternQuestions.Question> questions;
//
//    public QuestionController(ResourceLoader resourceLoader) {
//        this.resourceLoader = resourceLoader;
//    }
//
//    @PostConstruct
//    public void loadQuestions() throws IOException {
//        Resource resource = resourceLoader.getResource("classpath:data/questions.json");
//        String jsonData = new String(resource.getInputStream().readAllBytes(), StandardCharsets.UTF_8);
//        questions = new Gson().fromJson(jsonData, new TypeToken<List<TypePatternQuestions.Question>>() {}.getType());
//    }
//
//    @GetMapping("/questions")
//    public String getQuestions(Model model) {
//        String jsonData = "[\n" +
//                "  {\n" +
//                "    \"question\": \"What is the result of the following class? (Choose all that apply)\",\n" +
//                "    \"code\": \"public class _C {\\n  private static int $;\\n  public static void main(String[] main) {\\n    String a_b;\\n    System.out.print($);\\n    System.out.print(a_b);\\n  }\\n}\",\n" +
//                "    \"correctAnswers\": [\"Compiler error on line 6.\"],\n" +
//                "    \"wrongAnswers\": [\n" +
//                "      \"Compiler error on line 1.\",\n" +
//                "      \"Compiler error on line 2.\",\n" +
//                "      \"Compiler error on line 4.\",\n" +
//                "      \"Compiler error on line 5.\"\n" +
//                "    ]\n" +
//                "  }\n" +
//                "]";
//
////        List<TypePatternQuestions.Question> questions = new Gson().fromJson(jsonData, new TypeToken<List<TypePatternQuestions.Question>>() {}.getType());
////        model.addAttribute("questions", questions);
//
//        return "questions";
//    }
//}
//
