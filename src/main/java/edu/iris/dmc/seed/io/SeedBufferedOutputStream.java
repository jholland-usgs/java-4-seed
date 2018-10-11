package edu.iris.dmc.seed.io;

import java.io.IOException;
import java.io.OutputStream;

import edu.iris.dmc.seed.Record;

public class SeedBufferedOutputStream {

	private OutputStream outputStream;

	public SeedBufferedOutputStream(OutputStream outputStream, int size) {
		if (size <= 0) {
			throw new IllegalArgumentException("Buffer size <= 0");
		}
		this.outputStream = outputStream;
	}

	public void write(Record record) throws IOException {
		for (byte b : record.getBytes()) {
			if (b == 0) {
				outputStream.write(' ');
			} else {
				outputStream.write(b);
			}
		}
		outputStream.flush();
	}
}
