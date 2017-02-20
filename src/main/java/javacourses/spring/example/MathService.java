package javacourses.spring.example;

import org.springframework.stereotype.Service;

@Service
public class MathService {
    public int multiply(int a, int b) {
        return a * b;
    }
}
