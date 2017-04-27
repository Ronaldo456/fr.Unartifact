package com.margoconseil;

import org.junit.Test;

import junit.framework.Assert;

public class TddTest {

	@Test
	public void test() {

		StringCounter counter = new StringCounter();

		int length = counter.lengthOf("the big phrase");
		Assert.assertEquals(length, 14);
	}

}
