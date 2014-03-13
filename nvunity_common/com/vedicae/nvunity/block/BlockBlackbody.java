package com.vedicae.nvunity.block;

/* 
 * A massive energy sink for all power types.  Stores up to the Int limit, but will absorb every last drop of power on
 * a network it's attached to.  It has absolute priority over all machines.  Redstone signal or Omniwrench hit to turn
 * it into a Whitebody, which emits all that power back but nolonger consumes any power at all.  Very large energy
 * capacitor that can work like a UPS with proper setup automation.
 * 
 * Converts incoming energy into another power system so that it can transmit it back as whatever type of power that's
 * connected to it?  Must be on par with Power Converters but not a clear victor.  Not sure on this feature.  Might
 * not include it at all, or might make a power conversion system its own block.  Maybe a multiblock with a central
 * chamber that does the conversion.  1x3/4x1, or 3x3/4x3?  Maybe make it expandable as long as it's at least 3 high?
 * 
 * Config option to turn off the priority system (assuming I can even make that work) to prevent griefing.  It'll only
 * absorb excess power this way.
 * 
 * Needs to save power (and possibly state) when picked up.  
 * 
 * Make a lower-tier version that'll only output when that network is empty of energy, so that it works like a UPS.
 * But that version needs a much, much lower power storage.  
 */
public class BlockBlackbody {

}
