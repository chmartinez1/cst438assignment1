import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.TestCase;

public class QuestionsAnswersTest extends TestCase {

	@Test
	public void test() {
		QuestionsAnswers x = new QuestionsAnswers();
		x.put("What color is a red apple?", "Red");
		assertEquals(1,QuestionsAnswers.hm.size());
	}

}
