package Unit3.Lab1;

public class TriangleClassifier {
    public static void main(String[] args) {
        System.out.println(classifyTriangle(3, 4, 5));
        System.out.println(classifyTriangle(5, 5, 5));
        System.out.println(classifyTriangle(2, 2, 5));
        System.out.println(classifyTriangle(5, 5, 8));
        System.out.println(classifyTriangle(6, 8, 10));
    }

    public static String classifyTriangle(int a, int b, int c) {
        int a2 = a * a;
        int b2 = b * b;
        int c2 = c * c;

        if(a + b > c && b + c > a && a + c > b) {
            if(a == b && b == c) {
                if(a2 + b2 == c2 || a2 + c2 == b2 || b2 + c2 == a2) {
                    return "Equilateral Right Triangle";
                } else if(a2 + b2 < c2 || a2 + c2 < b2 || b2 + c2 < a2) {
                    return "Equilateral Obtuse Triangle";
                } else {
                    return "Equilateral Acute Triangle";
                }
            } else if(a == b || b == c || a == c) {
                if(a2 + b2 == c2 || a2 + c2 == b2 || b2 + c2 == a2) {
                    return "Isosceles Right Triangle";
                } else if(a2 + b2 < c2 || a2 + c2 < b2 || b2 + c2 < a2) {
                    return "Isosceles Obtuse Triangle";
                } else {
                    return "Isosceles Acute Triangle";
                }
            } else {
                if(a2 + b2 == c2 || a2 + c2 == b2 || b2 + c2 == a2) {
                    return "Scalene Right Triangle";
                } else if(a2 + b2 < c2 || a2 + c2 < b2 || b2 + c2 < a2) {
                    return "Scalene Obtuse Triangle";
                } else {
                    return "Scalene Acute Triangle";
                }
            }
        }
        return "Not a valid triangle";
    }
}
