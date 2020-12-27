/**
 * Here is the sequence of method call for each annotation
 * beforeSuite
 * beforeTest
 * beforeClass
 * beforeMethod
 * firstTest
 * afterMethod
 * beforeMethod
 * secondTest
 * afterMethod
 * afterClass
 * afterTest
 * afterSuite
 * :)
 */
/**
 * <suite name="...">
 *     <test name="...">
 *         <classes>
 *             <class name="test.AnnotationCall"/>
 *         </classes>
 *     </test>
 * </suite>
 */
package test;

import org.testng.annotations.*;

public class AnnotationCall {
    @BeforeMethod
    public void beforeMethod() {
        System.out.println("beforeMethod");
    }
    @BeforeClass
    public void beforeClass() {
        System.out.println("beforeClass");
    }
    @BeforeTest
    public void beforeTest() {
        System.out.println("beforeTest");
    }
    @BeforeSuite
    public void beforeSuite() {
        System.out.println("beforeSuite");
    }
    @Test
    public void firstTest(){
        System.out.println("firstTest");
    }
    @Test
    public void secondTest(){
        System.out.println("secondTest");
    }
    @AfterMethod
    public void afterMethod() {
        System.out.println("afterMethod");
    }
    @AfterClass
    public void afterClass() {
        System.out.println("afterClass");
    }
    @AfterTest
    public void afterTest() {
        System.out.println("afterTest");
    }
    @AfterSuite
    public void afterSuite() {
        System.out.println("afterSuite\n:)");
    }
}
