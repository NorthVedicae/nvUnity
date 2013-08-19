package com.vedicae.nvunity.block;

/* 
 * A mass-producable alternative to farming.  Make sure it's a good alternative to Forestry's multiblocks and MFR's 
 * Planter/Harvester(/Fertilizer) but not a clear victor over either.  Fully automating the other two should be better 
 * by default because those require more complicated automation and both power and fertilizer to work.  The Grower
 * (name pending) is a 'Set it and forget it' option that can be configured to grow any plant, plus a few extras
 * (Peat, IC2 Seed bags, etc) based on its inventory and continually, but kinda slowly, pumps them out.
 *     -Peat will need Bog Earth pumped in, IC2 will need some setup to control fertilizer/pesticide/moisture/height/air
 *     so that you can get access to all the special things it can do.  IC2 weeds may or may not form but won't wreck
 *     the seed bag and won't spread, you'll just get them instead of an item sometimes if your balance is wrong or
 *     something like that.
 * This'll also fill the role between small garden patches and the new Forestry resource abyss, while not conflicting
 * with the role of MFR's way-overpowered awesomeness.
 * 
 * Also set up some sort of intelligent sorting system for items pumped into a Grower so they share their incoming
 * and outgoing items and distribute them to the proper locations.  Example:  A 3x3x3 cube of Growers with Peat.  You
 * can pipe Bog Earth into any one block and it'll distribute them to all Growers that are already making Peat.
 */
public class BlockGrower {

}
