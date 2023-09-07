@RunWith(Parameterized.class)
public class CheckIsAdultTest {
	
  private final int age;
  private final boolean result;

  public CheckIsAdultTest(int age, boolean result) {
	this.age = age;
    this. result = result;
  }

  @Parameterized.Parameters
  public static Object[][] getTextData() {
	return new Object[][] {
        {19, true},
        {17, false},
        {18, true},
        {21, true},
    
    };
  }

  @Test
  public void checkIsAdultWhenAgeThenResult() {
	Program program = new Program();
	CheckIsAdultTest checkIsAdultTest = new CheckIsAdultTest(age, result); // Передай сюда возраст пользователя
    boolean isAdult = program.checkIsAdult(checkIsAdultTest.age);
	// Сравни полученный и ожидаемый результаты, не забудь про сообщение об ошибке
    assertEquals("Возраст не соответствует!",checkIsAdultTest.result, isAdult);
	}
}
