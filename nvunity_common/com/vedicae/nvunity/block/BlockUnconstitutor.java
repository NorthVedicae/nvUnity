package com.vedicae.nvunity.block;

/*  
 * Consumes blocks and items EE2-style to produce energy.  One point of energy consumed provides one dBu for one tick, or 
 * something like that.  An alternative to a large Harvesting Tower network if you want a megabuild or something, but you 
 * need to have a TON of stuff to use as fuel.  Set up some sort of adapter block that'll connect it to networks or just
 * emit it into a chunk with a speaker or something, though a Nexus would handle it with less power loss.
 * Can chunks get overloaded with power?  Negative effects would suck but it should probably have a downside.
 * 
 * Also, make the top open like a Cauldron so you can drop in monsters/animals if you want to be evil,
 * or toss in blocks/items if you want to run it in a fancy way.  Lets me put in a fancy render for the item
 * being consumed.  Some sort of fade-out that looks kinda cloudy.  Think like a Big Tear scenario.  Blocks take three
 * seconds to dissolve, creatures five?  It needs to work on a by-entity basis to everything in the chamber all at once.
 * If it went one at a time you'd get a massive pileup.  If it did it in waves that'd be okay too and likely easier to
 * do but this way looks cooler I think.  
 * 
 * Pump out liquid dBu?  With an option to connect straight to a machine or one of the small-scale transmission 
 * blocks (Speakers?).  I don't think this thing should dump energy straight into the environment.  Or maybe it can but 
 * at a very large energy loss and using the liquid method or the transmission block is just much more efficient.  
 * Maybe have it transmit outwards with a speaker or TV antenna or something to connect it to the chunk it's in.  
 * The liquid should be the same type that energy crystals can be turned into.  Make it off-white or a very light grey 
 * or something.  Pure ether is perfect white and destroys everything it touches.  Maybe make that into a different 
 * mechanic somewhere.  Super-refine it into the pure form for, like a powerful grenade or 'Bag of Holding + Portable Hole'
 * explosive arrow or something.  
 * 
 * Dark grey metalish top ring and base, main walls are like glass panes on the inside, but solid blocks on the outside.  
 * Transparent windows are a must but not manditory.  Maybe make this out of some reusable multiuse building materials
 * in a specific pattern and with a specific controller block?  2x2 would look good and work well with the previous 
 * few sentences.  A 1x would have to be a little more like a cauldron shape for more room to drop things in.  Villagers
 * and other mobs might only work if the chamber is big enough for them, and a 1x1 is too small to fit anything other
 * than items?  Whatever.  I like the outside being a flush block but the inside walls being half-wide like panes.
 */
public class BlockUnconstitutor {

}
