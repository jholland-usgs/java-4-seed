package edu.iris.dmc.seed.control.dictionary;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class B033Test {
	@Test
	public void fromString() throws Exception {
		B033 b = new B033();
		b.setDescription("My testing blockette");
		assertEquals("0330031000My testing blockette~", b.toSeedString());
	}
}
