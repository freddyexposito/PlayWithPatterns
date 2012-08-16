package org.structural.facade;

public class HardDrive {
	public byte[] read(long lba, int size) {
		return new byte[] { 1, 1 };
	}
}
