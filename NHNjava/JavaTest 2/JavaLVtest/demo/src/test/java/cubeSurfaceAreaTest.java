package test.java;
import org.junit.jupiter.api.cubeSurfaceAreaTest;

import java.beans.Transient;

import main.java.practice.geometry.cubeSurfaceArea;


public class cubeSurfaceAreaTest {

@Test 
@DisplayName("생성자 생성 테스트 부분입니다.")

void createTest(){
    cubeSurfaceArea cs = new cubeSurfaceArea(4);
    cubeSurfaceArea cs1 = new cubeSurfaceArea(4);
    cubeSurfaceArea cs2 = new cubeSurfaceArea(4);

    Assertions.assertEquals(cs.getArea1(4));
    Assertions.assertEquals(cs.getArea1(8));
    Assertions.assertEquals(cs.getArea1(16));
}

@Test 
@DisplayName("음수 값 생성 테스트 부분입니다.")
void minusTest(){
    cubeSurfaceArea cs = new cubeSurfaceArea(-1);
    cubeSurfaceArea cs1 = new cubeSurfaceArea(-1, -1);
    cubeSurfaceArea cs2 = new cubeSurfaceArea(-1, -1, -1);
    
     Assertions.assertEquals(cs.getCubeArea(-1));
     Assertions.assertEquals(cs1.getSquare(-2));
     Assertions.assertEquals(cs2.getRectangle(-3));

}

@Test
@DisplayName("Cube 테스트입니다. ")
void cubeTest(){
    Assertions.assertEquals(24.0, getCubeArea().cube(2.0));
}

@Test
@DisplayName("Square 테스트입니다. ")
void squareTest(){
    Assertions.assertEquals(27.0, getSquare().square(3.0));
}

@Test
@DisplayName("Rectangle 테스트입니다. ")
void rectangleTest(){
    Assertions.assertEquals(4.0, getRectangle().rectangle(2.0, 2.0));
}


@Test
@DisplayName("Box 테스트입니다. ")
void boxTest(){
    Assertions.assertEquals(80.0, getBox().box(4.0, 4.0, 3.0));
}



    
}
