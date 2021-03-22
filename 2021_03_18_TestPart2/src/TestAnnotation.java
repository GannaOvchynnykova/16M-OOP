import org.junit.*;

public class TestAnnotation {
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        System.out.println("setUpBeforeClass");
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
        System.out.println("tearDownAfterClass");
    }

    @Before
    public void setUp() throws Exception {
        System.out.println("Before each test methods");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("After each test methods");
    }

    @Test
    public void test1() {
        System.out.println("Test1");
    }

    @Test
    public void test2() {
        System.out.println("Test2");
    }

    @Ignore
    @Test(timeout = 5000)
    public void test3() {
        System.out.println("Test3");
        while (true) ;
    }
}
