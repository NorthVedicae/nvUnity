package com.vedicae.nvunity.block;

/* 
 * Find a better name.  Consumes energy (amount based on size) to heal everything inside the ring.  Cures debuffs and buffs,
 * this thing isn't a healer--it just forces the body into its natural state.  This usually involves healing but not always.
 * Wither is too strong, so it stays but deals no damage inside this ring.  Villager zombies are slowly returned into their
 * normal villager forms.  Zombie pigmen too.  What happens to normal zombies and skeletons?  What happens to wither skellies?
 * 
 * Can be set up vertically like a Nether Portal or horizontally.  The border blocks don't need corners.  One row of blocks
 * inside is a glasspane-shaped glow effect with a fading inner-edge.  This glow is treated like snow in that you can just
 * overwrite it with a solid block, and doing so will remove the glow from that part.  When turned off the glow goes away.
 * Size is expandable and power consumption goes in tiers.  Blocks inside don't prevent or block the effect in any way.
 */
public class BlockRegenerationArch {

}
