import static org.junit.jupiter.api.Assertions.*;

class TriangleClassifierTest {

    @org.junit.jupiter.api.Test
    void checkTriangle() {
        TriangleClassifier triangleClassifier = new TriangleClassifier();
        String test = triangleClassifier.checkTriangle(0,-1,5);
        String result = "không phải là tam giác";
        assertEquals(test,result);
    }
    @org.junit.jupiter.api.Test
    void checkTriangleOften() {
        TriangleClassifier triangleClassifier = new TriangleClassifier();
        String test = triangleClassifier.checkTriangle(1,3,4);
        String result = "tam giác thường";
        assertEquals(test,result);
    }
    @org.junit.jupiter.api.Test
    void checkEquilateralTriangle() {
        TriangleClassifier triangleClassifier = new TriangleClassifier();
        String test = triangleClassifier.checkTriangle(2,2,2);
        String result = "tam giác đều";
        assertEquals(test,result);
    }
    @org.junit.jupiter.api.Test
    void checkIsoscelesTriangle() {
        TriangleClassifier triangleClassifier = new TriangleClassifier();
        String test = triangleClassifier.checkTriangle(3,2,2);
        String result = "tam giác cân";
        assertEquals(test,result);
    }
}