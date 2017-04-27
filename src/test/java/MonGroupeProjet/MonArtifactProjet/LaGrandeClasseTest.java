package MonGroupeProjet.MonArtifactProjet;

import org.junit.Assert;
import org.junit.Test;

public class LaGrandeClasseTest {

	@Test
	public void ensureGoodWordCount() {

		LaGrandeClasse c = new LaGrandeClasse("et et");
		c.run();
		int total = c.getNbrTotal();

		Assert.assertEquals(total, 2);

	}

}
