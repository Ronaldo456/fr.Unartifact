package MonGroupeProjet.MonArtifactProjet;

import org.junit.Test;

import junit.framework.Assert;

public class LaGrandeClasseTest {

	@Test
	public void ensureGoodWordCount() {

		LaGrandeClasse c = new LaGrandeClasse("et et");
		c.run();
		int total = c.getNbrTotal();

		Assert.assertEquals(total, 2);

	}

}
