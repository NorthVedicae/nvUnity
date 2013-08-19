package com.vedicae.nvunity.block;

//The large control center for energy transport networks.  If sticking with the sound theme, make it vaguely resemble a DJ stage?  Multiblock
//control console at the very least.  Quite expensive to make but lets you directly control how many energy units (dBu?) are going where and 
//what each connected chunk has available / needs.  Sekin and Anavall blocks, or multiple iterations to stack up materials?  Probably
//best to use a little of both.
//Set up a frequency system like Tesseracts.  That would work really well here.
//Example, Towers 1 and 2 each have 16 dBu available, Tower 3 has 5 dBu available, and Tower 4 has 2 dBu available.  You can set T1 to output 
//to T3, and T2 to output to T3 and T4, bringing T3's total potential usage to 16+16+16=48 dBu and T4's to 16+16=32 dBu, but energy will be 
//claimed from towers on a first-come first-served basis.
//The network system is based on a BlockUpdate table that tracks the location of each Tower/Pillar controller block.  Any change will
//either not effect the multiblock, or end the multiblock effect and shut that tower down.  No need to chunk load if I do it right.  When
//that chunk is loaded it'll track the multiblock in full to make sure it stays together.  Otherwise it's just a number that acts as a 
//battery.  Pillars and Towers communicate in the table by their chunk location.
public class BlockEnergyControlNexus {

}
