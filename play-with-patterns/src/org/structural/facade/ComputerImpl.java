package org.structural.facade;

public class ComputerImpl implements Computer {

	private static final long BOOT_ADDRESS = 3;
	private static final long BOOT_SECTOR = 4;
	private static final int SECTOR_SIZE = 5;
	private CPU cpu;
	private Memory memory;
	private HardDrive hardDrive;
	
	public ComputerImpl() {
		cpu = new CPU();
		memory = new Memory();
		hardDrive = new HardDrive();
	}

	@Override
	public void startComputer() {
	       cpu.freeze();
	        memory.load(BOOT_ADDRESS, hardDrive.read(BOOT_SECTOR, SECTOR_SIZE));
	        cpu.jump(BOOT_ADDRESS);
	        cpu.execute();
		
	}

}
